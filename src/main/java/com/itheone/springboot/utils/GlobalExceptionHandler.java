package com.itheone.springboot.utils;

import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author caohaifengx@163.com 2019-03-12 11:11
 */

@ControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(value = RuntimeException.class)  //or Exception.class
    @ResponseBody
    public Object defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        e.printStackTrace();
        return "我是个异常处理类";
    }

    @Bean   //spring boot 2 配置方式
    public WebServerFactoryCustomizer<ConfigurableWebServerFactory> webServerFactoryCustomizer(){
//        return (factory->{
//            ErrorPage error404Page = new ErrorPage(HttpStatus.NOT_FOUND, "/404.do");
//            factory.addErrorPages( error404Page);
//        });

        WebServerFactoryCustomizer<ConfigurableWebServerFactory>  result = new WebServerFactoryCustomizer<ConfigurableWebServerFactory>() {
            @Override
            public void customize(ConfigurableWebServerFactory factory) {
                ErrorPage error404Page = new ErrorPage(HttpStatus.NOT_FOUND, "/404.do");
                factory.addErrorPages( error404Page);
            }
        };

        //jdk 1.8 lambda
        return  result;
    }


//    @Bean   //springboot1 配置方式
//    public EmbeddedServletContainerCustomizer containerCustomizer() {
//        return (container -> {
//            ErrorPage error404Page = new ErrorPage(HttpStatus.NOT_FOUND, "/404.do");
//            container.addErrorPages( error404Page);
//        });
//    }
}