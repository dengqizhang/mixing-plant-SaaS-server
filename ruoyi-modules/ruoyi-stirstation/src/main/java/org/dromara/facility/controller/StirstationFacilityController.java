package org.dromara.facility.controller;

import java.util.List;

import lombok.RequiredArgsConstructor;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.constraints.*;
import cn.dev33.satoken.annotation.SaCheckPermission;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.annotation.Validated;
import org.dromara.common.idempotent.annotation.RepeatSubmit;
import org.dromara.common.log.annotation.Log;
import org.dromara.common.web.core.BaseController;
import org.dromara.common.mybatis.core.page.PageQuery;
import org.dromara.common.core.domain.R;
import org.dromara.common.core.validate.AddGroup;
import org.dromara.common.core.validate.EditGroup;
import org.dromara.common.log.enums.BusinessType;
import org.dromara.common.excel.utils.ExcelUtil;
import org.dromara.facility.domain.vo.StirstationFacilityVo;
import org.dromara.facility.domain.bo.StirstationFacilityBo;
import org.dromara.facility.service.IStirstationFacilityService;
import org.dromara.common.mybatis.core.page.TableDataInfo;

/**
 * 设备管理
 *
 * @author 张登齐
 * @date 2024-06-05
 */
@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/facility/facility")
public class StirstationFacilityController extends BaseController {

    private final IStirstationFacilityService stirstationFacilityService;

    /**
     * 查询设备管理列表
     */
    @SaCheckPermission("facility:facility:list")
    @GetMapping("/list")
    public TableDataInfo<StirstationFacilityVo> list(StirstationFacilityBo bo, PageQuery pageQuery) {
        return stirstationFacilityService.queryPageList(bo, pageQuery);
    }

    /**
     * 导出设备管理列表
     */
    @SaCheckPermission("facility:facility:export")
    @Log(title = "设备管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(StirstationFacilityBo bo, HttpServletResponse response) {
        List<StirstationFacilityVo> list = stirstationFacilityService.queryList(bo);
        ExcelUtil.exportExcel(list, "设备管理", StirstationFacilityVo.class, response);
    }

    /**
     * 获取设备管理详细信息
     *
     * @param id 主键
     */
    @SaCheckPermission("facility:facility:query")
    @GetMapping("/{id}")
    public R<StirstationFacilityVo> getInfo(@NotNull(message = "主键不能为空")
                                     @PathVariable Long id) {
        return R.ok(stirstationFacilityService.queryById(id));
    }

    /**
     * 新增设备管理
     */
    @SaCheckPermission("facility:facility:add")
    @Log(title = "设备管理", businessType = BusinessType.INSERT)
    @RepeatSubmit()
    @PostMapping()
    public R<Void> add(@Validated(AddGroup.class) @RequestBody StirstationFacilityBo bo) {
        return toAjax(stirstationFacilityService.insertByBo(bo));
    }

    /**
     * 修改设备管理
     */
    @SaCheckPermission("facility:facility:edit")
    @Log(title = "设备管理", businessType = BusinessType.UPDATE)
    @RepeatSubmit()
    @PutMapping()
    public R<Void> edit(@Validated(EditGroup.class) @RequestBody StirstationFacilityBo bo) {
        return toAjax(stirstationFacilityService.updateByBo(bo));
    }

    /**
     * 删除设备管理
     *
     * @param ids 主键串
     */
    @SaCheckPermission("facility:facility:remove")
    @Log(title = "设备管理", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public R<Void> remove(@NotEmpty(message = "主键不能为空")
                          @PathVariable Long[] ids) {
        return toAjax(stirstationFacilityService.deleteWithValidByIds(List.of(ids), true));
    }
}
