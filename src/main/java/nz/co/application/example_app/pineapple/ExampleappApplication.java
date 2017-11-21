package nz.co.application.example_app.pineapple;

import nz.co.application.example_app.pineapple.domain.lock.LockInterface;
import nz.co.application.example_app.pineapple.domain.lock.Lock;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExampleappApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExampleappApplication.class, args);
	}

}
