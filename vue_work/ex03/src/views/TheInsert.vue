<template>
    <div>
        <h1 class="text-5xl">INSERT</h1>
        <label for="email">email</label>
        <input type="text" name="" id="email" v-model="email" class="border border-gray-400 rounded-lg shadow-lg p-3" placeholder="그림자가 있는 입력 필드">
        <h1 class="text-3xl">{{ email }}</h1>
        <button @click="doInsert" class="bg-green-500 hover:bg-green-700 text-white fond-bold py-2 px-4 rounded">INSERT</button>

    </div>
</template>

<script>
import {ref} from "vue";
export default {
    
    setup () {
        const email = ref('');
        const doInsert = () => {
            fetch(`http://localhost:8080/user/insert`,
                {method : "POST"}
            )
            .then()
        }

        return {email, doInsert}
    }
}
</script>

<style lang="scss" scoped>

</style>