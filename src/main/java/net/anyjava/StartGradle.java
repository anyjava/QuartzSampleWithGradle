package net.anyjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@EnableAutoConfiguration
@ComponentScan
@ImportResource({"classpath:applicationContext.xml"})
public class StartGradle {

	public static void main(String[] args) {
    	ApplicationContext ctx = (ApplicationContext)SpringApplication.run(StartGradle.class, args);
    	System.out.println("Hello Wordl!");
	}
}
