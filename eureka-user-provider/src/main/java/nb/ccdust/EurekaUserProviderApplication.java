package nb.ccdust;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaUserProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaUserProviderApplication.class, args);
	}
}
