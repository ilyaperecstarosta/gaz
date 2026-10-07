package org.example;

import org.springframework.boot.SpringApplication; //подключение Spring Boot инструментов
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //аннотация, то есть метка для Spring. «это главный класс приложения
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args); //запустить Spring Boot.
    }
}