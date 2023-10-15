package org.zhurad.todolist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class TodolistApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodolistApplication.class, args);
	
	}
}


/**
     * acessos:
	 * 
	 * http://localhost:8080/users/
	 * http://localhost:8080/tasks/
	 * http://localhost:8080/tasks/{Id} 
	 * Docker desbilitado por falta de ambiente de deploy
	 * 
     */
