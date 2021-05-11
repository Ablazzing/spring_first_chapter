package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context =  new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = context.getBean("myPerson",Person.class);
        person.callPet();
        System.out.println("My name is " +person.getName());
        context.close();
    }
}
