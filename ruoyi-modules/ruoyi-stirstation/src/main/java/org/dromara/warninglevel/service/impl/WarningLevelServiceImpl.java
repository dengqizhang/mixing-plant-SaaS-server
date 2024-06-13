package org.dromara.warninglevel.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.RequiredArgsConstructor;
import org.dromara.common.mybatis.core.page.PageQuery;
import org.dromara.common.mybatis.core.page.TableDataInfo;
import org.dromara.facility.domain.vo.StirstationFacilityVo;
import org.dromara.warninglevel.domin.SysUser;
import org.dromara.warninglevel.domin.bo.WarningLevelBo;
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
     * 修改用户的预警级别
     * @param warningLevel 用户数组和预警级别信息JSON对象
     * @return boolean
     */
    @Override
    public boolean updateIds(WarningLevelBo warningLevel) {
        return waningLevelMapper.updateIds(warningLevel.getWarninglevelList(),warningLevel.getWarninglevelId());
    }
    /**
     * 查询用户列表
     * @param id 预警级别id
     * @return
     */
    @Override
    public String getInfo(Long id) {
        return waningLevelMapper.getInfo(id);
    }

    @Override
    public List<SysUser> getUserList() {
        return waningLevelMapper.getUserList();
    }
}
