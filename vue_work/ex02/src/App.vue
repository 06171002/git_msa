<template>
  <div>
    <TheNav></TheNav>
    <RouterView></RouterView>

    
  </div>
</template>

<script>

import { RouterView } from 'vue-router';
import TheNav from './views/TheNav.vue';

export default {
  components :{
    
    RouterView,
    TheNav
  },
  setup () {
    

    return { RouterView, TheNav}
  }
}
</script>

<style lang="scss" scoped>

</style>