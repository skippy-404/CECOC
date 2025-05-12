package com.ruoyi.Fgranary.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.Fgranary.domain.FinishedProject;
import com.ruoyi.Fgranary.service.IFinishedProjectService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * FgranaryController
 * 
 * @author ruoyi
 * @date 2025-05-12
 */
@RestController
@RequestMapping("/Fgranary/Fgranary")
public class FinishedProjectController extends BaseController
{
    @Autowired
    private IFinishedProjectService finishedProjectService;

    /**
     * 查询Fgranary列表
     */
    @PreAuthorize("@ss.hasPermi('Fgranary:Fgranary:list')")
    @GetMapping("/list")
    public TableDataInfo list(FinishedProject finishedProject)
    {
        startPage();
        List<FinishedProject> list = finishedProjectService.selectFinishedProjectList(finishedProject);
        return getDataTable(list);
    }

    /**
     * 导出Fgranary列表
     */
    @PreAuthorize("@ss.hasPermi('Fgranary:Fgranary:export')")
    @Log(title = "Fgranary", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, FinishedProject finishedProject)
    {
        List<FinishedProject> list = finishedProjectService.selectFinishedProjectList(finishedProject);
        ExcelUtil<FinishedProject> util = new ExcelUtil<FinishedProject>(FinishedProject.class);
        util.exportExcel(response, list, "Fgranary数据");
    }

    /**
     * 获取Fgranary详细信息
     */
    @PreAuthorize("@ss.hasPermi('Fgranary:Fgranary:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(finishedProjectService.selectFinishedProjectById(id));
    }

    /**
     * 新增Fgranary
     */
    @PreAuthorize("@ss.hasPermi('Fgranary:Fgranary:add')")
    @Log(title = "Fgranary", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody FinishedProject finishedProject)
    {
        return toAjax(finishedProjectService.insertFinishedProject(finishedProject));
    }

    /**
     * 修改Fgranary
     */
    @PreAuthorize("@ss.hasPermi('Fgranary:Fgranary:edit')")
    @Log(title = "Fgranary", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody FinishedProject finishedProject)
    {
        return toAjax(finishedProjectService.updateFinishedProject(finishedProject));
    }

    /**
     * 删除Fgranary
     */
    @PreAuthorize("@ss.hasPermi('Fgranary:Fgranary:remove')")
    @Log(title = "Fgranary", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(finishedProjectService.deleteFinishedProjectByIds(ids));
    }
}
