package pureblog.business;

import pureblog.model.User;

public interface UserService {
	public User findByUsername(String username);
}
