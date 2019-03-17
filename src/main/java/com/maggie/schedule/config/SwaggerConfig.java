package com.maggie.schedule.config;

import java.util.Collections;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.annotation.AuthenticationPrincipal;

import com.maggie.schedule.controller.MemberSchedulingController;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * The Class SwaggerConfig.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
	private static Logger logger = LoggerFactory.getLogger(SwaggerConfig.class);

	/**
	 * Api.
	 *
	 * @return the docket
	 */
	@Bean
	public Docket api() {
		String basePackage = MemberSchedulingController.class.getPackage().toString().replaceAll("package ", "");
		logger.info("Swagger Base Package : " + basePackage);
		return new Docket(DocumentationType.SWAGGER_2).ignoredParameterTypes(AuthenticationPrincipal.class).select().apis(RequestHandlerSelectors.basePackage(basePackage))
				.paths(PathSelectors.regex(".*/*")).build().apiInfo(apiInfo());
	}

	/**
	 * Api info.
	 *
	 * @return the api info
	 */
	private ApiInfo apiInfo() {

		return new ApiInfo("Scheduling REST API", "Scheduling for members API.", "API SCHEDULE", "Terms of service",
				new Contact("Yogeshwar", "www.magbog.com", "maggie@magbog.com"), "License of API", "API license URL",
				Collections.emptyList());
	}
}