package dev.andrei.fueltrack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class FueltrackApplication {

	public static void main(String[] args) {
		SpringApplication.run(FueltrackApplication.class, args);
	}

}
