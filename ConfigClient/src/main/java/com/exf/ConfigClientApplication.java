package com.exf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@EnableDiscoveryClient
@RefreshScope
public class ConfigClientApplication {

	public static void main(String[] args) {

		/*
		 * 在项目启动目录中，生成一个 pid 文件用于优雅地停止服务:
		 * 停止文件使用命令：‘cat  ***App.pid | xargs kill’
		 */
		SpringApplication application = new SpringApplication(ConfigClientApplication.class);
		application.addListeners(new ApplicationPidFileWriter("ConfigClientApp.pid"));
		application.run();

	}

}
