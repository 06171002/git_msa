import './assets/main.css'

import { createApp } from 'vue'
import { createPinia } from 'pinia'

import App from './App.vue'
import router from './router'

const app = createApp(App)

app.use(createPinia())
app.use(router)

window.Kakao.init('cb27c0d94cbfb9a01625c760ee35563b');

app.mount('#app')
