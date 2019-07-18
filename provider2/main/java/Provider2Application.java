import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author BryanChan
 * @Date 2019/7/12 10:39
 * @CreatedFor CRCBank
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages = {Provider2Application.PACKAGE_PATH})
public class Provider2Application {

    public static final String PACKAGE_PATH = "com.example.provider2";

    public static void main(String[] args){
        SpringApplication.run(Provider2Application.class,args);
    }

}
