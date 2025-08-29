package com.drake.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.drake.common.utils.PageUtils;
import com.drake.gulimall.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品庫存
 *
 * @author DrakeFan
 * @email andy81910@gmail.com
 * @date 2025-08-29 15:33:20
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

