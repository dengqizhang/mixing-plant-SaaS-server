package org.dromara.warninglevel.domin.bo;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 预警级别用户信息对象
 *
 * @author 张登齐
 */

@Data
@NoArgsConstructor
public class WarningLevelBo {
    //用户数组
    private String warninglevelList;
    //预警级别id
    private Long warninglevelId;
}
