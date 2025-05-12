package com.ruoyi.ungranary.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * granary对象 processed_project
 * 
 * @author ruoyi
 * @date 2025-05-12
 */
public class ProcessedProject extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Long id;

    /** 粮仓名 */
    @Excel(name = "粮仓名")
    private String name;

    /** 容量 */
    @Excel(name = "容量")
    private Long capacity;

    /** 加工时效 */
    @Excel(name = "加工时效")
    private Long processedTimeline;

    /** 运输时效 */
    @Excel(name = "运输时效")
    private Long transportationTimeliness;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }

    public void setCapacity(Long capacity) 
    {
        this.capacity = capacity;
    }

    public Long getCapacity() 
    {
        return capacity;
    }

    public void setProcessedTimeline(Long processedTimeline) 
    {
        this.processedTimeline = processedTimeline;
    }

    public Long getProcessedTimeline() 
    {
        return processedTimeline;
    }

    public void setTransportationTimeliness(Long transportationTimeliness) 
    {
        this.transportationTimeliness = transportationTimeliness;
    }

    public Long getTransportationTimeliness() 
    {
        return transportationTimeliness;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("capacity", getCapacity())
            .append("processedTimeline", getProcessedTimeline())
            .append("transportationTimeliness", getTransportationTimeliness())
            .toString();
    }
}
