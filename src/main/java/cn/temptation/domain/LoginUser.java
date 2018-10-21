package cn.temptation.domain;

public class LoginUser {
	private int userId;
	private String userName;
	private String password;
	
	@Override
	public String toString() {  
        return "User [id=" + userId + ", password=" + password + ", userName=" + userName  
                + "]";  
    } 
	
	LoginUser() {
		super();
	}
	
	LoginUser(int userId, String userName, String password) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
