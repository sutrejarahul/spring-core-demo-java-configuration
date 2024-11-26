package config;

import com.example2.Alien;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig2 {

    // default bean name is alien
//    @Bean
//    public Alien alien() {
//        return new Alien();
//    }

    // set bean name using name attribute
//    @Bean(name = "alien1")
//    public Alien alien() {
//        return new Alien();
//    }

    // set multiple bean name using name attribute access bean using any one of them
    @Bean(name = {"alien1", "alien", "unknown"})
    public Alien alien() {
        return new Alien();
    }
}
