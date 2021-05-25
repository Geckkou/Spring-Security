package azure.spring.cloud.apigateways;

import azure.spring.cloud.apigateways.data.UserData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class ApiGatewaysJwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewaysJwtApplication.class, args);
	}

	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder(){
		return new BCryptPasswordEncoder();
	}
}
