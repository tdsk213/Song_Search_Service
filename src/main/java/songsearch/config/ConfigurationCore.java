package songsearch.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import songsearch.ab_package.A;
import songsearch.service.HelloService;
import songsearch.service.impl.HelloServiceImpl;

@Configuration
public class ConfigurationCore {

    @Bean
    public HelloService helloService() {

        return new HelloServiceImpl();
    }

    @Bean
    public A a() {
        return new A();
    }
}
