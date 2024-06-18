package org.dromara.mixproportion.domain.vo;

import java.math.BigDecimal;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import org.dromara.mixproportion.domain.StirstationMixproportion;
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
 * 生产配合比视图对象 stirstation_mixproportion
 *
 * @author 张登齐
 * @date 2024-06-14
 */
@Data
@ExcelIgnoreUnannotated
@AutoMapper(target = StirstationMixproportion.class)
public class StirstationMixproportionVo implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 生产配合比表主键
     */
    @ExcelProperty(value = "生产配合比表主键")
    private Long id;

    /**
     * 配合比名称
     */
    @ExcelProperty(value = "配合比名称")
    private String mixproportionName;

    /**
     * 混合料名称
     */
    @ExcelProperty(value = "混合料名称")
    private String hybridmateriaName;

    /**
     * 施工部位
     */
    @ExcelProperty(value = "施工部位")
    private String constructionAddress;

    /**
     * 设备
     */
    @ExcelProperty(value = "设备")
    private String facility;

    /**
     * 胶凝1仓材料
     */
    @ExcelProperty(value = "胶凝1仓材料")
    private String jnMaterialsOne;

    /**
     * 胶凝1仓重量
     */
    @ExcelProperty(value = "胶凝1仓重量")
    private BigDecimal jnWeightOne;

    /**
     * 胶凝2仓材料
     */
    @ExcelProperty(value = "胶凝2仓材料")
    private String jnMaterialsTwo;

    /**
     * 胶凝2仓重量
     */
    @ExcelProperty(value = "胶凝2仓重量")
    private BigDecimal jnWeightTwo;

    /**
     * 胶凝3仓材料
     */
    @ExcelProperty(value = "胶凝3仓材料")
    private String jnMaterialsThree;

    /**
     * 胶凝3仓重量
     */
    @ExcelProperty(value = "胶凝3仓重量")
    private BigDecimal jnWeightThree;

    /**
     * 胶凝4仓材料
     */
    @ExcelProperty(value = "胶凝4仓材料")
    private String jnMaterialsFour;

    /**
     * 胶凝4仓重量
     */
    @ExcelProperty(value = "胶凝4仓重量")
    private BigDecimal jnWeightFour;

    /**
     * 胶凝5仓材料
     */
    @ExcelProperty(value = "胶凝5仓材料")
    private String jnMaterialsFive;

    /**
     * 胶凝5仓重量
     */
    @ExcelProperty(value = "胶凝5仓重量")
    private BigDecimal jnWeightFive;

    /**
     * 胶凝6仓材料
     */
    @ExcelProperty(value = "胶凝6仓材料")
    private String jnMaterialsSix;

    /**
     * 胶凝6仓重量
     */
    @ExcelProperty(value = "胶凝6仓重量")
    private BigDecimal jnWeightSix;

    /**
     * 胶凝7仓材料
     */
    @ExcelProperty(value = "胶凝7仓材料")
    private String jnMaterialsSeven;

    /**
     * 胶凝7仓重量
     */
    @ExcelProperty(value = "胶凝7仓重量")
    private BigDecimal jnWeightSeven;

    /**
     * 胶凝8仓材料
     */
    @ExcelProperty(value = "胶凝8仓材料")
    private String jnMaterialsEight;

    /**
     * 胶凝8仓重量
     */
    @ExcelProperty(value = "胶凝8仓重量")
    private BigDecimal jnWeightEight;

    /**
     * 骨料1仓材料
     */
    @ExcelProperty(value = "骨料1仓材料")
    private String glMaterialsOne;

    /**
     * 骨料1仓重量
     */
    @ExcelProperty(value = "骨料1仓重量")
    private BigDecimal glWeightOne;

    /**
     * 骨料2仓材料
     */
    @ExcelProperty(value = "骨料2仓材料")
    private String glMaterialsTwo;

    /**
     * 骨料2仓重量
     */
    @ExcelProperty(value = "骨料2仓重量")
    private BigDecimal glWeightTwo;

    /**
     * 骨料3仓材料
     */
    @ExcelProperty(value = "骨料3仓材料")
    private String glMaterialsThree;

    /**
     * 骨料3仓重量
     */
    @ExcelProperty(value = "骨料3仓重量")
    private BigDecimal glWeightThree;

    /**
     * 骨料4仓材料
     */
    @ExcelProperty(value = "骨料4仓材料")
    private String glMaterialsFour;

    /**
     * 骨料4仓重量
     */
    @ExcelProperty(value = "骨料4仓重量")
    private BigDecimal glWeightFour;

    /**
     * 骨料5仓材料
     */
    @ExcelProperty(value = "骨料5仓材料")
    private String glMaterialsFive;

    /**
     * 骨料5仓重量
     */
    @ExcelProperty(value = "骨料5仓重量")
    private BigDecimal glWeightFive;

    /**
     * 骨料6仓材料
     */
    @ExcelProperty(value = "骨料6仓材料")
    private String glMaterialsSix;

    /**
     * 骨料6仓重量
     */
    @ExcelProperty(value = "骨料6仓重量")
    private BigDecimal glWeightSix;

    /**
     * 外加剂1仓材料
     */
    @ExcelProperty(value = "外加剂1仓材料")
    private String wjjMaterialsOne;

    /**
     * 外加剂1仓重量
     */
    @ExcelProperty(value = "外加剂1仓重量")
    private BigDecimal wjjWeightOne;

    /**
     * 外加剂2仓材料
     */
    @ExcelProperty(value = "外加剂2仓材料")
    private String wjjMaterialsTwo;

    /**
     * 外加剂2仓重量
     */
    @ExcelProperty(value = "外加剂2仓重量")
    private BigDecimal wjjWeightTwo;

    /**
     * 水1仓材料
     */
    @ExcelProperty(value = "水1仓材料")
    private String waterMaterialsOne;

    /**
     * 水1仓重量
     */
    @ExcelProperty(value = "水1仓重量")
    private BigDecimal waterWeightOne;

    /**
     * 水2仓材料
     */
    @ExcelProperty(value = "水2仓材料")
    private String waterMaterialsTwo;

    /**
     * 水2仓重量
     */
    @ExcelProperty(value = "水2仓重量")
    private BigDecimal waterWeightTwo;


}
