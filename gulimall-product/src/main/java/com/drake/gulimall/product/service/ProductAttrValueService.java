package com.drake.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.drake.common.utils.PageUtils;
import com.drake.gulimall.product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu屬性值
 *
 * @author DrakeFan
 * @email andy81910@gmail.com
 * @date 2025-08-21 11:13:20
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

