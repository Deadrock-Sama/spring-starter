package lo.proj3ct.springstarter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("application.properties")
public class SpringConfig {



    @Bean("CarBean")
    public Car getCar() {
        return new Car();
    }

    @Bean("CarWithModel")
    public Car getModelCar(@Value("${car.model}") String model) {
        return new Car(model);
    }
}
