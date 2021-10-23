package songsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import songsearch.ab_package.A;
import songsearch.ab_package.B;
import songsearch.service.ConcatenateService;

@SpringBootApplication
public class SongSearchServiceApp {

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(SongSearchServiceApp.class);

        ConcatenateService helloWorldService = applicationContext.getBean(ConcatenateService.class);
        helloWorldService.printString();

        B b = new B(applicationContext.getBean(A.class));
    }
}
