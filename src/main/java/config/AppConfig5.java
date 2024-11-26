package config;

import com.example5.Alien;
import com.example5.Computer;
import com.example5.Desktop;
import com.example5.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig5 {

    @Bean
    public Alien alien(@Autowired @Qualifier("desktop") Computer computer) {
        Alien alien = new Alien();
        alien.setAge(28);
        alien.setComputer(computer);
        return alien;
    }

    @Bean
    public Desktop desktop() {
        return new Desktop();
    }

    @Bean
//    @Primary
    public Laptop laptop() {
        return new Laptop();
    }
}
