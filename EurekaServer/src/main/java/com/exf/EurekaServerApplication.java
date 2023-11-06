package com.exf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

	public static void main(String[] args) {

		/*
		 * 在项目启动目录中，生成一个 pid 文件用于优雅地停止服务:
		 * 停止文件使用命令：‘cat  ***App.pid | xargs kill’
		 */
		SpringApplication application = new SpringApplication(EurekaServerApplication.class);
		application.addListeners(new ApplicationPidFileWriter("EurekaServerApp.pid"));
		application.run();

	}

}
