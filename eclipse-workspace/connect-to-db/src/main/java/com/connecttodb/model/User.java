package com.connecttodb.model;

public class User {
	private String Id;
	private String Email;
	private String Pass;
	private String Fullname;
	private String Phone;

	public User() {
		super();
	}

	public User(String id, String email, String pass, String fullname, String phone) {
		super();
		Id = id;
		Email = email;
		Pass = pass;
		Fullname = fullname;
		Phone = phone;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPass() {
		return Pass;
	}

	public void setPass(String pass) {
		Pass = pass;
	}

	public String getFullname() {
		return Fullname;
	}

	public void setFullname(String fullname) {
		Fullname = fullname;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	@Override
	public String toString() {
		return "[Id :" + Id + "] - " + "[Email=" + Email + "] - " + "[ Pass=" + Pass + "] - " + "[ name=" + Fullname
				+ "] - " + "[ Phone=" + Phone + "]";
	}

}
