package com.atguigu.gulimall.sms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.gulimall.commons.bean.PageVo;
import com.atguigu.gulimall.commons.bean.Query;
import com.atguigu.gulimall.commons.bean.QueryCondition;

import com.atguigu.gulimall.sms.dao.SpuFullReductionDao;
import com.atguigu.gulimall.sms.entity.SpuFullReductionEntity;
import com.atguigu.gulimall.sms.service.SpuFullReductionService;


@Service("spuFullReductionService")
public class SpuFullReductionServiceImpl extends ServiceImpl<SpuFullReductionDao, SpuFullReductionEntity> implements SpuFullReductionService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<SpuFullReductionEntity> page = this.page(
                new Query<SpuFullReductionEntity>().getPage(params),
                new QueryWrapper<SpuFullReductionEntity>()
        );

        return new PageVo(page);
    }

}