package com.zcc.code.entity;

/**
 * @author zhaocc
 * @time Jun 8, 201810:04:21 AM
 * @parent
 */
public class User {

	private Integer userId;
	private String userName;
	private String userPassword;

	public Integer getUserId() {

		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserFromString() {
		return "用户ID：" + this.getUserId() + " 用户名：" + this.getUserName() + " 用户密码：" + this.getUserPassword();
	}
}