package com.ruoyi.scenic.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 景点信息对象 scenicspots
 * 
 * @author ningf
 * @date 2024-07-06
 */
public class Scenicspots extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 景点id */
    private Long id;

    /** 景区id */
    @Excel(name = "景区id")
    private Long scenicAreaId;

    /** 地址 */
    @Excel(name = "地址")
    private String address;

    /** 景点名称 */
    @Excel(name = "景点名称")
    private String name;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setScenicAreaId(Long scenicAreaId) 
    {
        this.scenicAreaId = scenicAreaId;
    }

    public Long getScenicAreaId() 
    {
        return scenicAreaId;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("scenicAreaId", getScenicAreaId())
            .append("address", getAddress())
            .append("name", getName())
            .toString();
    }
}
