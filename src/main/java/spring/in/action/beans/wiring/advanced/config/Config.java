package spring.in.action.beans.wiring.advanced.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import spring.in.action.beans.wiring.advanced.model.BlankDisc;

@Configuration
@PropertySource("app.properties")
public class Config {

	@Autowired
	Environment env;
	
	@Bean
	public BlankDisc disc() {
		return new BlankDisc(env.getProperty("disc.title"), env.getProperty("disc.artist"));
		
	}
}
