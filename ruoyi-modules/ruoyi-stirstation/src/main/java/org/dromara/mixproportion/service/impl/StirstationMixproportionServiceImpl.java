package org.dromara.mixproportion.service.impl;

import org.dromara.common.core.utils.MapstructUtils;
import org.dromara.common.core.utils.StringUtils;
import org.dromara.common.mybatis.core.page.TableDataInfo;
import org.dromara.common.mybatis.core.page.PageQuery;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.dromara.mixproportion.domain.bo.StirstationMixproportionBo;
import org.dromara.mixproportion.domain.vo.StirstationMixproportionVo;
import org.dromara.mixproportion.domain.StirstationMixproportion;
import org.dromara.mixproportion.mapper.StirstationMixproportionMapper;
import org.dromara.mixproportion.service.IStirstationMixproportionService;

import java.util.List;
import java.util.Map;
import java.util.Collection;

/**
 * 生产配合比Service业务层处理
 *
 * @author 张登齐
 * @date 2024-06-14
 */
@RequiredArgsConstructor
@Service
public class StirstationMixproportionServiceImpl implements IStirstationMixproportionService {

    private final StirstationMixproportionMapper baseMapper;

    /**
     * 查询生产配合比
     *
     * @param id 主键
     * @return 生产配合比
     */
    @Override
    public StirstationMixproportionVo queryById(Long id){
        return baseMapper.selectVoById(id);
    }

    /**
     * 分页查询生产配合比列表
     *
     * @param bo        查询条件
     * @param pageQuery 分页参数
     * @return 生产配合比分页列表
     */
    @Override
    public TableDataInfo<StirstationMixproportionVo> queryPageList(StirstationMixproportionBo bo, PageQuery pageQuery) {
        LambdaQueryWrapper<StirstationMixproportion> lqw = buildQueryWrapper(bo);
        Page<StirstationMixproportionVo> result = baseMapper.selectVoPage(pageQuery.build(), lqw);

        System.out.println();
        return TableDataInfo.build(result);
    }

    /**
     * 查询符合条件的生产配合比列表
     *
     * @param bo 查询条件
     * @return 生产配合比列表
     */
    @Override
    public List<StirstationMixproportionVo> queryList(StirstationMixproportionBo bo) {
        LambdaQueryWrapper<StirstationMixproportion> lqw = buildQueryWrapper(bo);
        return baseMapper.selectVoList(lqw);
    }

