package com.xt.entity.vin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 产品型号类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product_model {
    private long id;//主键
    private String brand;//品牌
    private String model_name;//类型名
    private String motherboard;//主板
    private String cpu;//cpu
    private String memories;//内存条
    private String video_card;//显卡
    private String disks;//硬盘
    private String ssd;//固态硬盘
    private String size;//尺寸
    private String color;//颜色
    private Double weight;//裸机重量
    private String model_type;//型号类别
    private String delete_Flag;//删除标记（0==未删除,1==删除)
    private Date createtime;//产品型号创建时间
    private String status;//审核状态
}
