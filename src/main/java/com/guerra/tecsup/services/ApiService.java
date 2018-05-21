package com.guerra.tecsup.services;

import java.util.List;

import com.guerra.tecsup.model.Login;
import com.guerra.tecsup.model.Sede;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
	
		
    String API_BASE_URL = "https://pi4-v2-larav-pass-excel-api-gal05.c9users.io";

    @GET("api/sede")
    Call<List<Sede>> getSedes();
    
    
    
    

    
    
    
}
