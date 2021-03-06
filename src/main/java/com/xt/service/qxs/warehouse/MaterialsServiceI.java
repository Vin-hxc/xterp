package com.xt.service.qxs.warehouse;

import com.xt.entity.qxs.warehouse.Materials;

import java.util.List;

/**
 * @program: xterp
 * @description: 材料表业务操作
 * @author: snow
 * @create: 2019-12-17 14:29
 **/
public interface MaterialsServiceI {
    /**
     * 查询所有材料类型
     * @return
     */
    List<Materials> queryAllMaterials();

    /**
     * 根据id查询当前数据
     * @param id
     * @return
     */
    Materials queryOneMaterials(Integer id);

    /**
     *  新增材料类型
     * @param materials
     * @return
     */
    boolean addMaterials(Materials materials);

    /**
     * 根据类型查询
     * @param type
     * @return
     */
    List<Materials> queryType(String type);
}
