package com.chengli.dubbo.env;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @Author: chengli
 * @Date: 2018/8/16 17:35
 */
public class MyApplicationContextInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{};
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{DubboConfig.class, MvcConfig.class};
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

}
