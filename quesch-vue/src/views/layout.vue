<template>
  <div>
    <div class="header" style="top: 0;position:sticky;text-align: center;z-index: 10">
      <div style="position:relative;">
        <el-menu style="padding-left: 100px" :default-active="activeIndex" class="el-menu-demo" mode="horizontal" @select="handleSelect"
                 background-color="#24292f"
                 text-color="#fff"
                 active-text-color="#409eff">
          <el-menu-item index="home" style="margin-left: 80px;width: 100px">首页</el-menu-item>
          <el-submenu index="1">
            <template slot="title">问题</template>
            <el-menu-item index="1-1">选项1</el-menu-item>
            <el-menu-item index="1-2">选项2</el-menu-item>
            <el-menu-item index="1-3">选项3</el-menu-item>
            <el-submenu index="1-4">
              <template slot="title">选项4</template>
              <el-menu-item index="1-4-1">选项1</el-menu-item>
              <el-menu-item index="1-4-2">选项2</el-menu-item>
              <el-menu-item index="1-4-3">选项3</el-menu-item>
            </el-submenu>
          </el-submenu>
          <el-menu-item index="2">市场</el-menu-item>
          <el-menu-item index="3">活动</el-menu-item>
          <el-menu-item index="4">帮助</el-menu-item>

          <div class="input-icon">
          <span style="position: absolute;color:#C0C4CC;margin-top:14px;margin-left: 20px;z-index:10;">
            <i class="el-icon-search"></i>
          </span>
            <el-input type="text" v-model="search_content" class="search form-control" placeholder="Search…"
                      style="max-width: 240px;margin-top:10px;">
            </el-input>
          </div>

        </el-menu>
      </div>
      <div style="position:absolute;top:0;right: 0;margin-right: 80px;line-height: 50px">
        <el-button @click="login" v-if="!user.username" type="text" style="color: white;font-size:13px;">登录/注册</el-button>
        <el-dropdown v-if="user.username" style="color: white">
          <span class="el-dropdown-link" style="display:flex;cursor: pointer">
            <el-avatar size="small" src="" style="margin: auto 8px"></el-avatar>
            <div>{{ user.username }}</div>
            <i class="el-icon-arrow-down el-icon--right" style="margin: auto 4px"></i>
          </span>
          <el-dropdown-menu slot="dropdown">
            <el-dropdown-item>个人空间</el-dropdown-item>
            <el-dropdown-item dividedx>
              <div @click="logout">退出登录</div></el-dropdown-item>
          </el-dropdown-menu>
        </el-dropdown>
      </div>
    </div>
    <div style="flex: 1">
      <router-view/>
    </div>
  </div>
</template>

<script>
import Cookies from "js-cookie";
export default {
  name: "layout",
  data(){
    return{
      user:Cookies.get('user')?JSON.parse(Cookies.get('user')):{},
      activeIndex: '1',
      search_content:"",
    }
  },
  watch:{
    $route(to, from){
      console.log(to.path)
      location.reload()
    }
  },
  methods:{
    handleSelect(key, keyPath) {
      console.log(key, keyPath);
    },
    login(){
      this.$router.push('/login')
    },
    logout(){
      Cookies.remove('user')
      this.$message.success("退出成功")
      this.$router.push('/login')
    }
  }
}
</script>

<style scoped>

</style>