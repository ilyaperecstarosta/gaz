package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //метка для Spring: «этот класс принимает HTTP-запросы
public class HelloController {

    @GetMapping("/hello") //«когда придёт запрос GET на адрес /hello, вызови этот метод»
    public String hello() {
        return "привет мир"; //что отправить в ответ.
    }
}