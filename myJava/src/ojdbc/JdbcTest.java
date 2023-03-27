package ojdbc;

public class JdbcTest {
	
	private String username;
	private String email;
	
	public JdbcTest(String username, String email) {
		this.username = username;
		this.email = email;
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public String getEmail() {
		return this.email;
	}
}
