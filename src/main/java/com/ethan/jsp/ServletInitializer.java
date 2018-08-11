package com.ethan.jsp;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * 当打包成war格式部署是时，需要继承SpringBootServletInitializer；
 * 如果使用内嵌的tomcat/Jetty容器时，不需要此ServletInitializer
 */
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(DemoApplication.class);
	}

}
