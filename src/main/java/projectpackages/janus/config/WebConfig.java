package projectpackages.janus.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

//Конфигурация web-контекста
@Configuration
@EnableWebMvc
@ComponentScan("projectpackages.janus")
public class WebConfig extends WebMvcConfigurerAdapter{
}
