package org.dromara.mixproportion.controller;

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
import org.dromara.mixproportion.domain.vo.StirstationMixproportionVo;
import org.dromara.mixproportion.domain.bo.StirstationMixproportionBo;
import org.dromara.mixproportion.service.IStirstationMixproportionService;
import org.dromara.common.mybatis.core.page.TableDataInfo;

/**
 * 生产配合比
 *
 * @author 张登齐
 * @date 2024-06-14
 */
@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/mixproportion/mixproportion")
public class StirstationMixproportionController extends BaseController {

    private final IStirstationMixproportionService stirstationMixproportionService;

    /**
     * 查询生产配合比列表
     */
    @SaCheckPermission("mixproportion:mixproportion:list")
    @GetMapping("/list")
    public TableDataInfo<StirstationMixproportionVo> list(StirstationMixproportionBo bo, PageQuery pageQuery) {
        System.out.println("测试对象"+bo);
        System.out.println("测试分页参数" + pageQuery);
        return stirstationMixproportionService.queryPageList(bo, pageQuery);
    }

    /**
     * 导出生产配合比列表
     */
    @SaCheckPermission("mixproportion:mixproportion:export")
    @Log(title = "生产配合比", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(StirstationMixproportionBo bo, HttpServletResponse response) {
        List<StirstationMixproportionVo> list = stirstationMixproportionService.queryList(bo);
        ExcelUtil.exportExcel(list, "生产配合比", StirstationMixproportionVo.class, response);
    }

    /**
     * 获取生产配合比详细信息
     *
     * @param id 主键
     */
    @SaCheckPermission("mixproportion:mixproportion:query")
    @GetMapping("/{id}")
    public R<StirstationMixproportionVo> getInfo(@NotNull(message = "主键不能为空")
                                     @PathVariable Long id) {
        return R.ok(stirstationMixproportionService.queryById(id));
    }

    /**
     * 新增生产配合比
     */
    @SaCheckPermission("mixproportion:mixproportion:add")
    @Log(title = "生产配合比", businessType = BusinessType.INSERT)
    @RepeatSubmit()
    @PostMapping()
    public R<Void> add(@Validated(AddGroup.class) @RequestBody StirstationMixproportionBo bo) {
        return toAjax(stirstationMixproportionService.insertByBo(bo));
    }

    /**
     * 修改生产配合比
     */
    @SaCheckPermission("mixproportion:mixproportion:edit")
    @Log(title = "生产配合比", businessType = BusinessType.UPDATE)
    @RepeatSubmit()
    @PutMapping()
    public R<Void> edit(@Validated(EditGroup.class) @RequestBody StirstationMixproportionBo bo) {
        return toAjax(stirstationMixproportionService.updateByBo(bo));
    }

    /**
     * 删除生产配合比
     *
     * @param ids 主键串
     */
    @SaCheckPermission("mixproportion:mixproportion:remove")
    @Log(title = "生产配合比", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public R<Void> remove(@NotEmpty(message = "主键不能为空")
                          @PathVariable Long[] ids) {
        return toAjax(stirstationMixproportionService.deleteWithValidByIds(List.of(ids), true));
    }
}
