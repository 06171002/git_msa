import { createRouter, createWebHistory } from 'vue-router'
import TheUser from '@/views/TheUser.vue'
import TheFreeBoardInput from '@/views/freeboard/TheFreeBoardInput.vue'
import TheFreeBoardList from '@/views/freeboard/TheFreeBoardList.vue'
import TheHome from '@/views/TheHome.vue'
import TheFreeBoardView from '@/views/freeboard/TheFreeBoardView.vue'

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
      component: TheUser
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
    }
  ]
})

export default router
