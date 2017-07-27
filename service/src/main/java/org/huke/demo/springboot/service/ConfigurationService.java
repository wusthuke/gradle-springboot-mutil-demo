package org.huke.demo.springboot.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author huke
 * @create 27/7/2017
 */
@Configuration
@ComponentScan(basePackageClasses = ConfigurationService.class)
public class ConfigurationService {
}
