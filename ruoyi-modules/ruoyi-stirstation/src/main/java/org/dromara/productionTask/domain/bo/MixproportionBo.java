package org.dromara.productionTask.domain.bo;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
/**
 * 生产配合比业务对象 stirstation_mixproportion
 *
 * @author 张登齐
 * @date 2024-06-14
 */
@Data
@TableName("stirstation_mixproportion")
public class MixproportionBo {

    /**
     * 生产配合比表主键
     */
    private Long id;

    /**
     * 配合比名称
     */
    private String mixproportionName;

}
