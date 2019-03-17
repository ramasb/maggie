package com.maggie.schedule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * The Class ScheduleProjectApplication.
 */
@SpringBootApplication
@EntityScan(basePackageClasses=ScheduleProjectApplication.class)
@ComponentScan(basePackageClasses=ScheduleProjectApplication.class)
@EnableJpaRepositories(basePackages = "com.maggie.schedule.dao.repository")
@EnableAutoConfiguration
public class ScheduleProjectApplication {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(ScheduleProjectApplication.class, args);
	}

}
