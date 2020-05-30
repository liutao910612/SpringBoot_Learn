package com.liutao.es.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 程序启动主类
 *
 * @author LIUTAO
 * @version 2017/3/29
 * @see
 * @since
 */
@SpringBootApplication
@ComponentScan(basePackages={"com.liutao.es"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
