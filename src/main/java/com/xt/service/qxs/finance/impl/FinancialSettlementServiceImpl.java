package com.xt.service.qxs.finance.impl;

import com.xt.entity.qxs.finance.FinancialSettlement;
import com.xt.mapper.qxs.finance.ExpenditureMapper;
import com.xt.mapper.qxs.finance.FinancialSettlementMapper;
import com.xt.mapper.qxs.finance.IncomeMapper;
import com.xt.service.qxs.finance.FinancialSettlementServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FinancialSettlementServiceImpl implements FinancialSettlementServiceI {

    @Autowired
    private FinancialSettlementMapper financialSettlementMapper;

    /**
     * 查询所有未删除的记录
     * @return
     */
    @Override
    public List<FinancialSettlement> queryNotDeleteFs() {
        return financialSettlementMapper.queryNotDeleteFs();
    }

    /**
     * 查询所有已删除的数据
     * @return
     */
    @Override
    public List<FinancialSettlement> queryDeleteFs() {
        return financialSettlementMapper.queryDeleteFs();
    }

    /**
     * 查询所有数据
     * @return
     */
    @Override
    public List<FinancialSettlement> queryAllFinancialSettlement() {
        return financialSettlementMapper.queryAllFinancialSettlement();
    }

    /**
     * 根据id获取记录
     * @param id
     * @return
     */
    @Override
    public FinancialSettlement getOneFs(FinancialSettlement id) {
        return financialSettlementMapper.getOneFs(id);
    }

    /**
     * 修改记录数据 描述
     * @param financialSettlement
     * @return
     */
    @Override
    public boolean updateRemark(FinancialSettlement financialSettlement) {
        return financialSettlementMapper.updateRemark(financialSettlement);
    }

    /**
     * 标记删除
     * @param deleteFlag 0 不删除; 1：删除
     * @param id
     * @return
     */
    @Override
    public boolean deleteFinancialSettlement(Integer deleteFlag, Integer id) {
        return financialSettlementMapper.deleteFinancialSettlement(deleteFlag,id);
    }

    /**
     * 新增 结算记录
     * @param financialSettlement
     * @return
     */
    @Override
    public boolean addFinancialSettlement(FinancialSettlement financialSettlement) {
        return financialSettlementMapper.addFinancialSettlement(financialSettlement);
    }
}
