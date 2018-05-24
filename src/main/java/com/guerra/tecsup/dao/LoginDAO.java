package com.guerra.tecsup.dao;

import java.util.List;

import com.guerra.tecsup.exception.DAOException;
import com.guerra.tecsup.exception.EmptyResultException;
import com.guerra.tecsup.exception.Throwable;
import com.guerra.tecsup.model.Login;

public interface LoginDAO {

	
	Login login(String username, String password) throws DAOException, EmptyResultException,Throwable;
}
