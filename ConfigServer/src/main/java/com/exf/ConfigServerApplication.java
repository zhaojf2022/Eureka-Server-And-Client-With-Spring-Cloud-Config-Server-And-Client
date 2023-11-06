package com.exf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigServer
public class ConfigServerApplication {

	public static void main(String[] args) {

		/*
		 * 在项目启动目录中，生成一个 pid 文件用于优雅地停止服务:
		 * 停止文件使用命令：‘cat  ***App.pid | xargs kill’
		 */
		SpringApplication application = new SpringApplication(ConfigServerApplication.class);
		application.addListeners(new ApplicationPidFileWriter("ConfigServerApp.pid"));
		application.run();
	}

}
