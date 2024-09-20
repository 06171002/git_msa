<template>
  <div class="pb-100">
    <h1>FREEBOARDList</h1>
    <div class="px-5">
      <table class="border w-11/12">
        <thead>
          <tr>
            <th class="border">ID</th>
            <th class="border">TITLE</th>
            <th class="border">AUTHOR</th>
            <th class="border">REGDATE</th>
            <th class="border">VIEWCOUNT</th>
          </tr>
        </thead>
        <tbody>
          <tr v-for="item in arr" :key="item.id" class="cursor-pointer hover:bg-slate-200" @click="viewPage(item.id)">
            <td class="border text-center text-lg p-1">{{ item.id }}</td>
            <td class="border text-center text-lg p-1" >{{ item.title }}</td>
            <td class="border text-center text-lg p-1">{{ item.author }}</td>
            <td class="border text-center text-lg p-1">{{ item.regDate }}</td>
            <td class="border text-center text-lg p-1">{{ item.viewCount }}</td>
          </tr>
        </tbody>
      </table>
    </div>
    <div class="flex justify-center mt-5">
      <ul class="flex space-x-5">
        <li class="cursor-pointer p-3" v-for="num in totalPages" :key="num" @click="setPageNum(num-1)">{{ num }}</li>
      </ul>
    </div>
  </div>
</template>

<script setup>
import axios from 'axios';
// import { useRoute } from 'vue-router';
import { ref } from 'vue';
import { useRouter } from 'vue-router';



const router = useRouter();
const arr = ref([]);
const totalPages = ref(10);
const pageNum = ref(0);

const setPageNum = (num) => {
  pageNum.value = num;
  getFreeBoard(num);
}

const viewPage = (id) => {
  router.push({ name:'freeboardview', params: {id} });

}

const getFreeBoard = (pageNum) => {
  if(pageNum == undefined) pageNum = 0;
  axios.get(`http://localhost:8080/freeboard?pageNum=${pageNum}`)
  .then(res => {
    console.log(res.data);
    arr.value = res.data.list;
    totalPages.value = res.data.totalPages;
  })
  .catch(e => {
    console.log(e);
  })
}


getFreeBoard();
</script>

<style lang="scss" scoped></style>