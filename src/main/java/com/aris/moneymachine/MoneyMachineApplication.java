package com.aris.moneymachine;

import com.aris.moneymachine.entites.XmlConvert;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;


@SpringBootApplication
public class MoneyMachineApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoneyMachineApplication.class, args);
	}

	@PostConstruct
	public static void mx(){
		XmlConvert.saveLines("lines.csv");
		XmlConvert.saveBind("bind.csv");
	}

}
