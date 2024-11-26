package config;

import com.example1.Alien;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig1 {

    @Bean
    public Alien alien() {
        return  new Alien();
    }
}
