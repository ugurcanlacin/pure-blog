package pureblog.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import pureblog.model.User;

public interface UserRepository extends MongoRepository<User, String>{
	public User findByUsernameAndPassword(String username,String password);
	public User findByUsername(String username);
}
