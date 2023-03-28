<template>
  <div class="all">
    <the-header></the-header>
    <div class="page-wrapper">
      <div class="page-body">
        <div class="container-xl">
          <div class="row row-deck row-cards">

<!--            左栏-->
            <div class="col-3">
              <div class="card">
                <div class="card-body" style=""></div>
              </div>
            </div>

<!--            中栏-->
            <div class="col-6">
              <div class="col">

<!--                发布问题-->
                <div class="card" style="margin-bottom: 10px">
                  <div class="card-body" style="height: 4.5rem">
                    <input type="text" class="firstField form-control"  data-bs-toggle="modal" data-bs-target="#quesModal" placeholder="来提个问/分享点什么吧！">
                  </div>
                </div>

<!--                问题列表-->
                <div>
                  <div class="card" style="margin-bottom: 10px">
<!--                    头部（头像、姓名、发布时间-->
                    <div class="row" style="margin: 20px 20px 0px 16px">
                      <div class="col-auto">
                        <span class="avatar rounded-circle" style="width: 46px;height: 46px"></span>
                      </div>
                      <div class="col" style="padding-top: 4px;padding-left:6px">
                        <div class="text-truncate">
                          <strong>ROOT</strong>
                        </div>
                        <div class="text-muted">2 days ago</div>
                      </div>
                    </div>
<!--                    内容（发布内容-->
                    <div class="card-body" style="margin-left: 64px">
                      发布了一条问题
                    </div>
