import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanOne = (HelloWorld) applicationContext.getBean("HW");
        System.out.println(beanOne.getMessage());
        HelloWorld beanTwo = (HelloWorld) applicationContext.getBean("HW");
        System.out.println(beanOne == beanTwo);
        System.out.println(beanOne);
        System.out.println(beanTwo);

        Cat beanOneCat = (Cat) applicationContext.getBean("cat");
        System.out.println(beanOne.getMessage());
        Cat beanTwoCat = (Cat) applicationContext.getBean("cat");
        System.out.println(beanOneCat.getMessage());
        System.out.println(beanOneCat == beanTwoCat);
    }
}