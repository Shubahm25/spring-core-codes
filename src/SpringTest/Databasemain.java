package SpringTest;

import beans.Database;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Databasemain {
    public static void main(String[] args) {
        ApplicationContext applicationcontext=new ClassPathXmlApplicationContext("spring-configuration.xml");
        Database database=applicationcontext.getBean("database",Database.class);
        System.out.println("Database name:"+database.getName()+"\nDatabase port:"+database.getPort());
    }
}
