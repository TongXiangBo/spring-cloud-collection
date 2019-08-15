package com.example.springcloudconsulprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudConsulProviderApplication2 {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConsulProviderApplication2.class, args);
	}

}
