package by.itstep.internetShop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "by.itstep.internetShop")

//DatabaseConfiguration.class,
@Import({DatabaseConfiguration.class, WebConfiguration.class})
public class AppConfiguration {

}