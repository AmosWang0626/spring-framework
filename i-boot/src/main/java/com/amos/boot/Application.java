package com.amos.boot;

import com.amos.boot.config.AppConfig;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.Wrapper;
import org.apache.catalina.startup.Tomcat;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletException;

/**
 * DESCRIPTION: Tomcat
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2020/7/4
 * @see com.amos.boot.config.IBootInitializer 兼容 tomcat.addContext 与 WebApplicationInitializer 不适用情况
 */
public class Application {

	private static final String CONTEXT_PATH = "";

	public static void main(String[] args) throws LifecycleException, ServletException {
		Tomcat tomcat = new Tomcat();
		tomcat.setPort(50000);
		tomcat.addContext(CONTEXT_PATH, null);

		AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();
		ac.register(AppConfig.class);
		/// 此处无需手动调用。可以在 refresh() 里打个断点，观察什么时候执行
		// ac.refresh();

		DispatcherServlet servlet = new DispatcherServlet(ac);
		Wrapper wrapper = tomcat.addServlet(CONTEXT_PATH, "app", servlet);
		wrapper.setLoadOnStartup(1);
		wrapper.addMapping("*.do");

		tomcat.start();
		tomcat.getServer().await();
	}

}
