package com.guerra.tecsup.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guerra.tecsup.dao.LoginDAO;
import com.guerra.tecsup.exception.DAOException;
import com.guerra.tecsup.exception.EmptyResultException;
import com.guerra.tecsup.exception.Throwable;
import com.guerra.tecsup.model.Login;


@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginDAO logindDao;
	
	
	
	
	@Override
	public Login validacion(String username, String password) throws DAOException, EmptyResultException, Throwable {
		Login login=logindDao.login(username, password);
		return login;
	}
	
	
	
}
