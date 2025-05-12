package com.ruoyi.ungranary.controller;

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
import com.ruoyi.ungranary.domain.ProcessedProject;
import com.ruoyi.ungranary.service.IProcessedProjectService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * granaryController
 * 
 * @author ruoyi
 * @date 2025-05-12
 */
@RestController
@RequestMapping("/ungranary/granary")
public class ProcessedProjectController extends BaseController
{
    @Autowired
    private IProcessedProjectService processedProjectService;

    /**
     * 查询granary列表
     */
    @PreAuthorize("@ss.hasPermi('ungranary:granary:list')")
    @GetMapping("/list")
    public TableDataInfo list(ProcessedProject processedProject)
    {
        startPage();
        List<ProcessedProject> list = processedProjectService.selectProcessedProjectList(processedProject);
        return getDataTable(list);
    }

    /**
     * 导出granary列表
     */
    @PreAuthorize("@ss.hasPermi('ungranary:granary:export')")
    @Log(title = "granary", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ProcessedProject processedProject)
    {
        List<ProcessedProject> list = processedProjectService.selectProcessedProjectList(processedProject);
        ExcelUtil<ProcessedProject> util = new ExcelUtil<ProcessedProject>(ProcessedProject.class);
        util.exportExcel(response, list, "granary数据");
    }

    /**
     * 获取granary详细信息
     */
    @PreAuthorize("@ss.hasPermi('ungranary:granary:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(processedProjectService.selectProcessedProjectById(id));
    }

    /**
     * 新增granary
     */
    @PreAuthorize("@ss.hasPermi('ungranary:granary:add')")
    @Log(title = "granary", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ProcessedProject processedProject)
    {
        return toAjax(processedProjectService.insertProcessedProject(processedProject));
    }

    /**
     * 修改granary
     */
    @PreAuthorize("@ss.hasPermi('ungranary:granary:edit')")
    @Log(title = "granary", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ProcessedProject processedProject)
    {
        return toAjax(processedProjectService.updateProcessedProject(processedProject));
    }

    /**
     * 删除granary
     */
    @PreAuthorize("@ss.hasPermi('ungranary:granary:remove')")
    @Log(title = "granary", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(processedProjectService.deleteProcessedProjectByIds(ids));
    }
}
