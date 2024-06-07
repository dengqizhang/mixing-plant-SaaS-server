package org.dromara.hybridmateria.domain.vo;

import org.dromara.hybridmateria.domain.StirstationHybridmateria;
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
 * 混合料管理视图对象 stirstation_hybridmateria
 *
 * @author 张登齐
 * @date 2024-06-05
 */
@Data
@ExcelIgnoreUnannotated
@AutoMapper(target = StirstationHybridmateria.class)
public class StirstationHybridmateriaVo implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 混合料表主键
     */
    @ExcelProperty(value = "混合料表主键")
    private Long id;

    /**
     * 混合料名称
     */
    @ExcelProperty(value = "混合料名称")
    private String hybridmateriaName;


}
