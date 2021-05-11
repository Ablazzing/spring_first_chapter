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
        Pet pet1 = context.getBean("myPet",Dog.class);
        Pet pet2 = context.getBean("myPet",Dog.class);
        System.out.println(pet1);
        System.out.println(pet2);
        System.out.println("равны ли объекты?\n"+ (pet1==pet2));
        context.close();
    }
}
