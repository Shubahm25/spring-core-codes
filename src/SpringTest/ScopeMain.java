package SpringTest;

import beans.Restaurant;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by shubham on 7/5/17.
 */
public class ScopeMain {
    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("spring-scope.xml");
        Restaurant restaurant = context.getBean("tearesturant", Restaurant.class);
        System.out.println("-------------singeleton---------");

        System.out.println(restaurant);
        Restaurant restaurant1 = context.getBean("tearesturant", Restaurant.class);
        System.out.println(restaurant1);
    }


}
