package com.xt.service.hjn.impl;

import com.xt.entity.hjn.Orders;
import com.xt.mapper.hjn.OrderMapper;
import com.xt.mapper.qxs.finance.FinancialSettlementMapper;
import com.xt.service.hjn.OrderServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @program: xterp
 * @description: OrderServiceImpl
 * @author: hjn
 * @create: 2019-12-16 10:00
 **/
@Service
public class OrderServiceImpl implements OrderServiceI {
    @Autowired
    private OrderMapper orderMapper;

    public OrderMapper getOrderMapper() {
        return orderMapper;
    }

    /**
     * 查询所有采购订单
     * @return
     */
    @Override
    public List<HashMap<String, Object>>  findOrders(String orderid, Date createtime) {
        List<HashMap<String, Object>>  list=orderMapper.findOrders(orderid,createtime);
        return list;
    }

    /**
     * 添加采购订单
     * @return
     */
    @Override
    public int addOrders(Orders order) {
        return orderMapper.addOrders(order);
    }

    /**
     * 审核采购
     * @return
     */
    @Override
    public int updateState(int orderstate, int id) {
        return orderMapper.updateState(orderstate,id);
    }

    /**
     * 修改采购订单
     * @param id
     * @param supplierid
     * @param purchaserid
     * @param rebate
     * @param amount_paid
     * @return
     */
    @Override
    public int updateOrders(int id, int supplierid, int purchaserid, int rebate, int amount_paid) {
        return orderMapper.updateOrders(id,supplierid,purchaserid,rebate,amount_paid);
    }
}
