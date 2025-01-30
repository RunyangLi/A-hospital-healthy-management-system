package com.hello.hospital.entity.vo.user;

import lombok.Data;

/**
 * 医生登录 返回对象
 *
 * @author: Hello
 * @date: 2024-11-15
 */
@Data
public class DoctorUserVo {

    /**
     * 医生id (账号)
     */
    private Integer dId;

    /**
     * 医生名称
     */
    private String aName;

    /**
     * 生成的账号token（验签）
     */
    private String token;

}

