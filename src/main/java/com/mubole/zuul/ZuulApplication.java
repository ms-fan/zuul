package com.mubole.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Description: Zuul启动类
 * @Author: fanmanfu
 * @CreateDate: 2019/6/24 0024 10:35
 * @UpdateUser: fanmanfu
 * @UpdateDate: 2019/6/24 0024 10:35
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */

@EnableZuulProxy    //开启zuul的功能
@SpringBootApplication
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);
    }
}
