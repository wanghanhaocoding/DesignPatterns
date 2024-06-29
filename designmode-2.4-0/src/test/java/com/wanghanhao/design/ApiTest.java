package com.wanghanhao.design;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * @author wanghanhao
 * @version 1.0
 * @description: 测试
 * @date 2024/6/26 22:58
 */
public class ApiTest {

    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test_Principal(){
        Principal principal = new Principal();
        Map<String, Object> map = principal.queryClazzInfo("3年1班");
        logger.info("查询结果：{}", JSON.toJSONString(map));
    }
}
