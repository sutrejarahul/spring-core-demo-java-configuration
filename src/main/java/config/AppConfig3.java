package config;

import com.example3.Alien;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig3 {

    @Bean
    @Scope("prototype")
    public Alien alien() {
        return new Alien();
    }
}
