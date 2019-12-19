package com.xt.mapper.zqw;

import com.xt.entity.qxs.warehouse.Materials;
import com.xt.entity.zqw.Number;
import com.xt.entity.zqw.Picking;
import com.xt.entity.zqw.Productionplan;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 所需物料数量持久层操作接口
 */
public interface NumberMapper {
    /**
     * 添加所需物料数量
     * @param number
     * @return
     */
    @Insert("insert into number(id,materialsId,numbersl,pickid) values (null,#{materialsId},#{numbersl},#{pickid})")
    Boolean inserNum(Number number);

    /**
     * 查询材料编号信息
     * @return
     */
    @Select("select * from materials where mtype='零件'")
    List<Materials> seleMat();

    /**
     * 查询领料信息
     * @return
     */
    @Select("select * from Picking")
    List<Picking> selepicking();

    /**
     * 查询生产计划
     * @return
     */
    @Select("select * from productionplan")
    List<Productionplan> seleProduct();
}
