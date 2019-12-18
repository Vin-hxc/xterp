package com.xt.service.zqw;

import com.xt.entity.zqw.Number;
import com.xt.entity.zqw.Picking;

/**
 * 物料数量的业务层操作接口
 */
public interface NumberServiceI {
    /**
     * 添加物料数量
     * @param number
     * @return
     */
    Boolean inserNum(Number number, Picking picking);
}