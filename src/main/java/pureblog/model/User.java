package pureblog.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;

public class User {

	@Id
	private String id;
	private String username;
	private String password;
	private List<String> role;
	
	public User(String username, String password,List<String> role) {
		super();
		this.username = username;
		this.password = password;
		this.role = role;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Collection<? extends GrantedAuthority> getRole() {
		Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		for (String r : role) {
			authorities.add(new GrantedAuthorityImpl(r));
		}
		return authorities;
	}
	public void setRole(List<String> role) {
		this.role = role;
	}
}
