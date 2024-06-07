package org.dromara.warninglevel.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.dromara.warninglevel.domin.SysUser;

import java.util.List;

/**
 * 预警级别人员管理Mapper接口
 *
 * @author 张登齐
 * @date 2024-06-05
 */
public interface WaningLevelMapper extends BaseMapper {


    /**
     * 查询用户列表
     * @param page 分页参数
     * @return
     */
    Page<SysUser> selectWarningLevelById(IPage<SysUser> page);
}
