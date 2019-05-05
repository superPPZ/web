package com.communication;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * spring boot启动类.
 * @author ppz
 * @version v.0.1
 * @date 2019.5.5
 */
@SpringBootApplication
@MapperScan("com.communication.*.mapper") //需要指定包名。
//@MapperScan({"com.communication.*.mapper","org.communication.*.mapper"})
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
