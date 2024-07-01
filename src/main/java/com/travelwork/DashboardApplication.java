package com.travelwork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
//public class DashboardApplication extends SpringBootServletInitializer implements WebMvcConfigurer{
public class DashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(DashboardApplication.class, args);
	}
	
	//[Fix CORS Error in SpringBoot]
	//[https://www.youtube.com/watch?v=PcZGwcgbzE4]
	/*@Bean
	public WebMvcConfigurer configure()
	{
		return new WebMvcConfigurer()
		{
			@Override
			public void addCorsMappings(CorsRegistry reg)
			{
				reg.addMapping("/**").allowedOrigins("*");
			}
		};		
	}*/
}
   