<template>
  <div class="all">
    <div class="header">
      <div>Sign in</div>
    </div>
    <div class="content">
      <el-card class="box-card" :model="user" ref="loginForm" style="padding:20px">
        <div style="margin-bottom: 16px">
          <div style="font-size:14px">用户名</div>
          <el-input v-model="user.username" placeholder="请输入内容" style="padding: 6px 0px 0px 0px"></el-input>
        </div>
        <div>
          <div style="font-size:14px">密码</div>
          <el-input v-model="user.password" placeholder="请输入密码" style="padding: 6px 0px 0px 0px" show-password></el-input>
        </div>
        <div style="text-align: center;margin-top: 20px;">
          <el-button @click="login" style="width: 270px" type="primary">注册
          </el-button>
        </div>
        <div style="margin-top: 10px;position: relative;font-size: 14px">
<!--          <span>忘记密码</span>-->
          <span style="float: right">登录</span>
        </div>
      </el-card>
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
export default {
  name: "register",
  data(){
    return{
      user:{
        username:"",
        password:""
      }
    }
  },
  methods:{
    login(){
      request.post('/user/register',this.user).then(res=>{
        if(res.code === '200'){
          this.$message.success('注册成功')
        }else{
          this.$message.error(res.msg)
        }
      })
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
</style>