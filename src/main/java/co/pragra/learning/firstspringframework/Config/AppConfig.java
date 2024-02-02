package co.pragra.learning.firstspringframework.Config;

import co.pragra.learning.firstspringframework.Guest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Guest guest1(){
        Guest guest = new Guest("Tom","Hank",
                "Tom@hotmail.com","452-951-6524", "123 nowhere blvd");
        return guest;
    }
}
