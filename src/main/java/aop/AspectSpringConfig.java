package aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AspectSpringConfig {

    @Bean
    public EmailService emailService() throws Exception {
        return new EmailService();
    }

    @Bean
    public Logger logger() {
        return new Logger();
    }
}
