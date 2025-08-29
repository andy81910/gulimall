package com.drake.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.drake.common.utils.PageUtils;
import com.drake.gulimall.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 積分變化歷史記錄
 *
 * @author DrakeFan
 * @email andy81910@gmail.com
 * @date 2025-08-29 13:38:54
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

