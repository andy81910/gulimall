package com.drake.gulimall.order.dao;

import com.drake.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 訂單
 * 
 * @author DrakeFan
 * @email andy81910@gmail.com
 * @date 2025-08-29 14:34:46
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
