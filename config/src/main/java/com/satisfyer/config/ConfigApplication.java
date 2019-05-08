package com.satisfyer.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
/**
 * ConfigApplication class plays the central config server's role
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigApplication {
	/**
	 * This method is the config application entry point
	 * @param args command line parameters
	 */
	public static void main(String[] args) {
		SpringApplication.run(ConfigApplication.class, args);
	}

}

