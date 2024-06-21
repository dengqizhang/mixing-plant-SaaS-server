package org.dromara.productionTask.domain;

import org.dromara.common.tenant.core.TenantEntity;
import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serial;

/**
 * 生产任务对象 stirstation_production_task
 *
 * @author 张登齐
 * @date 2024-06-20
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("stirstation_production_task")
public class StirstationProductionTask extends TenantEntity {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 生产任务表主键
     */
    @TableId(value = "id",type = IdType.AUTO)
    private Long id;

    /**
     * 生产任务名称
     */
    private String taskName;

    /**
     * 开始时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date startTime;

    /**
     * 生产配合比
     */
    private String productionMixproportion;

    /**
     * 任务状态
     */
    private Integer taskType;
    /**
     * 结束时间
     */
    @TableField(exist = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endTime;


}
