package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AspectMain {

    public static void main(String[] args) {

        javaConfigAspect();
    }

    private static void javaConfigAspect() {
        AnnotationConfigApplicationContext springContext = new AnnotationConfigApplicationContext();
        springContext.scan("aop");
        springContext.refresh();

        EmailService emailService = springContext.getBean(EmailService.class);
        emailService.sendEmail();
        emailService.getEmail();
    }
}
