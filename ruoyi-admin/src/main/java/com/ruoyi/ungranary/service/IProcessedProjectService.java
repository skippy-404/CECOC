package com.ruoyi.ungranary.service;

import java.util.List;
import com.ruoyi.ungranary.domain.ProcessedProject;

/**
 * granaryService接口
 * 
 * @author ruoyi
 * @date 2025-05-12
 */
public interface IProcessedProjectService 
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
     * 批量删除granary
     * 
     * @param ids 需要删除的granary主键集合
     * @return 结果
     */
    public int deleteProcessedProjectByIds(Long[] ids);

    /**
     * 删除granary信息
     * 
     * @param id granary主键
     * @return 结果
     */
    public int deleteProcessedProjectById(Long id);
}