<!--                    尾部（转发、评论、点赞-->
                    <div class="row" style="color:#828282;margin: 4px 15px 10px 15px;text-align: center">
                      <div class="col-3">
                        <span>
                          <svg xmlns="http://www.w3.org/2000/svg" class="icon icon-tabler icon-tabler-heart" width="24" height="24" viewBox="0 0 24 24" stroke-width="2" stroke="currentColor" fill="none" stroke-linecap="round" stroke-linejoin="round"><path stroke="none" d="M0 0h24v24H0z" fill="none"></path><path d="M19.5 12.572l-7.5 7.428l-7.5 -7.428a5 5 0 1 1 7.5 -6.566a5 5 0 1 1 7.5 6.572"></path></svg>
                        </span>
                      </div>
                      <div class="col-3">
                        <span>
                          <svg xmlns="http://www.w3.org/2000/svg" class="icon icon-tabler icon-tabler-star" width="24" height="24" viewBox="0 0 24 24" stroke-width="2" stroke="currentColor" fill="none" stroke-linecap="round" stroke-linejoin="round"><path stroke="none" d="M0 0h24v24H0z" fill="none"></path><path d="M12 17.75l-6.172 3.245l1.179 -6.873l-5 -4.867l6.9 -1l3.086 -6.253l3.086 6.253l6.9 1l-5 4.867l1.179 6.873z"></path></svg>
                        </span>
                      </div>
                      <div class="col-3">
                        <span>
                          <svg xmlns="http://www.w3.org/2000/svg" class="icon icon-tabler icon-tabler-message-circle-2" width="24" height="24" viewBox="0 0 24 24" stroke-width="2" stroke="currentColor" fill="none" stroke-linecap="round" stroke-linejoin="round"><path stroke="none" d="M0 0h24v24H0z" fill="none"></path><path d="M3 20l1.3 -3.9a9 8 0 1 1 3.4 2.9l-4.7 1"></path></svg>
                        </span>
                      </div>
                      <div class="col-3">
                        <span>
                          <svg xmlns="http://www.w3.org/2000/svg" class="icon icon-tabler icon-tabler-arrow-forward-up" width="24" height="24" viewBox="0 0 24 24" stroke-width="2" stroke="currentColor" fill="none" stroke-linecap="round" stroke-linejoin="round"><path stroke="none" d="M0 0h24v24H0z" fill="none"></path><path d="M15 14l4 -4l-4 -4"></path><path d="M19 10h-11a4 4 0 1 0 0 8h1"></path></svg>
                        </span>
                      </div>
                    </div>
                  </div>
                  <div class="card" style="margin-bottom: 10px">
                    <!--                    头部（头像、姓名、发布时间-->
                    <div class="row" style="margin: 20px 20px 0px 16px">
                      <div class="col-auto">
                        <span class="avatar rounded-circle" style="width: 46px;height: 46px"></span>
                      </div>
                      <div class="col" style="padding-top: 4px;padding-left:6px">
                        <div class="text-truncate">
                          <strong>ROOT</strong>
                        </div>
                        <div class="text-muted">2 days ago</div>
                      </div>
                    </div>
                    <!--                    内容（发布内容-->
                    <div class="card-body" style="margin-left: 64px">
                      发布了一条问题
                    </div>
                    <!--                    尾部（转发、评论、点赞-->
                    <div class="row" style="color:#828282;margin: 4px 15px 10px 15px;text-align: center">
                      <div class="col-3">
                        <span>
                          <svg xmlns="http://www.w3.org/2000/svg" class="icon icon-tabler icon-tabler-heart" width="24" height="24" viewBox="0 0 24 24" stroke-width="2" stroke="currentColor" fill="none" stroke-linecap="round" stroke-linejoin="round"><path stroke="none" d="M0 0h24v24H0z" fill="none"></path><path d="M19.5 12.572l-7.5 7.428l-7.5 -7.428a5 5 0 1 1 7.5 -6.566a5 5 0 1 1 7.5 6.572"></path></svg>
                        </span>
                      </div>
                      <div class="col-3">
                        <span>
                          <svg xmlns="http://www.w3.org/2000/svg" class="icon icon-tabler icon-tabler-star" width="24" height="24" viewBox="0 0 24 24" stroke-width="2" stroke="currentColor" fill="none" stroke-linecap="round" stroke-linejoin="round"><path stroke="none" d="M0 0h24v24H0z" fill="none"></path><path d="M12 17.75l-6.172 3.245l1.179 -6.873l-5 -4.867l6.9 -1l3.086 -6.253l3.086 6.253l6.9 1l-5 4.867l1.179 6.873z"></path></svg>
                        </span>
                      </div>
                      <div class="col-3">
                        <span>
                          <svg xmlns="http://www.w3.org/2000/svg" class="icon icon-tabler icon-tabler-message-circle-2" width="24" height="24" viewBox="0 0 24 24" stroke-width="2" stroke="currentColor" fill="none" stroke-linecap="round" stroke-linejoin="round"><path stroke="none" d="M0 0h24v24H0z" fill="none"></path><path d="M3 20l1.3 -3.9a9 8 0 1 1 3.4 2.9l-4.7 1"></path></svg>
                        </span>
                      </div>
                      <div class="col-3">
                        <span>
                          <svg xmlns="http://www.w3.org/2000/svg" class="icon icon-tabler icon-tabler-arrow-forward-up" width="24" height="24" viewBox="0 0 24 24" stroke-width="2" stroke="currentColor" fill="none" stroke-linecap="round" stroke-linejoin="round"><path stroke="none" d="M0 0h24v24H0z" fill="none"></path><path d="M15 14l4 -4l-4 -4"></path><path d="M19 10h-11a4 4 0 1 0 0 8h1"></path></svg>
                        </span>
                      </div>
                    </div>
                  </div>
                  <div class="card" style="margin-bottom: 10px">
                    <!--                    头部（头像、姓名、发布时间-->
                    <div class="row" style="margin: 20px 20px 0px 16px">
                      <div class="col-auto">
                        <span class="avatar rounded-circle" style="width: 46px;height: 46px"></span>
                      </div>
                      <div class="col" style="padding-top: 4px;padding-left:6px">
                        <div class="text-truncate">
                          <strong>ROOT</strong>
                        </div>
                        <div class="text-muted">2 days ago</div>
                      </div>
                    </div>
                    <!--                    内容（发布内容-->
                    <div class="card-body" style="margin-left: 64px">
                      发布了一条问题
                    </div>
                    <!--                    尾部（转发、评论、点赞-->
                    <div class="row" style="color:#828282;margin: 4px 15px 10px 15px;text-align: center">
                      <div class="col-3">
                        <span>
                          <svg xmlns="http://www.w3.org/2000/svg" class="icon icon-tabler icon-tabler-heart" width="24" height="24" viewBox="0 0 24 24" stroke-width="2" stroke="currentColor" fill="none" stroke-linecap="round" stroke-linejoin="round"><path stroke="none" d="M0 0h24v24H0z" fill="none"></path><path d="M19.5 12.572l-7.5 7.428l-7.5 -7.428a5 5 0 1 1 7.5 -6.566a5 5 0 1 1 7.5 6.572"></path></svg>
                        </span>
                      </div>
                      <div class="col-3">
                        <span>
                          <svg xmlns="http://www.w3.org/2000/svg" class="icon icon-tabler icon-tabler-star" width="24" height="24" viewBox="0 0 24 24" stroke-width="2" stroke="currentColor" fill="none" stroke-linecap="round" stroke-linejoin="round"><path stroke="none" d="M0 0h24v24H0z" fill="none"></path><path d="M12 17.75l-6.172 3.245l1.179 -6.873l-5 -4.867l6.9 -1l3.086 -6.253l3.086 6.253l6.9 1l-5 4.867l1.179 6.873z"></path></svg>
                        </span>
                      </div>
                      <div class="col-3">
                        <span>
                          <svg xmlns="http://www.w3.org/2000/svg" class="icon icon-tabler icon-tabler-message-circle-2" width="24" height="24" viewBox="0 0 24 24" stroke-width="2" stroke="currentColor" fill="none" stroke-linecap="round" stroke-linejoin="round"><path stroke="none" d="M0 0h24v24H0z" fill="none"></path><path d="M3 20l1.3 -3.9a9 8 0 1 1 3.4 2.9l-4.7 1"></path></svg>
                        </span>
                      </div>
                      <div class="col-3">
                        <span>
                          <svg xmlns="http://www.w3.org/2000/svg" class="icon icon-tabler icon-tabler-arrow-forward-up" width="24" height="24" viewBox="0 0 24 24" stroke-width="2" stroke="currentColor" fill="none" stroke-linecap="round" stroke-linejoin="round"><path stroke="none" d="M0 0h24v24H0z" fill="none"></path><path d="M15 14l4 -4l-4 -4"></path><path d="M19 10h-11a4 4 0 1 0 0 8h1"></path></svg>
                        </span>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>