    private LambdaQueryWrapper<StirstationMixproportion> buildQueryWrapper(StirstationMixproportionBo bo) {
        Map<String, Object> params = bo.getParams();
        LambdaQueryWrapper<StirstationMixproportion> lqw = Wrappers.lambdaQuery();
        lqw.like(StringUtils.isNotBlank(bo.getMixproportionName()), StirstationMixproportion::getMixproportionName, bo.getMixproportionName());
        lqw.like(StringUtils.isNotBlank(bo.getHybridmateriaName()), StirstationMixproportion::getHybridmateriaName, bo.getHybridmateriaName());
        lqw.eq(StringUtils.isNotBlank(bo.getConstructionAddress()), StirstationMixproportion::getConstructionAddress, bo.getConstructionAddress());
        lqw.eq(StringUtils.isNotBlank(bo.getFacility()), StirstationMixproportion::getFacility, bo.getFacility());
        lqw.eq(StringUtils.isNotBlank(bo.getJnMaterialsOne()), StirstationMixproportion::getJnMaterialsOne, bo.getJnMaterialsOne());
        lqw.eq(bo.getJnWeightOne() != null, StirstationMixproportion::getJnWeightOne, bo.getJnWeightOne());
        lqw.eq(StringUtils.isNotBlank(bo.getJnMaterialsTwo()), StirstationMixproportion::getJnMaterialsTwo, bo.getJnMaterialsTwo());
        lqw.eq(bo.getJnWeightTwo() != null, StirstationMixproportion::getJnWeightTwo, bo.getJnWeightTwo());
        lqw.eq(StringUtils.isNotBlank(bo.getJnMaterialsThree()), StirstationMixproportion::getJnMaterialsThree, bo.getJnMaterialsThree());
        lqw.eq(bo.getJnWeightThree() != null, StirstationMixproportion::getJnWeightThree, bo.getJnWeightThree());
        lqw.eq(StringUtils.isNotBlank(bo.getJnMaterialsFour()), StirstationMixproportion::getJnMaterialsFour, bo.getJnMaterialsFour());
        lqw.eq(bo.getJnWeightFour() != null, StirstationMixproportion::getJnWeightFour, bo.getJnWeightFour());
        lqw.eq(StringUtils.isNotBlank(bo.getJnMaterialsFive()), StirstationMixproportion::getJnMaterialsFive, bo.getJnMaterialsFive());
        lqw.eq(bo.getJnWeightFive() != null, StirstationMixproportion::getJnWeightFive, bo.getJnWeightFive());
        lqw.eq(StringUtils.isNotBlank(bo.getJnMaterialsSix()), StirstationMixproportion::getJnMaterialsSix, bo.getJnMaterialsSix());
        lqw.eq(bo.getJnWeightSix() != null, StirstationMixproportion::getJnWeightSix, bo.getJnWeightSix());
        lqw.eq(StringUtils.isNotBlank(bo.getJnMaterialsSeven()), StirstationMixproportion::getJnMaterialsSeven, bo.getJnMaterialsSeven());
        lqw.eq(bo.getJnWeightSeven() != null, StirstationMixproportion::getJnWeightSeven, bo.getJnWeightSeven());
        lqw.eq(StringUtils.isNotBlank(bo.getJnMaterialsEight()), StirstationMixproportion::getJnMaterialsEight, bo.getJnMaterialsEight());
        lqw.eq(bo.getJnWeightEight() != null, StirstationMixproportion::getJnWeightEight, bo.getJnWeightEight());
        lqw.eq(StringUtils.isNotBlank(bo.getGlMaterialsOne()), StirstationMixproportion::getGlMaterialsOne, bo.getGlMaterialsOne());
        lqw.eq(bo.getGlWeightOne() != null, StirstationMixproportion::getGlWeightOne, bo.getGlWeightOne());
        lqw.eq(StringUtils.isNotBlank(bo.getGlMaterialsTwo()), StirstationMixproportion::getGlMaterialsTwo, bo.getGlMaterialsTwo());
        lqw.eq(bo.getGlWeightTwo() != null, StirstationMixproportion::getGlWeightTwo, bo.getGlWeightTwo());
        lqw.eq(StringUtils.isNotBlank(bo.getGlMaterialsThree()), StirstationMixproportion::getGlMaterialsThree, bo.getGlMaterialsThree());
        lqw.eq(bo.getGlWeightThree() != null, StirstationMixproportion::getGlWeightThree, bo.getGlWeightThree());
        lqw.eq(StringUtils.isNotBlank(bo.getGlMaterialsFour()), StirstationMixproportion::getGlMaterialsFour, bo.getGlMaterialsFour());
        lqw.eq(bo.getGlWeightFour() != null, StirstationMixproportion::getGlWeightFour, bo.getGlWeightFour());
        lqw.eq(StringUtils.isNotBlank(bo.getGlMaterialsFive()), StirstationMixproportion::getGlMaterialsFive, bo.getGlMaterialsFive());
        lqw.eq(bo.getGlWeightFive() != null, StirstationMixproportion::getGlWeightFive, bo.getGlWeightFive());
        lqw.eq(StringUtils.isNotBlank(bo.getGlMaterialsSix()), StirstationMixproportion::getGlMaterialsSix, bo.getGlMaterialsSix());
        lqw.eq(bo.getGlWeightSix() != null, StirstationMixproportion::getGlWeightSix, bo.getGlWeightSix());
        lqw.eq(StringUtils.isNotBlank(bo.getWjjMaterialsOne()), StirstationMixproportion::getWjjMaterialsOne, bo.getWjjMaterialsOne());
        lqw.eq(bo.getWjjWeightOne() != null, StirstationMixproportion::getWjjWeightOne, bo.getWjjWeightOne());
        lqw.eq(StringUtils.isNotBlank(bo.getWjjMaterialsTwo()), StirstationMixproportion::getWjjMaterialsTwo, bo.getWjjMaterialsTwo());
        lqw.eq(bo.getWjjWeightTwo() != null, StirstationMixproportion::getWjjWeightTwo, bo.getWjjWeightTwo());
        lqw.eq(StringUtils.isNotBlank(bo.getWaterMaterialsOne()), StirstationMixproportion::getWaterMaterialsOne, bo.getWaterMaterialsOne());
        lqw.eq(bo.getWaterWeightOne() != null, StirstationMixproportion::getWaterWeightOne, bo.getWaterWeightOne());
        lqw.eq(StringUtils.isNotBlank(bo.getWaterMaterialsTwo()), StirstationMixproportion::getWaterMaterialsTwo, bo.getWaterMaterialsTwo());
        lqw.eq(bo.getWaterWeightTwo() != null, StirstationMixproportion::getWaterWeightTwo, bo.getWaterWeightTwo());
        return lqw;
    }

    /**
     * 新增生产配合比
     *
     * @param bo 生产配合比
     * @return 是否新增成功
     */
    @Override
    public Boolean insertByBo(StirstationMixproportionBo bo) {
        StirstationMixproportion add = MapstructUtils.convert(bo, StirstationMixproportion.class);
        validEntityBeforeSave(add);
        boolean flag = baseMapper.insert(add) > 0;
        if (flag) {
            bo.setId(add.getId());
        }
        return flag;
    }

    /**
     * 修改生产配合比
     *
     * @param bo 生产配合比
     * @return 是否修改成功
     */
    @Override
    public Boolean updateByBo(StirstationMixproportionBo bo) {
        StirstationMixproportion update = MapstructUtils.convert(bo, StirstationMixproportion.class);
        validEntityBeforeSave(update);
        return baseMapper.updateById(update) > 0;
    }

    /**
     * 保存前的数据校验
     */
    private void validEntityBeforeSave(StirstationMixproportion entity){
        //TODO 做一些数据校验,如唯一约束
    }

    /**
     * 校验并批量删除生产配合比信息
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
