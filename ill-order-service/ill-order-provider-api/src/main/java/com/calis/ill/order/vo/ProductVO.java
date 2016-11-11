package com.calis.ill.order.vo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class ProductVO{

	private String id;
	private String title;//名称
    private Integer price;//价格
    private String note;//描述
    private String code;//商品编码
    private String model;//型号
    private Long stock;//库存
    
    
}