<!--            右栏-->
            <div class="col-3">
              <div class="card">
<!--                头部-->
                <div class="row" style="margin:20px 16px 0px 16px">
                  <span class="text-pink col-auto">
                    <svg xmlns="http://www.w3.org/2000/svg" class="icon icon-tabler icon-tabler-flame" width="24" height="24" viewBox="0 0 24 24" stroke-width="2" stroke="currentColor" fill="none" stroke-linecap="round" stroke-linejoin="round">
     <path stroke="none" d="M0 0h24v24H0z" fill="none"></path>
     <path d="M12 12c2 -2.96 0 -7 -1 -8c0 3.038 -1.773 4.741 -3 6c-1.226 1.26 -2 3.24 -2 5a6 6 0 1 0 12 0c0 -1.532 -1.056 -3.94 -2 -5c-1.786 3 -2.791 3 -4 2z"></path>
  </svg>
                  </span>
                  <div class="col" style="padding: 2px 0px 0px 0px">讨论最多</div>
                  <div class="col" style="float: right;">
                    <svg xmlns="http://www.w3.org/2000/svg" class="icon icon-tabler icon-tabler-dots" width="24" height="24" viewBox="0 0 24 24" stroke-width="2" stroke="currentColor" fill="none" stroke-linecap="round" stroke-linejoin="round">
                      <path stroke="none" d="M0 0h24v24H0z" fill="none"></path>
                      <path d="M5 12m-1 0a1 1 0 1 0 2 0a1 1 0 1 0 -2 0"></path>
                      <path d="M12 12m-1 0a1 1 0 1 0 2 0a1 1 0 1 0 -2 0"></path>
                      <path d="M19 12m-1 0a1 1 0 1 0 2 0a1 1 0 1 0 -2 0"></path>
                    </svg>
                  </div>
                </div>
                <div class="card-body" style="margin: 2px 8px 0px 8px">
<!--                  热门话题列表-->
                  <div class="hot-ques-item">
                    第一条问题
                  </div>
                  <div class="hot-ques-item">
                    第二条测试长度问题啊啊啊啊h哈哈
                  </div>
                  <div class="hot-ques-item">
                    第三条测试样例qweqweqweqwe
                  </div>
                  <div class="hot-ques-item">
                    第四条
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>

<!--  发布问题详情页-->
  <div class="modal" id="quesModal" tabindex="-1">
    <div class="modal-dialog modal-lg" role="document">
      <div class="modal-content">
        <div class="modal-header">
          <h5 class="modal-title">发布问题</h5>
          <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
        </div>
        <div class="modal-body">
          <label class="form-label" style="text-align: left">问题名称</label>
          <div class="row">
            <div class="col-lg-8">
              <div class="mb-3">
                <input type="text" class="form-control" name="example-text-input" placeholder="请输入您要提出的问题" />
              </div>
            </div>
            <div class="col-lg-4">
              <div class="mb-3">
                <select class="form-select">
                  <option value="1" selected>Private</option>
                  <option value="2">Public</option>
                  <option value="3">Hidden</option>
                </select>
              </div>
            </div>
          </div>
          <div>
            <label class="form-label" style="float:left;">问题描述</label>
            <textarea class="form-control" rows="5" style="resize:none;height: 200px"></textarea>
          </div>
        </div>

