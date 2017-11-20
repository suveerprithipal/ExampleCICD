package nz.co.application.example_app.pineapple;

import nz.co.application.example_app.pineapple.domain.lock.LockInterface;
import nz.co.application.example_app.pineapple.domain.lock.LockInterfaceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExampleappApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExampleappApplication.class, args);

		LockInterface lockInterface = new LockInterfaceImpl(10,10);
		lockInterface.printState();

	}

}
