package pureblog;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

import pureblog.model.Post;
import pureblog.model.User;
import pureblog.repository.PostRepository;
import pureblog.repository.UserRepository;

@SpringBootApplication
public class PureblogApplication implements CommandLineRunner {
	
	@Autowired
	UserRepository repository;
	
	@Autowired
	PostRepository postRepository;
	 
    public static void main(String[] args) {
        SpringApplication.run(PureblogApplication.class, args);
    }
	@Override
	public void run(String... arg0) throws Exception {
		postRepository.deleteAll();
		Post post =  new Post("Bu bir makaledir", "Genel", new Date());
		postRepository.save(post);
		
	}

}
