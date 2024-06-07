package org.dromara.facility.domain.bo;

import org.dromara.facility.domain.StirstationFacility;
import org.dromara.common.mybatis.core.domain.BaseEntity;
import org.dromara.common.core.validate.AddGroup;
import org.dromara.common.core.validate.EditGroup;
import io.github.linpeilie.annotations.AutoMapper;
import lombok.Data;
import lombok.EqualsAndHashCode;
import jakarta.validation.constraints.*;

/**
 * 设备管理业务对象 stirstation_facility
 *
 * @author 张登齐
 * @date 2024-06-05
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AutoMapper(target = StirstationFacility.class, reverseConvertGenerate = false)
public class StirstationFacilityBo extends BaseEntity {

    /**
     * 设备表主键
     */
    @NotNull(message = "设备表主键不能为空", groups = { EditGroup.class })
    private Long id;

    /**
     * 设备编号
     */
    @NotBlank(message = "设备编号不能为空", groups = { AddGroup.class, EditGroup.class })
    private String facilityNumber;

    /**
     * 设备名称
     */
    @NotBlank(message = "设备名称不能为空", groups = { AddGroup.class, EditGroup.class })
    private String facilityName;

    /**
     * 设备规格
     */
    private String facilitySpecification;

    /**
     * 设备标识
     */
    @NotBlank(message = "设备标识不能为空", groups = { AddGroup.class, EditGroup.class })
    private String facilityIdentifier;


}
