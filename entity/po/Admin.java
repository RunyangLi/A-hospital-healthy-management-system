package com.hello.hospital.entity.po;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * 管理员
 *

 */
@Data
@TableName("admin_user")
public class Admin {

    /**
     * 管理员id （账号）
     */
    @TableId(value = "a_id")
    private Integer aId;

    /**
     * 管理员密码
     */
    @JsonProperty("aPassword")
    private String aPassword;

    /**
     * 管理员名字
     */
    @JsonProperty("aName")
    private String aName;

    /**
     * 管理员性别
     */
    @JsonProperty("aGender")
    private String aGender;

    /**
     * 证件号码
     */
    @JsonProperty("aCard")
    private String aCard;

    /**
     * 邮箱
     */
    @JsonProperty("aEmail")
    private String aEmail;

    /**
     * 手机号
     */
    @JsonProperty("aPhone")
    private String aPhone;

}
