<template>
  <div class="home">
    <el-row>
      <!--        左-->
      <el-col :span="10" :offset="5" class="grid-middle">
        <!--          头部回答问题-->
        <div class="grid-content">
          <div style="margin: 20px 50px 10px 50px">
            <el-input @keyup.enter.native="submitMessage" v-model="content" type="textarea" placeholder="请输入内容" :autosize="{ minRows: 2}"></el-input>
            <el-row >
              <el-popover placement="bottom" width="300" height="500" trigger="click" v-model="emojiShow">
                <el-button style="margin-top: 6px;" slot="reference">😀</el-button>
                <div class="browBox" >
                  <ul>
                    <li v-for="(item, index) in faceList" :key="index" @click="getBrow(index)">
                      {{ item }}
                    </li>
                  </ul>
                </div>
              </el-popover>
              <el-upload :limit="2" style="display: inline" action="#" list-type="picture-card" :auto-upload="false">
                <i slot="default" class="el-icon-plus"></i>
                <div slot="file" slot-scope="{file}">
                  <img class="el-upload-list__item-thumbnail" :src="file.url" alt="">
                  <span class="el-upload-list__item-actions">
                      <span
                          class="el-upload-list__item-preview"
                          @click="handlePictureCardPreview(file)">
                        <i class="el-icon-zoom-in"></i>
                      </span>
                      <span
                          v-if="!disabled"
                          class="el-upload-list__item-delete"
                          @click="handleRemove(file)">
                        <i class="el-icon-delete"></i>
                      </span>
                    </span>
                </div>
              </el-upload>
              <el-dialog :visible.sync="dialogVisible">
                <img width="100%" :src="dialogImageUrl" alt="">
              </el-dialog>
              <div class="right-btn">
                <el-select class="select_ques" v-model="selectvalue" placeholder="请选择">
                  <el-option
                      v-for="item in options"
                      :key="item.value"
                      :label="item.label"
                      :value="item.value">
                  </el-option>
                </el-select>
                <el-checkbox class="anony-check" v-model="checked">是否匿名</el-checkbox>
                <el-button class="submit-btn" type="primary" @click="submitMessage" :disabled="content == ''">
                  发送
                </el-button>
              </div>
            </el-row>
          </div>
        </div>
        <!--          标签页-->
        <el-tabs v-model="activeName" type="card" @tab-click="handleClick" style="margin: 4px 40px 4px 40px">
          <el-tab-pane label="最热" name="first">
            <div class="queses infinite-list" style="overflow:auto">

              <!--            单个问题-->
              <div class="ques-one infinite-list-item" style="margin:10px 0px 30px 0px">
                <!--              问题头部（昵称、发布了一条问题-->
                <!--              问题内容主体-->
                <el-card class="box-card">
                  <div class="ques-header" style="margin-bottom:10px;display: flex">
                    <div width="50px" style="box-sizing: border-box">
                      <el-avatar size="medium" :src="circleUrl"></el-avatar>
                    </div>
                    <div style="margin-left: 15px;">
                      <div style="margin-bottom:10px;height: 10px;font-size: 14px">
                        root
                      </div>
                      <div style="height: 10px;font-size: 12px">
                        两个小时 前发布了一条问题
                      </div>
                    </div>
                  </div>
                  <div class="text item">
                    <div class="ques-title" style="font-size: 16px">
                      发布的第一条问题
                    </div>
                    <div class="ques-content" style="margin:6px 0 6px 0;font-size: 14px">
                      发布问题的一些内容
                    </div>
                    <div class="ques-footer" style="margin-top: 14px;margin-bottom: -6px;">
                      <el-button class="zan_btn" icon="el-icon-my-export" circle></el-button>
                      <el-button icon="el-icon-star-off" circle></el-button>
                      <el-button icon="el-icon-share" circle></el-button>
                      <el-badge value="12" class="item" style="float: right;margin-right: 30px;">
                        <el-button size="small" style="border-radius: 20px;width: 64px">评论</el-button>
                      </el-badge>
                    </div>
                  </div>
                </el-card>
              </div>
              <div class="ques-one infinite-list-item" style="margin:10px 0px 30px 0px">
                <!--              问题头部（昵称、发布了一条问题-->
                <!--              问题内容主体-->
                <el-card class="box-card">
                  <div class="ques-header" style="margin-bottom:10px;display: flex">
                    <div width="50px" style="box-sizing: border-box">
                      <el-avatar size="medium" :src="circleUrl"></el-avatar>
                    </div>
                    <div style="margin-left: 15px;">
                      <div style="margin-bottom:10px;height: 10px;font-size: 14px">
                        root
                      </div>
                      <div style="height: 10px;font-size: 12px">
                        两个小时 前发布了一条问题
                      </div>
                    </div>
                  </div>
                  <div class="text item">
                    <div class="ques-title" style="font-size: 16px">
                      发布的第一条问题
                    </div>
                    <div class="ques-content" style="margin:6px 0 6px 0;font-size: 14px">
                      发布问题的一些内容
                    </div>
                    <div class="ques-footer" style="margin-top: 14px;margin-bottom: -6px;">
                      <el-button class="zan_btn" icon="el-icon-my-export" circle></el-button>
                      <el-button icon="el-icon-star-off" circle></el-button>
                      <el-button icon="el-icon-share" circle></el-button>
                      <el-badge value="12" class="item" style="float: right;margin-right: 30px;">
                        <el-button size="small" style="border-radius: 20px;width: 64px">评论</el-button>
                      </el-badge>
                    </div>
                  </div>
                </el-card>
              </div>
              <div class="ques-one infinite-list-item" style="margin:10px 0px 30px 0px">
                <!--              问题头部（昵称、发布了一条问题-->
                <!--              问题内容主体-->
                <el-card class="box-card">
                  <div class="ques-header" style="margin-bottom:10px;display: flex">
                    <div width="50px" style="box-sizing: border-box">
                      <el-avatar size="medium" :src="circleUrl"></el-avatar>
                    </div>
                    <div style="margin-left: 15px;">
                      <div style="margin-bottom:10px;height: 10px;font-size: 14px">
                        root
                      </div>
                      <div style="height: 10px;font-size: 12px">
                        两个小时 前发布了一条问题
                      </div>
                    </div>
                  </div>
                  <div class="text item">
                    <div class="ques-title" style="font-size: 16px">
                      发布的第一条问题
                    </div>
                    <div class="ques-content" style="margin:6px 0 6px 0;font-size: 14px">
                      发布问题的一些内容
                    </div>
                    <div class="ques-footer" style="margin-top: 14px;margin-bottom: -6px;">
                      <el-button class="zan_btn" icon="el-icon-my-export" circle></el-button>
                      <el-button icon="el-icon-star-off" circle></el-button>
                      <el-button icon="el-icon-share" circle></el-button>
                      <el-badge value="12" class="item" style="float: right;margin-right: 30px;">
                        <el-button size="small" style="border-radius: 20px;width: 64px">评论</el-button>
                      </el-badge>
                    </div>
                  </div>
                </el-card>
              </div>

            </div>

          </el-tab-pane>
          <el-tab-pane label="最新" name="second">
            <div class="queses">
              <!--            单个问题-->
              <div class="ques-one infinite-list-item" style="margin:10px 0px 30px 0px">
                <!--              问题头部（昵称、发布了一条问题-->
                <!--              问题内容主体-->
                <el-card class="box-card">
                  <div class="ques-header" style="margin-bottom:10px;display: flex">
                    <div width="50px" style="box-sizing: border-box">
                      <el-avatar size="medium" :src="circleUrl"></el-avatar>
                    </div>
                    <div style="margin-left: 15px;">
                      <div style="margin-bottom:10px;height: 10px;font-size: 14px">
                        root
                      </div>
                      <div style="height: 10px;font-size: 12px">
                        两个小时 前发布了一条问题
                      </div>
                    </div>
                  </div>
                  <div class="text item">
                    <div class="ques-title" style="font-size: 16px">
                      发布的第一条问题
                    </div>
                    <div class="ques-content" style="margin:6px 0 6px 0;font-size: 14px">
                      发布问题的一些内容
                    </div>
                    <div class="ques-footer" style="margin-top: 14px;margin-bottom: -6px;">
                      <el-button class="zan_btn" icon="el-icon-my-export" circle></el-button>
                      <el-button icon="el-icon-star-off" circle></el-button>
                      <el-button icon="el-icon-share" circle></el-button>
                      <el-badge value="12" class="item" style="float: right;margin-right: 30px;">
                        <el-button size="small" style="border-radius: 20px;width: 64px">评论</el-button>
                      </el-badge>
                    </div>
                  </div>
                </el-card>
              </div>
              <div class="ques-one infinite-list-item" style="margin:10px 0px 30px 0px">
                <!--              问题头部（昵称、发布了一条问题-->
                <!--              问题内容主体-->
                <el-card class="box-card">
                  <div class="ques-header" style="margin-bottom:10px;display: flex">
                    <div width="50px" style="box-sizing: border-box">
                      <el-avatar size="medium" :src="circleUrl"></el-avatar>
                    </div>
                    <div style="margin-left: 15px;">
                      <div style="margin-bottom:10px;height: 10px;font-size: 14px">
                        root
                      </div>
                      <div style="height: 10px;font-size: 12px">
                        两个小时 前发布了一条问题
                      </div>
                    </div>
                  </div>
                  <div class="text item">
                    <div class="ques-title" style="font-size: 16px">
                      发布的第一条问题
                    </div>
                    <div class="ques-content" style="margin:6px 0 6px 0;font-size: 14px">
                      发布问题的一些内容
                    </div>
                    <div class="ques-footer" style="margin-top: 14px;margin-bottom: -6px;">
                      <el-button class="zan_btn" icon="el-icon-my-export" circle></el-button>
                      <el-button icon="el-icon-star-off" circle></el-button>
                      <el-button icon="el-icon-share" circle></el-button>
                      <el-badge value="12" class="item" style="float: right;margin-right: 30px;">
                        <el-button size="small" style="border-radius: 20px;width: 64px">评论</el-button>
                      </el-badge>
                    </div>
                  </div>
                </el-card>
              </div>
              <div class="ques-one infinite-list-item" style="margin:10px 0px 30px 0px">
                <!--              问题头部（昵称、发布了一条问题-->
                <!--              问题内容主体-->
                <el-card class="box-card">
                  <div class="ques-header" style="margin-bottom:10px;display: flex">
                    <div width="50px" style="box-sizing: border-box">
                      <el-avatar size="medium" :src="circleUrl"></el-avatar>
                    </div>
                    <div style="margin-left: 15px;">
                      <div style="margin-bottom:10px;height: 10px;font-size: 14px">
                        root
                      </div>
                      <div style="height: 10px;font-size: 12px">
                        两个小时 前发布了一条问题
                      </div>
                    </div>
                  </div>
                  <div class="text item">
                    <div class="ques-title" style="font-size: 16px">
                      发布的第一条问题
                    </div>
                    <div class="ques-content" style="margin:6px 0 6px 0;font-size: 14px">
                      发布问题的一些内容
                    </div>
                    <div class="ques-footer" style="margin-top: 14px;margin-bottom: -6px;">
                      <el-button class="zan_btn" icon="el-icon-my-export" circle></el-button>
                      <el-button icon="el-icon-star-off" circle></el-button>
                      <el-button icon="el-icon-share" circle></el-button>
                      <el-badge value="12" class="item" style="float: right;margin-right: 30px;">
                        <el-button size="small" style="border-radius: 20px;width: 64px">评论</el-button>
                      </el-badge>
                    </div>
                  </div>
                </el-card>
              </div>


            </div>
          </el-tab-pane>
        </el-tabs>
        <!--          问题列表-->
      </el-col>
      <!--        右栏-->
      <el-col :span="6" class="grid-you" style="top: 52px;position:sticky;">
        <div class="grid-content">
          <el-card class="box-card">
            <div style="margin-bottom: 20px">最多讨论
              <el-tag type="danger" style="height: 20px;line-height: 20px;margin-left: 5px;">HOT</el-tag>
            </div>
            <div>
              <div class="hot-item">
                <span class="hot-item-index">1</span>
                第一条问题</div>
              <div class="hot-item">
                <span class="hot-item-index">2</span>
                第二条问题测试长度啊啊啊啊啊啊啊啊啊</div>
              <div class="hot-item">
                <span class="hot-item-index">3</span>
                第一条问题</div>
              <div class="hot-item">
                <span class="hot-item-index">4</span>
                第一条问题</div>
              <div class="hot-item">
                <span class="hot-item-index">5</span>
                第一条问题</div>
              <div class="hot-item">
                <span class="hot-item-index">6</span>
                第一条问题</div>
              <div class="hot-item">
                <span class="hot-item-index">7</span>
                第一条问题</div>
              <div class="hot-item">
                <span class="hot-item-index">8</span>
                第一条问题</div>
              <div class="hot-item">
                <span class="hot-item-index">9</span>
                第一条问题</div>
              <div class="hot-item">
                <span class="hot-item-index">10</span>
                第一条问题</div>

            </div>
          </el-card>
          <el-card>
            <div style="margin-bottom: 20px">个人中心
            </div>
            <div class="user-space">
              <el-col>
                <el-menu
                    default-active="2"
                    class="el-menu-vertical-demo"
                    @open="handleOpen"
                    @close="handleClose">
                  <el-menu-item index="1">
                    <i class="el-icon-edit"></i>
                    <span slot="title">我提出的问题</span>
                  </el-menu-item>
                  <el-menu-item index="2">
                    <i class="el-icon-edit-outline"></i>
                    <span slot="title">我回答的问题</span>
                  </el-menu-item>
                  <el-menu-item index="3">
                    <i class="el-icon-thumb"></i>
                    <span slot="title">我点赞的问题</span>
                  </el-menu-item>
                  <el-menu-item index="4">
                    <i class="el-icon-folder-add"></i>
                    <span slot="title">我收藏的问题</span>
                  </el-menu-item>
                </el-menu>
              </el-col>
            </div>
          </el-card>
        </div>
      </el-col>
    </el-row>
  </div>
