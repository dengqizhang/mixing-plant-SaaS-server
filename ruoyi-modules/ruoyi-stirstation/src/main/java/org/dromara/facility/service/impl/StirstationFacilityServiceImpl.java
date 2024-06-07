package org.dromara.facility.service.impl;

import org.dromara.common.core.utils.MapstructUtils;
import org.dromara.common.core.utils.StringUtils;
import org.dromara.common.mybatis.core.page.TableDataInfo;
import org.dromara.common.mybatis.core.page.PageQuery;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.dromara.facility.domain.bo.StirstationFacilityBo;
import org.dromara.facility.domain.vo.StirstationFacilityVo;
import org.dromara.facility.domain.StirstationFacility;
import org.dromara.facility.mapper.StirstationFacilityMapper;
import org.dromara.facility.service.IStirstationFacilityService;

import java.util.List;
import java.util.Map;
import java.util.Collection;

/**
 * 设备管理Service业务层处理
 *
 * @author 张登齐
 * @date 2024-06-05
 */
@RequiredArgsConstructor
@Service
public class StirstationFacilityServiceImpl implements IStirstationFacilityService {

    private final StirstationFacilityMapper baseMapper;

    /**
     * 查询设备管理
     *
     * @param id 主键
     * @return 设备管理
     */
    @Override
    public StirstationFacilityVo queryById(Long id){
        return baseMapper.selectVoById(id);
    }

    /**
     * 分页查询设备管理列表
     *
     * @param bo        查询条件
     * @param pageQuery 分页参数
     * @return 设备管理分页列表
     */
    @Override
    public TableDataInfo<StirstationFacilityVo> queryPageList(StirstationFacilityBo bo, PageQuery pageQuery) {
        LambdaQueryWrapper<StirstationFacility> lqw = buildQueryWrapper(bo);
        Page<StirstationFacilityVo> result = baseMapper.selectVoPage(pageQuery.build(), lqw);
        return TableDataInfo.build(result);
    }

    /**
     * 查询符合条件的设备管理列表
     *
     * @param bo 查询条件
     * @return 设备管理列表
     */
    @Override
    public List<StirstationFacilityVo> queryList(StirstationFacilityBo bo) {
        LambdaQueryWrapper<StirstationFacility> lqw = buildQueryWrapper(bo);
        return baseMapper.selectVoList(lqw);
    }

    private LambdaQueryWrapper<StirstationFacility> buildQueryWrapper(StirstationFacilityBo bo) {
        Map<String, Object> params = bo.getParams();
        LambdaQueryWrapper<StirstationFacility> lqw = Wrappers.lambdaQuery();
        lqw.eq(StringUtils.isNotBlank(bo.getFacilityNumber()), StirstationFacility::getFacilityNumber, bo.getFacilityNumber());
        lqw.like(StringUtils.isNotBlank(bo.getFacilityName()), StirstationFacility::getFacilityName, bo.getFacilityName());
        lqw.eq(StringUtils.isNotBlank(bo.getFacilitySpecification()), StirstationFacility::getFacilitySpecification, bo.getFacilitySpecification());
        lqw.eq(StringUtils.isNotBlank(bo.getFacilityIdentifier()), StirstationFacility::getFacilityIdentifier, bo.getFacilityIdentifier());
        return lqw;
    }

    /**
     * 新增设备管理
     *
     * @param bo 设备管理
     * @return 是否新增成功
     */
    @Override
    public Boolean insertByBo(StirstationFacilityBo bo) {
        StirstationFacility add = MapstructUtils.convert(bo, StirstationFacility.class);
        validEntityBeforeSave(add);
        boolean flag = baseMapper.insert(add) > 0;
        if (flag) {
            bo.setId(add.getId());
        }
        return flag;
    }

    /**
     * 修改设备管理
     *
     * @param bo 设备管理
     * @return 是否修改成功
     */
    @Override
    public Boolean updateByBo(StirstationFacilityBo bo) {
        StirstationFacility update = MapstructUtils.convert(bo, StirstationFacility.class);
        validEntityBeforeSave(update);
        return baseMapper.updateById(update) > 0;
    }

    /**
     * 保存前的数据校验
     */
    private void validEntityBeforeSave(StirstationFacility entity){
        //TODO 做一些数据校验,如唯一约束
    }

    /**
     * 校验并批量删除设备管理信息
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
