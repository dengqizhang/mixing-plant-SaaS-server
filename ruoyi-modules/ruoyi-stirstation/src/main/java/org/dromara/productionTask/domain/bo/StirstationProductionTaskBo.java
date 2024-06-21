package org.dromara.productionTask.domain.bo;

import com.baomidou.mybatisplus.annotation.TableField;
import org.dromara.productionTask.domain.StirstationProductionTask;
import org.dromara.common.mybatis.core.domain.BaseEntity;
import org.dromara.common.core.validate.AddGroup;
import org.dromara.common.core.validate.EditGroup;
import io.github.linpeilie.annotations.AutoMapper;
import lombok.Data;
import lombok.EqualsAndHashCode;
import jakarta.validation.constraints.*;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * 生产任务业务对象 stirstation_production_task
 *
 * @author 张登齐
 * @date 2024-06-20
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AutoMapper(target = StirstationProductionTask.class, reverseConvertGenerate = false)
public class StirstationProductionTaskBo extends BaseEntity {

    /**
     * 生产任务表主键
     */
    @NotNull(message = "生产任务表主键不能为空", groups = { EditGroup.class })
    private Long id;

    /**
     * 生产任务名称
     */
    @NotBlank(message = "生产任务名称不能为空", groups = { AddGroup.class, EditGroup.class })
    private String taskName;

    /**
     * 开始时间
     */
    @NotNull(message = "开始时间不能为空", groups = { AddGroup.class, EditGroup.class })
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date startTime;
    /**
     * 结束时间
     */
    @TableField(exist = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endTime;

    /**
     * 生产配合比
     */
    @NotBlank(message = "生产配合比不能为空", groups = { AddGroup.class, EditGroup.class })
    private String productionMixproportion;

    /**
     * 任务状态
     */
    private Integer taskType;


}
