package org.huke.demo.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author huke
 * @create 5/7/2017
 */
@Controller
@EnableAutoConfiguration
public class SimpleController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }




    public static void main(String[] args) throws Exception {
        SpringApplication.run(SimpleController.class, args);
    }
}
