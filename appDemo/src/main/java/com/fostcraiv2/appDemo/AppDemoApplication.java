package com.fostcraiv2.appDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fostcraiv2.appDemo.entidad.Cliente;
import com.fostcraiv2.appDemo.respository.ClienteRepository;

@SpringBootApplication
public class AppDemoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(AppDemoApplication.class, args);
	}

	@Autowired
	private ClienteRepository repositorio;

	@Override
	public void run(String... args) throws Exception {

		}

}
