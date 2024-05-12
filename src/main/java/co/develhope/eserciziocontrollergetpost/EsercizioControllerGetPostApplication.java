package co.develhope.eserciziocontrollergetpost;

import co.develhope.controllers.NameController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = NameController.class)
public class EsercizioControllerGetPostApplication {

	public static void main(String[] args) {
		SpringApplication.run(EsercizioControllerGetPostApplication.class, args);
	}

}
