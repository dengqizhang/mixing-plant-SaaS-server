package org.dromara.warninglevel.controller;

import cn.dev33.satoken.annotation.SaCheckPermission;
import lombok.RequiredArgsConstructor;
import org.dromara.common.mybatis.core.page.PageQuery;
import org.dromara.common.mybatis.core.page.TableDataInfo;
import org.dromara.common.web.core.BaseController;
import org.dromara.warninglevel.domin.SysUser;
import org.dromara.warninglevel.service.WarningLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
    * 预警级别人员管理
    *
    * @author 张登齐
    * @date 2024-06-05
    */
@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/warninglevel/warninglevel")
public class WarningLevelController extends BaseController {

    @Autowired
    WarningLevelService warningLevelService;
    /**
     * 查询用户列表
     * @param pageQuery 分页参数
     * @return
     */
    @SaCheckPermission("warninglevel:warninglevel:list")
    @GetMapping("/list")
    public TableDataInfo<SysUser> list(PageQuery pageQuery) {
        System.out.println(warningLevelService.queryPageList(pageQuery));
        return warningLevelService.queryPageList(pageQuery);
    }
    

}
