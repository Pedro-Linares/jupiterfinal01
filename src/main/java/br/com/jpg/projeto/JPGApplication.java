package br.com.jpg.projeto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class JPGApplication extends SpringBootServletInitializer{
	public static void main(String[] args) {
		SpringApplication.run(JPGApplication.class, args);
	}	     

}