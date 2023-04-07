//在原项目中作了如下修改
=======================================================================================
<!-- Spring Boot 启动父依赖 -->
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>2.1.3.RELEASE</version>
        <relativePath/>
    </parent>

//这里添加了<relativePath/>
=======================================================================================
    <!-- MySQL 连接驱动依赖 -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.27</version>
        </dependency>
//由于我本机的mysql版本的原因，这里修改了MySQL连接驱动依赖的版本号
//同时数据源配置也做了修改，添加了&useSSL=false，spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
## 数据源配置
spring.datasource.url=jdbc:mysql://localhost:3306/springbootdb?useUnicode=true&characterEncoding=utf8&useSSL=false
spring.datasource.username=root
spring.datasource.password=admin
#spring.datasource.driver-class-name=com.mysql.jdbc.Driver
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
=======================================================================================
其中redis相关的配置使用了默认的配置，本机已经安装了redis，安装目录D:\Redis-x64-3.2.100，redis服务安装参考了SPTools-master项目
开发环境 win 配置：

1.redis 启动

打开一个命令窗口，进入到你解压的目录，输入命令：redis-server redis.windows.conf

2.部署redis为windows下的服务 命令如下：

再打开一个新的命令窗口，输入命令：redis-server --service-install redis.windows.conf
这个命令的作用，可以使得关闭了shell窗口以后，服务依然运行着，可以ctrl+shift+esc查看服务

3.安装后的启动服务命令：redis-server --service-start

4.停止服务命令：redis-server --service-stop

redis的卸载命令：redis-server --service-uninstall

=======================================================================================