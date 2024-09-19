<template>
  <div>
    <div class="flex items-center justify-center">
      <h1>{{ myVar }}</h1>
      <TheHeader/>
      <RouterView></RouterView>
    </div>
  </div>
</template>

<script setup>
import {RouterView} from 'vue-router';
import TheHeader from './components/TheHeader.vue';
  const myVar = "hi";
</script>

<style lang="scss" scoped>

</style>