package SpringTest;

import beans.Complex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 */
public class Complexmain {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-configuration.xml");
        Complex complex = context.getBean("complexbean", Complex.class);
        complex.display();
    }
}