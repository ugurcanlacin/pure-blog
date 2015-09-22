package pureblog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import pureblog.model.User;
import pureblog.repository.UserRepository;

@SpringBootApplication
public class PureblogApplication {
	
    public static void main(String[] args) {
        SpringApplication.run(PureblogApplication.class, args);
    }
}
