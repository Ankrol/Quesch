<template>
  <div class="all">
    <div class="header">
      <div>Sign in</div>
    </div>
    <div class="content">
      <el-form :model="user" status-icon :rules="rules" ref="user" style="padding:40px 40px 20px 40px;border: 1px solid #EBEEF5;">
        <div style="margin-bottom: 16px">
          <div style="font-size:14px">用户名</div>
          <el-form-item prop="username">
            <el-input v-model="user.username" placeholder="请输入用户名" style="padding: 6px 0px 0px 0px"></el-input>
          </el-form-item>
        </div>
        <div>
          <div style="font-size:14px">密码</div>
          <el-form-item prop="password">
            <el-input v-model="user.password" placeholder="请输入密码" style="padding: 6px 0px 0px 0px" show-password></el-input>
          </el-form-item>
        </div>
        <div style="text-align: center;margin-top: 20px;">
          <el-button @click="login" style="width: 270px" type="primary">登录
          </el-button>
        </div>
        <div style="color:#808080;margin-top: 10px;position: relative;font-size: 14px">
          <span>忘记密码</span>
          <span class="register_btn" @click="register">注册</span>
        </div>
      </el-form>
    </div>
    <div class="footer" style="margin-top:40px;text-align: center">
        <span style="margin-right: 10px;"><img class="social-icon" alt="" src="../../assets/social/qq.png"></span>
        <el-divider direction="vertical"></el-divider>
        <span style="margin:0 10px"><img class="social-icon" alt="" src="../../assets/social/vx.png"></span>
<!--        <el-divider direction="vertical"></el-divider>-->
<!--        <span style="margin-left: 10px;"><img class="social-icon" alt="" src="../../assets/social/wb.png"></span>-->
    </div>

  </div>
</template>

<script>
import router from "@/router";
import request from "@/utils/request";
import Cookies from "js-cookie";
export default {
  name: "login",
  data(){
    return{
      user:{
        username:"",
        password:""
      },
      rules: {
        username: [
          { required: true, message: '请输入用户名', trigger: 'blur' },
          { min: 3, max: 10, message: '用户名至少三个字', trigger: 'blur' }
        ],
        password: [
          { required: true, message: '请输入密码', trigger: 'blur' },
          { min: 6, max: 20, message: '密码至少六位数', trigger: 'blur' }
        ]
      }
    }
  },

  methods:{
    login(){
      this.$refs['user'].validate((valid)=> {
        if (valid) {
          request.post('/user/login', this.user).then(res => {
            console.log(res)
            if (res.code === '200') {
              this.$message.success('登录成功')
              if (res.data){
                Cookies.set('user',JSON.stringify(res.data))
                setTimeout(()=>{
                  this.$router.push('/')
                },800);
              }
            } else {
              this.$message.error(res.msg)
            }
          })
        }
      })
    },
    register(){
      this.$router.push('/register')
    }
  }
}
</script>

<style scoped>
.all{
  background-color: white;

}
.header{
  font-size: 28px;
  font-family: "Calibri Light";
  margin-top: 80px;
  text-align: center;
}
.content{
  margin-top: 20px;
  justify-content: center;
  align-items: center;
  display:flex;
}
.content>.el-card
{
  box-shadow:none;
  -webkit-box-shadow:none;
}
.box-card{
  width: 350px;
  height: 290px;
}
.footer{

}
.social-space{
  width: 80px;
}
.social-icon{
  width: 30px;
  height: 30px;
}
.register_btn{
  float: right;
  cursor:pointer;
}
.register_btn:focus{
  color: #409eff;
}
</style>