import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class MyApp {
    static Map<String, Object> beans = new HashMap<>();

    public static void main(String[] args) throws IOException {

        // init beans
        try (InputStream pis = ClassLoader.getSystemResourceAsStream("bean.properties")) {
            Properties properties = new Properties();
            properties.load(pis);

            Set<String> beanNames = properties.stringPropertyNames();
            beanNames.forEach(key -> {
                String className = (String) properties.get(key);
                if (beans.containsKey(className)) return;

                try {
                    Class<?> beanClass = Class.forName(className);
                    Object beanInstance = beanClass.getConstructor().newInstance();
                    beans.put(className, beanInstance);
                } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
                    throw new RuntimeException("Cannot create object instance: " + className, e);
                }
            });
        }


        // print init result
        System.out.println(beans);
    }
}
