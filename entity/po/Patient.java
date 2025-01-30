package com.hello.hospital.entity.po;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * 患者
 *
 *

 */
@Data
@TableName("patient_user")
public class Patient {

    /**
     * 主键 (患者账号)
     */
    @TableId(value = "p_id")
    @JsonProperty("pId")
    private int pId;

    /**
     * 密码
     */
    @JsonProperty("pPassword")
    private String pPassword;

    /**
     * 名字
     */
    @JsonProperty("pName")
    private String pName;

    /**
     * 性别
     */
    @JsonProperty("pGender")
    private String pGender;

    /**
     * 证件号码
     */
    @JsonProperty("pCard")
    private String pCard;

    /**
     * 邮箱
     */
    @JsonProperty("pEmail")
    private String pEmail;


    /**
     * 手机号
     */
    @JsonProperty("pPhone")
    private String pPhone;
    /**
     * 账号状态
     */
    @JsonProperty("pState")
    private Integer pState;

    /**
     * 生日
     */
    @JsonProperty("pBirthday")
    private String pBirthday;

    /**
     * 年龄
     */
    @JsonProperty("pAge")
    private Integer pAge;

}
