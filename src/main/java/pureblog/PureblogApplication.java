package pureblog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

import pureblog.model.User;
import pureblog.repository.UserRepository;

@SpringBootApplication
public class PureblogApplication extends SpringBootServletInitializer {
	
	@Autowired
	UserRepository repository;
	 
    public static void main(String[] args) {
        SpringApplication.run(PureblogApplication.class, args);
    }
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(PureblogApplication.class);
    }

}
