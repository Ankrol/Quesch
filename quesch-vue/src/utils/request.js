import axios from "axios";
import router from "@/router";
import Cookies from "js-cookie";


const request = axios.create({
    baseURL: 'http://localhost:8080/api',
    timeout:5000,
    // withCredentials:true
    // headers: {"withCredentials":true}
});

request.interceptors.request.use(config =>{
    config.headers['Content-Type']='application/json;charset=utf-8';
    const user = Cookies.get('user')
    if(user){
        config.headers['token'] = JSON.parse(user).token
    }
    return config
    },error => {
    return Promise.reject(error)
    }
);

request.interceptors.response.use(
    response=>{
        let res = response.data;
        if(typeof res === 'string'){
            res=res?JSON.parse(res):res
        }
        if (res.code === '401'){
            router.push('/login')
        }
        return res;
    },
    error => {
        console.log('err'+error)
        return Promise.reject(error)
    }
)

// router.beforeEach((to,from,next)=>{
//     if (to.path === '/') {
//             next();
//         }else if(to.path === '/register') {
//             next();
//         }else{
//
//     }
//     }
// }
export default request