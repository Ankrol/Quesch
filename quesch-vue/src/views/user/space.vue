<template>
  <div class="all">
    <el-row :gutter="2">
<!--      个人信息-->
      <el-col :span="6" :offset="3">
        <el-card class="box-card header">
          <el-avatar :size="120" src="" shape="square"></el-avatar>
          <div class="user_name">{{ user.username }}</div>
          <el-divider></el-divider>
          <el-row style="font-size: 14px">
            <el-col :span="8">
              关注
              <div style="margin-top: 6px;">0</div>
            </el-col>
              <el-col :span="8">
                粉丝
                <div style="margin-top: 6px;">0</div>
              </el-col>
              <el-col :span="8">
                回答
                <div style="margin-top: 6px;">0</div>
              </el-col>
          </el-row>
        </el-card>
      </el-col>


<!--      标签页-->
      <el-col :span="12">
        <div class="tab-all">
          <el-card class="box-card">
          <el-tabs v-model="activeName" type="card" @tab-click="handleClick">
            <el-tab-pane label="我提出的问题" name="first">

              <div class="ques-one infinite-list-item" style="margin:10px -10px 10px -10px">
                <!--              问题头部（昵称、发布了一条问题-->
                <!--              问题内容主体-->
                <el-card class="box-card">
                  <div class="text item" style="float:left;">
                    <div class="ques-title" style="font-size: 16px">
                      发布的第一条问题
                    </div>
                    <div class="ques-content" style="margin:6px 0 20px 0;font-size: 14px">
                      发布问题的一些内容
                    </div>
                  </div>
                  <div style="float: right">
                    <el-button type="primary" plain><i class="el-icon-edit"></i>编辑</el-button>
                    <el-button><i class="el-icon-delete"></i></el-button>
                  </div>
                </el-card>
              </div>
              <div class="ques-one infinite-list-item" style="margin:10px -10px 10px -10px">
                <!--              问题头部（昵称、发布了一条问题-->
                <!--              问题内容主体-->
                <el-card class="box-card">
                  <div class="text item" style="float:left;">
                    <div class="ques-title" style="font-size: 16px">
                      发布的第一条问题
                    </div>
                    <div class="ques-content" style="margin:6px 0 20px 0;font-size: 14px">
                      发布问题的一些内容
                    </div>
                  </div>
                  <div style="float: right">
                    <el-button type="primary" plain><i class="el-icon-edit"></i>编辑</el-button>
                    <el-button><i class="el-icon-delete"></i></el-button>
                  </div>
                </el-card>
              </div>

            </el-tab-pane>
            <el-tab-pane label="我回答的问题" name="second">
              <div class="ques-one infinite-list-item" style="margin:10px 0px 10px 0px">
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
                  </div>
                </el-card>
              </div>
              <div class="ques-one infinite-list-item" style="margin:10px 0px 10px 0px">
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
                  </div>
                </el-card>
              </div>
            </el-tab-pane>
            <el-tab-pane label="我点赞的问题" name="third">
              <div class="ques-one infinite-list-item" style="margin:10px 0px 10px 0px">
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
                  </div>
                </el-card>
              </div>
              <div class="ques-one infinite-list-item" style="margin:10px 0px 10px 0px">
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
                  </div>
                </el-card>
              </div>
            </el-tab-pane>
            <el-tab-pane label="我收藏的问题" name="fourth">
              <div class="ques-one infinite-list-item" style="margin:10px 0px 10px 0px">
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
                  </div>
                </el-card>
              </div>
              <div class="ques-one infinite-list-item" style="margin:10px 0px 10px 0px">
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
                  </div>
                </el-card>
              </div>
            </el-tab-pane>
          </el-tabs>
          </el-card>
        </div>
      </el-col>
    </el-row>
  </div>
</template>

<script>
import Cookies from "js-cookie";

export default {
  name: "space",
  data(){
    return{
      user:Cookies.get('user')?JSON.parse(Cookies.get('user')):{},
      activeName: 'first'
    }
  },
  methods: {
    handleClick(tab, event) {
      console.log(tab, event);
    }
  }
}
</script>

<style scoped>
.header{
  margin:30px 0 0 40px;
  text-align: center;
}
.avatar{
  margin:20px 0 0 20px;
  display: flex;
}
.user_name{
  padding: 0 10px;
  font-size: 20px;
  margin-top: 30px;
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}
.tab-all{
  margin:30px 0 0 10px;
}

.el-card
{
  box-shadow:none;
  -webkit-box-shadow:none;
}
</style>