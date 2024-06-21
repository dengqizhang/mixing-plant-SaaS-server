package org.dromara.productionTask.domain.vo;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.dromara.productionTask.domain.StirstationProductionTask;
import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;
import org.dromara.common.excel.annotation.ExcelDictFormat;
import org.dromara.common.excel.convert.ExcelDictConvert;
import io.github.linpeilie.annotations.AutoMapper;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;



/**
 * 生产任务视图对象 stirstation_production_task
 *
 * @author 张登齐
 * @date 2024-06-20
 */
@Data
@ExcelIgnoreUnannotated
@AutoMapper(target = StirstationProductionTask.class)
public class StirstationProductionTaskVo implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 生产任务表主键
     */
    @ExcelProperty(value = "生产任务表主键")
    private Long id;

    /**
     * 生产任务名称
     */
    @ExcelProperty(value = "生产任务名称")
    private String taskName;

    /**
     * 开始时间
     */
    @ExcelProperty(value = "开始时间")
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
    @ExcelProperty(value = "生产配合比")
    private String productionMixproportion;

    /**
     * 任务状态
     */
    @ExcelProperty(value = "任务状态")
    private Integer taskType;


}
