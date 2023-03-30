import Vue from 'vue'
import VueRouter from 'vue-router'
import layout from "@/views/layout";

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    // name: 'layout',
    component: layout,
    children:[
      {
        path:'',
        name:'home',
        component:()=> import('@/views/home')
      },
      {
        path:'/login',
        name:'login',
        component:()=> import('@/views/user/login')
      },
      {
        path:'/register',
        name:'register',
        component:()=> import('@/views/user/register')
      },
      {
        path:'/404',
        name:'404',
        component:()=> import('@/views/404')
      }
    ]
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
