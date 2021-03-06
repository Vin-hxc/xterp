package com.xt.service.zqw;

import com.xt.entity.qxs.warehouse.Depothead;
import com.xt.entity.zqw.Assemble;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.HashMap;
import java.util.List;

public interface AssembleServiceI {
    /**
     * 添加组装信息
     * @param assemble
     * @return
     */
    boolean inserAssemble(Assemble assemble);

    /**
     * 查询组装信息
     * @return
     */
    List<HashMap> seleAssem();

    /**
     * 根据id查询单据编号
     * @param id
     * @return
     */
    List<HashMap> seledepothead(int id);

    /**
     * 根据id查询生产名称
     * @param id
     * @return
     */
    List<HashMap> seleProi(int id);
    /**
     * 根据派工的票据号查询单据状态
     * @param id
     * @return
     */
    List<HashMap> seleDep(int id);
    boolean AssemSh(@Param("id") int id, @Param("qualityTesting") int qualityTesting);
    /**
     * 添加入库单据
     * @param depothead
     * @return
     */
    boolean inserDepths(Depothead depothead);
}
