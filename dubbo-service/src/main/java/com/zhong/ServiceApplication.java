package com.zhong;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@EnableDubboConfiguration
@MapperScan({"com.zhong.mapper"})
@SpringBootApplication
public class ServiceApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(ServiceApplication.class, args);
        System.in.read();
    }

}
