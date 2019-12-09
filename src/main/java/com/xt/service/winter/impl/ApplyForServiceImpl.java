package com.xt.service.winter.impl;

import com.xt.entity.winter.ApplyFor;
import com.xt.mapper.winter.ApplyForMapper;
import com.xt.service.winter.ApplyForServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Winter
 * @Date 2019/12/6 15:07
 */
@Service
@SuppressWarnings("all")
public class ApplyForServiceImpl implements ApplyForServiceI {
    @Autowired
    private ApplyForMapper applyForMapper;
    /**
     * 查看所有申请数据
     * 倒序
     *
     * @return
     */
    @Override
    public List<ApplyFor> getAllApplyFor() {
        return applyForMapper.getAllApplyFor();
    }

    /**
     * 添加申请数据
     *
     * @param applyFor
     * @return
     */
    @Override
    public boolean saveApplyFor(ApplyFor applyFor) {
        return applyForMapper.saveApplyFor(applyFor);
    }

    /**
     * 修改申请数据
     *
     * @param applyFor
     * @return
     */
    @Override
    public boolean updateApplyFor(ApplyFor applyFor) {
        return applyForMapper.updateApplyFor(applyFor);
    }

    /**
     * 删除申请数据
     *
     * @param deleteFlag
     * @param id
     * @return
     */
    @Override
    public boolean deleteApplyFor(int deleteFlag, int id) {
        return applyForMapper.deleteApplyFor(deleteFlag,id);
    }
}
