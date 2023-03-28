import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import '@tabler/core/dist/css/tabler.css'
import '@tabler/core/dist/js/tabler'

createApp(App).use(store).use(router).mount('#app')
