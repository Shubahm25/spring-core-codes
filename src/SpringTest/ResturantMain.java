package SpringTest;

import beans.Restaurant;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ResturantMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-configuration.xml");
        Restaurant restaurant = context.getBean("tearesturant", Restaurant.class);
        restaurant.getHotdrink().preparehotdrink();
      //  restaurant.getHotdrink1().preparehotdrink();

    }
}
