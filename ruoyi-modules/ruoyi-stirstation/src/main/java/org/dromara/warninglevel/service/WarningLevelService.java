package org.dromara.warninglevel.service;

import org.dromara.common.mybatis.core.page.PageQuery;
import org.dromara.common.mybatis.core.page.TableDataInfo;
import org.dromara.warninglevel.domin.SysUser;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 预警级别人员管理Service接口
 *
 * @author 张登齐
 * @date 2024-06-05
 */
public interface WarningLevelService {
    /**
     * 查询用户列表
     * @param pageQuery 分页参数
     * @return
     */
    TableDataInfo<SysUser> queryPageList( PageQuery pageQuery);
}
