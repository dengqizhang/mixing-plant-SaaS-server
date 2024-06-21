package org.dromara.productionTask.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.dromara.productionTask.domain.StirstationProductionTask;
import org.dromara.productionTask.domain.bo.MixproportionBo;
import org.dromara.productionTask.domain.bo.StirstationProductionTaskBo;
import org.dromara.productionTask.domain.vo.StirstationProductionTaskVo;
import org.dromara.common.mybatis.core.mapper.BaseMapperPlus;

import java.util.List;

/**
 * 生产任务Mapper接口
 *
 * @author 张登齐
 * @date 2024-06-20
 */
public interface StirstationProductionTaskMapper extends BaseMapperPlus<StirstationProductionTask, StirstationProductionTaskVo> {

    /**
     * 查询生产任务列表
     */
   Page<StirstationProductionTaskVo> queryList(Page<StirstationProductionTaskVo> page,StirstationProductionTaskBo bo);
    /**
     * 查询生产配合比
     */
    List<MixproportionBo> mixproportionList();
}
