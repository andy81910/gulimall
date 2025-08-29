package com.drake.gulimall.coupon.dao;

import com.drake.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 優惠券信息
 * 
 * @author DrakeFan
 * @email andy81910@gmail.com
 * @date 2025-08-29 11:37:45
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
