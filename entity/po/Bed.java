package com.hello.hospital.entity.po;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.Version;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * 病床
 *

 */
@Data
@TableName("bed")
public class Bed {

    /**
     * 病床id
     */
    @TableId(value = "b_id")
    @JsonProperty("bId")
    private int bId;

    /**
     * 病人id
     */
    @JsonProperty("pId")
    private int pId;

    /**
     * 医生id
     */
    @JsonProperty("dId")
    private int dId;

    /**
     * 病床状态
     */
    @JsonProperty("bState")
    private Integer bState;

    /**
     * 入住开始时间
     */
    @JsonProperty("bStart")
    private String bStart;

    /**
     * 申请利用
     */
    @JsonProperty("bReason")
    private String bReason;

    /**
     * 数据库乐观锁版本号
     */
    @Version
    private Integer version;

}
