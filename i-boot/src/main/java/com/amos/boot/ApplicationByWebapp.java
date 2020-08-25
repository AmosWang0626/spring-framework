package com.amos.boot;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * DESCRIPTION: Tomcat Webapp方式运行
 * 不足：该方法仅在 Tomcat容器为 web模式时生效
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2020/7/4
 * @see com.amos.boot.config.IBootInitializer#onStartup(ServletContext)
 */
public class ApplicationByWebapp {

	public static void main(String[] args) throws LifecycleException, ServletException {
		Tomcat tomcat = new Tomcat();
		tomcat.setPort(50000);
		tomcat.addWebapp("", "D:\\test\\html");
		tomcat.start();
		tomcat.getServer().await();
	}

}
