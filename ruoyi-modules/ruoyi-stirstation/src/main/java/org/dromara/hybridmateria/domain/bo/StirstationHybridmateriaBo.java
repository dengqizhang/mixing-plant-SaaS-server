package org.dromara.hybridmateria.domain.bo;

import org.dromara.hybridmateria.domain.StirstationHybridmateria;
import org.dromara.common.mybatis.core.domain.BaseEntity;
import org.dromara.common.core.validate.AddGroup;
import org.dromara.common.core.validate.EditGroup;
import io.github.linpeilie.annotations.AutoMapper;
import lombok.Data;
import lombok.EqualsAndHashCode;
import jakarta.validation.constraints.*;

/**
 * 混合料管理业务对象 stirstation_hybridmateria
 *
 * @author 张登齐
 * @date 2024-06-05
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AutoMapper(target = StirstationHybridmateria.class, reverseConvertGenerate = false)
public class StirstationHybridmateriaBo extends BaseEntity {

    /**
     * 混合料表主键
     */
    @NotNull(message = "混合料表主键不能为空", groups = { EditGroup.class })
    private Long id;

    /**
     * 混合料名称
     */
    @NotBlank(message = "混合料名称不能为空", groups = { AddGroup.class, EditGroup.class })
    private String hybridmateriaName;


}
