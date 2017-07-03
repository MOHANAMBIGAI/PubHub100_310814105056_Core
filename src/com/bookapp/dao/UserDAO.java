package com.bookapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.revature.User;
import com.revature.connectionUtil;

public class UserDAO {
	@SuppressWarnings("null")
	void register(User user) throws Exception {
    Connection connection=connectionUtil.getConnection();
    
    
    connection.prepareStatement("insert into users(name,email,password,active)values(?,?,?,?)");
    
    PreparedStatement pst = null;
	pst.setString(1,user.getName());
    pst.setString(2,user.getEmail_id());
    pst.setString(3,user.getPassword());
    pst.setInt(4,user.getActive());
	
	
    
    pst.executeUpdate();
    
    }

}
