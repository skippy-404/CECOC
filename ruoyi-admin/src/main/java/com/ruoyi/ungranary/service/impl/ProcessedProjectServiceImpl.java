package com.ruoyi.ungranary.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ungranary.mapper.ProcessedProjectMapper;
import com.ruoyi.ungranary.domain.ProcessedProject;
import com.ruoyi.ungranary.service.IProcessedProjectService;

/**
 * granaryService业务层处理
 * 
 * @author ruoyi
 * @date 2025-05-12
 */
@Service
public class ProcessedProjectServiceImpl implements IProcessedProjectService 
{
    @Autowired
    private ProcessedProjectMapper processedProjectMapper;

    /**
     * 查询granary
     * 
     * @param id granary主键
     * @return granary
     */
    @Override
    public ProcessedProject selectProcessedProjectById(Long id)
    {
        return processedProjectMapper.selectProcessedProjectById(id);
    }

    /**
     * 查询granary列表
     * 
     * @param processedProject granary
     * @return granary
     */
    @Override
    public List<ProcessedProject> selectProcessedProjectList(ProcessedProject processedProject)
    {
        return processedProjectMapper.selectProcessedProjectList(processedProject);
    }

    /**
     * 新增granary
     * 
     * @param processedProject granary
     * @return 结果
     */
    @Override
    public int insertProcessedProject(ProcessedProject processedProject)
    {
        return processedProjectMapper.insertProcessedProject(processedProject);
    }

    /**
     * 修改granary
     * 
     * @param processedProject granary
     * @return 结果
     */
    @Override
    public int updateProcessedProject(ProcessedProject processedProject)
    {
        return processedProjectMapper.updateProcessedProject(processedProject);
    }

    /**
     * 批量删除granary
     * 
     * @param ids 需要删除的granary主键
     * @return 结果
     */
    @Override
    public int deleteProcessedProjectByIds(Long[] ids)
    {
        return processedProjectMapper.deleteProcessedProjectByIds(ids);
    }

    /**
     * 删除granary信息
     * 
     * @param id granary主键
     * @return 结果
     */
    @Override
    public int deleteProcessedProjectById(Long id)
    {
        return processedProjectMapper.deleteProcessedProjectById(id);
    }
}
