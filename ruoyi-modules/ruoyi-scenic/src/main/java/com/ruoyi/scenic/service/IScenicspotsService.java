package com.ruoyi.scenic.service;

import java.util.List;
import com.ruoyi.scenic.domain.Scenicspots;

/**
 * 景点信息Service接口
 * 
 * @author ningf
 * @date 2024-07-06
 */
public interface IScenicspotsService 
{
    /**
     * 查询景点信息
     * 
     * @param id 景点信息主键
     * @return 景点信息
     */
    public Scenicspots selectScenicspotsById(Long id);

    /**
     * 查询景点信息列表
     * 
     * @param scenicspots 景点信息
     * @return 景点信息集合
     */
    public List<Scenicspots> selectScenicspotsList(Scenicspots scenicspots);

    /**
     * 新增景点信息
     * 
     * @param scenicspots 景点信息
     * @return 结果
     */
    public int insertScenicspots(Scenicspots scenicspots);

    /**
     * 修改景点信息
     * 
     * @param scenicspots 景点信息
     * @return 结果
     */
    public int updateScenicspots(Scenicspots scenicspots);

    /**
     * 批量删除景点信息
     * 
     * @param ids 需要删除的景点信息主键集合
     * @return 结果
     */
    public int deleteScenicspotsByIds(Long[] ids);

    /**
     * 删除景点信息信息
     * 
     * @param id 景点信息主键
     * @return 结果
     */
    public int deleteScenicspotsById(Long id);
}
