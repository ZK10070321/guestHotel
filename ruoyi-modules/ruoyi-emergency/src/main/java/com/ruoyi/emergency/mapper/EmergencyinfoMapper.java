package com.ruoyi.emergency.mapper;

import java.util.List;
import com.ruoyi.emergency.domain.Emergencyinfo;

/**
 * 应急信息Mapper接口
 * 
 * @author ningf
 * @date 2024-07-06
 */
public interface EmergencyinfoMapper 
{
    /**
     * 查询应急信息
     * 
     * @param id 应急信息主键
     * @return 应急信息
     */
    public Emergencyinfo selectEmergencyinfoById(Long id);

    /**
     * 查询应急信息列表
     * 
     * @param emergencyinfo 应急信息
     * @return 应急信息集合
     */
    public List<Emergencyinfo> selectEmergencyinfoList(Emergencyinfo emergencyinfo);

    /**
     * 新增应急信息
     * 
     * @param emergencyinfo 应急信息
     * @return 结果
     */
    public int insertEmergencyinfo(Emergencyinfo emergencyinfo);

    /**
     * 修改应急信息
     * 
     * @param emergencyinfo 应急信息
     * @return 结果
     */
    public int updateEmergencyinfo(Emergencyinfo emergencyinfo);

    /**
     * 删除应急信息
     * 
     * @param id 应急信息主键
     * @return 结果
     */
    public int deleteEmergencyinfoById(Long id);

    /**
     * 批量删除应急信息
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteEmergencyinfoByIds(Long[] ids);
}
