package org.dromara.mixproportion.service;

import org.dromara.mixproportion.domain.vo.StirstationMixproportionVo;
import org.dromara.mixproportion.domain.bo.StirstationMixproportionBo;
import org.dromara.common.mybatis.core.page.TableDataInfo;
import org.dromara.common.mybatis.core.page.PageQuery;

import java.util.Collection;
import java.util.List;

/**
 * 生产配合比Service接口
 *
 * @author 张登齐
 * @date 2024-06-14
 */
public interface IStirstationMixproportionService {

    /**
     * 查询生产配合比
     *
     * @param id 主键
     * @return 生产配合比
     */
    StirstationMixproportionVo queryById(Long id);

    /**
     * 分页查询生产配合比列表
     *
     * @param bo        查询条件
     * @param pageQuery 分页参数
     * @return 生产配合比分页列表
     */
    TableDataInfo<StirstationMixproportionVo> queryPageList(StirstationMixproportionBo bo, PageQuery pageQuery);

    /**
     * 查询符合条件的生产配合比列表
     *
     * @param bo 查询条件
     * @return 生产配合比列表
     */
    List<StirstationMixproportionVo> queryList(StirstationMixproportionBo bo);

    /**
     * 新增生产配合比
     *
     * @param bo 生产配合比
     * @return 是否新增成功
     */
    Boolean insertByBo(StirstationMixproportionBo bo);

    /**
     * 修改生产配合比
     *
     * @param bo 生产配合比
     * @return 是否修改成功
     */
    Boolean updateByBo(StirstationMixproportionBo bo);

    /**
     * 校验并批量删除生产配合比信息
     *
     * @param ids     待删除的主键集合
     * @param isValid 是否进行有效性校验
     * @return 是否删除成功
     */
    Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid);
}
