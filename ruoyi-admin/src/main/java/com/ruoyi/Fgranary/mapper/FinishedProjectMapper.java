package com.ruoyi.Fgranary.mapper;

import java.util.List;
import com.ruoyi.Fgranary.domain.FinishedProject;

/**
 * FgranaryMapper接口
 * 
 * @author ruoyi
 * @date 2025-05-12
 */
public interface FinishedProjectMapper 
{
    /**
     * 查询Fgranary
     * 
     * @param id Fgranary主键
     * @return Fgranary
     */
    public FinishedProject selectFinishedProjectById(Long id);

    /**
     * 查询Fgranary列表
     * 
     * @param finishedProject Fgranary
     * @return Fgranary集合
     */
    public List<FinishedProject> selectFinishedProjectList(FinishedProject finishedProject);

    /**
     * 新增Fgranary
     * 
     * @param finishedProject Fgranary
     * @return 结果
     */
    public int insertFinishedProject(FinishedProject finishedProject);

    /**
     * 修改Fgranary
     * 
     * @param finishedProject Fgranary
     * @return 结果
     */
    public int updateFinishedProject(FinishedProject finishedProject);

    /**
     * 删除Fgranary
     * 
     * @param id Fgranary主键
     * @return 结果
     */
    public int deleteFinishedProjectById(Long id);

    /**
     * 批量删除Fgranary
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteFinishedProjectByIds(Long[] ids);
}
