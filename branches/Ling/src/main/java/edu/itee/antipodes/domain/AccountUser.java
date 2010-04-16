package edu.itee.antipodes.domain;
import java.io.Serializable;


/**
 * A persistence class that stores user login details from the User table in DB. 
 *
 */
public class AccountUser {
	private int userID;
	private String userName;
	private String password;
	private String userType;
	
	private TourOperator operator;
	
	public AccountUser(){}
	
	public int getUserID(){
		return userID;
	}
	private void setUserID(int userID){
		this.userID=userID;
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
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	
	
	
	public TourOperator getOperator() {
		return operator;
	}
	public void setOperator(TourOperator operator) {
		this.operator = operator;
	}

	@Override
	public String toString() {
		return "AccountUser [operator=" + operator + ", password=" + password
				+ ", userID=" + userID + ", userName=" + userName
				+ ", userType=" + userType + "]";
	}
	
}
