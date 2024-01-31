package co.pragra.learning.firstspringframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class FirstSpringFrameworkApplication {

	public static void main(String[] args) {
		//SpringApplication.run(FirstSpringFrameworkApplication.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("app-config.xml");
		Guest guest = context.getBean("guest", Guest.class);
		System.out.println(guest);
		Guest guest1 = context.getBean("guest1", Guest.class);
		System.out.println(guest1);
		System.out.println(context.getBean("guest2", Guest.class));
	}
}
