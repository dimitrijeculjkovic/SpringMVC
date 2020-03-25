package rs.engineering.javacourse.spring_mvc_configuration_03_config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
//1
public class MyWebApplicationInitalizer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		System.out.println("123");
		AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
		webApplicationContext.register(MyWebContextConfig.class);
		webApplicationContext.setServletContext(servletContext);
		ServletRegistration.Dynamic dispatcherServlet = servletContext.addServlet("mySpringDispatcherServlet", new DispatcherServlet(webApplicationContext));
		
		dispatcherServlet.addMapping("/");
		dispatcherServlet.setLoadOnStartup(1);
	}

}
