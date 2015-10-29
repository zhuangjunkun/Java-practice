package com.web.uesr;

/**
 * User entity. @author MyEclipse Persistence Tools
 */
public class User extends AbstractUser implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public User() {
	}

	/** full constructor */
	public User(String username, String loginname, String password, String sex) {
		super(username, loginname, password, sex);
	}

}
