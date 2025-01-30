package com.hello.hospital.service.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.google.common.collect.Maps;
import com.hello.hospital.entity.po.Admin;
import com.hello.hospital.entity.vo.user.AdminUserVo;
import com.hello.hospital.mapper.AdminUserMapper;
import com.hello.hospital.service.AdminUserService;
import com.hello.hospital.utils.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.BooleanUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 管理员相关 服务层
 *
 */
@Service("AdminService")
@RequiredArgsConstructor
public class AdminUserServiceImpl extends ServiceImpl<AdminUserMapper, Admin> implements AdminUserService {

    /**
     * 管理员登录
     *
     * @param aId       管理员id （账号）
     * @param aPassword 管理员密码
     * @return 返回管理员登录信息
     */
    @Override
    public AdminUserVo login(int aId, String aPassword) {
        //通过id（账号）查询管理员记录
        Admin admin = this.getById(aId);

        //通过账号查询不到记录
        if (admin == null) {
            return null;
        }

        //密码错误
        if (BooleanUtils.isFalse(admin.getAPassword().equals(aPassword))) {
            return null;
        }

        //组装接口数据结果
        AdminUserVo vo = new AdminUserVo();
        vo.setAId(admin.getAId());
        vo.setAName(admin.getAName());
        vo.setToken(generateToken(admin));

        return vo;
    }

    /**
     * 生成token
     *
     * @param admin 管理员信息
     * @return token
     */
    private String generateToken(Admin admin) {
        Map<String, String> adminMap = Maps.newHashMap();
        adminMap.put("aName", admin.getAName());
        adminMap.put("aId", String.valueOf(admin.getAId()));
        return JwtUtil.generateToken(adminMap);
    }

}
