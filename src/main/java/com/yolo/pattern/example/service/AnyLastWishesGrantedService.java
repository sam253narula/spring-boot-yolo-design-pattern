package com.yolo.pattern.example.service;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class AnyLastWishesGrantedService implements ApplicationContextAware{
	private ApplicationContext context;

	public void sayHiBeforeTYouDie() {
		System.out.println("Hello Death");
		((ConfigurableApplicationContext) context).close();
	}

	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		this.context = ctx;
	}
	
	
}
