# springdemo
maven、spring boot、spring mvc后台流程
1、热部署的添加
    option + command + shift + ／容易忘记这最后一步
2、基本架构的搭建
    2.1 数据库的搭建
        用户表demo：        
            drop TABLE if EXISTS t_user;
            CREATE TABLE t_user(
              userId INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
              userName VARCHAR(255) NOT NULL ,
              password VARCHAR(255) NOT NULL ,
              phone VARCHAR(255) NOT NULL
            ) ENGINE=INNODB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT "用户信息表";
    2.2 myibatis基本CURL,分页查找
    
    2.3 Druid web ui地址
        http://localhost:8080/druid/login.html
        用户名admin 密码admin
        
    2.4 Spring boot定时任务，已添加
    
    2.5 Spring boot日志，默认使用Logback日志
    
    2.6 Spring boot自定义配置DemoProperties.java、demo.properties配置文件，已完成
    2.6.1 Spring boot自定义配置demo.properties配置文件方式二
    
    2.7 收取邮件，已完成，解析附件
    
    2.8 myibatis自动化生成xml、model、dao
    
    2.9 返回格式RespEntity的定义与使用
    
    3.0 添加生产、测试环境配置
    3.1 测试lombok的使用
    3.2 生产接口Swagger2的使用