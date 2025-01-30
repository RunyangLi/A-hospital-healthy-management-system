package com.hello.hospital.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hello.hospital.entity.po.Bed;
import org.apache.ibatis.annotations.Mapper;

/**
 * 病床 持久层（mapper）
 *
 */
@Mapper
public interface BedMapper extends BaseMapper<Bed> {

}
