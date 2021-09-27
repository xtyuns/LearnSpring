import com.xtyuns.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("spring-content.xml");

        // in default, bean is pre-load, not lazy load
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // in default, bean is singleton
        User u1 = app.getBean("u1", User.class);
        User u2 = app.getBean("u1", User.class);
        System.out.println(u1);
        System.out.println(u2);
    }
}
