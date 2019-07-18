import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author BryanChan
 * @Date 2019/7/4 18:04
 * @CreatedFor CRCBank
 * @Version 1.0
 */


@SpringBootApplication
@EnableEurekaServer
@ComponentScan(basePackages = {EurekaApplication.PACKAGE_PATH})
public class EurekaApplication{

    public static final String PACKAGE_PATH = "com.example.eureka";

    public static void main(String[] args){
        SpringApplication.run(EurekaApplication.class,args);
    }
}
