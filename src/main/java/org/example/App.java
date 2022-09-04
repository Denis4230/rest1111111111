package org.example;

import org.example.config.MyConfig;
import org.example.model.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.annotation.PostConstruct;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);
        System.out.println(communication.getAllUsers());


//        User user = new User(3L, "James", "Brown", (byte) 11);
//        communication.saveUser(user);
//        System.out.println(communication.getAllUser());

    }

}
