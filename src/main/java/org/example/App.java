package org.example;

import org.example.config.Appconfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
//        Using java
//        Alien obj = new Alien();
//        obj.execute();
//        System.out.println(obj.getAge());

        //using spring xml
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Alien obj = context.getBean(Alien.class);
//        obj.execute();

        //using java based config
        ApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);
        Desktop desktop = context.getBean(Desktop.class);
        desktop.compile();
    }
}
