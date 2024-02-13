package lo.proj3ct.springstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SpringStarterApplication {

	public static void main(String[] args)
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        Car engine = ctx.getBean( "CarWithModel", Car.class);

        engine.printCarEngine();
        System.out.println(engine.getManufacturer());
        System.out.println(engine.getModel());
	}

}
