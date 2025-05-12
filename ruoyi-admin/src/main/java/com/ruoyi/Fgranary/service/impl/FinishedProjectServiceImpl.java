package com.ruoyi.Fgranary.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.Fgranary.mapper.FinishedProjectMapper;
import com.ruoyi.Fgranary.domain.FinishedProject;
import com.ruoyi.Fgranary.service.IFinishedProjectService;

/**
 * FgranaryService业务层处理
 * 
 * @author ruoyi
 * @date 2025-05-12
 */
@Service
public class FinishedProjectServiceImpl implements IFinishedProjectService 
{
    @Autowired
    private FinishedProjectMapper finishedProjectMapper;

    /**
     * 查询Fgranary
     * 
     * @param id Fgranary主键
     * @return Fgranary
     */
    @Override
    public FinishedProject selectFinishedProjectById(Long id)
    {
        return finishedProjectMapper.selectFinishedProjectById(id);
    }

    /**
     * 查询Fgranary列表
     * 
     * @param finishedProject Fgranary
     * @return Fgranary
     */
    @Override
    public List<FinishedProject> selectFinishedProjectList(FinishedProject finishedProject)
    {
        return finishedProjectMapper.selectFinishedProjectList(finishedProject);
    }

    /**
     * 新增Fgranary
     * 
     * @param finishedProject Fgranary
     * @return 结果
     */
    @Override
    public int insertFinishedProject(FinishedProject finishedProject)
    {
        return finishedProjectMapper.insertFinishedProject(finishedProject);
    }

    /**
     * 修改Fgranary
     * 
     * @param finishedProject Fgranary
     * @return 结果
     */
    @Override
    public int updateFinishedProject(FinishedProject finishedProject)
    {
        return finishedProjectMapper.updateFinishedProject(finishedProject);
    }

    /**
     * 批量删除Fgranary
     * 
     * @param ids 需要删除的Fgranary主键
     * @return 结果
     */
    @Override
    public int deleteFinishedProjectByIds(Long[] ids)
    {
        return finishedProjectMapper.deleteFinishedProjectByIds(ids);
    }

    /**
     * 删除Fgranary信息
     * 
     * @param id Fgranary主键
     * @return 结果
     */
    @Override
    public int deleteFinishedProjectById(Long id)
    {
        return finishedProjectMapper.deleteFinishedProjectById(id);
    }
}
