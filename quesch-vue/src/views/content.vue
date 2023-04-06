<template>
  <div style="background-color: #f1f2f5">
  <el-row class="all" style="max-width: 800px;min-width: 200px;margin: auto">
    <div class="header">
      <div class="header-content">
        <div class="back" @click="back">
          <i class="el-icon-arrow-left">返回</i></div>
        <div class="header-title">第一个问题标题
        <span>
          <el-button style="float: right;height: 36px">
            收藏问题
          </el-button>
        </span>
        </div>
        <div class="header-des" style="line-height: 30px">问题描述啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊阿</div>

        <div style="margin-top: 20px;margin-bottom:-8px;display: flex;font-size: 14px;">
          <el-avatar :size="30"></el-avatar>
          <span style="float: left;margin:4px 8px 0 8px">root</span>
          <span style="margin-top: 4px;color: #808080">两小时前 发布了一个问题</span>
          <el-tag style="margin:1px 0 0 28px;height: 26px;line-height: 26px">问题分类</el-tag>
        </div>
        <el-divider></el-divider>
        <div>1 条评论</div>
        <div style="margin:16px 0 60px 0">
          <el-row>
            <el-col :span="2">
              <el-avatar :size="46" :src="circleUrl"></el-avatar>
            </el-col>
            <el-col :span="22">
              <el-input type="textarea" style="float: right"></el-input>
            </el-col>
          </el-row>
        <el-button style="float: right;margin-top: 10px;height: 36px">提交</el-button>
        </div>
        <div class="ques-one infinite-list-item" style="border-top: 1px solid #ededed;margin:10px 0px 40px 0px">
          <!--              问题头部（昵称、发布了一条问题-->
          <!--              问题内容主体-->
            <div class="ques-header" style="margin:20px 0px 6px 0;display: flex">
              <div style="box-sizing: border-box">
                <el-avatar :size="46" :src="circleUrl"></el-avatar>
              </div>
              <div style="margin-left: 15px;">
                <div style="margin-bottom:10px;height: 10px;font-size: 14px">
                  root
                </div>
                <div style="height: 10px;font-size: 12px;color: #808080">
                  两个小时 前回答了一条问题
                </div>
              </div>
            </div>
            <div class="text item">
              <div class="ques-content" style="margin:6px 20px 15px 0px;line-height:40px;font-size: 14px">
                回答的一些内容啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊
              </div>
              <div class="ques-footer">
                <span><img src="../assets/appreciate.png" alt="" width="15px" height="15px"></span>
                <span style="margin-left: 30px;"><img src="../assets/stamp.png" alt="" width="15px" height="15px"></span>
                <span @click="second" style="cursor:pointer;float: right;font-size:14px;color:#808080;margin-right: 30px;">
                  {{ text }}
                </span>
              </div>
              <div class="sec-comment">
                <el-avatar class="sec_avatar" style="margin-right: 16px;"></el-avatar>
                <div class="sec-content">一条楼中楼回复啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊</div>
              </div>

              <transition name="el-fade-in-linear">
              <div v-if="flag">
              <el-form class="comment-space" v-model="activeNames" @change="handleChange">
                <el-form-item>
                  <el-row>
                    <el-col :span="2">
                      <el-avatar class="sec_avatar"></el-avatar>
                    </el-col>
                    <el-col :span="18">
                  <el-input type="textarea" :autosize="{ minRows: 2}" class="second_comment"></el-input>
                    </el-col>
                    <el-col :span="4" style="text-align: center;">
                  <el-button type="primary">提交</el-button>
                    </el-col>
                  </el-row>
                </el-form-item>
              </el-form>
              </div>
              </transition>
            </div>
        </div>

      </div>
    </div>
    <div class="middle" style="">
      <div class="middle-content"></div>
    </div>
  </el-row>
  </div>
</template>

<script>
export default {
  name: "content",
  data() {
    return {
      activeNames: ['1'],
      text:'回复',
      flag:0
    };
  },
  methods:{
    back(){
      this.$router.go(-1)
    },
    second(){
      this.text =this.text== "回复" ? "收起" : "回复";
      this.flag=!this.flag;
    }
  }
}
</script>

<style scoped>
.transition-box {
  margin-bottom: 10px;
  width: 200px;
  height: 100px;
  border-radius: 4px;
  background-color: #409EFF;
  text-align: center;
  color: #fff;
  padding: 40px 20px;
  box-sizing: border-box;
  margin-right: 20px;
}
.back{
  margin-bottom: 15px;
  margin-left: -30px;
  font-size: 14px;
  cursor: pointer;
}
.header{
  background-color: #f1f2f5;
}
.header-content{
  background-color: white;
  border: 1px solid #d0d7de;
  padding: 20px 50px 50px 50px;
  margin-top: 20px;
}
.header-title{
  margin-top: 26px;
  font-weight: 550;
  width: 100%;
  font-size: 24px;
}
.header-des{
  margin-right: 80px;
  margin-top: 20px;
  overflow: hidden ;
  text-overflow: ellipsis ;
  display: -webkit-box ;
  -webkit-line-clamp: 2 ;
  -webkit-box-orient: vertical ;
}
.ques-footer{
  z-index: 10;
  margin-top: 14px;
  margin-bottom: -6px;
}
.comment-space{
  margin-top: 20px;
}
.sec-comment{
  margin-top: 20px;
}
.sec_avatar{
  float: left;
  margin-left: 10px;
  width: 40px;
  height: 40px;
}
.second_comment{
  margin: 0 14px;
}
.sec-content{
  font-size: 14px;
  line-height: 40px;
  display: flex;
}
</style>