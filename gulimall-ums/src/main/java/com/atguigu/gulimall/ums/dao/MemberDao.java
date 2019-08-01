package com.atguigu.gulimall.ums.dao;

import com.atguigu.gulimall.ums.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author Jklive
 * @email Jklive@atguigu.com
 * @date 2019-08-02 01:12:49
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
