package com.cetpa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        HondaCar car=(HondaCar)context.getBean("c1");
        car.turnEngineOn();
    	
     
    }
}
