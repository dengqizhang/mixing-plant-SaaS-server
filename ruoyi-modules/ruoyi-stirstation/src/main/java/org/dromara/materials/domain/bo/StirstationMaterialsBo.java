package org.dromara.materials.domain.bo;

import org.dromara.materials.domain.StirstationMaterials;
import org.dromara.common.mybatis.core.domain.BaseEntity;
import org.dromara.common.core.validate.AddGroup;
import org.dromara.common.core.validate.EditGroup;
import io.github.linpeilie.annotations.AutoMapper;
import lombok.Data;
import lombok.EqualsAndHashCode;
import jakarta.validation.constraints.*;

/**
 * 材料管理业务对象 stirstation_materials
 *
 * @author 张登齐
 * @date 2024-06-05
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AutoMapper(target = StirstationMaterials.class, reverseConvertGenerate = false)
public class StirstationMaterialsBo extends BaseEntity {

    /**
     * 材料表id
     */
    @NotNull(message = "材料表id不能为空", groups = { EditGroup.class })
    private Long id;

    /**
     * 材料类型
     */
    @NotBlank(message = "材料类型不能为空", groups = { AddGroup.class, EditGroup.class })
    private String materialsType;

    /**
     * 材料名称
     */
    @NotBlank(message = "材料名称不能为空", groups = { AddGroup.class, EditGroup.class })
    private String materialsName;

    /**
     * 规格型号
     */
    @NotBlank(message = "规格型号不能为空", groups = { AddGroup.class, EditGroup.class })
    private String specificationType;

    /**
     * 用途
     */
    private String purpose;


}
