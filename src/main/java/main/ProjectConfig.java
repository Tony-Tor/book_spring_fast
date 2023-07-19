package main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "main")
public class ProjectConfig {

    //No qualifying bean of type 'main.Parrot' available: expected single matching bean but found 3: parrot1,parrot2,parrot3


    @Bean
    String hello() {
        return "Hello";
    }

    @Bean
    Integer ten(){
        return 10;
    }
}
