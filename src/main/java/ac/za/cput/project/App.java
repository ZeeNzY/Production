package ac.za.cput.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import javax.sql.DataSource;

/**
 * Hello world!
 *
 */

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@EntityScan("ac.za.cput.project")
//@EnableMongoRepositories ("com.server.repository")
public class App 
{

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
}

