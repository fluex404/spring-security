package com.fluex404.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringMvcDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{
                SecurityConfig.class
        };
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{
                AppConfig.class
        };
    }

    protected String[] getServletMappings() {
        return new String[]{
                "/"
        };
    }
}
