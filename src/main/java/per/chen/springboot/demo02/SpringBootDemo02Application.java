package per.chen.springboot.demo02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SpringBootDemo02Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemo02Application.class, args);
    }

}
