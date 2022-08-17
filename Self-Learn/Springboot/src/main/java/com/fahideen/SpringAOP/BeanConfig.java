package com.fahideen.SpringAOP;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.fahideen.SpringAOP")
@EnableAspectJAutoProxy
public class BeanConfig {

}
