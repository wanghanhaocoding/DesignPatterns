package com.wanghanhao.design;

import org.junit.Test;

/**
 * @author wanghanhao
 * @version 1.0
 * @description: 测试验证
 * @date 2024/6/19 23:27
 */
public class ApiTest {
    @Test
    public static void main(String[] args) {
        VideoUserService service = new VideoUserService();
        service.serveGrade("VIP用户");
        service.serveGrade("普通用户");
        service.serveGrade("访客用户");
    }
}
