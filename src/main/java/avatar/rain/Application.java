package avatar.rain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// @EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
@ComponentScan
public class Application {

    //启动服务时，开启debug日志模式：java -jar xxx.jar --debug
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}
