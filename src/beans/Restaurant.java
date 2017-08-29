package beans;

import interfaces.Hotdrink;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

/**
 * Created by shubham on 7/4/17.
 */
@Component
public class Restaurant {
  private   Hotdrink hotdrink;




    public Hotdrink getHotdrink() {
        return tea;
    }

    private Tea tea;
    @Autowired
    public Restaurant(Tea tea) {

        this.tea = tea;
    }
   // public Hotdrink getHotdrink1() {
     //   return hotdrink1;
    //}

    //public void setHotdrink1(Hotdrink hotdrink1) {
       // this.hotdrink1 = hotdrink1;
    //}



//@Autowired

    //}
 /*   @Autowired
    public Restaurant(Tea tea) {

        this.tea = tea;
    }
*/
  /* Tea tea;

    public Tea getTea() {
        return tea;
    }

    public void setTea(Tea tea) {
        this.tea = tea;
    }*/





    //public Hotdrink getHotdrink() {
       // return tea;
    //}
/*@Required
    public void setHotdrink(Hotdrink hotdrink) {
        this.hotdrink = hotdrink;

    }*/


}


