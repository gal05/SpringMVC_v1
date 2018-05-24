package com.guerra.tecsup.dao.retrofit;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.guerra.tecsup.dao.SedeDAO;
import com.guerra.tecsup.exception.DAOException;
import com.guerra.tecsup.exception.EmptyResultException;
import com.guerra.tecsup.model.Sede;



@Repository
public class SedeDAOImpl implements SedeDAO {

	@Override
	public List<Sede> findAllSedes() throws DAOException, EmptyResultException {
		// TODO Auto-generated method stub
		return null;
	}

}
