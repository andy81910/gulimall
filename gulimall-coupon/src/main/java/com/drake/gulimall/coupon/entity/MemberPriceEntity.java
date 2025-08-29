package com.drake.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 商品會員價格
 * 
 * @author DrakeFan
 * @email andy81910@gmail.com
 * @date 2025-08-29 11:37:46
 */
@Data
@TableName("sms_member_price")
public class MemberPriceEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * sku_id
	 */
	private Long skuId;
	/**
	 * 會員等級id
	 */
	private Long memberLevelId;
	/**
	 * 會員等級名
	 */
	private String memberLevelName;
	/**
	 * 會員對應價格
	 */
	private BigDecimal memberPrice;
	/**
	 * 可否疊加其他優惠[0-不可疊加優惠，1-可疊加]
	 */
	private Integer addOther;

}
