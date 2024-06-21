package org.dromara.productionTask.controller;

import java.util.List;
import lombok.RequiredArgsConstructor;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.constraints.*;
import cn.dev33.satoken.annotation.SaCheckPermission;
import org.dromara.productionTask.domain.bo.MixproportionBo;
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
import org.dromara.productionTask.domain.vo.StirstationProductionTaskVo;
import org.dromara.productionTask.domain.bo.StirstationProductionTaskBo;
import org.dromara.productionTask.service.IStirstationProductionTaskService;
import org.dromara.common.mybatis.core.page.TableDataInfo;

/**
 * 生产任务
 *
 * @author 张登齐
 * @date 2024-06-20
 */
@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/productionTask/productionTask")
public class StirstationProductionTaskController extends BaseController {

    private final IStirstationProductionTaskService stirstationProductionTaskService;

    /**
     * 查询生产任务列表
     */
    @SaCheckPermission("productionTask:productionTask:list")
    @GetMapping("/list")
    public TableDataInfo<StirstationProductionTaskVo> list(StirstationProductionTaskBo bo, PageQuery pageQuery) {
        System.out.println(bo);
        return stirstationProductionTaskService.queryPageList(bo, pageQuery);
    }

    /**
     * 导出生产任务列表
     */
    @SaCheckPermission("productionTask:productionTask:export")
    @Log(title = "生产任务", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(StirstationProductionTaskBo bo, HttpServletResponse response) {
        List<StirstationProductionTaskVo> list = stirstationProductionTaskService.queryList(bo);
        ExcelUtil.exportExcel(list, "生产任务", StirstationProductionTaskVo.class, response);
    }

    /**
     * 获取生产任务详细信息
     *
     * @param id 主键
     */
    @SaCheckPermission("productionTask:productionTask:query")
    @GetMapping("/{id}")
    public R<StirstationProductionTaskVo> getInfo(@NotNull(message = "主键不能为空")
                                     @PathVariable Long id) {
        return R.ok(stirstationProductionTaskService.queryById(id));
    }

    /**
     * 新增生产任务
     */
    @SaCheckPermission("productionTask:productionTask:add")
    @Log(title = "生产任务", businessType = BusinessType.INSERT)
    @RepeatSubmit()
    @PostMapping()
    public R<Void> add(@Validated(AddGroup.class) @RequestBody StirstationProductionTaskBo bo) {
        return toAjax(stirstationProductionTaskService.insertByBo(bo));
    }

    /**
     * 修改生产任务
     */
    @SaCheckPermission("productionTask:productionTask:edit")
    @Log(title = "生产任务", businessType = BusinessType.UPDATE)
    @RepeatSubmit()
    @PutMapping()
    public R<Void> edit(@Validated(EditGroup.class) @RequestBody StirstationProductionTaskBo bo) {
        return toAjax(stirstationProductionTaskService.updateByBo(bo));
    }

    /**
     * 删除生产任务
     *
     * @param ids 主键串
     */
    @SaCheckPermission("productionTask:productionTask:remove")
    @Log(title = "生产任务", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public R<Void> remove(@NotEmpty(message = "主键不能为空")
                          @PathVariable Long[] ids) {
        return toAjax(stirstationProductionTaskService.deleteWithValidByIds(List.of(ids), true));
    }
    /**
     * 查询生产配合比
     */
    @GetMapping("/mixproportionList")
    public List<MixproportionBo> mixproportionList() {
        return stirstationProductionTaskService.mixproportionList();
    }
}
