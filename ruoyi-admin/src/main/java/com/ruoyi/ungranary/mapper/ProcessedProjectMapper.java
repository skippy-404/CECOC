package com.ruoyi.ungranary.mapper;

import java.util.List;
import com.ruoyi.ungranary.domain.ProcessedProject;

/**
 * granaryMapper接口
 * 
 * @author ruoyi
 * @date 2025-05-12
 */
public interface ProcessedProjectMapper 
{
    /**
     * 查询granary
     * 
     * @param id granary主键
     * @return granary
     */
    public ProcessedProject selectProcessedProjectById(Long id);

    /**
     * 查询granary列表
     * 
     * @param processedProject granary
     * @return granary集合
     */
    public List<ProcessedProject> selectProcessedProjectList(ProcessedProject processedProject);

    /**
     * 新增granary
     * 
     * @param processedProject granary
     * @return 结果
     */
    public int insertProcessedProject(ProcessedProject processedProject);

    /**
     * 修改granary
     * 
     * @param processedProject granary
     * @return 结果
     */
    public int updateProcessedProject(ProcessedProject processedProject);

    /**
     * 删除granary
     * 
     * @param id granary主键
     * @return 结果
     */
    public int deleteProcessedProjectById(Long id);

    /**
     * 批量删除granary
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteProcessedProjectByIds(Long[] ids);
}
