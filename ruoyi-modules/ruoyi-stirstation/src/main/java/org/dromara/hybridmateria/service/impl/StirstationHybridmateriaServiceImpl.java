package org.dromara.hybridmateria.service.impl;

import org.dromara.common.core.utils.MapstructUtils;
import org.dromara.common.core.utils.StringUtils;
import org.dromara.common.mybatis.core.page.TableDataInfo;
import org.dromara.common.mybatis.core.page.PageQuery;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.dromara.hybridmateria.domain.bo.StirstationHybridmateriaBo;
import org.dromara.hybridmateria.domain.vo.StirstationHybridmateriaVo;
import org.dromara.hybridmateria.domain.StirstationHybridmateria;
import org.dromara.hybridmateria.mapper.StirstationHybridmateriaMapper;
import org.dromara.hybridmateria.service.IStirstationHybridmateriaService;

import java.util.List;
import java.util.Map;
import java.util.Collection;

/**
 * 混合料管理Service业务层处理
 *
 * @author 张登齐
 * @date 2024-06-05
 */
@RequiredArgsConstructor
@Service
public class StirstationHybridmateriaServiceImpl implements IStirstationHybridmateriaService {

    private final StirstationHybridmateriaMapper baseMapper;

    /**
     * 查询混合料管理
     *
     * @param id 主键
     * @return 混合料管理
     */
    @Override
    public StirstationHybridmateriaVo queryById(Long id){
        return baseMapper.selectVoById(id);
    }

    /**
     * 分页查询混合料管理列表
     *
     * @param bo        查询条件
     * @param pageQuery 分页参数
     * @return 混合料管理分页列表
     */
    @Override
    public TableDataInfo<StirstationHybridmateriaVo> queryPageList(StirstationHybridmateriaBo bo, PageQuery pageQuery) {
        LambdaQueryWrapper<StirstationHybridmateria> lqw = buildQueryWrapper(bo);
        Page<StirstationHybridmateriaVo> result = baseMapper.selectVoPage(pageQuery.build(), lqw);
        return TableDataInfo.build(result);
    }

    /**
     * 查询符合条件的混合料管理列表
     *
     * @param bo 查询条件
     * @return 混合料管理列表
     */
    @Override
    public List<StirstationHybridmateriaVo> queryList(StirstationHybridmateriaBo bo) {
        LambdaQueryWrapper<StirstationHybridmateria> lqw = buildQueryWrapper(bo);
        return baseMapper.selectVoList(lqw);
    }

    private LambdaQueryWrapper<StirstationHybridmateria> buildQueryWrapper(StirstationHybridmateriaBo bo) {
        Map<String, Object> params = bo.getParams();
        LambdaQueryWrapper<StirstationHybridmateria> lqw = Wrappers.lambdaQuery();
        lqw.like(StringUtils.isNotBlank(bo.getHybridmateriaName()), StirstationHybridmateria::getHybridmateriaName, bo.getHybridmateriaName());
        return lqw;
    }

    /**
     * 新增混合料管理
     *
     * @param bo 混合料管理
     * @return 是否新增成功
     */
    @Override
    public Boolean insertByBo(StirstationHybridmateriaBo bo) {
        StirstationHybridmateria add = MapstructUtils.convert(bo, StirstationHybridmateria.class);
        validEntityBeforeSave(add);
        boolean flag = baseMapper.insert(add) > 0;
        if (flag) {
            bo.setId(add.getId());
        }
        return flag;
    }

    /**
     * 修改混合料管理
     *
     * @param bo 混合料管理
     * @return 是否修改成功
     */
    @Override
    public Boolean updateByBo(StirstationHybridmateriaBo bo) {
        StirstationHybridmateria update = MapstructUtils.convert(bo, StirstationHybridmateria.class);
        validEntityBeforeSave(update);
        return baseMapper.updateById(update) > 0;
    }

    /**
     * 保存前的数据校验
     */
    private void validEntityBeforeSave(StirstationHybridmateria entity){
        //TODO 做一些数据校验,如唯一约束
    }

    /**
     * 校验并批量删除混合料管理信息
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
}
