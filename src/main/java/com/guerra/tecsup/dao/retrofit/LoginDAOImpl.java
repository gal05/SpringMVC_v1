package com.guerra.tecsup.dao.retrofit;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.ModelAndView;

import com.guerra.tecsup.dao.LoginDAO;
import com.guerra.tecsup.exception.DAOException;
import com.guerra.tecsup.exception.EmptyResultException;
import com.guerra.tecsup.model.Github;
import com.guerra.tecsup.model.Login;
import com.guerra.tecsup.services.ApiService;
import com.guerra.tecsup.services.ApiServiceGenerator;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

@Repository
public class LoginDAOImpl  implements LoginDAO{
	private static String grant_type="password";
	private static int client_id=2;
	private static String client_secret="q03flHoux0KNekRK0ICtEZ2CjfBTIDwGADx4094Y";
	Login login=null;
	
	
	@Override
	public Login login(String username, String password) throws DAOException, EmptyResultException {
		 ApiService service = ApiServiceGenerator.createService(ApiService.class);

		 	
	        Call<Login> call = service.login(username, password, grant_type, client_id, client_secret);

	        call.enqueue(new Callback<Login>() {
	            @Override
	            public void onResponse(Call<Login> call, Response<Login> response) {
	            	
	                try {

	                    int statusCode = response.code();
	                    System.out.println("HTTP status code: " + statusCode);

	                    if (response.isSuccessful()) {

	                        login = response.body();
	                        System.out.println("Login from DAO " + login);
	                       

	                    } else {
	                        System.out.println( "onError: " + response.errorBody().string());
	                        throw new Exception("Error en el servicio");
	                        
	                    }

	                } catch (Throwable t) {
	                    try {
	                        System.out.println("onThrowable: " + t.toString());
	                        
	                    }catch (Throwable x){}
	                }
	            }

	            @Override
	            public void onFailure(Call<Login> call, Throwable t) {
	                System.out.println("onFailure: " + t.toString());
	            }

	        });
		return login;
	}



}
