package com.oubl23.demo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {CDPlayer.class})
public class CDPlayerConfig { 
}
