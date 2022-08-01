package aop;

public class EmailService {

    public EmailService() {

    }

    public void sendEmail() {
        System.out.println("Sending email ...");
//        if (Math.random() > 0.5)
//            throw new NullPointerException();
    }

    public void getEmail() {
        System.out.println("Get Email..");
    }
}
