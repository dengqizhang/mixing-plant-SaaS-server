package org.dromara.facility.domain.vo;

import org.dromara.facility.domain.StirstationFacility;
import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;
import org.dromara.common.excel.annotation.ExcelDictFormat;
import org.dromara.common.excel.convert.ExcelDictConvert;
import io.github.linpeilie.annotations.AutoMapper;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;



/**
 * 设备管理视图对象 stirstation_facility
 *
 * @author 张登齐
 * @date 2024-06-05
 */
@Data
@ExcelIgnoreUnannotated
@AutoMapper(target = StirstationFacility.class)
public class StirstationFacilityVo implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 设备表主键
     */
    @ExcelProperty(value = "设备表主键")
    private Long id;

    /**
     * 设备编号
     */
    @ExcelProperty(value = "设备编号")
    private String facilityNumber;

    /**
     * 设备名称
     */
    @ExcelProperty(value = "设备名称")
    private String facilityName;

    /**
     * 设备规格
     */
    @ExcelProperty(value = "设备规格")
    private String facilitySpecification;

    /**
     * 设备标识
     */
    @ExcelProperty(value = "设备标识")
    private String facilityIdentifier;


}
