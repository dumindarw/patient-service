package org.drw.ps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@NativeHint(trigger = FlywayAutoConfiguration.class)
//@NativeHint(trigger = JdbcTemplateAutoConfiguration.class)
public class PatientServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatientServiceApplication.class, args);
	}

}
