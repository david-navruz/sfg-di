package com.udemy.sfgdi;

import com.udemy.sfgdi.controllers.ConstructorInjectionController;
import com.udemy.sfgdi.controllers.SetterInjectionController;
import com.udemy.sfgdi.controllers.SfgController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		SetterInjectionController controller2 = ctx.getBean(SetterInjectionController.class);

		System.out.println(controller2.getGreeting());

		ConstructorInjectionController controller3 = ctx.getBean(ConstructorInjectionController.class);

		System.out.println(controller3.getGreeting());


		SfgController controller4 = ctx.getBean(SfgController.class);

		System.out.println(controller4.sayHello());



	}




}