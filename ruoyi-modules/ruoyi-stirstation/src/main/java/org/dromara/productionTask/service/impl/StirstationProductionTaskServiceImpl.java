package org.dromara.productionTask.service.impl;

import org.dromara.common.core.utils.MapstructUtils;
import org.dromara.common.core.utils.StringUtils;
import org.dromara.common.mybatis.core.page.TableDataInfo;
import org.dromara.common.mybatis.core.page.PageQuery;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import lombok.RequiredArgsConstructor;
import org.dromara.productionTask.domain.bo.MixproportionBo;
import org.springframework.stereotype.Service;
import org.dromara.productionTask.domain.bo.StirstationProductionTaskBo;
import org.dromara.productionTask.domain.vo.StirstationProductionTaskVo;
import org.dromara.productionTask.domain.StirstationProductionTask;
import org.dromara.productionTask.mapper.StirstationProductionTaskMapper;
import org.dromara.productionTask.service.IStirstationProductionTaskService;

import java.util.List;
import java.util.Map;
import java.util.Collection;

/**
 * 生产任务Service业务层处理
 *
 * @author 张登齐
 * @date 2024-06-20
 */
@RequiredArgsConstructor
@Service
public class StirstationProductionTaskServiceImpl implements IStirstationProductionTaskService {

    private final StirstationProductionTaskMapper baseMapper;

    /**
     * 查询生产任务
     *
     * @param id 主键
     * @return 生产任务
     */
    @Override
    public StirstationProductionTaskVo queryById(Long id){
        return baseMapper.selectVoById(id);
    }

    /**
     * 分页查询生产任务列表
     *
     * @param pageQuery 分页参数
     * @return 生产任务分页列表
     */
    @Override
    public TableDataInfo<StirstationProductionTaskVo> queryPageList(StirstationProductionTaskBo bo,PageQuery pageQuery) {
        Page<StirstationProductionTaskVo> result = baseMapper.queryList(pageQuery.build(),bo);
        System.out.println(result);
        return TableDataInfo.build(result);
    }

    /**
     * 查询符合条件的生产任务列表
     *
     * @param bo 查询条件
     * @return 生产任务列表
     */
    @Override
    public List<StirstationProductionTaskVo> queryList(StirstationProductionTaskBo bo) {
        LambdaQueryWrapper<StirstationProductionTask> lqw = buildQueryWrapper(bo);
        return baseMapper.selectVoList(lqw);
    }

    private LambdaQueryWrapper<StirstationProductionTask> buildQueryWrapper(StirstationProductionTaskBo bo) {
        Map<String, Object> params = bo.getParams();
        LambdaQueryWrapper<StirstationProductionTask> lqw = Wrappers.lambdaQuery();
        lqw.like(StringUtils.isNotBlank(bo.getTaskName()), StirstationProductionTask::getTaskName, bo.getTaskName());
        lqw.eq(bo.getStartTime() != null, StirstationProductionTask::getStartTime, bo.getStartTime());
        lqw.eq(StringUtils.isNotBlank(bo.getProductionMixproportion()), StirstationProductionTask::getProductionMixproportion, bo.getProductionMixproportion());
        lqw.eq(bo.getTaskType() != null, StirstationProductionTask::getTaskType, bo.getTaskType());
        return lqw;
    }

    /**
     * 新增生产任务
     *
     * @param bo 生产任务
     * @return 是否新增成功
     */
    @Override
    public Boolean insertByBo(StirstationProductionTaskBo bo) {
        StirstationProductionTask add = MapstructUtils.convert(bo, StirstationProductionTask.class);
        validEntityBeforeSave(add);
        boolean flag = baseMapper.insert(add) > 0;
        if (flag) {
            bo.setId(add.getId());
        }
        return flag;
    }

    /**
     * 修改生产任务
     *
     * @param bo 生产任务
     * @return 是否修改成功
     */
    @Override
    public Boolean updateByBo(StirstationProductionTaskBo bo) {
        StirstationProductionTask update = MapstructUtils.convert(bo, StirstationProductionTask.class);
        validEntityBeforeSave(update);
        return baseMapper.updateById(update) > 0;
    }

    /**
     * 保存前的数据校验
     */
    private void validEntityBeforeSave(StirstationProductionTask entity){
        //TODO 做一些数据校验,如唯一约束
    }

    /**
     * 校验并批量删除生产任务信息
     *
     * @param ids     待删除的主键集合
     * @param isValid 是否进行有效性校验
     * @return 是否删除成功
     */
    @Override
    public Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid) {
        if(isValid){
            //TODO 做一些业务上的校验,判断是否需要校验
        }
        return baseMapper.deleteBatchIds(ids) > 0;
    }
    /**
     * 查询生产配合比
     */
    @Override
    public List<MixproportionBo> mixproportionList() {
        return baseMapper.mixproportionList();
    }
}
