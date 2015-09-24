package pureblog.securityconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.AbstractUserDetailsAuthenticationProvider;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import pureblog.model.User;
import pureblog.repository.UserRepository;

@Service
public class MongoDBAuthenticationProvider extends
		AbstractUserDetailsAuthenticationProvider {

	@Autowired
	UserRepository repository;

	@Override
	protected void additionalAuthenticationChecks(UserDetails arg0,
			UsernamePasswordAuthenticationToken arg1)
			throws AuthenticationException {
	}

	@Override
	protected UserDetails retrieveUser(String username,
			UsernamePasswordAuthenticationToken authentication)
			throws AuthenticationException {
		UserDetails loadedUser = null;
		try {
			User searchedUser = repository.findByUsername(username);
			loadedUser = new org.springframework.security.core.userdetails.User(
					searchedUser.getUsername(), searchedUser.getPassword(),searchedUser.getRole());
		} catch (Exception e) {
		}
		return loadedUser;
	}

}
