package com.guerra.tecsup.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.guerra.tecsup.model.Empleado;
import com.guerra.tecsup.model.Sede;
import com.guerra.tecsup.services.ApiService;
import com.guerra.tecsup.services.ApiServiceGenerator;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Call;


@Controller
public class InicioController {

	List<Sede>sedes=null;
	private static final Logger logger = LoggerFactory.getLogger(InicioController.class);	
	@GetMapping("/to/menu")
	public String list(@ModelAttribute("SpringWeb") Sede sedes, ModelMap model) {
		
		//model.addAttribute("sedes", listarSedes());
		

		return "menu";
	}
	

	private List<Sede> listarSedes()
	{
		
		ApiService service = ApiServiceGenerator.createService(ApiService.class);

        Call<List<Sede>> call = service.getSedes();

        call.enqueue(new Callback<List<Sede>>() {
            @Override
            public void onResponse(Call<List<Sede>> call, Response<List<Sede>> response) {
                try {

                    int statusCode = response.code();
                    System.out.println("HTTP status code: " + statusCode);

                    if (response.isSuccessful()) {

                        sedes = response.body();
                        System.out.println("productos: " + sedes);

                    } else {
                        System.out.println("onError: " + response.errorBody().string());
                        throw new Exception("Error en el servicio");
                    }

                } catch (Throwable t) {
                    try {
                        System.out.println("onThrowable: " + t.toString());
                        System.out.println(t.getMessage());
                    }catch (Throwable x){}
                }
            }

            @Override
            public void onFailure(Call<List<Sede>> call, Throwable t) {
            	System.out.println(t.toString());
                System.out.println( t.getMessage());
            }

        });
	
		return  sedes;
	}	
	
}








