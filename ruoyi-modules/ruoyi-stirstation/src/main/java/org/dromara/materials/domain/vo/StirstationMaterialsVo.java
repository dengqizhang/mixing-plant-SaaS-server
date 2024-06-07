package org.dromara.materials.domain.vo;

import org.dromara.materials.domain.StirstationMaterials;
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
 * 材料管理视图对象 stirstation_materials
 *
 * @author 张登齐
 * @date 2024-06-05
 */
@Data
@ExcelIgnoreUnannotated
@AutoMapper(target = StirstationMaterials.class)
public class StirstationMaterialsVo implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 材料表id
     */
    @ExcelProperty(value = "材料表id")
    private Long id;

    /**
     * 材料类型
     */
    @ExcelProperty(value = "材料类型")
    private String materialsType;

    /**
     * 材料名称
     */
    @ExcelProperty(value = "材料名称")
    private String materialsName;

    /**
     * 规格型号
     */
    @ExcelProperty(value = "规格型号")
    private String specificationType;

    /**
     * 用途
     */
    @ExcelProperty(value = "用途")
    private String purpose;


}
