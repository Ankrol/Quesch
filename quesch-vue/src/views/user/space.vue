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
          <div><el-button v-if="profile_btn" @click="profile" style="margin-top: 30px">修改个人信息</el-button></div>
          <div><el-button v-if="secure_btn" @click="secure" style="margin-top: 20px">账号安全</el-button></div>

          <el-form style="margin-top:30px;margin-right:20px" v-if="profile_flag" :rules="rules" ref="form" :model="form" label-width="80px">
            <el-form-item label="用户名" prop="username">
              <el-input v-model="form.username"></el-input>
            </el-form-item>
            <el-form-item label="密码" prop="password">
              <el-input v-model="form.password" type="password"></el-input>
            </el-form-item>
            <el-button type="primary" @click="saveChange">保存</el-button>
            <el-button @click="profile_cancel">取消</el-button>
          </el-form>
          <div v-if="secure_flag" style="margin-top:30px;margin-right:20px;font-size: 14px">
          <div style="margin-bottom: 26px;">
            <div style="margin-bottom: 20px;display: flex;justify-content: center;align-items: center">
              未绑定QQ账号
                <img style="margin-left: 15px" width="30" height="30" src="../../assets/social/qq.png" alt="">
            </div>
            <div style="display: flex;align-items: center;justify-content: center;">
              未绑定微信账号
                <img style="margin-left: 10px" width="30" height="30" src="../../assets/social/vx.png" alt="">
            </div>
          </div>
            <el-button type="primary">保存</el-button>
            <el-button @click="secure_cancel">取消</el-button>
          </div>
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
                    <el-button type="primary" plain @click="centerDialogVisible = true"><i class="el-icon-edit"></i>编辑</el-button>
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


    <el-dialog
        title="编辑问题"
        :visible.sync="centerDialogVisible"
        width="40%"
        center>
      <el-form ref="form" :model="form" label-width="80px" style="margin-right: 50px">
        <el-form-item label="问题标题">
          <el-input v-model="form.name"></el-input>
        </el-form-item>
        <el-form-item label="问题类别">
          <el-select v-model="form.region" placeholder="请选择分类">
            <el-option label="区域一" value="shanghai"></el-option>
            <el-option label="区域二" value="beijing"></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="问题描述">
          <el-input type="textarea" :autosize="{ minRows: 3}" v-model="form.desc"></el-input>
        </el-form-item>
      </el-form>
      <span slot="footer" class="dialog-footer">
    <el-button type="primary" @click="onSubmit">确 定</el-button>
    <el-button @click="centerDialogVisible = false">取 消</el-button>
  </span>
    </el-dialog>
  </div>
</template>

<script>
import Cookies from "js-cookie";
import request from "@/utils/request";

export default {
  name: "space",
  data(){
    return{
      centerDialogVisible: false,
      form: {
        id:'',
        username:'',
        password:''
      },
      rules: {
        username: [
          { min: 3, max: 10, message: '用户名至少三个字', trigger: 'blur' }
        ],
        password: [
          { min: 6, max: 20, message: '密码至少六位数', trigger: 'blur' }
        ]}
      ,
      profile_flag:0,
      secure_flag:0,
      profile_btn:1,
      secure_btn:1,
      user:Cookies.get('user')?JSON.parse(Cookies.get('user')):{},
      activeName: 'first'
    }
  },
  methods:{
    onSubmit(){
      this.centerDialogVisible = false;

    },
    handleClick() {
    }
    ,profile(){
      this.profile_flag = 1;
      this.profile_btn = 0;
      this.secure_flag = 0;
      this.secure_btn = 1;
    },
    secure(){
      this.secure_flag = 1;
      this.secure_btn = 0;
      this.profile_flag = 0;
      this.profile_btn = 1;
    },
    profile_cancel(){
      this.profile_flag = 0;
      this.profile_btn = 1;
    },
    secure_cancel(){
      this.secure_flag = 0;
      this.secure_btn = 1;
    },
    saveChange(){
      this.$refs['form'].validate((valid)=>{
        if (valid){
          this.form.id = this.user.id;
          request.put('/user/changeInfo',this.form).then(res=>{
            if(res.code === '200'){
              this.$message.success('修改成功');
            }else{
              this.$message.error(res.msg);
            }
          })
        }
      })
      this.profile_flag = 0;
      this.profile_btn = 1;
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