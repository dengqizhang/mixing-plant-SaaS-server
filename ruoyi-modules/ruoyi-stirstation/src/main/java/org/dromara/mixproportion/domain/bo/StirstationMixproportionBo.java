package org.dromara.mixproportion.domain.bo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import org.dromara.mixproportion.domain.StirstationMixproportion;
import org.dromara.common.mybatis.core.domain.BaseEntity;
import org.dromara.common.core.validate.AddGroup;
import org.dromara.common.core.validate.EditGroup;
import io.github.linpeilie.annotations.AutoMapper;
import lombok.Data;
import lombok.EqualsAndHashCode;
import jakarta.validation.constraints.*;
import java.math.BigDecimal;

/**
 * 生产配合比业务对象 stirstation_mixproportion
 *
 * @author 张登齐
 * @date 2024-06-14
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AutoMapper(target = StirstationMixproportion.class, reverseConvertGenerate = false)
public class StirstationMixproportionBo extends BaseEntity {

    /**
     * 生产配合比表主键
     */
    @NotNull(message = "生产配合比表主键不能为空", groups = { EditGroup.class })
    private Long id;

    /**
     * 配合比名称
     */
    @NotBlank(message = "配合比名称不能为空", groups = { AddGroup.class, EditGroup.class })
    private String mixproportionName;

    /**
     * 混合料名称
     */
    @NotBlank(message = "混合料名称不能为空", groups = { AddGroup.class, EditGroup.class })
    private String hybridmateriaName;

    /**
     * 施工部位
     */
    @NotBlank(message = "施工部位不能为空", groups = { AddGroup.class, EditGroup.class })
    private String constructionAddress;

    /**
     * 设备
     */
    @NotBlank(message = "设备不能为空", groups = { AddGroup.class, EditGroup.class })
    private String facility;

    /**
     * 胶凝1仓材料
     */
    private String jnMaterialsOne;

    /**
     * 胶凝1仓重量
     */
    @NotNull(message = "胶凝1仓重量不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal jnWeightOne;

    /**
     * 胶凝2仓材料
     */
    private String jnMaterialsTwo;

    /**
     * 胶凝2仓重量
     */
    @NotNull(message = "胶凝2仓重量不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal jnWeightTwo;

    /**
     * 胶凝3仓材料
     */
    private String jnMaterialsThree;

    /**
     * 胶凝3仓重量
     */
    @NotNull(message = "胶凝3仓重量不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal jnWeightThree;

    /**
     * 胶凝4仓材料
     */
    private String jnMaterialsFour;

    /**
     * 胶凝4仓重量
     */
    @NotNull(message = "胶凝4仓重量不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal jnWeightFour;

    /**
     * 胶凝5仓材料
     */
    private String jnMaterialsFive;

    /**
     * 胶凝5仓重量
     */
    @NotNull(message = "胶凝5仓重量不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal jnWeightFive;

    /**
     * 胶凝6仓材料
     */
    private String jnMaterialsSix;

    /**
     * 胶凝6仓重量
     */
    @NotNull(message = "胶凝6仓重量不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal jnWeightSix;

    /**
     * 胶凝7仓材料
     */
    private String jnMaterialsSeven;

    /**
     * 胶凝7仓重量
     */
    @NotNull(message = "胶凝7仓重量不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal jnWeightSeven;

    /**
     * 胶凝8仓材料
     */
    private String jnMaterialsEight;

    /**
     * 胶凝8仓重量
     */
    @NotNull(message = "胶凝8仓重量不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal jnWeightEight;

    /**
     * 骨料1仓材料
     */
    private String glMaterialsOne;

    /**
     * 骨料1仓重量
     */
    @NotNull(message = "骨料1仓重量不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal glWeightOne;

    /**
     * 骨料2仓材料
     */
    private String glMaterialsTwo;

    /**
     * 骨料2仓重量
     */
    @NotNull(message = "骨料2仓重量不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal glWeightTwo;

    /**
     * 骨料3仓材料
     */
    private String glMaterialsThree;

    /**
     * 骨料3仓重量
     */
    @NotNull(message = "骨料3仓重量不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal glWeightThree;

    /**
     * 骨料4仓材料
     */
    private String glMaterialsFour;

    /**
     * 骨料4仓重量
     */
    @NotNull(message = "骨料4仓重量不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal glWeightFour;

    /**
     * 骨料5仓材料
     */
    private String glMaterialsFive;

    /**
     * 骨料5仓重量
     */
    @NotNull(message = "骨料5仓重量不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal glWeightFive;

    /**
     * 骨料6仓材料
     */
    private String glMaterialsSix;

    /**
     * 骨料6仓重量
     */
    @NotNull(message = "骨料6仓重量不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal glWeightSix;

    /**
     * 外加剂1仓材料
     */
    private String wjjMaterialsOne;

    /**
     * 外加剂1仓重量
     */
    @NotNull(message = "外加剂1仓重量不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal wjjWeightOne;

    /**
     * 外加剂2仓材料
     */
    private String wjjMaterialsTwo;

    /**
     * 外加剂2仓重量
     */
    @NotNull(message = "外加剂2仓重量不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal wjjWeightTwo;

    /**
     * 水1仓材料
     */
    private String waterMaterialsOne;

    /**
     * 水1仓重量
     */
    @NotNull(message = "水1仓重量不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal waterWeightOne;

    /**
     * 水2仓材料
     */
    private String waterMaterialsTwo;

    /**
     * 水2仓重量
     */
    @NotNull(message = "水2仓重量不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal waterWeightTwo;


}
