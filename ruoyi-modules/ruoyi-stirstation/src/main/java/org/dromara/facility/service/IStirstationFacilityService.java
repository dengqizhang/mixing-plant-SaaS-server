package org.dromara.facility.service;

import org.dromara.facility.domain.vo.StirstationFacilityVo;
import org.dromara.facility.domain.bo.StirstationFacilityBo;
import org.dromara.common.mybatis.core.page.TableDataInfo;
import org.dromara.common.mybatis.core.page.PageQuery;

import java.util.Collection;
import java.util.List;

/**
 * 设备管理Service接口
 *
 * @author 张登齐
 * @date 2024-06-05
 */
public interface IStirstationFacilityService {

    /**
     * 查询设备管理
     *
     * @param id 主键
     * @return 设备管理
     */
    StirstationFacilityVo queryById(Long id);

    /**
     * 分页查询设备管理列表
     *
     * @param bo        查询条件
     * @param pageQuery 分页参数
     * @return 设备管理分页列表
     */
    TableDataInfo<StirstationFacilityVo> queryPageList(StirstationFacilityBo bo, PageQuery pageQuery);

    /**
     * 查询符合条件的设备管理列表
     *
     * @param bo 查询条件
     * @return 设备管理列表
     */
    List<StirstationFacilityVo> queryList(StirstationFacilityBo bo);

    /**
     * 新增设备管理
     *
     * @param bo 设备管理
     * @return 是否新增成功
     */
    Boolean insertByBo(StirstationFacilityBo bo);

    /**
     * 修改设备管理
     *
     * @param bo 设备管理
     * @return 是否修改成功
     */
    Boolean updateByBo(StirstationFacilityBo bo);

    /**
     * 校验并批量删除设备管理信息
     *
     * @param ids     待删除的主键集合
     * @param isValid 是否进行有效性校验
     * @return 是否删除成功
     */
    Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid);
}
