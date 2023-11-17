Spring Cloud Config 演示项目

1、包含三个模块：
* EurekaServer：服务注册中心，用于登记 ConfigServer 和 ConfigClient 两个服务；
* ConfigServer：配置中心；
* ConfigClient：配置客户端（可以是连接配置中心的任意服务）

2、编译
* 带测试编译时，需在本地启动 EurekaServer，编译 ConfigServer 时才会不报错；
* 带测试编译时，需在本地启动 ConfigServer，编译 ConfigClient 时才会不报错；

3、项目工程使用：
* Java17
* Spring Boot 3.1.5
* Spring Cloud： 2022.0.3
* Spring Boot Admin ：3.1.7

4、EurekaServer