</template>

<script>
const appData = require("@/assets/images/emojis.json");

export default {
  name: 'home',
  data(){
    return{
      selectvalue:'',
      content: "",
      emojiShow: false,
      faceList: [],
      getBrowString: "",
      dialogImageUrl: '',
      dialogVisible: false,
      disabled: false,
      checked: true,
      activeName: 'first',
      circleUrl: "https://cube.elemecdn.com/3/7c/3ea6beec64369c2642b92c6726f1epng.png",
      options: [{
          value: '选项1',
          label: '学校通知'
        },
        {
          value:'选项2',
          label: '杂事'
        }
      ]
    }
  },
  created() {
    this.loadEmojis();
  },
  methods:{
    handleOpen(){},
    handleClose(){

    },
    handleClick(tab, event) {
      console.log(tab, event);
    },
    //加载表情，存放到表情列表中
    loadEmojis(){
      for(let i in appData){
        this.faceList.push(appData[i].char);
      }
    },
    // 获取用户点击之后的标签 ，存放到输入框内
    getBrow(index){
      for(let i in this.faceList){
        if(index == i){
          this.getBrowString = this.faceList[index];
          this.content += this.getBrowString;
        }
      }
      this.emojiShow = false;
    },
    submitMessage(){

    },
    handleRemove(file) {
      console.log(file);
    },
    handlePictureCardPreview(file) {
      this.dialogImageUrl = file.url;
      this.dialogVisible = true;
    },
  }
  ,
  components: {
  }
}
</script>
<style>
.user-space>.el-col>.el-menu{
  border-right: none;
}
.user-space>.el-col>.el-menu>.el-menu-item{
  margin-left: -20px;
}
.el-upload-list--picture-card .el-upload-list__item{
  width: 60px;
  height: 40px;
  margin-top: 6px;
}
.select_ques{
  width: 200px;
  margin-right: 14px;
}
.ques-footer>.el-button{
  padding: 9px 22px 22px 8px;
}
.el-icon-my-export{
  background: url('../assets/appreciate.png') no-repeat;
  font-size: 14px;
  background-size: cover;
}
.zan_btn:hover .el-icon-my-export{
  background: url('../assets/appreciate_f.png') no-repeat;
  font-size: 14px;
  background-size: cover;
}
.el-icon-my-export:before{
  content: "替";
  font-size: 14px;
  visibility: hidden;
}
.ques-footer>.el-button{
  width: 10px;
  height: 10px;
  line-height: 10px;
}
.ques-footer>.el-button>i{
  position: relative;
}
.grid-middle{
  background-color: #f1f2f5;
}

