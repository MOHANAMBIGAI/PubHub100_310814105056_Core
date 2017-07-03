package com.bookapp.dao;

import com.revature.User;

public class TestUserDAO {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		User user=new User();
		user.setName("mona");
		user.setEmail_id("mohana@gmail.com");
		user.setPassword("pass");
		user.setActive(0);
		
		User dao=new User();
		try {
			dao.register(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
			// TODO Auto-generated method stub

		}

	

		// TODO Auto-generated method stub

	}


