<template>
  <div>
    <h1 class="text-5xl">HOME</h1>
    <div class="p-5">
    <table class="border border-gray-500 w-full">
      <tr>
        <th class="border border-gray-500">id</th>
        <th class="border border-gray-500">name</th>
        <th class="border border-gray-500">email</th>
        <th class="border border-gray-500">age</th>
        <th class="border border-gray-500">password</th>
        <th class="border border-gray-500">date</th>
      </tr>
      <tr v-for="user in list" v-bind:key="user.id">
        <td class="border border-gray-500"> {{ user.id }}</td>
        <td class="border border-gray-500"> {{ user.name }}</td>
        <td class="border border-gray-500"> {{ user.email }}</td>
        <td class="border border-gray-500"> {{ user.age }}</td>
        <td class="border border-gray-500"> {{ user.password }}</td>
        <td class="border border-gray-500"> {{ user.date }}</td>
      </tr>
    </table>
    <button @click="select" class="bg-yellow-200 p-3 hover:bg-yellow-100 border border-gray-300" >불러오기</button>
  </div>
    <div v-for="num in mylist" v-bind:key="num">
      num = {{ num }}
    </div>
    <div class="p-5">
      name = <input class="border border-yellow-400 focus:ring-2 focus:ring-yellow-500 focus:outline-none rounded-lg p-3 w-64 text-yellow-900 placeholder-yellow-500 bg-yellow-100 transition-all duration-300 shadow-md hover:bg-yellow-200 hover:shadow-lg" type="text" name="name" id="" v-model="name"><br>
      age = <input class="border border-yellow-400 focus:ring-2 focus:ring-yellow-500 focus:outline-none rounded-lg p-3 w-64 text-yellow-900 placeholder-yellow-500 bg-yellow-100 transition-all duration-300 shadow-md hover:bg-yellow-200 hover:shadow-lg" type="number" name="name" id="" v-model="age"><br>
      password = <input class="border border-yellow-400 focus:ring-2 focus:ring-yellow-500 focus:outline-none rounded-lg p-3 w-64 text-yellow-900 placeholder-yellow-500 bg-yellow-100 transition-all duration-300 shadow-md hover:bg-yellow-200 hover:shadow-lg" type="text" name="name" id="" v-model="password"><br>
      email = <input class="border border-yellow-400 focus:ring-2 focus:ring-yellow-500 focus:outline-none rounded-lg p-3 w-64 text-yellow-900 placeholder-yellow-500 bg-yellow-100 transition-all duration-300 shadow-md hover:bg-yellow-200 hover:shadow-lg" type="text" name="name" id="" v-model="email"><br>
      <button @click="insert" class="bg-yellow-200 p-3 hover:bg-yellow-100 border border-gray-300" >입력</button>
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
    
    const name = ref('');
    const age = ref('');
    const password = ref('');
    const email = ref('');
    
    const select = () => {
      fetch(`http://localhost:8080/user/select`)
      .then(res => {
        return res.json();
      })
      .then(result => {
        list.value = result;
      })
      .catch(e => {
        console.log("exeption");
        console.log(e);
      })
      
    }

    const insert = () => {
      const data = {
        name:name.value,
        age:age.value,
        password:password.value,
        email:email.value
      }
      fetch('http://localhost:8080/user/insert',{ method:"POST", headers: {'Content-Type':'application/json'}, body:JSON.stringify(data)})
      .then(res => {
        console.log(res);
      })
      .catch(e => {
        console.log(e);
      });
    }
    
    

    return {list, mylist,select,name,age,password,insert,email}
  }
}
</script>

<style lang="scss" scoped>

</style>