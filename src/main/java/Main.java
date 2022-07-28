import ClassConfig.SpringConfig2;
import model.Game;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("App Start");

        ApplicationContext springContext = new AnnotationConfigApplicationContext(SpringConfig2.class);
//        ApplicationContext springContext = new ClassPathXmlApplicationContext("config2.xml");
//        Game game = (Game) springContext.getBean("game");
        Game game = springContext.getBean(Game.class);
        System.out.println(game);
        game.play();
        System.out.println("App Stop");
    }
}
