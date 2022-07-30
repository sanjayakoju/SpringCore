package ClassConfig;

import model.Game;
import model.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(SpringConfig1.class)
//@ImportResource("classpath:config2.xml")
public class SpringConfig2 {

    @Bean
    public Game game(Vehicle vehicle) {
        return new Game(vehicle);
    }

    @Bean
    public void init() {
        System.out.println("Init Called");
    }


}
