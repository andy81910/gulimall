package com.drake.gulimall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 會員等級
 * 
 * @author DrakeFan
 * @email andy81910@gmail.com
 * @date 2025-08-29 13:38:54
 */
@Data
@TableName("ums_member_level")
public class MemberLevelEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 等級名稱
	 */
	private String name;
	/**
	 * 等級需要的成長值
	 */
	private Integer growthPoint;
	/**
	 * 是否為默認等級[0->不是；1->是]
	 */
	private Integer defaultStatus;
	/**
	 * 免運費標准
	 */
	private BigDecimal freeFreightPoint;
	/**
	 * 每次評價獲取的成長值
	 */
	private Integer commentGrowthPoint;
	/**
	 * 是否有免郵特權
	 */
	private Integer priviledgeFreeFreight;
	/**
	 * 是否有會員價格特權
	 */
	private Integer priviledgeMemberPrice;
	/**
	 * 是否有生日特權
	 */
	private Integer priviledgeBirthday;
	/**
	 * 備注
	 */
	private String note;

}
