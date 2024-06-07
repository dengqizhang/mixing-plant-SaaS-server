package org.dromara.materials.service.impl;

import org.dromara.common.core.utils.MapstructUtils;
import org.dromara.common.core.utils.StringUtils;
import org.dromara.common.mybatis.core.page.TableDataInfo;
import org.dromara.common.mybatis.core.page.PageQuery;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.dromara.materials.domain.bo.StirstationMaterialsBo;
import org.dromara.materials.domain.vo.StirstationMaterialsVo;
import org.dromara.materials.domain.StirstationMaterials;
import org.dromara.materials.mapper.StirstationMaterialsMapper;
import org.dromara.materials.service.IStirstationMaterialsService;

import java.util.List;
import java.util.Map;
import java.util.Collection;

/**
 * 材料管理Service业务层处理
 *
 * @author 张登齐
 * @date 2024-06-05
 */
@RequiredArgsConstructor
@Service
public class StirstationMaterialsServiceImpl implements IStirstationMaterialsService {

    private final StirstationMaterialsMapper baseMapper;

    /**
     * 查询材料管理
     *
     * @param id 主键
     * @return 材料管理
     */
    @Override
    public StirstationMaterialsVo queryById(Long id){
        return baseMapper.selectVoById(id);
    }

    /**
     * 分页查询材料管理列表
     *
     * @param bo        查询条件
     * @param pageQuery 分页参数
     * @return 材料管理分页列表
     */
    @Override
    public TableDataInfo<StirstationMaterialsVo> queryPageList(StirstationMaterialsBo bo, PageQuery pageQuery) {
        LambdaQueryWrapper<StirstationMaterials> lqw = buildQueryWrapper(bo);
        Page<StirstationMaterialsVo> result = baseMapper.selectVoPage(pageQuery.build(), lqw);
        return TableDataInfo.build(result);
    }

    /**
     * 查询符合条件的材料管理列表
     *
     * @param bo 查询条件
     * @return 材料管理列表
     */
    @Override
    public List<StirstationMaterialsVo> queryList(StirstationMaterialsBo bo) {
        LambdaQueryWrapper<StirstationMaterials> lqw = buildQueryWrapper(bo);
        return baseMapper.selectVoList(lqw);
    }

    private LambdaQueryWrapper<StirstationMaterials> buildQueryWrapper(StirstationMaterialsBo bo) {
        Map<String, Object> params = bo.getParams();
        LambdaQueryWrapper<StirstationMaterials> lqw = Wrappers.lambdaQuery();
        lqw.eq(StringUtils.isNotBlank(bo.getMaterialsType()), StirstationMaterials::getMaterialsType, bo.getMaterialsType());
        lqw.like(StringUtils.isNotBlank(bo.getMaterialsName()), StirstationMaterials::getMaterialsName, bo.getMaterialsName());
        lqw.eq(StringUtils.isNotBlank(bo.getSpecificationType()), StirstationMaterials::getSpecificationType, bo.getSpecificationType());
        lqw.eq(StringUtils.isNotBlank(bo.getPurpose()), StirstationMaterials::getPurpose, bo.getPurpose());
        return lqw;
    }

    /**
     * 新增材料管理
     *
     * @param bo 材料管理
     * @return 是否新增成功
     */
    @Override
    public Boolean insertByBo(StirstationMaterialsBo bo) {
        StirstationMaterials add = MapstructUtils.convert(bo, StirstationMaterials.class);
        validEntityBeforeSave(add);
        boolean flag = baseMapper.insert(add) > 0;
        if (flag) {
            bo.setId(add.getId());
        }
        return flag;
    }

    /**
     * 修改材料管理
     *
     * @param bo 材料管理
     * @return 是否修改成功
     */
    @Override
    public Boolean updateByBo(StirstationMaterialsBo bo) {
        StirstationMaterials update = MapstructUtils.convert(bo, StirstationMaterials.class);
        validEntityBeforeSave(update);
        return baseMapper.updateById(update) > 0;
    }

    /**
     * 保存前的数据校验
     */
    private void validEntityBeforeSave(StirstationMaterials entity){
        //TODO 做一些数据校验,如唯一约束
    }

    /**
     * 校验并批量删除材料管理信息
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
