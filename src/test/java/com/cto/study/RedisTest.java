package com.cto.study;

import com.cto.study.service.redis.RedisCacheService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;


@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(RedisTest.class);

    @Autowired
    private RedisCacheService redisService;

    @Test
    public void money() throws ParseException {
        /*long now = System.currentTimeMillis();
        SimpleDateFormat sdfOne = new SimpleDateFormat("yyyy-MM-dd");
        long overTime = (now - (sdfOne.parse(sdfOne.format(now)).getTime()))/1000;
        long convert = TimeUnit.SECONDS.convert(1, TimeUnit.DAYS);
        long time = convert - overTime;
        LOGGER.info("time:{}",time);
        Map<String,Object> map = new HashMap<>(16);
        map.put("name","1");
        map.put("age","2");
        map.put("six","3");
        map.put("aa","4");
        redisService.setCacheMap("map",map);*/
        redisService.setCacheString("aaa","bbb");
    }
}
