package com.example.basic.auth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "http://localhost:4200")
@RestController

//public class HelloWorldController {
//	//GetMapping without method
//	@RequestMapping(method = RequestMethod.GET,path = "/helloworld")
//	public String helloWorld() {
//		return "Hello World";
//	}
//	@RequestMapping(method = RequestMethod.GET,path = "/helloworldbean")
//	public HelloWorldBean HelloWorldBean() {
//		//throw new RuntimeException("An Error has happened contact us at ****- ***");
//		return new HelloWorldBean ("Hello World - changed");
//	}
//		@RequestMapping(method = RequestMethod.GET,path = "/helloworldbean/path-variable/{name}")
//		public HelloWorldBean HelloWorldPathVariable(@PathVariable String name) {
//			return new HelloWorldBean (String.format("Hello World , %s" , name));
//		}
//		}
		
		
		
public class BasicAuthenticationController {

		@RequestMapping(method = RequestMethod.GET,path = "/basicauth")
		public AuthenticationBean HelloWorldBean() {
			//throw new RuntimeException("An Error has happened contact us at ****- ***");
			return new AuthenticationBean ("You are authenticated");
		
		
}
		@RequestMapping(method = RequestMethod.GET,path = "/helloworldbean/path-variable/{name}")
		public AuthenticationBean HelloWorldPathVariable(@PathVariable String name) {
			return new AuthenticationBean (String.format("Hello World , %s" , name));
		}

		}
