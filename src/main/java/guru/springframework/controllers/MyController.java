package guru.springframework.controllers;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;

import guru.springframework.DiDemoApplication;

@Controller
public class MyController {

	public static void main(String[] args){
		ApplicationContext cxt = SpringApplication.run(DiDemoApplication.class, args);
		
		MyController controller = (MyController) cxt.getBean("myController");
		controller.hello();
		
		System.out.println(cxt.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(cxt.getBean(ConstructorInjectedController.class).sayHello());
		System.out.println(cxt.getBean(SetterInjectedController.class).sayHello());
	}
	public String hello(){
		System.out.println("Hello Spring !!!");
		return "Hello";
	}
}
