package com.modelo03.DESAFIO.CRUD.de.clientes.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**") // Permite todas as rotas
						.allowedOrigins("http://localhost:4200", "https://crud-front-4why2ln1o-luans-projects-002dcac7.vercel.app") // Permite o domínio do front-end (Angular, por
																	// exemplo)
						.allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Métodos permitidos
						.allowedHeaders("*") // Permite todos os headers
						.allowCredentials(true); // Permite envio de cookies/sessão
			}
		};
	}
}