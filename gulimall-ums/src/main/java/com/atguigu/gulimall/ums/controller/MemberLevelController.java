package com.atguigu.gulimall.ums.controller;

import java.util.Arrays;
import java.util.Map;


import com.atguigu.gulimall.commons.bean.PageVo;
import com.atguigu.gulimall.commons.bean.QueryCondition;
import com.atguigu.gulimall.commons.bean.Resp;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.atguigu.gulimall.ums.entity.MemberLevelEntity;
import com.atguigu.gulimall.ums.service.MemberLevelService;




/**
 * 会员等级
 *
 * @author Jklive
 * @email Jklive@atguigu.com
 * @date 2019-08-02 01:12:49
 */
@Api(tags = "会员等级 管理")
@RestController
@RequestMapping("ums/memberlevel")
public class MemberLevelController {
    @Autowired
    private MemberLevelService memberLevelService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('ums:memberlevel:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = memberLevelService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('ums:memberlevel:info')")
    public Resp<MemberLevelEntity> info(@PathVariable("id") Long id){
		MemberLevelEntity memberLevel = memberLevelService.getById(id);

        return Resp.ok(memberLevel);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('ums:memberlevel:save')")
    public Resp<Object> save(@RequestBody MemberLevelEntity memberLevel){
		memberLevelService.save(memberLevel);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('ums:memberlevel:update')")
    public Resp<Object> update(@RequestBody MemberLevelEntity memberLevel){
		memberLevelService.updateById(memberLevel);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('ums:memberlevel:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		memberLevelService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
