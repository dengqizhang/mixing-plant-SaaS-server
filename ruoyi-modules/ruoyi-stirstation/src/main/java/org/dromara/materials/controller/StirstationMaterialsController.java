package org.dromara.materials.controller;

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
import org.dromara.materials.domain.vo.StirstationMaterialsVo;
import org.dromara.materials.domain.bo.StirstationMaterialsBo;
import org.dromara.materials.service.IStirstationMaterialsService;
import org.dromara.common.mybatis.core.page.TableDataInfo;

/**
 * 材料管理
 *
 * @author 张登齐
 * @date 2024-06-05
 */
@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/materials/materials")
public class StirstationMaterialsController extends BaseController {

    private final IStirstationMaterialsService stirstationMaterialsService;

    /**
     * 查询材料管理列表
     */
    @SaCheckPermission("materials:materials:list")
    @GetMapping("/list")
    public TableDataInfo<StirstationMaterialsVo> list(StirstationMaterialsBo bo, PageQuery pageQuery) {
        return stirstationMaterialsService.queryPageList(bo, pageQuery);
    }

    /**
     * 导出材料管理列表
     */
    @SaCheckPermission("materials:materials:export")
    @Log(title = "材料管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(StirstationMaterialsBo bo, HttpServletResponse response) {
        List<StirstationMaterialsVo> list = stirstationMaterialsService.queryList(bo);
        ExcelUtil.exportExcel(list, "材料管理", StirstationMaterialsVo.class, response);
    }

    /**
     * 获取材料管理详细信息
     *
     * @param id 主键
     */
    @SaCheckPermission("materials:materials:query")
    @GetMapping("/{id}")
    public R<StirstationMaterialsVo> getInfo(@NotNull(message = "主键不能为空")
                                     @PathVariable Long id) {
        return R.ok(stirstationMaterialsService.queryById(id));
    }

    /**
     * 新增材料管理
     */
    @SaCheckPermission("materials:materials:add")
    @Log(title = "材料管理", businessType = BusinessType.INSERT)
    @RepeatSubmit()
    @PostMapping()
    public R<Void> add(@Validated(AddGroup.class) @RequestBody StirstationMaterialsBo bo) {
        return toAjax(stirstationMaterialsService.insertByBo(bo));
    }

    /**
     * 修改材料管理
     */
    @SaCheckPermission("materials:materials:edit")
    @Log(title = "材料管理", businessType = BusinessType.UPDATE)
    @RepeatSubmit()
    @PutMapping()
    public R<Void> edit(@Validated(EditGroup.class) @RequestBody StirstationMaterialsBo bo) {
        return toAjax(stirstationMaterialsService.updateByBo(bo));
    }

    /**
     * 删除材料管理
     *
     * @param ids 主键串
     */
    @SaCheckPermission("materials:materials:remove")
    @Log(title = "材料管理", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public R<Void> remove(@NotEmpty(message = "主键不能为空")
                          @PathVariable Long[] ids) {
        return toAjax(stirstationMaterialsService.deleteWithValidByIds(List.of(ids), true));
    }
}
