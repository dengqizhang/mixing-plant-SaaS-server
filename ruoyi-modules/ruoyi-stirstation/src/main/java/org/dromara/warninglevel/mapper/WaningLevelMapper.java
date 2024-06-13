package org.dromara.warninglevel.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
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
     * 修改用户的预警级别
     * @param warninglevelList 用户数组
     * @param warninglevelId 预警级别ID
     * @return boolean
     */
    Boolean updateIds(String warninglevelList, Long warninglevelId);
    /**
     * 查询用户列表
     * @param id 预警级别id
     * @return
     */
    String getInfo(Long id);

    List<SysUser> getUserList();
}
