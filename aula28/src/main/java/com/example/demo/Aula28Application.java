package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.controller.MyController;

@SpringBootApplication
@ComponentScan(basePackages = { "com.example.demo.service", "com.example.demo.controller" })
public class Aula28Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Aula28Application.class, args);
		MyController c = (MyController) ctx.getBean("myController");
		c.hello();
	}

}
