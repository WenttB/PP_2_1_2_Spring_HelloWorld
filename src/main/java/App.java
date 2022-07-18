import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");
        boolean eq = bean == bean2;
        System.out.println(bean.getMessage());
        System.out.println(eq);
        Cat beanCat = (Cat) applicationContext.getBean("cat");
        Cat beanCat1 = (Cat) applicationContext.getBean("cat");
        boolean eqCat = beanCat == beanCat1;
        System.out.println(eqCat);
    }
}