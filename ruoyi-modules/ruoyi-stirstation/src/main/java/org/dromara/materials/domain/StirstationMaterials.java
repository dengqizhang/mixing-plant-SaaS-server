package org.dromara.materials.domain;

import org.dromara.common.tenant.core.TenantEntity;
import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;

/**
 * 材料管理对象 stirstation_materials
 *
 * @author 张登齐
 * @date 2024-06-05
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("stirstation_materials")
public class StirstationMaterials extends TenantEntity {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 材料表id
     */
    @TableId(value = "id",type=IdType.AUTO)
    private Long id;

    /**
     * 材料类型
     */
    private String materialsType;

    /**
     * 材料名称
     */
    private String materialsName;

    /**
     * 规格型号
     */
    private String specificationType;

    /**
     * 用途
     */
    private String purpose;


}
