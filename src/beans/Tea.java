package beans;

import interfaces.Hotdrink;
import org.springframework.stereotype.Component;

/**
 * Created by shubham on 7/4/17.
 */
@Component
public class Tea implements Hotdrink {

    public void preparehotdrink()
    {
        System.out.println("This is Tea");
    }
}
