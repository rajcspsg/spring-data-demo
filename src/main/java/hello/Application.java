package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String []args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
        UsersRepository ur = ctx.getBean(UsersRepository.class);
        ur.save(new Users());
    }
}
