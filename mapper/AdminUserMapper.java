package com.hello.hospital.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hello.hospital.entity.po.Admin;
import org.apache.ibatis.annotations.Mapper;

/**
 * 管理员 持久层（mapper）
 *
 */
@Mapper
public interface AdminUserMapper extends BaseMapper<Admin> {

}
