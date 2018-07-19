package com.tr.apiresourceserver1.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan({ "com.tr.apiresourceserver1.api" })
public class ResourceServerWebConfig extends WebMvcConfigurerAdapter {
}
