package pureblog.business.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pureblog.business.UserService;
import pureblog.model.User;
import pureblog.repository.UserRepository;

@Service
public class UserServiceImp implements UserService{
	
	@Autowired
	private UserRepository repository;

	public UserRepository getRepository() {
		return repository;
	}

	public void setRepository(UserRepository repository) {
		this.repository = repository;
	}
	
	public User findByUsername(String username){
		return repository.findByUsername(username);
	}
	
	
}
