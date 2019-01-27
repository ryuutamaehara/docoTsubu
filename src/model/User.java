package model;

import java.io.Serializable;

public class User implements Serializable{
	private String name;	//ユーザ名
	private String pass;	//パスワード

	public User(String name,String pass) {
		this.name = name;
		this.pass = pass;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
}
