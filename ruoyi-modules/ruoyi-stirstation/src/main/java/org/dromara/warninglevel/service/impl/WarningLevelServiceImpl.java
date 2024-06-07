package org.dromara.warninglevel.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.RequiredArgsConstructor;
import org.dromara.common.mybatis.core.page.PageQuery;
import org.dromara.common.mybatis.core.page.TableDataInfo;
import org.dromara.facility.domain.vo.StirstationFacilityVo;
import org.dromara.warninglevel.domin.SysUser;
import org.dromara.warninglevel.mapper.WaningLevelMapper;
import org.dromara.warninglevel.service.WarningLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 预警级别人员管理Service业务层处理
 *
 * @author 张登齐
 * @date 2024-06-05
 */
@RequiredArgsConstructor
@Service
public class WarningLevelServiceImpl implements WarningLevelService {
    @Autowired
    private WaningLevelMapper waningLevelMapper;

    /**
     * 查询用户列表
     * @param pageQuery 分页参数
     * @return
     */
    @Override
    public TableDataInfo<SysUser> queryPageList( PageQuery pageQuery) {
        // 创建分页对象
        Page<SysUser> result = waningLevelMapper.selectWarningLevelById(pageQuery.build());
        return TableDataInfo.build(result);
    }
}
