package com.yolo.pattern.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.yolo.pattern.example.service.AnyLastWishesGrantedService;

@SpringBootApplication
public class YoloDesignPatternApplication implements CommandLineRunner  {
	
	public static void main(String[] args) {
	SpringApplication.run(YoloDesignPatternApplication.class, args);

	}

	@Autowired
	AnyLastWishesGrantedService grantLastWishService;
	
	@Override
	public void run(String... args) throws Exception {
		grantLastWishService.sayHiBeforeTYouDie();
	}

}
