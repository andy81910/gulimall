package com.drake.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.drake.common.utils.PageUtils;
import com.drake.gulimall.product.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分類關聯
 *
 * @author DrakeFan
 * @email andy81910@gmail.com
 * @date 2025-08-21 11:13:20
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

