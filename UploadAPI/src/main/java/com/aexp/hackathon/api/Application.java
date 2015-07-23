package com.aexp.hackathon.api;

import java.io.File;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
		String base_path = System.getProperty("user.dir");
		File file = new File(base_path+"/uploadedJars/");
		if (!file.exists()) {
			file.mkdir();
		}
		file = new File(base_path+"/Documentation/");
		if (!file.exists()) {
			file.mkdir();
		}
    }
}
