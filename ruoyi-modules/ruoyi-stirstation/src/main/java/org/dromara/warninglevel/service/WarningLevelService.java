package org.dromara.warninglevel.service;

import org.dromara.common.mybatis.core.page.PageQuery;
import org.dromara.common.mybatis.core.page.TableDataInfo;
import org.dromara.warninglevel.domin.SysUser;
import org.dromara.warninglevel.domin.bo.WarningLevelBo;

import java.util.List;

/**
 * 预警级别人员管理Service接口
 *
 * @author 张登齐
 * @date 2024-06-05
 */
public interface WarningLevelService {
    /**
     * 修改用户的预警级别
     * @param warningLevel 用户数组和预警级别信息JSON对象
     * @return boolean
     */
    boolean updateIds(WarningLevelBo warningLevel);
    /**
     * 查询用户列表
     * @param id 预警级别id
     * @return
     */
    String getInfo(Long id);

    List<SysUser> getUserList();
}
