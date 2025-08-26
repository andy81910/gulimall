package com.drake.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.drake.common.utils.PageUtils;
import com.drake.gulimall.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author DrakeFan
 * @email andy81910@gmail.com
 * @date 2025-08-21 11:13:20
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

