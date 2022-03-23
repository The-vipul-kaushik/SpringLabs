package cg.feb18.spring.lab1.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

import cg.feb18.spring.lab1.model.Employee;

@ComponentScan
public class App2 
{
    public static void main( String[] args )
    {
        System.out.println( "start" );
        
        ApplicationContext context = new AnnotationConfigApplicationContext(App2.class);
        
        Employee emp = context.getBean(Employee.class);
        
        System.out.println(emp.toString());
        
        ((AbstractApplicationContext) context).close();
        
        
        System.out.println("End");
    }
}
