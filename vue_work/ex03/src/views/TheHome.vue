<template>
    <div class="p-10">
        <h1 class="text-5xl">HOME</h1>
        <p>ref 반응형 함수를 사용해볼께요</p>
        <h2>{{ count }}</h2>
        <div class="flex space-x-3">
        <button @click="doPls" class="bg-green-500 hover:bg-green-700 text-white fond-bold py-2 px-4 rounded">증가</button>
        <button @click="doMin" class="bg-green-500 hover:bg-green-700 text-white fond-bold py-2 px-4 rounded">감소</button>
    </div>
    </div>
</template>

<script>
import { ref } from "vue";

export default {
    setup () {
        const count = ref(0);
        const doPls = () => {
            console.log("플러스");
            count.value = count.value +1;
        }
        const doMin = () => {
            console.log("마이너스");
            count.value = count.value -1;
        }

        return {count,doPls,doMin}
    }
}
</script>

<style lang="scss" scoped>

</style>