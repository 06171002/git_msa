<template>
  <div>
    <h1>HOME</h1>
    <ul>
      <li v-for="user in list" v-bind:key="user.id">
        id = {{ user.id }}
        name = {{ user.name }}
      </li>
    </ul>
    <button @click="select" class="bg-yellow-200 p-3 hover:bg-yellow-100 border border-gray-300" >불러오기</button>
    <div v-for="num in mylist" v-bind:key="num">
      num = {{ num }}
    </div>
  </div>
</template>

<script>
import { ref } from 'vue';

export default {
  
  setup () {
    const mylist = [10,20,30];
    const list = ref([
    {
        "id": 1,
        "name": "Lee",
        "age": 10,
        "email": "asdfaaqq",
        "password": "1234",
        "createDate": "2024-09-06T11:18:50.210237"
    },
    {
        "id": 2,
        "name": "Lee",
        "age": 10,
        "email": "asdfaaqq1",
        "password": "1234",
        "createDate": "2024-09-06T11:18:50.210237"
    },
    {
        "id": 3,
        "name": "kim",
        "age": 20,
        "email": "asdfaaqq1234",
        "password": "1234",
        "createDate": "2024-09-06T11:18:50.210237"
    },
    {
        "id": 4,
        "name": "Lee",
        "age": 10,
        "email": "asdfaaqq123",
        "password": "1234",
        "createDate": "2024-09-06T11:18:50.210237"
    }
    ]);
    const select = () => {
      list.value = [{id:1,name:"바꿈"}];
    }
    fetch(`localhost:8080/user/select`)
    

    return {list, mylist,select}
  }
}
</script>

<style lang="scss" scoped>

</style>