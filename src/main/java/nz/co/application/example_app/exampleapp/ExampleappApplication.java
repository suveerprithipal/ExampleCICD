package nz.co.application.example_app.exampleapp;

import nz.co.application.example_app.exampleapp.domain.lock.MyLockClassInterface;
import nz.co.application.example_app.exampleapp.domain.lock.MyLockClassInterfaceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExampleappApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExampleappApplication.class, args);

		MyLockClassInterface myLockClassInterface = new MyLockClassInterfaceImpl(10,10);
		myLockClassInterface.printState();

	}

}
