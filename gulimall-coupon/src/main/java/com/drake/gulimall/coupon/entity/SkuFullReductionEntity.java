package com.drake.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 商品滿減信息
 * 
 * @author DrakeFan
 * @email andy81910@gmail.com
 * @date 2025-08-29 11:37:46
 */
@Data
@TableName("sms_sku_full_reduction")
public class SkuFullReductionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * spu_id
	 */
	private Long skuId;
	/**
	 * 滿多少
	 */
	private BigDecimal fullPrice;
	/**
	 * 減多少
	 */
	private BigDecimal reducePrice;
	/**
	 * 是否參與其他優惠
	 */
	private Integer addOther;

}
