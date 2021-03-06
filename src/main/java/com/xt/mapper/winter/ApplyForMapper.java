package com.xt.mapper.winter;

import com.xt.entity.winter.ApplyFor;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author Winter
 * @Date 2019/12/6 12:04
 * 申请数据处理接口
 */
public interface ApplyForMapper {
    /**
     * 查看所有未删除的申请数据
     * @return
     */
    List<ApplyFor> getAllNoDeleteApplyFor();

    /**
     * 查看所有已删除的申请数据
     * @return
     */
    List<ApplyFor> getAllDeleteApplyFor();
    /**
     * 查看所有申请数据
     * 倒序
     * @return
     */
    List<ApplyFor> getAllApplyFor();

    /**
     * 根据编号查询单条申请数据
     * @param id
     * @return
     */
    ApplyFor findApplyFoyOne(int id);

    /**
     * 添加申请数据
     * @param applyFor
     * @return
     */
    boolean saveApplyFor(ApplyFor applyFor);

    /**
     * 修改申请数据
     * @param applyFor
     * @return
     */
    boolean updateApplyFor(ApplyFor applyFor);

    /**
     * 删除申请数据
     * @param id
     * @return
     */
    boolean deleteApplyFor(@Param("deleteFlag") int deleteFlag,
                           @Param("id") int id);
}
