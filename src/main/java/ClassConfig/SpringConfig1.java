package ClassConfig;

import model.Bike;
import model.Car;
import model.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig1 {

    @Bean
    public Vehicle vehicle() {
//        return new Car("BMW", 23000);
//        return new Bike("Suzuki Hayabus", 23000);

        Car car = new Car();
        car.setModel("Dodge");
        car.setPrice(123000);
        return car;
    }
}
