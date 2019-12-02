package com.xt.mapper.winter;

import com.xt.entity.winter.Recruit;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author Winter
 * @Date 2019/12/2 16:51
 * 招聘 持久操作实现接口
 */
@Repository
public interface RecruitMapper {
    /**
     * 添加招聘信息
     * @param recruit
     * @return
     */
    public boolean saveRecruit(Recruit recruit);

    /**
     * 修改招聘信息
     * @param recruit
     * @return
     */
    public boolean updateRecruit(Recruit recruit);

    /**
     * 根据编号删除招聘信息
     * @param id
     * @return
     */
    public boolean deleteRecruit(int id);
}