.grid-you{
  background-color: #f1f2f5;
}
.browBox {
  width: 100%;
  height: 200px;
  background: white;
  position: absolute;
  z-index: 100;
  overflow: scroll;
}
.browBox>ul{
  display: flex;
  flex-wrap: wrap;
  padding: 10px;
}
.browBox>ul>li{
  cursor: pointer;
  padding: 4px;
  font-size: 18px;
  list-style: none;
  text-align: center;
}
.browBox>ul>li:hover{
  background-color: #ededed;
}
.submit-btn {
  width: 70px;
  height: 36px;
  border-radius: 20px;
  margin: 6px 10px 10px 0;
}

.el-upload,
.el-upload--picture-card{
  margin-top: 6px;
  width: 60px;
  height: 40px;
  line-height: 46px;
}
.anony-check{
  padding-right: 20px;
}
.right-btn{
  float: right;
}
.hot-item{
  margin-bottom: 15px;
  overflow:hidden;
  white-space: nowrap;
  text-overflow:ellipsis;
}
.hot-item-index{
  color: #FFAA55;
  font-size: 16px;
  margin-right: 10px;
}
.el-tabs--card>.el-tabs__header .el-tabs__item{
  color: #808080;
}
.el-tabs--card>.el-tabs__header .el-tabs__item.is-active{
  color: #409eff;
  background-color: white;
}
.grid-content>.el-card{
  margin: 18px 50px 8px 0px;
  padding-left: 20px
}
.grid-content>.el-card,
.grid-zuo>.el-card
{
  box-shadow:none;
  -webkit-box-shadow:none;
}
.ques-header~.el-card{
  box-shadow: 0 20px 2px 1px rgba(27,31,36,0.04) !important;
  -webkit-box-shadow: 0 3px 3px 1px rgba(27,31,36,0.04) !important;
  border-color: #d0d7de;
  border-radius: 6px;
}
.user-item{
  margin-bottom: 15px;
}
</style>