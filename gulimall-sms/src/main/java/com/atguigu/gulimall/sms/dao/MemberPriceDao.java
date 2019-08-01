package com.atguigu.gulimall.sms.dao;

import com.atguigu.gulimall.sms.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author Jklive
 * @email Jklive@atguigu.com
 * @date 2019-08-02 00:16:44
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
