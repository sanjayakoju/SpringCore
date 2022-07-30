package profiling;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("production")
public class SpringConfigProd implements SpringConfigInterface{

    @Bean
    public DbService dbService() {
        DbService dbService = new DbService();
        dbService.setDb_url("Production_db_url");
        return dbService;
    }
}
