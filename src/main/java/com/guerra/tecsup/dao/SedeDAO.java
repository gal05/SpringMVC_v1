package com.guerra.tecsup.dao;

import java.util.List;

import com.guerra.tecsup.exception.DAOException;
import com.guerra.tecsup.exception.EmptyResultException;
import com.guerra.tecsup.model.Sede;

public interface SedeDAO {
	
	List<Sede>findAllSedes() throws DAOException,EmptyResultException;

}
