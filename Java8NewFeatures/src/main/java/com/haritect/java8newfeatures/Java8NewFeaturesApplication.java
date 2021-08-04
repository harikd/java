package com.haritect.java8newfeatures;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.haritech.javacomparator.MyComparator;
import com.haritech.javacomparator.User;

@SpringBootApplication
public class Java8NewFeaturesApplication {

	public static void main(String[] args) {
		SpringApplication.run(Java8NewFeaturesApplication.class, args);
	}
	@Bean
	public MyComparator compare() {
		return new  MyComparator();
	}


}
