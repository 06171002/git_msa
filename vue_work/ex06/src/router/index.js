import { createRouter, createWebHistory } from 'vue-router'
import TheFreeBoardInput from '@/views/freeboard/TheFreeBoardInput.vue'
import TheFreeBoardList from '@/views/freeboard/TheFreeBoardList.vue'
import TheHome from '@/views/TheHome.vue'
import TheFreeBoardView from '@/views/freeboard/TheFreeBoardView.vue'
import TheFreeBoardUpdate from '@/views/freeboard/TheFreeBoardUpdate.vue'
import TheFileUpload from '@/views/TheFileUpload.vue'
import TheUserList from '@/views/users/TheUserList.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: TheHome
    },
    {
      path: '/user',
      name: 'user',
      component: TheUserList
    },
    {
      path: '/freeboardinput',
      name: 'freeboardinput',
      component: TheFreeBoardInput
    },
    {
      path: '/freeboardlist',
      name: 'freeboardlist',
      component: TheFreeBoardList
    },
    {
      path: '/freeboardview/:id',
      name: 'freeboardview',
      component: TheFreeBoardView
    },
    {
      path: '/freeboardupdate',
      name: 'freeboardupdate',
      component: TheFreeBoardUpdate
    },
    {
      path: '/fileupload',
      name: 'fileupload',
      component: TheFileUpload
    }
  ]
})

export default router
