package gaohwangh.config;

import gaohwangh.model.GaohWanghModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: GH
 * @Date: 2019/12/2 1:07
 * @Version 1.0
 */
@Configuration
@ComponentScan("gaohwangh")
public class Config {
	@Bean
	public GaohWanghModel getGaohWanghModel() {
		return new GaohWanghModel();
	}
}
