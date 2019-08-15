package com.example.springcloudconsulcustomer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudConsulCustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConsulCustomerApplication.class, args);
	}

}
