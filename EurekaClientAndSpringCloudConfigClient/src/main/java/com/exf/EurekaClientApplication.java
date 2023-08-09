package com.exf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@EnableDiscoveryClient
@RefreshScope
public class EurekaClientApplication {

	@Value("${name}")
	private static  String name;
	public static void main(String[] args) {
		SpringApplication.run(EurekaClientApplication.class, args);
		System.out.println(name);
	}

}
