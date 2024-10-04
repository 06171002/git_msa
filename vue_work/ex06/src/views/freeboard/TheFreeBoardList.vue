<template>
  <div class="pb-100">
    <h1 class="h1-red">FreeBoardList</h1>
    <div class="px-5">
      <table class="border border-b-gray-500 w-full">
        <thead>
          <tr>
            <th class="border">IDX</th>
            <th class="border">title</th>
            <th class="border">author</th>
            <th class="border">regdate</th>
            <th class="border">viewcount</th>
          </tr>
        </thead>
        <tbody>
          <!-- && <- 앞에꺼 true 이면 뒤에꺼 확인해봅니다. -->
          <!-- || <- 앞에꺼 false 이면 뒤에꺼 확인해봅니다. -->
          <template v-if="arr && arr.length>0">
            <tr
              v-for="item in arr"
              :key="item.id"
              class="cursor-pointer hover:bg-slate-200"
              @click="viewPage(item.id)"
            >
              <td class="border text-center text-lg p-1">{{ item.id }}</td>
              <td class="border text-center text-lg p-1">{{ item.title }}</td>
              <td class="border text-center text-lg p-1">{{ item.author }}</td>
              <td class="border text-center text-lg p-1">{{ item.regdate }}</td>
              <td class="border text-center text-lg p-1">{{ item.viewcount }}</td>
              <template v-if="item.list[0]">
                <td class="border text-center text-lg p-1">
                  <img :src="`${GLOBAL_URL}/file/download/${item.list[0].name}`" alt="" srcset="" width="150">
                </td>
              </template>
            </tr>
          </template>
        </tbody>
      </table>
    </div>
    <div class="flex justify-center mt-5">
      <ul class="flex space-x-2">
        <li
          class="cursor-pointer p-3"
          v-for="num in totalPages"
          v-bind:key="num"
          @click="setPageNum(num - 1)"
        >
          {{ num }}
        </li>
      </ul>
    </div>

  </div>
</template>

<script setup>
import axios from 'axios';
// import { useRoute } from 'vue-router';
import { ref, watchEffect } from 'vue';
import { useRouter } from 'vue-router';
import { GLOBAL_URL } from '@/api/util';
import { getFreeBoard } from '@/api/freeboardApi';

const router = useRouter();
const arr = ref([]);
const totalPages = ref(10);
const pageNum = ref(0);

const setPageNum = async(num) => {
  pageNum.value = num;
  const res = await getFreeBoard(num);
  arr.value = res.data.list;
  totalPages.value = res.data.totalPages;
};

const viewPage = (id) => {
  router.push({ name: 'freeboardview', params: { id } });
}

watchEffect(async()=>{
  const res = await getFreeBoard();
  arr.value = res.data.list;
  totalPages.value = res.data.totalPages;
});
</script>

<style lang="scss" scoped></style>