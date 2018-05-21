package com.guerra.tecsup.services;

import retrofit2.Retrofit;

public final class ApiServiceGenerator {

	
	private static Retrofit retrofit;
	
    public static <S> S createService(Class<S> serviceClass) {
        if(retrofit == null) {


        }
        return retrofit.create(serviceClass);
    }
}
