package com.guerra.tecsup.services;

import java.util.List;

import com.guerra.tecsup.model.Github;
import com.guerra.tecsup.model.InfoUser;
import com.guerra.tecsup.model.Login;
import com.guerra.tecsup.model.LoginOne;
import com.guerra.tecsup.model.Reporte;
import com.guerra.tecsup.model.Sede;
import com.guerra.tecsup.model.Usuario;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {
	
		
  String API_BASE_URL = "https://pi4-v2-larav-pass-excel-api-gal05.c9users.io";
//	String API_BASE_URL = "https://api.github.com";

    @GET("api/sede")
    Call<List<Sede>> getSedes();

    @GET("api/reporte")
    Call<List<Reporte>> getReportes();
    
    @GET("api/listarUsuario")
    Call<List<Usuario>> getUsuarios();
    
    
    @FormUrlEncoded
    @PUT("/posts/{id}")
    Call<Reporte> updateReportes(@Path("id") int id,
                          @Field("user_id") int user_id,
                          @Field("maquinaria_id") String maquinaria_id,
                          @Field("aula_id") int aula_id,
    					  @Field("observacion") String observacion,
    					  @Field("estadorep") String estadorep,
    					  @Field("imagen") String imagen,
    					  @Field("fecha") String fecha,
    					  @Field("hora") String hora);
    
    @FormUrlEncoded
    @POST("oauth/token")
    Call<Login> login(@Field("username") String username,
                                        @Field("password") String password,
                                        @Field("grant_type") String grant_type,
                                        @Field("client_id") int client_id,
    									@Field("client_secret") String client_secret);
    
    
    @FormUrlEncoded
    @POST("api/login")
    Call<Login> login2(@Field("username") String username,
                                        @Field("password") String password,
                                        @Field("grant_type") String grant_type,
                                        @Field("client_id") int client_id,
    									@Field("client_secret") String client_secret);
    
    @FormUrlEncoded
    @POST("api/findUser")
    Call<List<InfoUser>> finduser(@Field("id") int id);
    
    
    
}
