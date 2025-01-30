package com.hello.hospital.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hello.hospital.entity.po.Doctor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 医生相关 持久层（mapper）

 */
@Mapper
public interface DoctorUserMapper extends BaseMapper<Doctor> {

    /**
     * 更新评价
     *
     * @param dId   医生id
     * @param dStar 评分
     * @return 结果
     */
    Boolean updateStar(@Param("dId") Integer dId, @Param("dStar") Double dStar);
}
