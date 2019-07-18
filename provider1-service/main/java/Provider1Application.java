import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author BryanChan
 * @Date 2019/7/4 18:04
 * @CreatedFor CRCBank
 * @Version 1.0
 */


@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages = {Provider1Application.PACKAGE_PATH})
public class Provider1Application {

    public static final String PACKAGE_PATH = "com.example.provider1";

    public static void main(String[] args) {
        SpringApplication.run(Provider1Application.class, args);
    }
}
