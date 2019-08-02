package com.mkyong.helloworld.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inimbus.jarA.ClassA;
import com.inimbus.jarB.ClassB;

@RestController
public class WelcomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		return "Index Page";
	}
	@RequestMapping(value = "/methodA", method = RequestMethod.GET)
	public String methodA() {
		ClassA classA = new ClassA();
		return classA.methodA();
	}
	@RequestMapping(value = "/methodB", method = RequestMethod.GET)
	public String methodB() {
		ClassB classB  = new ClassB();
		return classB.methoB();
	}
}