<!--        是否匿名-->
        <div class="modal-body">
          <div class="form-selectgroup-boxes row mb-3">
            <div class="col-md-6">
              <label class="form-selectgroup-item">
                <input type="radio" name="report-type" value="1" class="form-selectgroup-input" checked />
                <span class="form-selectgroup-label d-flex align-items-center p-3">
                  <span class="me-3">
                    <span class="form-selectgroup-check"></span>
                  </span>
                  <span class="form-selectgroup-label-content">
                    <span class="form-selectgroup-title strong mb-1">
                    <svg xmlns="http://www.w3.org/2000/svg" class="icon icon-tabler icon-tabler-lock-open" width="24" height="24" viewBox="0 0 24 24" stroke-width="2" stroke="currentColor" fill="none" stroke-linecap="round" stroke-linejoin="round">
   <path stroke="none" d="M0 0h24v24H0z" fill="none"></path>
   <path d="M5 11m0 2a2 2 0 0 1 2 -2h10a2 2 0 0 1 2 2v6a2 2 0 0 1 -2 2h-10a2 2 0 0 1 -2 -2z"></path>
   <path d="M12 16m-1 0a1 1 0 1 0 2 0a1 1 0 1 0 -2 0"></path>
   <path d="M8 11v-5a4 4 0 0 1 8 0"></path>
</svg>
                      不匿名
                    </span>
                    <span class="d-block text-muted">
                      你的信息将会展示给所有人，包括头像、昵称、个人主页等
                    </span>
                  </span>
                </span>
              </label>
            </div>
            <div class="col-md-6">
              <label class="form-selectgroup-item">
                <input type="radio" name="report-type" value="1" class="form-selectgroup-input" />
                <span class="form-selectgroup-label d-flex align-items-center p-3">
                  <span class="me-3">
                    <span class="form-selectgroup-check"></span>
                  </span>
                  <span class="form-selectgroup-label-content">
                    <span class="form-selectgroup-title strong mb-1">
                    <svg xmlns="http://www.w3.org/2000/svg" class="icon icon-tabler icon-tabler-lock" width="24" height="24" viewBox="0 0 24 24" stroke-width="2" stroke="currentColor" fill="none" stroke-linecap="round" stroke-linejoin="round">
   <path stroke="none" d="M0 0h24v24H0z" fill="none"></path>
   <path d="M5 13a2 2 0 0 1 2 -2h10a2 2 0 0 1 2 2v6a2 2 0 0 1 -2 2h-10a2 2 0 0 1 -2 -2v-6z"></path>
   <path d="M11 16a1 1 0 1 0 2 0a1 1 0 0 0 -2 0"></path>
   <path d="M8 11v-4a4 4 0 1 1 8 0v4"></path>
</svg>
                      匿名
                    </span>
                    <span class="d-block text-muted">
                      你的信息将不会展示给任何人，头像、昵称一律被系统展示成匿名状态
                    </span>
                  </span>
                </span>
              </label>
            </div>
          </div>
        </div>

<!--        取消 发布按钮-->
        <div class="modal-footer">
          <a href="#" class="btn btn-link link-secondary" style="width:100px;border-color:#C0C0C0;ext-decoration: none" data-bs-dismiss="modal">
            取消
          </a>
          <a href="#" class="btn btn-primary ms-auto" data-bs-dismiss="modal">
            <svg xmlns="http://www.w3.org/2000/svg" class="icon icon-tabler icon-tabler-send" width="24" height="24" viewBox="0 0 24 24" stroke-width="2" stroke="currentColor" fill="none" stroke-linecap="round" stroke-linejoin="round"><path stroke="none" d="M0 0h24v24H0z" fill="none"></path><path d="M10 14l11 -11"></path><path d="M21 3l-6.5 18a.55 .55 0 0 1 -1 0l-3.5 -7l-7 -3.5a.55 .55 0 0 1 0 -1l18 -6.5"></path></svg>
            发布问题
          </a>
        </div>
      </div>
    </div>
  </div>
<!--  <router-view/>-->
</template>

<script lang="ts">
  import {defineComponent} from "vue";
  import TheHeader from '@/components/the-header.vue';

  export default defineComponent({
    name:'app',
    components:{
      TheHeader
    }
  });
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  color: #2c3e50;
}
.all{
  background-color: #F5F5F5;
}
.btn-link:hover, .btn-link:focus-visible{
  text-decoration: none;
}
.hot-ques-item{
  overflow:hidden;
  white-space: nowrap;
  text-overflow:ellipsis;
  margin-bottom: 10px;
}
</style>
