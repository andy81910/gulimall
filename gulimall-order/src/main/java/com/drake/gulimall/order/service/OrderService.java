package com.drake.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.drake.common.utils.PageUtils;
import com.drake.gulimall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 訂單
 *
 * @author DrakeFan
 * @email andy81910@gmail.com
 * @date 2025-08-29 14:34:46
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

