package com.xt.service.winter;

import com.xt.entity.qxs.warehouse.DepotItem;
import com.xt.entity.qxs.warehouse.Depothead;
import com.xt.entity.winter.Sale;

import java.text.ParseException;
import java.util.HashMap;
import java.util.List;

/**
 * @Author Winter
 * @Date 2019/12/16 16:01
 * 销售业务处理接口
 */
public interface SaleServiceI {
    //通过财务审核修改状态
    /**
     * 未删除的销售数据
     * @return
     */
    List<HashMap> getAllNoDeleteSale();

    /**
     * 已删除的销售数据
     * @return
     */
    List<HashMap> getAllDeleteSale();

    /**
     * 修改销售删除标记
     * @param deleteFlag
     * @param id
     * @return
     */
    boolean deleteSale(int deleteFlag,int id);

    /**
     * 添加销售信息
     * 生成单据主表
     * @param sale
     * @param depothead
     * @return
     */
    boolean saveSaleAndDepotHead(Sale sale, Depothead depothead, DepotItem depotItem) throws ParseException;
}
