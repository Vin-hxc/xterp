package com.xt.service.qxs.warehouse;

import com.xt.entity.qxs.warehouse.Depothead;
import java.util.List;

/**
 * 单据主表业务操作
 */
public interface DepotHeadServiceI {

    /**
     * 查询所有未删除的单据主表
     * @return
     */
    List<Depothead> queryNotDeleteDepotHead();

    /**
     * 查询所有数据,包括删除的数据
     * @return
     */
    List<Depothead> queryAllDepotHead();

    /**
     * 根据票据号查询当前记录
     * @param number
     * @return
     */
    Depothead getOneDepotHead(String number);

    /**
     * 查询被删除的数据
     * @return
     */
    List<Depothead> queryDelete();

    /**
     * 新增主表数据
     * @param depothead
     * @return
     */
    boolean addDepotHead(Depothead depothead);

    /**
     * 修改数据
     * @param depothead
     * @return
     */
    boolean updateDepotHead(Depothead depothead);

    /**
     * 审批
     * @param status 1:已审核 0:未审核 2：不通过 默认 0 其他数值为待审核
     * @return
     */
    int depotHeadExamin(Integer status, Integer id);

    /**
     * 标记删除
     * @param deleteFlag 1 删除 0 未删除 默认 0
     * @param id 条件
     * @return
     */
    boolean deleteDepotHead(String deleteFlag, Integer id);

}