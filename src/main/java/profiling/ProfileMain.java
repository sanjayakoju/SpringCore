package profiling;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class ProfileMain {

    public static void main(String[] args) {
//        usingJavaClass();

        usingXML();

    }

    private static void usingXML() {

        GenericXmlApplicationContext springContext = new GenericXmlApplicationContext("profileConfig.xml");

//        GenericXmlApplicationContext springContext = new GenericXmlApplicationContext();
        // For Seprate Config Calling
//        springContext.load("configProd.xml");
//        springContext.refresh();

        DbService dbService = springContext.getBean(DbService.class);
        dbService.connect();
    }

    private static void usingJavaClass() {
        // Using Java Class
        AnnotationConfigApplicationContext springContext = new AnnotationConfigApplicationContext();
//        AnnotationConfigApplicationContext springContext = new AnnotationConfigApplicationContext(SpringConfig.class);

//        springContext.getEnvironment().setActiveProfiles("development");
        springContext.getEnvironment().setActiveProfiles("production");
        springContext.scan("profiling");

        springContext.refresh();
        DbService dbService = springContext.getBean(DbService.class);
        dbService.connect();
    }
}
