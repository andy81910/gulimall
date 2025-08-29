package com.drake.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 秒殺活動
 * 
 * @author DrakeFan
 * @email andy81910@gmail.com
 * @date 2025-08-29 11:37:46
 */
@Data
@TableName("sms_seckill_promotion")
public class SeckillPromotionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 活動標題
	 */
	private String title;
	/**
	 * 開始日期
	 */
	private Date startTime;
	/**
	 * 結束日期
	 */
	private Date endTime;
	/**
	 * 上下線狀態
	 */
	private Integer status;
	/**
	 * 創建時間
	 */
	private Date createTime;
	/**
	 * 創建人
	 */
	private Long userId;

}
