package com.amos.boot.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * DESCRIPTION: IBootInitializer
 * <p>
 * Servlet 3.1 之后提供了 resources\META-INF\services\javax.servlet.ServletContainerInitializer
 * 这个方法会自动扫描 WebApplicationInitializer 的实现类
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2020/7/4
 * @see org.springframework.web.SpringServletContainerInitializer
 */
public class IBootInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		System.out.println("========== IBootInitializer onStartup ==========");
		// Load Spring web application configuration
		AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();
		ac.register(AppConfig.class);
		/// 此处无需手动调用。可以在 refresh() 里打个断点，观察什么时候执行
		// ac.refresh();

		// Create and register the DispatcherServlet
		DispatcherServlet servlet = new DispatcherServlet(ac);
		ServletRegistration.Dynamic registration = servletContext.addServlet("app", servlet);
		registration.setLoadOnStartup(1);
		registration.addMapping("*.do");
	}

}
