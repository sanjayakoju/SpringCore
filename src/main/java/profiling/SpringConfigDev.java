package profiling;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile({"development", "default"})
public class SpringConfigDev implements SpringConfigInterface{

    @Bean
    public DbService dbService() {
        DbService dbService = new DbService();
        dbService.setDb_url("development_db_url");
        return dbService;
    }
}
