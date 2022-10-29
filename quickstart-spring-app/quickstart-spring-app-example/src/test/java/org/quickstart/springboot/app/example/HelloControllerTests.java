package org.quickstart.springboot.app.example;

import org.junit.jupiter.api.Test;
import org.quickstart.springboot.app.example.controller.HelloController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloControllerTests {

    @Autowired
    private HelloController exampleController;

    @Test
    void contextLoads() {
        String say = exampleController.sayHello();
        System.out.println(say);
    }

}
