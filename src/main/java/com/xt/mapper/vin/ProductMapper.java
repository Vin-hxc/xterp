package com.xt.mapper.vin;

import com.xt.entity.qxs.warehouse.Depothead;
import com.xt.entity.vin.Product;
import com.xt.entity.vin.Product_model;
import com.xt.entity.vin.Product_type;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

import java.util.HashMap;
import java.util.List;

//@Repository
public interface ProductMapper {

    /**
     * 查询所有产品
     * @return List<Product>
     */
    @Select("select p.id,p.product_name,pm.model_name,p.product_model,pt.type_name,p.product_unit,p.product_stock,p.retail_price,p.min_price,p.cost_price,p.trade_price,p.product_state,p.serial_number,p.createtime,p.status from product as p" +
            " INNER JOIN product_model AS pm ON p.product_model = pm.id" +
            " INNER JOIN product_type as pt ON p.product_type = pt.id" +
            " where p.delete_Flag = '0'")
    public List<HashMap> getAllProduct();

    /**
     * 查询所有的产品类别
     * @return List<Product_type>
     */
    @Select("SELECT * FROM product_type where delete_Flag = '0'")
    public List<Product_type> getProductType();

    /**
     * 查询所有产品型号
     * @return List<Product_model>
     */
    @Select("SELECT * FROM product_model where delete_Flag = '0'")
    public List<Product_model> getProductModel();

    /**
     * 根据产品id查询
     * @return Product
     */
    @Select("select * from product where delete_Flag = '0' AND id = #{id}")
    public Product getProductById(long id);

    /**
     * 添加新的产品信息
     * @param product
     * @return boolean
     */
    @Insert("INSERT INTO product (product_name,product_model,product_type,product_unit,product_stock,retail_price,min_price,cost_price,trade_price,product_state,serial_number,delete_Flag,createtime,`status`) " +
            " VALUES(#{product_name},#{product_model},#{product_type},#{product_unit},#{product_stock},#{retail_price},#{min_price},#{cost_price},#{trade_price},0,#{serial_number},'0',now(),DEFAULT);")
    public boolean insertProduct(Product product);

    /**
     * 修改产品信息
     * @param product
     * @return boolean
     */
    @Update("UPDATE product SET product_name=#{product_name},product_model=#{product_model},product_type=#{product_type},product_unit=#{product_unit},retail_price=#{retail_price},min_price=#{min_price},cost_price=#{cost_price},trade_price=#{trade_price},serial_number=#{serial_number} WHERE id=#{id} and delete_Flag='0'")
    public boolean updateProduct(Product product);

    /**
     * 删除产品信息（删除标记）
     * @param id
     * @return boolean
     */
    @Update("UPDATE product SET delete_Flag='1' where id = #{id} and delete_Flag='0'")
    public boolean deleteProduct(long id);

    /**
     * 查询产品型号
     * @param id
     * @return Product_model
     */
    @Select("SELECT * from product_model WHERE id=#{id} and delete_Flag='0'")
    public Product_model getProductModelById(long id);

    /**
     * 查询产品库存信息
     * @return List<Depothead>
     */
    @Select("SELECT dh.Id,dh.Type,dt.BasicNumber,dh.OperTime from `depothead` AS dh " +
            " INNER JOIN `depotitem` AS dt ON dh.Id = dt.HeaderId" +
            " INNER JOIN `depot` AS d ON dt.DepotId = d.id" +
            " WHERE dt.MaterialId = #{id} AND dh.delete_Flag = 0")
    public List<Depothead> getProductStock();

    /**
     * 根据产品型号获取产品类型
     * @return Product_type
     */
    @Select("SELECT * from product_type where id =#{id} and delete_Flag = 0")
    public Product_type queryByModelName(long id);

    /**
     * 根据产品类型获取类型名称
     * @param product_type
     * @return
     */
    @Select("SELECT pt.type_name,pt.id from product as p" +
            " INNER JOIN product_type as pt ON p.product_type = pt.id" +
            " where p.id = 25 and p.delete_Flag ='0'")
    public Product queryByProductType(long product_type);

    /**
     * 修改产品状态为禁用
     * @param id
     * @return
     */
    @Update("UPDATE product set `product_state` = 0 where id = #{id}")
    public boolean updateProductStateF(long id);

    /**
     * 修改产品状态为启用
     * @param id
     * @return
     */
    @Update("UPDATE product set `product_state` = 1 where id = #{id}")
    public boolean updateProductStateT(long id);

    /**
     * 修改产品审核状态
     * @param id
     * @return
     */
    @Update("update product set status = '1' where id = #{id}")
    public boolean updateProductStatus(long id);
}
