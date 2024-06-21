package org.dromara.productionTask.service;

import org.dromara.productionTask.domain.bo.MixproportionBo;
import org.dromara.productionTask.domain.vo.StirstationProductionTaskVo;
import org.dromara.productionTask.domain.bo.StirstationProductionTaskBo;
import org.dromara.common.mybatis.core.page.TableDataInfo;
import org.dromara.common.mybatis.core.page.PageQuery;

import java.util.Collection;
import java.util.List;

/**
 * 生产任务Service接口
 *
 * @author 张登齐
 * @date 2024-06-20
 */
public interface IStirstationProductionTaskService {

    /**
     * 查询生产任务
     *
     * @param id 主键
     * @return 生产任务
     */
    StirstationProductionTaskVo queryById(Long id);

    /**
     * 分页查询生产任务列表
     *
     * @param bo        查询条件
     * @param pageQuery 分页参数
     * @return 生产任务分页列表
     */
    TableDataInfo<StirstationProductionTaskVo> queryPageList(StirstationProductionTaskBo bo, PageQuery pageQuery);

    /**
     * 查询符合条件的生产任务列表
     *
     * @param bo 查询条件
     * @return 生产任务列表
     */
    List<StirstationProductionTaskVo> queryList(StirstationProductionTaskBo bo);

    /**
     * 新增生产任务
     *
     * @param bo 生产任务
     * @return 是否新增成功
     */
    Boolean insertByBo(StirstationProductionTaskBo bo);

    /**
     * 修改生产任务
     *
     * @param bo 生产任务
     * @return 是否修改成功
     */
    Boolean updateByBo(StirstationProductionTaskBo bo);

    /**
     * 校验并批量删除生产任务信息
     *
     * @param ids     待删除的主键集合
     * @param isValid 是否进行有效性校验
     * @return 是否删除成功
     */
    Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid);
    /**
     * 查询生产配合比
     */
    List<MixproportionBo> mixproportionList();
}
