package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot x = new Parrot();
        x.setName("KIki");

        Supplier<Parrot> parrotSupplier = () -> x;

        context.registerBean("parrot1", Parrot.class, parrotSupplier);

        Parrot y = new Parrot();
        y.setName("MiKi");

        Supplier<Parrot> parrotSupplier2 = () -> y;

        context.registerBean("parrot2", Parrot.class, parrotSupplier2, bc -> bc.setPrimary(true));

        Parrot p = context.getBean(Parrot.class);
        System.out.println(p.getName());

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
