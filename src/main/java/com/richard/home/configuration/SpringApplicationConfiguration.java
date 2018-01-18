package com.richard.home.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.richard.home.domain.Player;

@Configuration
public class SpringApplicationConfiguration {
	
	@Bean
	public Player richard(){
		Player richard = new Player();
		richard.setName("richard");
		richard.setAlter(25);
		return richard;
	}
	
//	@Bean(name="toni")
//	public Player toni(String name, int alter){
//		return new Player(name, alter);
//	}
}
