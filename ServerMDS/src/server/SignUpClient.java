package server;

import java.io.Serializable;

public class SignUpClient implements Serializable {

	public static final long serialVersionUID = 1L;
	
	private String username;
	private String email;
	private String password;
	private String retypedPassword;
	private String code;
	private String message;
	private String destinationUsername;
	
	
	
	
	public String getUsername() {
		return username;
	}




	public void setUsername(String username) {
		this.username = username;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	public String getRetypedPassword() {
		return retypedPassword;
	}




	public void setRetypedPassword(String retypedPassword) {
		this.retypedPassword = retypedPassword;
	}




	public String getCode() {
		return code;
	}




	public void setCode(String code) {
		this.code = code;
	}




	public String getMessage() {
		return message;
	}




	public void setMessage(String message) {
		this.message = message;
	}




	public String getDestinationUsername() {
		return destinationUsername;
	}




	public void setDestinationUsername(String destinationUsername) {
		this.destinationUsername = destinationUsername;
	}




	public String toString()
	{
		return String.format("(%s %s %s %s)", username, email, password, retypedPassword);
	}
}
