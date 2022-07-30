package profiling;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class SpringConfig {

    @Bean("dbService")
    @Profile({"development", "default"})
    public DbService dbServiceDev() {
        DbService dbService = new DbService();
        dbService.setDb_url("development_db_url");
        return dbService;
    }

    @Bean("dbService")
    @Profile("production")
    public DbService dbServiceProd() {
        DbService dbService = new DbService();
        dbService.setDb_url("Production_db_url");
        return dbService;
    }

}
