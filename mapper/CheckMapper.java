package com.hello.hospital.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hello.hospital.entity.po.Checks;
import org.apache.ibatis.annotations.Mapper;

/**
 * 检查项目 持久层（mapper）
 *

 */
@Mapper
public interface CheckMapper extends BaseMapper<Checks> {

}
