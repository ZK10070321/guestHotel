package com.ruoyi.complaint.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 投诉处理信息对象 handlingresults
 * 
 * @author ningf
 * @date 2024-07-06
 */
public class Handlingresults extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 处理结果id */
    private Long id;

    /** 投诉id */
    @Excel(name = "投诉id")
    private Long complaintId;

    /** 结果 */
    @Excel(name = "结果")
    private String result;

    /** 处理时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "处理时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date handleTime;

    /** 处理人id */
    @Excel(name = "处理人id")
    private Long handlerId;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setComplaintId(Long complaintId) 
    {
        this.complaintId = complaintId;
    }

    public Long getComplaintId() 
    {
        return complaintId;
    }
    public void setResult(String result) 
    {
        this.result = result;
    }

    public String getResult() 
    {
        return result;
    }
    public void setHandleTime(Date handleTime) 
    {
        this.handleTime = handleTime;
    }

    public Date getHandleTime() 
    {
        return handleTime;
    }
    public void setHandlerId(Long handlerId) 
    {
        this.handlerId = handlerId;
    }

    public Long getHandlerId() 
    {
        return handlerId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("complaintId", getComplaintId())
            .append("result", getResult())
            .append("handleTime", getHandleTime())
            .append("handlerId", getHandlerId())
            .toString();
    }
}
