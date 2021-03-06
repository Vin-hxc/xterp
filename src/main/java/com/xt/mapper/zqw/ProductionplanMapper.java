
package com.xt.mapper.zqw;
import com.xt.entity.vin.Product_model;
import com.xt.entity.zqw.Picking;
import com.xt.entity.zqw.Productionplan;
import com.xt.entity.zqw.SysUser;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.List;

/**
 * 生产计划持久层操作接口
 */
@Repository
public interface ProductionplanMapper {
    /**
     * 查询生产计划
     * @return
     */
    @Select(" SELECT productionPlan.*,product.product_name,sys_user.name FROM productionPlan,product,sys_user\n" +
            "where productionPlan.productId=product.id and productionPlan.personCharge=sys_user.id ")
    List<HashMap> seleProuct();
    /**
     * 添加一个生产计划
     * @param productionplan
     * @return
     */
    @Insert("insert into productionplan(id,productId,startTime,endTime,personCharge,productionAudit,deleteProd,pickingid,quantity) values " +
            "(null,#{productId},#{startTime},#{endTime},#{personCharge},#{productionAudit},#{deleteProd},#{pickingid},#{quantity})")
    boolean inserProuct(Productionplan productionplan);

    /**
     * 修改生产计划
     * @param productionplan
     * @return
     */
    boolean updatePeouct(Productionplan productionplan);

    /**
     * 根据id删除生产计划
     * @param id
     * @return
     */
    @Update("update productionplan set deleteProd=#{deleteProd} where id=#{id}")
    boolean deletePeouct(@Param("deleteProd") int deleteProd, @Param("id") int id);

    /**
     * 根据申请表查询产品名称
     * @return
     */
    @Select("select * from product")
    List<HashMap> dgselepro();

    /**
     * 查询产品信息
     * @return
     */
    @Select("select product_model.*,number.*,productionplan.id as prid from productionplan,number,product_model WHERE number.pickid=productionplan.id")
    List<HashMap> selepm();

    /**
     * 查询产品信息
     * @return
     */
    @Select("select * from product_model")
    List<Product_model> selepmll();

    /**
     * 添加领料信息
     * @param picking
     * @return
     */
    @Insert("insert into picking(id,pickingNo,startTime,productionAudit,deletePick) values " +
            "(null,#{pickingNo},#{startTime},#{productionAudit},#{deletePick})")
    boolean inserpick(Picking picking);

    /**
     * 查询用户姓名
     * @return
     */
    @Select("select * from sys_user")
    List<SysUser> seleuser();

    /**
     * 根据生产编号查询所需物料
     * @return
     */
    @Select("select productionplan.*,number.*,materials.* from productionplan,number,materials\n" +
            "where productionplan.pickingid=number.pickid and number.materialsId=materials.id")
    List<HashMap> selepropick(int pickingid);

    /**
     * 查询生产和领料数据
     * @return
     */
    @Select("select productionplan.pickingid,picking.*,number.*,product_model.* from productionplan,picking,number,product_model\n" +
            "where productionplan.pickingid=picking.id and Number.pickid=picking.id and picking.pickingNo=product_model.id")
    List<HashMap> seleProckll();

    /**
     * 修改审核状态
     * @param id
     * @param productionAudit
     * @return
     */
    @Update("update productionplan set productionAudit=#{productionAudit} where id=#{id}")
    boolean productSh(@Param("id") int id,@Param("productionAudit")int productionAudit);

}
