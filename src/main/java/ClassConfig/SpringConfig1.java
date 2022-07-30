package ClassConfig;

import model.Car;
import model.Vehicle;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Configuration
public class SpringConfig1 implements InitializingBean, DisposableBean {

    @Bean
    @Scope(value = "singleton")
    public Vehicle vehicle() {
//        return new Car("BMW", 23000);
//        return new Bike("Suzuki Hayabus", 23000);

        Car car = new Car();
        car.setModel("Dodge");
        car.setPrice(123000);
        return car;

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("After Property Set Called");
    }


    @PostConstruct
    public void postConstruct() {
        System.out.println("Java class Post Construct Called");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Java class Pre Destroy Called");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Bean Destroy");
    }
}
