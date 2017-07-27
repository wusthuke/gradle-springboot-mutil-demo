package org.huke.demo.springboot.api;

import org.huke.demo.springboot.service.ConfigurationService;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author huke
 * @create 14/7/2017
 */
@RunWith(SpringRunner.class)
@SpringBootConfiguration
@EnableAutoConfiguration
@Import({ConfigurationService.class})
// @ContextConfiguration("classpath:spring-context-test.xml")
public class TestSupport {

}