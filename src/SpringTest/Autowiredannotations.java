package SpringTest;

import beans.Restaurant;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by shubham on 7/5/17.
 */
public class Autowiredannotations {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("springcomponent.xml");
        Restaurant restaurant=context.getBean(Restaurant.class);

        restaurant.getHotdrink().preparehotdrink();
    }
}
