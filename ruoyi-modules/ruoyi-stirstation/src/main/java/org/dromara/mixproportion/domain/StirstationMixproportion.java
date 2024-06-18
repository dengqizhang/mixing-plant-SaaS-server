package org.dromara.mixproportion.domain;

import org.dromara.common.tenant.core.TenantEntity;
import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.math.BigDecimal;

import java.io.Serial;

/**
 * 生产配合比对象 stirstation_mixproportion
 *
 * @author 张登齐
 * @date 2024-06-14
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("stirstation_mixproportion")
public class StirstationMixproportion extends TenantEntity {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 生产配合比表主键
     */
    @TableId(value = "id",type = IdType.AUTO)
    private Long id;

    /**
     * 配合比名称
     */
    private String mixproportionName;

    /**
     * 混合料名称
     */
    private String hybridmateriaName;

    /**
     * 施工部位
     */
    private String constructionAddress;

    /**
     * 设备
     */
    private String facility;

    /**
     * 胶凝1仓材料
     */
    private String jnMaterialsOne;

    /**
     * 胶凝1仓重量
     */
    private BigDecimal jnWeightOne;

    /**
     * 胶凝2仓材料
     */
    @TableField("jn_materials_two")
    private String jnMaterialsTwo;

    /**
     * 胶凝2仓重量
     */
    @TableField("jn_weight_two")
    private BigDecimal jnWeightTwo;

    /**
     * 胶凝3仓材料
     */

    @TableField("jn_materials_three")
    private String jnMaterialsThree;

    /**
     * 胶凝3仓重量
     */
    @TableField("jn_weight_three")
    private BigDecimal jnWeightThree;

    /**
     * 胶凝4仓材料
     */
    private String jnMaterialsFour;

    /**
     * 胶凝4仓重量
     */
    private BigDecimal jnWeightFour;

    /**
     * 胶凝5仓材料
     */
    private String jnMaterialsFive;

    /**
     * 胶凝5仓重量
     */
    private BigDecimal jnWeightFive;

    /**
     * 胶凝6仓材料
     */
    private String jnMaterialsSix;

    /**
     * 胶凝6仓重量
     */
    private BigDecimal jnWeightSix;

    /**
     * 胶凝7仓材料
     */
    private String jnMaterialsSeven;

    /**
     * 胶凝7仓重量
     */
    private BigDecimal jnWeightSeven;

    /**
     * 胶凝8仓材料
     */
    private String jnMaterialsEight;

    /**
     * 胶凝8仓重量
     */
    private BigDecimal jnWeightEight;

    /**
     * 骨料1仓材料
     */
    private String glMaterialsOne;

    /**
     * 骨料1仓重量
     */
    private BigDecimal glWeightOne;

    /**
     * 骨料2仓材料
     */
    private String glMaterialsTwo;

    /**
     * 骨料2仓重量
     */
    private BigDecimal glWeightTwo;

    /**
     * 骨料3仓材料
     */
    private String glMaterialsThree;

    /**
     * 骨料3仓重量
     */
    private BigDecimal glWeightThree;

    /**
     * 骨料4仓材料
     */
    private String glMaterialsFour;

    /**
     * 骨料4仓重量
     */
    private BigDecimal glWeightFour;

    /**
     * 骨料5仓材料
     */
    private String glMaterialsFive;

    /**
     * 骨料5仓重量
     */
    private BigDecimal glWeightFive;

    /**
     * 骨料6仓材料
     */
    private String glMaterialsSix;

    /**
     * 骨料6仓重量
     */
    private BigDecimal glWeightSix;

    /**
     * 外加剂1仓材料
     */
    private String wjjMaterialsOne;

    /**
     * 外加剂1仓重量
     */
    private BigDecimal wjjWeightOne;

    /**
     * 外加剂2仓材料
     */
    private String wjjMaterialsTwo;

    /**
     * 外加剂2仓重量
     */
    private BigDecimal wjjWeightTwo;

    /**
     * 水1仓材料
     */
    private String waterMaterialsOne;

    /**
     * 水1仓重量
     */
    private BigDecimal waterWeightOne;

    /**
     * 水2仓材料
     */
    private String waterMaterialsTwo;

    /**
     * 水2仓重量
     */
    private BigDecimal waterWeightTwo;


}
