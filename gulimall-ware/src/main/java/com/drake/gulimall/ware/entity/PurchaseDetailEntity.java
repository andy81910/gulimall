package com.drake.gulimall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author DrakeFan
 * @email andy81910@gmail.com
 * @date 2025-08-29 15:33:20
 */
@Data
@TableName("wms_purchase_detail")
public class PurchaseDetailEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 采購單id
	 */
	private Long purchaseId;
	/**
	 * 采購商品id
	 */
	private Long skuId;
	/**
	 * 采購數量
	 */
	private Integer skuNum;
	/**
	 * 采購金額
	 */
	private BigDecimal skuPrice;
	/**
	 * 倉庫id
	 */
	private Long wareId;
	/**
	 * 狀態[0新建，1已分配，2正在采購，3已完成，4采購失敗]
	 */
	private Integer status;

}
