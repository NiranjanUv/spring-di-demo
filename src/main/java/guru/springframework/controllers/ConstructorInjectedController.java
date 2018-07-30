package guru.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import guru.springframework.services.GreetingService;

@Component
public class ConstructorInjectedController {
	
	@Autowired
	private GreetingService greetingService;

	public ConstructorInjectedController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String sayHello(){
		return greetingService.sayGreeting();
	}
}
