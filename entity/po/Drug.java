package com.hello.hospital.entity.po;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * 药物
 *

 */
@Data
@TableName("drug")
public class Drug {

    /**
     * 药物id
     */
    @TableId(value = "dr_id")
    @JsonProperty("drId")
    private int drId;

    /**
     * 药物名
     */
    @JsonProperty("drName")
    private String drName;

    /**
     * 药物价格
     */
    @JsonProperty("drPrice")
    private double drPrice;

    /**
     * 药物数量
     */
    @JsonProperty("drNumber")
    private int drNumber;

    /**
     * 单位
     */
    @JsonProperty("drUnit")
    private String drUnit;

    /**
     * 出版商
     */
    @JsonProperty("drPublisher")
    private String drPublisher;

}
