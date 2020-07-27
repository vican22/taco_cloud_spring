package com.vedran.tacocloud.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //homepage
        registry
                .addViewController("/")
                .setViewName("home");

        //login page
        registry.addViewController("/login")
            .setViewName("login");
    }
}
