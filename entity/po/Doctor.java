package com.hello.hospital.entity.po;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * 医生
 *

 */
@Data
@TableName("doctor_user")
@ExcelTarget("doctor")
public class Doctor {

    /**
     * 医生id （账号）
     */
    @TableId(value = "d_id")
    @Excel(name = "账号")
    @JsonProperty("dId")
    private Integer dId;

    /**
     * 密码
     */
    @Excel(name = "密码")
    @JsonProperty("dPassword")
    private String dPassword;

    /**
     * 姓名
     */
    @Excel(name = "姓名")
    @JsonProperty("dName")
    private String dName;

    /**
     * 性别
     */
    @Excel(name = "性别")
    @JsonProperty("dGender")
    private String dGender;

    /**
     * 身份证号码
     */
    @Excel(name = "身份证号码")
    @JsonProperty("dCard")
    private String dCard;

    /**
     * 邮箱
     */
    @Excel(name = "邮箱")
    @JsonProperty("dEmail")
    private String dEmail;

    /**
     * 手机号
     */
    @Excel(name = "手机号")
    @JsonProperty("dPhone")
    private String dPhone;

    /**
     * 职位
     */
    @Excel(name = "职位")
    @JsonProperty("dPost")
    private String dPost;

    /**
     * 简介
     */
    @Excel(name = "简介")
    @JsonProperty("dIntroduction")
    private String dIntroduction;

    /**
     * 科室
     */
    @Excel(name = "科室")
    @JsonProperty("dSection")
    private String dSection;

    /**
     * 是否在职
     */
    @Excel(name = "是否在职", replace = {"在职_1","离职_0"})
    @JsonProperty("dState")
    private Integer dState;

    /**
     * 挂号价格
     */
    @Excel(name = "挂号价格")
    @JsonProperty("dPrice")
    private Double dPrice;

    /**
     * 评价人数
     */
    @Excel(name = "评价人数")
    @JsonProperty("dPeople")
    private Integer dPeople;

    /**
     * 总分
     */
    @Excel(name = "总分")
    @JsonProperty("dStar")
    private Double dStar;

    /**
     * 平均分
     */
    @Excel(name = "平均分")
    @JsonProperty("dAvgStar")
    private Double dAvgStar;

    /**
     * 是否已排班，排班id
     */
    @TableField(exist = false)
    @JsonProperty("arrangeId")
    private String arrangeId;

}
