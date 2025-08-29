package com.drake.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.drake.common.utils.PageUtils;
import com.drake.gulimall.order.entity.OrderItemEntity;

import java.util.Map;

/**
 * 訂單項信息
 *
 * @author DrakeFan
 * @email andy81910@gmail.com
 * @date 2025-08-29 14:34:46
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

