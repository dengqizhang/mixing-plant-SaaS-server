package org.dromara.warninglevel.domin;

import org.dromara.common.tenant.core.TenantEntity;
import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;

/**
 * 设备管理对象 sj_system_user_permission
 *
 * @author 张登齐
 * @date 2024-06-05
 */
@Data
@TableName("sj_system_user_permission")
public class WarningLevel{
    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 设备表主键
     */
    @TableId(value = "id",type=IdType.AUTO)
    private Long id;

    //用户主键
    private Long userId;


    //预警级别主键
    private Long warninglevelId;


}
