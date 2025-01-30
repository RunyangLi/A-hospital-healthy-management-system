<!--
 * 医生首页
 *
-->
<template>
  <div>
    <el-row>
      <el-col :span="24">
        <div style="text-align: center;width: 100%;font-size: 32px;margin-top: 250px">
          <h1><span style="color: rebeccapurple;">欢迎登录医院预约挂号管理系统</span></h1>
        </div>
      </el-col>
    </el-row>

  </div>
</template>
<script>
import request from "@/utils/request.js";
import jwtDecode from "jwt-decode";
import { getToken } from "@/utils/storage.js";
export default {
    name: "DoctorLayout",
    data() {
        return {
            userId: 1,
            orderPeople: 1,
        };
    },
    methods: {
        //token解码
        tokenDecode(token) {
            if (token !== null) return jwtDecode(token);
        },
        requestPeople() {
            request
                .get("order/orderPeopleByDid", {
                    params: {
                        dId: this.userId,
                    },
                })
                .then((res) => {
                    if (res.data.status !== 200)
                        return this.$message.error("数据请求失败");
                    this.orderPeople = res.data.data;
                });
        },
    },
    created() {
        this.userId = this.tokenDecode(getToken()).dId;
        this.requestPeople();
    },
};
</script>
<style lang="scss" scoped>
.userFont {
    height: 150px;
    width: 250px;
    color: white;
    float: right;
    .spanCure {
        font-size: 15px;
        margin-top: 60px;
        margin-bottom: 15px;
    }
    .spanPeople {
        font-size: 18px;
    }
}

.userImage {
    height: 150px;
    width: 150px;
    font-size: 130px;
    color: white;
    float: left;
    position: relative;
    left: 40px;
    top: 10px;
}
.indexPeople {
    height: 200px;
    width: 500px;
    background: #58b9ae;
    margin-top: 50px;
    margin-left: 30px;
}
</style>
