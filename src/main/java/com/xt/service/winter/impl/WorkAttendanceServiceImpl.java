package com.xt.service.winter.impl;

import com.xt.entity.winter.WorkAttendance;
import com.xt.mapper.winter.WorkAttendanceMapper;
import com.xt.service.winter.WorkAttendanceServiceI;
import com.xt.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @Author Winter
 * @Date 2019/12/9 9:08
 * 考勤实现类
 */
@SuppressWarnings("all")
@Service
public class WorkAttendanceServiceImpl implements WorkAttendanceServiceI {
    @Autowired
    private WorkAttendanceMapper workAttendanceMapper;
    /**
     * 添加考勤
     *
     * @param workAttendance
     * @return
     */
    @Override
    public boolean saveWorkAttendance(WorkAttendance workAttendance) {
        return workAttendanceMapper.saveWorkAttendance(workAttendance);
    }

    /**
     * 修改考勤数据
     *
     * @param workAttendance
     * @return
     */
    @Override
    public boolean updateWorkAttendance(WorkAttendance workAttendance) {
        return workAttendanceMapper.updateWorkAttendance(workAttendance);
    }

    /**
     * 修改上班时间
     *
     * @param startTime
     * @param id
     * @return
     */
    @Override
    public boolean updateWorkStartTime(Time startTime, int id) {
        return workAttendanceMapper.updateWorkStartTime(startTime,id);
    }


    /**
     * 修改考勤时间
     *
     * @param startTime 开始时间
     * @param endTime   结束时间
     * @param allHour   总时长
     * @param id        编号
     * @return
     */
    @Override
    public boolean updateWorkAttendanceDate(Time startTime, Time endTime, Time allHour, int id) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        //计算上下班时间时长
        String timeDifference = DateUtils.timeDifference(startTime, endTime);
        Date date = sdf.parse(timeDifference);
        allHour = new Time(date.getTime());
        return workAttendanceMapper.updateWorkAttendanceDate(startTime,endTime,allHour,id);
    }

    /**
     * 查看该员工的考勤信息
     *
     * @param userId
     * @return
     */
    @Override
    public List<HashMap> getEmployeeAttendance(int userId) {
        return workAttendanceMapper.getEmployeeAttendance(userId);
    }
}
