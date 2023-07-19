package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        //Primary bean
        Parrot p2 = context.getBean(Parrot.class);
        System.out.println(p2.getName());

        int n = context.getBean(Integer.class);
        System.out.println(n);

        String s = context.getBean(String.class);
        System.out.println(s);
/*
        No qualifying bean of type 'java.lang.Double' available
        double d = context.getBean(Double.class);
        System.out.println(d);
*/


    }
}
