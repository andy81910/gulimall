package com.drake.gulimall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 庫存工作單
 * 
 * @author DrakeFan
 * @email andy81910@gmail.com
 * @date 2025-08-29 15:33:20
 */
@Data
@TableName("wms_ware_order_task_detail")
public class WareOrderTaskDetailEntity implements Serializable {
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
	 * sku_name
	 */
	private String skuName;
	/**
	 * 購買個數
	 */
	private Integer skuNum;
	/**
	 * 工作單id
	 */
	private Long taskId;
	/**
	 * 倉庫id
	 */
	private Long wareId;
	/**
	 * 1-已鎖定  2-已解鎖  3-扣減
	 */
	private Integer lockStatus;

}
