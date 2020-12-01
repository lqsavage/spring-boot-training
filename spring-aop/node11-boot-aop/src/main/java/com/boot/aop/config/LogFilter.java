package com.boot.aop.config;
import java.lang.annotation.*;

/**
 * 系统日志元注解
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LogFilter {
    String value() default "" ;
}