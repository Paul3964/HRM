package entity;

public class User {
private String username;
private String password;
private String position;
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
public String getPosition() {
	return position;
}
public void setPosition(String position) {
	this.position = position;
}
public User(String username, String password, String position) {
	super();
	this.username = username;
	this.password = password;
	this.position = position;
}
public User() {
	super();
}

}
