package main;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
@Component
public class Parrot {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
