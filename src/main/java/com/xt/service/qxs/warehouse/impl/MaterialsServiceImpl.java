package com.xt.service.qxs.warehouse.impl;

import com.xt.entity.qxs.warehouse.Materials;
import com.xt.mapper.qxs.warehouse.MaterialsMapper;
import com.xt.service.qxs.warehouse.MaterialsServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: xterp
 * @description: 业务实现
 * @author: snow
 * @create: 2019-12-17 14:30
 **/
@Service
public class MaterialsServiceImpl implements MaterialsServiceI {

    @Autowired
    private MaterialsMapper materialsMapper;

    @Override
    public List<Materials> queryAllMaterials() {
        return materialsMapper.queryAllMaterials();
    }

    @Override
    public Materials queryOneMaterials(Integer id) {
        return materialsMapper.queryOneMaterials(id);
    }

    @Override
    public boolean addMaterials(Materials materials) {
        return materialsMapper.addMaterials(materials);
    }

    @Override
    public List<Materials> queryType(String type) {
        return materialsMapper.queryType(type);
    }
}
