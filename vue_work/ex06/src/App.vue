<script setup>
import { RouterLink, RouterView } from 'vue-router'
</script>

<template>
  <div>
    <header>
      <div class="p-5 bg-slate-500 text-white text-3xl">
        <nav class="flex space-x-5">
          <div>
            <RouterLink to="/">Home</RouterLink>
          </div>
          <div>
            <RouterLink to="/user">USER</RouterLink>
          </div>
          <div class="group relative">
            <RouterLink to="/freeboardlist">FREEBOARD</RouterLink>
            <div
              class="opacity-0 group-hover:opacity-100 transition absolute bg-yellow-200 p-5 top-14 -left-5 rounded"
            >
              <div>
                <RouterLink to="/freeboardlist">FREEBOARDList</RouterLink>
              </div>
              <div>
                <RouterLink to="/freeboardinput">FREEBOARDInput</RouterLink>
              </div>
            </div>
          </div>
          <div>
            <RouterLink to="/fileupload">fileupload</RouterLink>
          </div>
        </nav>
      </div>
    </header>

    <RouterView />
  </div>
</template>