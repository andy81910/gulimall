package com.drake.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.drake.common.utils.PageUtils;
import com.drake.gulimall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品屬性
 *
 * @author DrakeFan
 * @email andy81910@gmail.com
 * @date 2025-08-21 11:13:19
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

