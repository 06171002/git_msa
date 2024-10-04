<template>
  <div class="overlay" :class="{ isModal: isModal }"></div>
  <div class="modal p-5 rounded" :class="{ isView: isModal }">
    <h1 class="text-5xl">USER 수정</h1>
    <div class="bg-slate-500 w-80 p-5 m-5 rounded text-white cursor-pointer">
      <h1>id = {{ id }}</h1>
      <h1>name = <input type="text" v-model="name"
          class=" p-1 border border-gray-300 rounded-lg shadow-sm focus:outline-none focus:ring-2 focus:ring-blue-500 focus:border-blue-500 text-gray-700">
      </h1>
      <h1>email = {{ email }}</h1>
      <h1>date = {{ date }}</h1>
    </div>
    <div class="flex justify-center space-x-5">
      <button @click="modalUser"
        class="px-4 py-2 ml-5 bg-blue-500 text-white font-semibold rounded-lg shadow-md hover:bg-blue-600 focus:outline-none focus:ring-2 focus:ring-blue-300">취소</button>
      <button @click="modalUser('save')"
        class="px-4 py-2 ml-5 bg-blue-500 text-white font-semibold rounded-lg shadow-md hover:bg-blue-600 focus:outline-none focus:ring-2 focus:ring-blue-300">저장</button>
    </div>
  </div>

  <div class="pb-10">

    <h1>UserList</h1>
    <div class="flex flex-wrap">
      <div @click="modalUser(item)" class="bg-slate-500 w-80 p-5 m-5 rounded text-white cursor-pointer"
        v-for="item in arr" :key="item.id">
        <h1>id = {{ item.id }}</h1>
        <h1>name = {{ item.name }}</h1>
        <h1>email = {{ item.email }}</h1>
        <h1>date = {{ item.date }}</h1>
        <h1>작성한 글 = {{ item.list.length }}</h1>
        <button @click.stop="doDelete(item.id)">삭제</button>
      </div>
    </div>
  </div>
</template>

<script setup>
import { ref, watchEffect } from 'vue';
import { getUsers, saveUser } from '@/api/userApi';
import axios from 'axios';

const arr = ref([]);

const id = ref();
const name = ref();
const date = ref();
const email = ref();

const isModal = ref(false);
const doDelete = () => {
  console.log("delete");
}

const modalUser = async (item) => {
  isModal.value = !isModal.value;

  if(item == 'save') {

    const result = await saveUser({id:id.value, name:name.value});

    alert('수정하였습니다.');
    return 
  }
  id.value = item.id;
  name.value = item.name;
  date.value = item.date;
  email.value = item.email;
};

watchEffect(async () => {
  const retValue = await getUsers();
  arr.value = retValue.data;
  console.log(arr.value);
});
</script>

<style scoped>
.overlay {
  position: fixed;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  z-index: 1000;
  background-color: rgb(0, 0, 0, 0.3);
  display: none;
}

.isModal {
  display: block;
}

.modal {
  position: fixed;
  top: 50%;
  left: 50%;
  background-color: white;
  z-index: 1001;
  transform: translate(-50%, -50%);
  display: none;
}

.isView {
  display: block;
}
</style>