package org.dromara.materials.service;

import org.dromara.materials.domain.vo.StirstationMaterialsVo;
import org.dromara.materials.domain.bo.StirstationMaterialsBo;
import org.dromara.common.mybatis.core.page.TableDataInfo;
import org.dromara.common.mybatis.core.page.PageQuery;

import java.util.Collection;
import java.util.List;

/**
 * 材料管理Service接口
 *
 * @author 张登齐
 * @date 2024-06-05
 */
public interface IStirstationMaterialsService {

    /**
     * 查询材料管理
     *
     * @param id 主键
     * @return 材料管理
     */
    StirstationMaterialsVo queryById(Long id);

    /**
     * 分页查询材料管理列表
     *
     * @param bo        查询条件
     * @param pageQuery 分页参数
     * @return 材料管理分页列表
     */
    TableDataInfo<StirstationMaterialsVo> queryPageList(StirstationMaterialsBo bo, PageQuery pageQuery);

    /**
     * 查询符合条件的材料管理列表
     *
     * @param bo 查询条件
     * @return 材料管理列表
     */
    List<StirstationMaterialsVo> queryList(StirstationMaterialsBo bo);

    /**
     * 新增材料管理
     *
     * @param bo 材料管理
     * @return 是否新增成功
     */
    Boolean insertByBo(StirstationMaterialsBo bo);

    /**
     * 修改材料管理
     *
     * @param bo 材料管理
     * @return 是否修改成功
     */
    Boolean updateByBo(StirstationMaterialsBo bo);

    /**
     * 校验并批量删除材料管理信息
     *
     * @param ids     待删除的主键集合
     * @param isValid 是否进行有效性校验
     * @return 是否删除成功
     */
    Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid);
}
