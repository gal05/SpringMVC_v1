package com.guerra.tecsup.daoRetrofit;

import java.util.List;

import com.guerra.tecsup.dao2.SedeDAO;
import com.guerra.tecsup.exception.DAOException;
import com.guerra.tecsup.exception.EmptyResultException;
import com.guerra.tecsup.model.Login;
import com.guerra.tecsup.model.Sede;
import com.guerra.tecsup.services.ApiService;
import com.guerra.tecsup.services.ApiServiceGenerator;

import retrofit2.Call;

public class SedeDAOImpl  implements SedeDAO{

	@Override
	public List<Sede> findAllSedes() throws DAOException, EmptyResultException {
		ApiService apiService=ApiServiceGenerator.createService(ApiService.class);
		
		 Call<List<Sede>> call = apiService.getSedes();
	return (List<Sede>) call;
	}

}
