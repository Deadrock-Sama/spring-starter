package lo.proj3ct.springstarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {

    @Autowired
    CarEngine carEngine;

    @Value("${car.manufacturer:SkodaBASE}")
    private String manufacturer;

    public String getModel() {
        return model;
    }

    private String model;

    public Car(String model) {
        this.model = model;
    }

    public Car() {}
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void printCarEngine() {
        System.out.println(carEngine.getEngineType());
    }
}
