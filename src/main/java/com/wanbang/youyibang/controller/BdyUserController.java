package com.wanbang.youyibang.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wanbang.youyibang.mapper.BdyUserMapper;
import com.wanbang.youyibang.po.BdyUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: wcy
 * @Date: 2020/1/4 18:01
 * @Description:
 */
@RestController
public class BdyUserController {

    private static final Logger logger = LoggerFactory.getLogger(BdyUserController.class);

    @Autowired
    BdyUserMapper bdyUserMapper;

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @RequestMapping("get")
    public List<BdyUser> test01(){
        PageHelper.startPage(1,3);
        List<BdyUser> bdyUser = bdyUserMapper.selectAll();
        PageInfo<BdyUser> info = new PageInfo<>();
//        stringRedisTemplate.opsForValue().set("k111111test", JSON.toJSONString(bdyUser));
        return bdyUser;
    }
}
