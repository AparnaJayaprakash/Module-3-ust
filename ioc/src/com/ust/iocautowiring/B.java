package com.ust.iocautowiring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Qualifier;

public class B {
	
	A a;
	public B() {
		
		System.out.println("from B() constructor....");
	}
	
	public B(A a) {
		System.out.println("from setA() constructor.....");
	}
	
	@Qualifier("a")
	public void setA(A a) {
		//byName byType will use setter injection
		System.out.println("setA() called....");
		this.a=a;
	}
	
	@PostConstruct         // this annotation treats the following method as init() method
	public void setUp() {
		System.out.println("from setUp()...");
	}
	
	@PreDestroy            // // this annotation treats the following method as destroy() method
	public void windUp() {
		System.out.println("from windUp()...");
	}

}
