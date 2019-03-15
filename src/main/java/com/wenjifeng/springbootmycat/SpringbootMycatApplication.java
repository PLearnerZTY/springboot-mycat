package com.wenjifeng.springbootmycat;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
@MapperScan("com.wenjifeng.springbootmycat.mapper")
public class SpringbootMycatApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMycatApplication.class, args);
		log.info("启动完成");
	}

}
