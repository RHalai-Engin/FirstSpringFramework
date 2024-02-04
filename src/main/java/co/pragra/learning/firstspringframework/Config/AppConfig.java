package co.pragra.learning.firstspringframework.Config;

import co.pragra.learning.firstspringframework.Guest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "application.properties") // or (value = "application.yml")
public class AppConfig {
    @Value("${firstName}") //SPEL CAPABLE //#{$firstName.substring(3)}
    private String firstNamee;
    @Value("${lastName}")
    private String lastNamee;
    /*@Bean
    public Guest guest1(){
        Guest guest = new Guest(firstNamee,lastNamee,
                "Tom@hotmail.com","452-951-6524", "123 nowhere blvd");
        return guest;
    }*/

}
