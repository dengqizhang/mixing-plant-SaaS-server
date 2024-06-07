package org.dromara.hybridmateria.service;

import org.dromara.hybridmateria.domain.vo.StirstationHybridmateriaVo;
import org.dromara.hybridmateria.domain.bo.StirstationHybridmateriaBo;
import org.dromara.common.mybatis.core.page.TableDataInfo;
import org.dromara.common.mybatis.core.page.PageQuery;

import java.util.Collection;
import java.util.List;

/**
 * 混合料管理Service接口
 *
 * @author 张登齐
 * @date 2024-06-05
 */
public interface IStirstationHybridmateriaService {

    /**
     * 查询混合料管理
     *
     * @param id 主键
     * @return 混合料管理
     */
    StirstationHybridmateriaVo queryById(Long id);

    /**
     * 分页查询混合料管理列表
     *
     * @param bo        查询条件
     * @param pageQuery 分页参数
     * @return 混合料管理分页列表
     */
    TableDataInfo<StirstationHybridmateriaVo> queryPageList(StirstationHybridmateriaBo bo, PageQuery pageQuery);

    /**
     * 查询符合条件的混合料管理列表
     *
     * @param bo 查询条件
     * @return 混合料管理列表
     */
    List<StirstationHybridmateriaVo> queryList(StirstationHybridmateriaBo bo);

    /**
     * 新增混合料管理
     *
     * @param bo 混合料管理
     * @return 是否新增成功
     */
    Boolean insertByBo(StirstationHybridmateriaBo bo);

    /**
     * 修改混合料管理
     *
     * @param bo 混合料管理
     * @return 是否修改成功
     */
    Boolean updateByBo(StirstationHybridmateriaBo bo);

    /**
     * 校验并批量删除混合料管理信息
     *
     * @param ids     待删除的主键集合
     * @param isValid 是否进行有效性校验
     * @return 是否删除成功
     */
    Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid);
}
