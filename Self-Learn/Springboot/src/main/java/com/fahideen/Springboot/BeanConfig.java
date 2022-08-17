package com.fahideen.Springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages="com.fahideen.Springboot")
public class BeanConfig {
  @Bean
  public Doctor doctor(){
	  return new Doctor();
  }
}
