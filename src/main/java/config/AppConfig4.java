package config;

import com.example4.Alien;
import com.example4.Computer;
import com.example4.Desktop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig4 {

    @Bean
    public Alien alien(@Autowired Computer computer) {
        Alien alien = new Alien();
        alien.setAge(28);
        alien.setComputer(computer);
        return alien;
    }

    @Bean
    public Desktop desktop() {
        return new Desktop();
    }
}
