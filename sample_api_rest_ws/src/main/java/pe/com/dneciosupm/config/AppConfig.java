package pe.com.dneciosupm.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan( basePackages = "pe.com.dneciosupm" )
public class AppConfig extends WebMvcConfigurerAdapter
{
	@Override
	public void addCorsMappings(CorsRegistry registry)
	{
		registry.addMapping("/**").
		allowedOrigins("*").
		allowedMethods("POST", "GET", "HEAD", "PUT", "OPTIONS", "DELETE").
		allowedHeaders("X-Auth-Token",
							"x-xsrf-token",
							"Content-Type",
							"Access-Control-Allow-Headers", 
							"X-Requested-With", 
							"Authorization", 
							"Origin", 
							"Accept", 
							"Access-Control-Request-Method",
							"Access-Control-Request-Headers",
							"Access-Control-Allow-Origin").
							exposedHeaders("custom-header1", "custom-header2").
							allowCredentials(false).maxAge(3600);
	}
}
