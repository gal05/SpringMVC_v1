package com.guerra.tecsup.services;

import java.util.List;

import com.guerra.tecsup.model.Github;
import com.guerra.tecsup.model.Login;
import com.guerra.tecsup.model.Sede;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {
	
		
  String API_BASE_URL = "https://pi4-v2-larav-pass-excel-api-gal05.c9users.io";
//	String API_BASE_URL = "https://api.github.com";

    @GET("api/sede")
    Call<List<Sede>> getSedes();
    
    
    
    

    

    
    
    
}
