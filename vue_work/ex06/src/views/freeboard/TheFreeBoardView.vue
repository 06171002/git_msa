<template>
  <div>
    <h1>TheFreeBoardView</h1>
    <div class="p-5">
      <div class="border border-b-slate-400 rounded p-3">
        <h1>글 제목 : {{ title }}</h1>
        <hr>
        <h1>글 내용</h1>
        <p class="h-64">{{ content }}</p>
        <h1>작성일자 : {{ regDate }}</h1>
        <h1>작성자 : {{ author }}</h1>
      </div>
      <div class="flex justify-between mt-5">
        <button
          class="px-4 py-2 bg-blue-500 text-white font-semibold rounded-lg shadow-md hover:bg-blue-600 focus:outline-none focus:ring-2 focus:ring-blue-300" @click="pageMove(id)">수정</button>
        <button
          class="px-4 py-2 bg-blue-500 text-white font-semibold rounded-lg shadow-md hover:bg-blue-600 focus:outline-none focus:ring-2 focus:ring-blue-300" @click="doDelete(id)">삭제</button>
      </div>
    </div>
  </div>
</template>

<script setup>
import axios from 'axios';
import { ref } from 'vue';
import { useRoute, useRouter } from 'vue-router';

const route = useRoute();
const router = useRouter();
const title = ref();
const content = ref();
const regDate = ref();
const author = ref();
const id = ref(0);


const pageMove = () => {
  router.push({ name:"freeboardinput", query:{ id:id.value } });
}

const doDelete = (id) => {
  axios.delete(`http://localhost:8080/freeboard/delete/${id}`)
  .then(res => {
    alert(res.data);
    if(res.status == '200') {
      router.push({name:"freeboardlist"})
    }
  } )
  .catch(e => console.log(e));
}


const getFreeBoard = () => {

  axios.get(`http://localhost:8080/freeboard/view/${route.params.id}`)
    .then(res => {
      title.value = res.data.title;
      content.value = res.data.content;
      regDate.value = res.data.regDate;
      author.value = res.data.author;
      id.value = res.data.id
    })
    .catch(e => {
      console.log(e);
      alert(e.response.data.message);
      router.push({name:"freeboardlist"});
    })
}

getFreeBoard();
</script>

<style lang="scss" scoped></style>