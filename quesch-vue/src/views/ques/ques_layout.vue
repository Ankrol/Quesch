<template>
  <div class="all">
    <el-card style="margin:30px 300px 12px 300px">
      <div class="classify-header" style="display: flex">
        <div style="margin-left: 15px;">
          <div style="margin-bottom:10px;font-size: 24px">
            问题分类
            <el-tag style="height: 26px;line-height: 26px">专区</el-tag>
          </div>
          <div style="font-size: 16px">
            <el-tag type="warning" style="height: 24px;line-height: 24px">热度 100条</el-tag>
          </div>
        </div>
      </div>
    </el-card>
    <div class="content" style="margin:10px 300px">
      <el-row>
        <el-col :span="16" >
          <el-tabs v-model="activeName" style="margin-right: 10px" type="card" @tab-click="handleClick">
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

        </el-col>
        <el-col :span="8">
          <el-card style="text-align: center;margin-top: 40px">
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
          <el-card></el-card>
        </el-col>
      </el-row>

    </div>
  </div>
</template>

<script>
export default {
  name: "classify",
  data(){
    return{
      activeName: 'first',
    }
  }
}
</script>

<style scoped>
.el-card
{
  box-shadow:none;
  -webkit-box-shadow:none;
}
</style>