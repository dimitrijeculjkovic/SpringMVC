package rs.engineering.javacourse.spring_mvc_configuration_03_config;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import rs.engineering.javacourse.spring_mvc_configuration_03_controller.UserController;
import rs.engineering.javacourse.spring_mvc_configuration_03_service.UserService;




@Configuration
@EnableWebMvc

public class MyWebContextConfig {

	@Bean
	public UserController userController() {
		return new UserController();
	}
	
	@Bean
	public RequestMappingHandlerMapping requestMappingHandlerMapping() {
		return new RequestMappingHandlerMapping();
	}
	
	@Bean
	public UserService userService() {
		return new UserService();
	}
	//konfigurisati view resolver
		@Bean
		public ViewResolver viewResolver() {
			InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
			viewResolver.setPrefix("/WEB-INF/view/");
			viewResolver.setSuffix(".jsp");
			return viewResolver;
		}
}
