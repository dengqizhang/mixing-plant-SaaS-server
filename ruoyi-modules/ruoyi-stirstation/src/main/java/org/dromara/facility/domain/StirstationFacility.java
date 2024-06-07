package org.dromara.facility.domain;

import org.dromara.common.tenant.core.TenantEntity;
import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;

/**
 * 设备管理对象 stirstation_facility
 *
 * @author 张登齐
 * @date 2024-06-05
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("stirstation_facility")
public class StirstationFacility extends TenantEntity {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 设备表主键
     */
    @TableId(value = "id",type=IdType.AUTO)
    private Long id;

    /**
     * 设备编号
     */
    private String facilityNumber;

    /**
     * 设备名称
     */
    private String facilityName;

    /**
     * 设备规格
     */
    private String facilitySpecification;

    /**
     * 设备标识
     */
    private String facilityIdentifier;


}
