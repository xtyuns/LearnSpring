import com.xtyuns.pojo.Dog;
import com.xtyuns.pojo.People;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("spring-content.xml");

        Dog dog1 = app.getBean(Dog.class);
        System.out.println(dog1);

        People people1 = app.getBean(People.class);
        System.out.println(people1);
    }
}
