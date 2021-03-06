package com.xt.service.vin;

import com.xt.entity.vin.Supplier;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface SupplierServiceI {
    /**
     * 查询所有供应商
     * @return
     */
    public List<Supplier> getAllSupplierG();

    /**
     * 查询所有客户
     * @return
     */
    public List<Supplier> getAllSupplierK();

    /**
     * 修改供应商删除标记（删除）
     * @param id
     * @return
     */
    public boolean deleteSupplier(long id);

    /**
     * 添加供应商信息
     * @param supplier
     * @return
     */
    public boolean insertSupplierG(Supplier supplier);

    /**
     * 添加客户信息
     * @param supplier
     * @return
     */
    public boolean insertSupplierK(Supplier supplier);

    /**
     * 修改供应商信息
     * @param supplier
     * @return
     */
    public boolean updateSupplier(Supplier supplier);

    /**
     * 修改审核状态
     * @param id
     * @return
     */
    public boolean updateSupplierStatus(long id);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    public Supplier queryBySupplierId(long id);

    /**
     * 修改供应商状态为启用
     * @param id
     * @return
     */
    public boolean updateSupplierEnabledT(long id);

    /**
     * 修改供应商状态为禁用
     * @param id
     * @return
     */
    public boolean updateSupplierEnabledF(long id);
}
