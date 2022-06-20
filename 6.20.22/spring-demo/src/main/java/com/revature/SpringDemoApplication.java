package com.revature;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// part of this annotation is that it scans all sub-classes for controllers and spring beans, so we need to make sure it exists on the same
// level as our controllers, data, service, packages
@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplication.class, args);
	}
}
