package com.cetpa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext app=new ClassPathXmlApplicationContext("beans.xml");
       ProductRepo product=(ProductRepo)app.getBean("repository");
         
       //Save Recard
      // product.Saverecord(new Product(103,"rgfee","Hp",950));
      
       
       // Delete Records
     // product.Deleterecord(104);
       
       //Search Records
      // product.Searchrecords(105);
     
       //Update Records
       
       product.Updaterecord(new Product(105,"Ankit","Haryana",100000000));
        
    }
}
