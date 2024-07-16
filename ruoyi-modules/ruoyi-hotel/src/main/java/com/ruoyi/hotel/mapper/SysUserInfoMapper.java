package com.ruoyi.hotel.mapper;

import com.ruoyi.hotel.domain.Starhotels;
import com.ruoyi.hotel.domain.SysUserInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysUserInfoMapper {
    /**
     * 查询游客信息
     *
     * @param id 游客ID
     * @return 游客信息
     */
    public SysUserInfo selectUserInfoById(Long id);
}
