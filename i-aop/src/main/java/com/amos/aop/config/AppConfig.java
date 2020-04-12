package com.amos.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 模块描述: AppConfig
 *
 * @author amos.wang
 * @date 2020/3/24 13:17
 */
@ComponentScan("com.amos.aop")
@EnableAspectJAutoProxy
public class AppConfig {
}
