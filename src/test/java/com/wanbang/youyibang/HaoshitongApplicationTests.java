package com.wanbang.youyibang;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;

import javax.sql.DataSource;
import java.sql.Connection;

@SpringBootTest
class HaoshitongApplicationTests {

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Autowired
    DataSource dataSource;

    @Test
    void contextLoads() throws Exception{
        Class<? extends DataSource> aClass = dataSource.getClass();
        System.out.println("aClass = " + aClass);
        Connection connection = dataSource.getConnection();
        System.out.println("connection = " + connection);
    }

}
