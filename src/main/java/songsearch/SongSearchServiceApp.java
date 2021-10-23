package songsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SongSearchServiceApp {

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(SongSearchServiceApp.class);
    }
}
