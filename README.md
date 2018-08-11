# SpringBoot2.0整合jsp
## 注意点：  
1. 只能打包成`war`类型的格式；
2. 必须将打好的`war`包放到外部tomcat容器中运行。

步骤：  
1. 引入外部tomcat依赖：
```xml
<!-- SpringBoot web 核心组件 -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-tomcat</artifactId>
</dependency>

<!-- SpringBoot 外部tomcat支持 -->	
<dependency>
    <groupId>org.apache.tomcat.embed</groupId>
    <artifactId>tomcat-embed-jasper</artifactId>
</dependency>
```
2. 在application.properties配置文件中配置jsp文件路径和后缀：
```yaml
spring.mvc.view.prefix=/WEB-INF/jsp/     #视图（jsp）文件路径
spring.mvc.view.suffix=.jsp              #视图（jsp）文件后缀
```

3. 在项目中新建视图文件存储路径：  
这里一定不能把JSP页面放到 `resources/jsp` 路径下，否则项目运行后访问不到此路径。  
正确的存放位置应该是 `src/main/webapp/WEB-INF/jsp/*.jsp`
