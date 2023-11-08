package by.dorogokupets.cvservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class CvServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CvServiceApplication.class, args);
	}

}
