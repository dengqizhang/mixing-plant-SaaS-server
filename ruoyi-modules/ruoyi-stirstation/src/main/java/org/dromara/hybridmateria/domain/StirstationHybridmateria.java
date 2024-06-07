package org.dromara.hybridmateria.domain;

import org.dromara.common.tenant.core.TenantEntity;
import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;

/**
 * 混合料管理对象 stirstation_hybridmateria
 *
 * @author 张登齐
 * @date 2024-06-05
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("stirstation_hybridmateria")
public class StirstationHybridmateria extends TenantEntity {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 混合料表主键
     */
    @TableId(value = "id",type=IdType.AUTO)
    private Long id;

    /**
     * 混合料名称
     */
    private String hybridmateriaName;


}
