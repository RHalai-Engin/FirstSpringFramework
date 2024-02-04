package co.pragra.learning.firstspringframework;

import co.pragra.learning.firstspringframework.Config.AppConfig;
import co.pragra.learning.firstspringframework.Config.AppConfig2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class FirstSpringFrameworkApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(FirstSpringFrameworkApplication.class, args);
		Guest guest = context.getBean(Guest.class);
		System.out.println(guest);
		/*ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class, AppConfig2.class);
		Guest guest1 = context.getBean("guest1",Guest.class);
		System.out.println(guest1);
		Guest guest2 = context.getBean("guest2",Guest.class);
		System.out.println(guest2);*/


		/*ApplicationContext context = new ClassPathXmlApplicationContext("app-config.xml");
		Guest guest = context.getBean("guest", Guest.class);
		System.out.println(guest);
		Guest guest1 = context.getBean("guest1", Guest.class);
		System.out.println(guest1);
		System.out.println(context.getBean("guest2", Guest.class));*/
	}
}
