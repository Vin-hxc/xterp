package com.xt.entity.winter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author Winter
 * @Date 2019/12/2 15:43
 * 考勤实体类
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class WorkAttendance implements Serializable {
    private static final long serialVersionUID = 6041751401738508571L;
    private Integer id;//主键编号
    private Integer userId;//用户编号
    private Date attendanceDate;//考勤编号
    private String week;//星期几
    private Date startTime;//开始时间
    private Date endTime;//结束时间
    private Date allHour;//总时长
    private Integer state;//考勤状态 0早卡，1工时不足，2全勤，3缺勤,4未打晚卡，5未打早卡
}
