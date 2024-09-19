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
          <tr v-for="item in arr" :key="item.id">
            <td class="border text-center">{{ item.id }}</td>
            <td class="border text-center">{{ item.title }}</td>
            <td class="border text-center">{{ item.author }}</td>
            <td class="border text-center">{{ item.regDate }}</td>
            <td class="border text-center">{{ item.viewCount }}</td>
          </tr>
        </tbody>
      </table>
    </div>
  </div>
</template>

<script setup>
import axios from 'axios';
import { useRoute } from 'vue-router';
import { ref } from 'vue';


const route = useRoute();
const arr = ref([]);
console.log("route.params.aa = " + route.params.aa);
console.log("route.params.bb = " + route.params.bb);

axios.get('http://localhost:8080/freeboard')
  .then(res => {
    console.log(res.data);
    arr.value = res.data;
  })
  .catch(e => {
    console.log(e);
  })
</script>

<style lang="scss" scoped></style>