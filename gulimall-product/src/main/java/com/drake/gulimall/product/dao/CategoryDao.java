package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三級分類
 * 
 * @author DrakeFan
 * @email andy81910@gmail.com
 * @date 2025-08-21 11:13:20
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
