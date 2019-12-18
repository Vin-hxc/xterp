package com.xt.service.zqw;

import com.xt.entity.vin.Product_model;

import com.xt.entity.zqw.Picking;
import com.xt.entity.zqw.Productionplan;
import com.xt.entity.zqw.Userinfo;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

/**
 * 生产计划业务操作接口
 */
public interface ProductionplanServiceI {
    /**
     * 查询生产计划
     * @return
     */
    List<HashMap> seleProuct();
    /**
     * 添加一个生产计划
     * @param productionplan
     * @return
     */
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
    boolean deletePeouct(@Param("deleteProd")int deleteProd, @Param("id")int id);
    /**
     * 根据申请表查询产品名称
     * @return
     */
    List<HashMap> dgselepro();

    /**
     * 查询产品信息
     * @return
     */
    List<HashMap> selepm();

    /**
     * 添加领料信息
     * @param picking
     * @return
     */
    boolean inserpick(Picking picking);

    /**
     * 查询产品信息
     * @return
     */
    List<Product_model> selepmll();

    /**
     * 查询用户姓名
     * @return
     */
    List<Userinfo> seleuser();

    /**
     * 根据id查询所需物料
     * @param pickingid
     * @return
     */
    List<HashMap> selepropick(int pickingid);
}
