package com.hello.hospital.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hello.hospital.entity.po.Drug;
import org.apache.ibatis.annotations.Mapper;

/**
 * 药物 持久层（mapper）
 *
 *
 */
@Mapper
public interface DrugMapper extends BaseMapper<Drug> {

}
