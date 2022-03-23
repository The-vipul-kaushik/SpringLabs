package cg.feb18.spring.lab1.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cg.feb18.spring.lab1.model.Employee;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "start" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
        
        Employee emp = context.getBean("employee", Employee.class);
        
        System.out.println(emp.toString());
        
        ((AbstractApplicationContext) context).close();
        
        
        System.out.println("End");
    }
}
