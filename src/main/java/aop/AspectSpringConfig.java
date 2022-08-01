package aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AspectSpringConfig {

    @Bean
    public EmailService emailService() {
        return new EmailService();
    }

    @Bean
    public AspectLogger aspectLogger() {
        return new AspectLogger();
    }
}
