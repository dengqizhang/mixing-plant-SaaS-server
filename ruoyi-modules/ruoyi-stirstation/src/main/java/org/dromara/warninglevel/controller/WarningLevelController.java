package org.dromara.warninglevel.controller;

import cn.dev33.satoken.annotation.SaCheckPermission;
import lombok.RequiredArgsConstructor;
import org.dromara.common.core.domain.R;
import org.dromara.common.web.core.BaseController;
import org.dromara.warninglevel.domin.SysUser;
import org.dromara.warninglevel.domin.bo.WarningLevelBo;
import org.dromara.warninglevel.service.WarningLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
     * @return
     */
    @SaCheckPermission("warninglevel:warninglevel:list")
    @GetMapping("/list")
    public R<List<SysUser>> getUserList() {
        List<SysUser> userList = warningLevelService.getUserList();
        return R.ok("操作成功",userList);
    }
    /**
     * 查询用户列表
     * @param id 预警级别id
     * @return
     */
    @SaCheckPermission("warninglevel:warninglevel:getInfo")
    @GetMapping("/{id}")
    public R<String> getInfo(@PathVariable Long id) {
        String info = warningLevelService.getInfo(id);
        System.out.println(id);
        return R.ok("操作成功",info);
    }

    /**
     * 修改用户的预警级别
     * @param warningLevel 用户数组和预警级别信息JSON对象
     * @return boolean
     */
    @SaCheckPermission("warninglevel:warninglevel:edit")
    @PostMapping("/edit")
    public R<Void> update(@RequestBody WarningLevelBo warningLevel) {
        boolean updateIds = warningLevelService.updateIds(warningLevel);
        if (updateIds){
            return R.ok("操作成功");
        }else {
            return R.fail();
        }
    }



}
