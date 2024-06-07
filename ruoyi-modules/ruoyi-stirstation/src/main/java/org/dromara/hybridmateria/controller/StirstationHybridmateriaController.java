package org.dromara.hybridmateria.controller;

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
import org.dromara.hybridmateria.domain.vo.StirstationHybridmateriaVo;
import org.dromara.hybridmateria.domain.bo.StirstationHybridmateriaBo;
import org.dromara.hybridmateria.service.IStirstationHybridmateriaService;
import org.dromara.common.mybatis.core.page.TableDataInfo;

/**
 * 混合料管理
 *
 * @author 张登齐
 * @date 2024-06-05
 */
@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/hybridmateria/hybridmateria")
public class StirstationHybridmateriaController extends BaseController {

    private final IStirstationHybridmateriaService stirstationHybridmateriaService;

    /**
     * 查询混合料管理列表
     */
    @SaCheckPermission("hybridmateria:hybridmateria:list")
    @GetMapping("/list")
    public TableDataInfo<StirstationHybridmateriaVo> list(StirstationHybridmateriaBo bo, PageQuery pageQuery) {
        return stirstationHybridmateriaService.queryPageList(bo, pageQuery);
    }

    /**
     * 导出混合料管理列表
     */
    @SaCheckPermission("hybridmateria:hybridmateria:export")
    @Log(title = "混合料管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(StirstationHybridmateriaBo bo, HttpServletResponse response) {
        List<StirstationHybridmateriaVo> list = stirstationHybridmateriaService.queryList(bo);
        ExcelUtil.exportExcel(list, "混合料管理", StirstationHybridmateriaVo.class, response);
    }

    /**
     * 获取混合料管理详细信息
     *
     * @param id 主键
     */
    @SaCheckPermission("hybridmateria:hybridmateria:query")
    @GetMapping("/{id}")
    public R<StirstationHybridmateriaVo> getInfo(@NotNull(message = "主键不能为空")
                                     @PathVariable Long id) {
        return R.ok(stirstationHybridmateriaService.queryById(id));
    }

    /**
     * 新增混合料管理
     */
    @SaCheckPermission("hybridmateria:hybridmateria:add")
    @Log(title = "混合料管理", businessType = BusinessType.INSERT)
    @RepeatSubmit()
    @PostMapping()
    public R<Void> add(@Validated(AddGroup.class) @RequestBody StirstationHybridmateriaBo bo) {
        return toAjax(stirstationHybridmateriaService.insertByBo(bo));
    }

    /**
     * 修改混合料管理
     */
    @SaCheckPermission("hybridmateria:hybridmateria:edit")
    @Log(title = "混合料管理", businessType = BusinessType.UPDATE)
    @RepeatSubmit()
    @PutMapping()
    public R<Void> edit(@Validated(EditGroup.class) @RequestBody StirstationHybridmateriaBo bo) {
        return toAjax(stirstationHybridmateriaService.updateByBo(bo));
    }

    /**
     * 删除混合料管理
     *
     * @param ids 主键串
     */
    @SaCheckPermission("hybridmateria:hybridmateria:remove")
    @Log(title = "混合料管理", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public R<Void> remove(@NotEmpty(message = "主键不能为空")
                          @PathVariable Long[] ids) {
        return toAjax(stirstationHybridmateriaService.deleteWithValidByIds(List.of(ids), true));
    }
}
