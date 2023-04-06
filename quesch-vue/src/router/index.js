import Vue from 'vue'
import VueRouter from 'vue-router'
import layout from "@/views/layout";
import Cookies from "js-cookie";

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
        path:'/space',
        name:'space',
        component:()=> import('@/views/user/space')
      },
      {
        path:'/content',
        name:'content',
        component:()=> import('@/views/content')
      },
      {
        path:'/classify',
        name:'classify',
        component:()=> import('@/views/ques/ques_layout')
      },
      {
        path: '*',
        name:'404',
        component:()=> import('@/views/404'),
      }
    ]
  },

]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

router.beforeEach((to,form,next)=>{
  if (to.path === '/login')
    next()
  const user = Cookies.get('user')
  if(!user && to.path!=='/login')
    return next('/login')
  next()
})

export default router
