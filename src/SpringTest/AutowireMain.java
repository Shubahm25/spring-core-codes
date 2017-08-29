package SpringTest;

import beans.Restaurant;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by shubham on 7/5/17.
 */
public class AutowireMain

{
    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("spring1-config.xml");
        Restaurant restaurant = context.getBean("tearesturant", Restaurant.class);
        restaurant.getHotdrink().preparehotdrink();
    }
}