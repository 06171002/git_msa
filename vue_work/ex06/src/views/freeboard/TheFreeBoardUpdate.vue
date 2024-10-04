<template>
  <div>
    <h1>FREEBOARDUPDATE</h1>
    <div class="p-5">
      <input
        type="text"
        v-model="title"
        placeholder="Enter your title here"
        class="w-11/12 p-3 border border-gray-300 rounded-lg shadow-sm focus:outline-none focus:ring-2 focus:ring-blue-500 focus:border-transparent text-gray-700 placeholder-gray-400 bg-white m-2"
      />
      <textarea
        v-model="content"
        class="w-11/12 h-40 p-4 border border-gray-300 rounded-lg shadow-sm focus:outline-none focus:ring-2 focus:ring-blue-400 focus:border-transparent resize-none text-gray-700 placeholder-gray-400 bg-white m-2"
        placeholder="Enter Content here"
      ></textarea>
    </div>
    <div class="my-3">
      <input type="file" @click="onFileChange">
    </div>
    <button
      @click="save"
      class="px-4 py-2 ml-5 bg-blue-500 text-white font-semibold rounded-lg shadow-md hover:bg-blue-600 focus:outline-none focus:ring-2 focus:ring-blue-300"
    >
      수정
    </button>
  </div>
</template>

<script setup>
import axios from 'axios';
import { ref } from 'vue';
import { useRoute, useRouter } from 'vue-router';

const title = ref();
const content = ref();
const regDate = ref();
const author = ref();
const id = ref(0);
const router = useRouter();
const route = useRoute();

const myfile = ref(null);


const onFileChange = (e) => {
  myfile.value = e.target.files[0];
}

const getFreeBoard = () => {

axios.get(`http://localhost:10000/freeboard/view/${route.query.id}`)
  .then(res => {
    title.value = res.data.title;
    content.value = res.data.content;
    regDate.value = res.data.regDate;
    author.value = res.data.author;
    id.value = res.data.id;
  })
  .catch(e => {
    console.log(e);
    alert(e.response.data.message);
    router.push({name:"freeboardlist"});
  })
}


const save = () => {
  const data = {
    id: route.query.id,
    title: title.value,
    content: content.value
  };

  const formData = new FormData();
  formData.append("data", new Blob( [JSON.stringify(data)], { type: 'application/json'} ) );
  formData.append('file', myfile.value);

  axios
    .post('http://localhost:10000/freeboard', formData)
    .then((res) => {
      console.log(res);
      router.push({ name: 'freeboardlist', params: { pagenum: 0 } });
    })
    .catch((e) => {
      console.log(e);
    });
}

getFreeBoard();
</script>

<style lang="scss" scoped></style>