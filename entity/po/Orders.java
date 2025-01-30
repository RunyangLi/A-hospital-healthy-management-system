package com.hello.hospital.entity.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * 挂号单
 *

 */
@Data
@TableName("orders")
public class Orders {

    /**
     * 主键
     */
    @TableId(value = "o_id")
    @JsonProperty("oId")
    private int oId;

    /**
     * 患者id (账号)
     */
    @JsonProperty("pId")
    private int pId;

    /**
     * 医生id (账号)
     */
    @JsonProperty("dId")
    private int dId;

    /**
     * 挂号时间段
     */
    @JsonProperty("oRecord")
    private String oRecord;

    /**
     * 开始时间
     */
    @JsonProperty("oStart")
    private String oStart;

    /**
     * 结束时间
     */
    @JsonProperty("oEnd")
    private String oEnd;

    /**
     * 单状态
     */
    @JsonProperty("oState")
    private Integer oState;

    /**
     * 药物
     */
    @JsonProperty("oDrug")
    private String oDrug;

    /**
     * 检查项目
     */
    @JsonProperty("oCheck")
    private String oCheck;

    /**
     * 费用
     */
    @JsonProperty("oTotalPrice")
    private Double oTotalPrice;

    /**
     * 缴费状态
     */
    @JsonProperty("oPriceState")
    private Integer oPriceState;

    /**
     *
     */
    @JsonProperty("countGender")
    @TableField(exist = false)
    private Integer countGender;

    /**
     * 建议
     */
    @JsonProperty("oAdvice")
    private String oAdvice;

    /**
     * 医生 多表查询用
     */
    @TableField(exist = false)
    private Doctor doctor;

    /**
     * 患者 多表查询用
     */
    @TableField(exist = false)
    private Patient patient;

    /**
     * 挂号科室人数统计
     */
    @TableField(exist = false)
    private Integer countSection;

    /**
     * 医生名称
     */
    @JsonProperty("dName")
    @TableField(exist = false)
    private String dName;

    /**
     * 患者名称
     */
    @JsonProperty("pName")
    @TableField(exist = false)
    private String pName;

}
