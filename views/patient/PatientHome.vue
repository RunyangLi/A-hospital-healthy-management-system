<!--
 * 病患首页
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
export default {
    name: "PatientLayout",
    data() {
        return {
            orderPeople: 1,
            bedPeople: 1,
        };
    },
    methods: {
        requestPeople() {
            request
                .get("order/orderPeople")
                .then((res) => {
                    if (res.data.status !== 200)
                        return this.$message.error("数据请求失败");
                    this.orderPeople = res.data.data;
                })
                .catch((err) => {
                    console.error(err);
                });
        },
        requestBed() {
            request
                .get("bed/bedPeople")
                .then((res) => {
                    if (res.data.status !== 200)
                        return this.$message.error("数据请求失败");
                    this.bedPeople = res.data.data;
                })
                .catch((err) => {
                    console.error(err);
                });
        },
    },
    created() {
        this.requestPeople();
        this.requestBed();
    },
};
</script>
<style lang="scss" scoped>
.userFont {
    height: 150px;
    width: 250px;
    float: right;
    color: white;
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
    position: relative;
    left: 40px;
    top: 10px;
    float: left;
}
.indexPeople {
    height: 200px;
    width: 440px;
    background: #58b9ae;
    float: left;
    margin: 30px;
}
</style>
