package org.huke.demo.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

/**
 * @author huke
 * @create 5/7/2017
 */
@SpringBootApplication
public class DemoBootApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DemoBootApplication.class, args);

        System.out.println("通过SpringBoot来注入依赖:");

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
    }
}
