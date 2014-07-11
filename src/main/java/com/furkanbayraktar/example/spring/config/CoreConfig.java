package com.furkanbayraktar.example.spring.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.jetty.JettyEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Created with IntelliJ IDEA.
 * User: Furkan Bayraktar
 * Date: 7/11/14
 * Time: 11:22 AM
 * To change this template use File | Settings | File Templates.
 */
@Configuration
@EnableAutoConfiguration
public class CoreConfig {
    @Bean
    public WebMvcConfigurerAdapter initAdapter(){
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addResourceHandlers(ResourceHandlerRegistry registry) {
                registry.addResourceHandler("/angular/**").addResourceLocations("/WEB-INF/assets/angular/");
                registry.addResourceHandler("/app/**").addResourceLocations("/WEB-INF/assets/app/");
                registry.addResourceHandler("/bootstrap/**").addResourceLocations("/WEB-INF/assets/bootstrap/");
                registry.addResourceHandler("/img/**").addResourceLocations("/WEB-INF/assets/img/");
                registry.addResourceHandler("/scripts/**").addResourceLocations("/WEB-INF/assets/scripts/");
                registry.addResourceHandler("/styles/**").addResourceLocations("/WEB-INF/assets/styles/");
                registry.addResourceHandler("/**").addResourceLocations("/WEB-INF/views/");
            }
        };
    }

    @Bean
    public InternalResourceViewResolver getInternalResourceViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setSuffix(".html");
        return resolver;
    }

    @Bean
    public EmbeddedServletContainerFactory servletContainer() {
        JettyEmbeddedServletContainerFactory factory = new JettyEmbeddedServletContainerFactory();
        // Port number that server will run.
        factory.setPort(8888);
        return factory;
    }
}
