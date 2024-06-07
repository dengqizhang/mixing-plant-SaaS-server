package org.dromara.warninglevel.domin;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.dromara.common.tenant.core.TenantEntity;

/**
 * 用户对象 sys_user
 *
 * @author 张登齐
 */

@Data
@NoArgsConstructor
@TableName("sys_user")
public class SysUser {

    /**
     * 用户ID
     */
    @TableId(value = "user_id")
    private Long userId;
    /**
     * 用户账号
     */
    private String userName;

    /**
     * 预警id
     */
    private Long warninglevelId;



}
