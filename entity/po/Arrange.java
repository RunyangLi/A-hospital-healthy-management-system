package com.hello.hospital.entity.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * 排班信息

 */
@Data
@TableName("arrange")
public class Arrange {

    /**
     * 排班id
     */
    @TableId(value = "ar_id")
    @JsonProperty("arId")
    private String arId;

    /**
     * 排班时间
     */
    @JsonProperty("arTime")
    private String arTime;

    /**
     * 医生id
     */
    @JsonProperty("dId")
    private Integer dId;

    /**
     * 医生 多表查询用
     */
    @TableField(exist = false)
    private Doctor doctor;

}
