package com.guerra.tecsup.services;

import java.util.List;

import com.guerra.tecsup.exception.DAOException;
import com.guerra.tecsup.exception.EmptyResultException;
import com.guerra.tecsup.exception.Throwable;
import com.guerra.tecsup.model.Login;

public interface LoginService {
	
	 Login validacion(String username, String password)throws DAOException, EmptyResultException, Throwable;

}
