<!--
 * 医生用户主题布局
 *

-->
<template>
  <el-container>
    <!-- 头部 -->
    <el-header>
      <div class="font_words">
          <span @click="menuClick('adminLayout')">
            <img src="../../assets/logo.png" style="width: 35px;position: relative; top: 8px;right: 6px"/>
             <span style="color: rebeccapurple;font-size: 20px">医院预约挂号管理系统</span>
          </span>
      </div>

      <div class="font_words">
        <span>欢迎您，<b>{{ userName }}</b>&nbsp;医生&nbsp;</span>
        <span><el-button type="danger" round size="mini" @click="logoutDoctor">退出</el-button></span>
      </div>
    </el-header>

    <el-container>
      <!-- 侧边栏 -->
      <el-aside width="200px">
        <!-- 导航菜单 -->
        <el-menu
          background-color="white"
          text-color="black"
          active-text-color="black"
          :default-active="activePath"
          style="font-size: 22px;"
        >

          <el-menu-item index="doctorLayout" @click="menuClick('doctorLayout')">
            <i class="iconfont icon-homepage-menu" style="font-size: 18px;"> 首页</i>
          </el-menu-item>
          <el-menu-item index="orderToday" @click="menuClick('orderToday')">
            <i class="iconfont icon-orders-menu" style="font-size: 18px;"> 今日挂号列表</i>
          </el-menu-item>
            <el-menu-item index="doctorOrder" @click="menuClick('doctorOrder')">
            <i class="iconfont icon-checks-menu" style="font-size: 18px;"> 历史挂号列表</i>
          </el-menu-item>
            <el-menu-item index="inBed" @click="menuClick('inBed')">
            <i class="iconfont icon-bed-menu" style="font-size: 18px;"> 住院申请管理</i>
          </el-menu-item>
           <el-menu-item index="doctorCard" @click="menuClick('doctorCard')">
            <i class="iconfont icon-doctor-menu" style="font-size: 18px;"> 个人信息查询</i>
          </el-menu-item>

        </el-menu>
      </el-aside>
      <el-main>
        <!-- 子路由入口 -->
        <router-view></router-view>
      </el-main>
    </el-container>
  </el-container>
</template>
<script>
import jwtDecode from "jwt-decode";
import { getToken, clearToken, getActivePath, setActivePath} from "@/utils/storage.js";
export default {
  name: "Doctor",
  data() {
    return {
      userName: "",
      activePath:"",
    };
  },
  methods: {
    //token解码
    tokenDecode(token){
      if (token !== null)
      return jwtDecode(token);
    },
    //导航栏点击事件
    menuClick(path){
      this.activePath=path;
            setActivePath(path);
            if(this.$route.path !== "/"+path) this.$router.push(path);
    },
    //退出登录
    logoutDoctor() {
      this.$confirm("此操作将退出登录, 是否继续?", "提示", {
        confirmButtonText: "确定",
        cancelButtonText: "取消",
        type: "warning",
      })
        .then(() => {
          clearToken();
          this.$message({
            type: "success",
            message: "退出登录成功!",
          });
          this.$router.push("login");
        })
        .catch(() => {
          this.$message({
            type: "info",
            message: "已取消",
          });
        });
    },
  },
   created() {
     // 获取激活路径
     this.activePath=getActivePath();
     // 解码token
     this.userName = this.tokenDecode(getToken()).dName;
    }
};
</script>
<style scoped lang="scss">
.title{
  cursor: pointer;
}
.el-header {
  background-color: rgba(52, 114, 166, 0.18);
  display: flex;
  justify-content: space-between;
  align-items: center;
  border-bottom: 1px solid lightgrey;
  .font_words {
    text-align: center;
    span {
      color: black;
    }
  }
}
.el-container{
        height: 100%;
    }
.el-aside{
  background-color:white;
  border-right: 1px solid lightgrey;
}
.el-menu{
  border: 0;
}
</style>
