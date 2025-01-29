package com.udemy.sfgdi;

import com.udemy.sfgdi.controllers.SfgController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		SfgController controller = ctx.getBean(SfgController.class);

		String greeting = controller.sayHello();

		System.out.println(greeting);


	}




}
