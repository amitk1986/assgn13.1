package com.diablo.assgn131;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "spring.xml");
        
        Beean bean1 = (Beean)ctx.getBean("myBean1");
        Beean bean2 = (Beean)ctx.getBean("myBean2");
        
        System.out.println("Bean 1");
        bean1.execute();
        
        System.out.println("\nBean 2");
        bean2.execute();
    }
    }

