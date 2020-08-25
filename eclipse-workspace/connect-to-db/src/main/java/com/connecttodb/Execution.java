package com.connecttodb;

import java.util.List;

import com.connecttodb.model.Category;
import com.connecttodb.model.User;

public class Execution {

	public static void main(String[] args) {
		ConnectMysqlExample mysql = new ConnectMysqlExample();
//		mysql.addCategory(new Category("c2", "Food2"));
		
//		List<Category> categories= mysql.getCategory();
//		categories.forEach(category->System.out.println(category));
		
//		List<User> users = mysql.getUsers();
//		users.forEach(user->System.out.println(user));
		
//		mysql.updateCateggory();
		
		mysql.deleteCategory();
	}
}
