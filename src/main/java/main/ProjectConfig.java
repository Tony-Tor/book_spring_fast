package main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    //No qualifying bean of type 'main.Parrot' available: expected single matching bean but found 3: parrot1,parrot2,parrot3
    @Bean
    @Primary
    Parrot parrot1(){
        var p = new Parrot();
        p.setName("KoKo");
        return p;
    }

    @Bean("Miki")
    Parrot parrot2(){
        var p = new Parrot();
        p.setName("Miki");
        return p;
    }

    @Bean
    Parrot parrot3(){
        var p = new Parrot();
        p.setName("Riki");
        return p;
    }

    @Bean
    String hello() {
        return "Hello";
    }

    @Bean
    Integer ten(){
        return 10;
    }
}
