package com.db.webproject;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.db.webproject.Data.Users;
import com.db.webproject.Data.UsersRepository;

@SpringBootApplication
public class WebprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebprojectApplication.class, args);
	}

}
