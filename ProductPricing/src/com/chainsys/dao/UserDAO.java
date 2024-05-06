package com.chainsys.dao;

import java.sql.SQLException;

import com.chainsys.model.User1;

public interface UserDAO {
	void Register (User1 u) throws ClassNotFoundException, SQLException;
	void login(User1 u) throws ClassNotFoundException, SQLException;
}
