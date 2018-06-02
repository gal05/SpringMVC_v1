package com.guerra.tecsup.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;


import com.guerra.tecsup.model.Reportes_v2;

import com.guerra.tecsup.services.ApiService;
import com.guerra.tecsup.services.ApiServiceGenerator;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

@Controller
public class ReporteController {

	private static final Logger logger = LoggerFactory.getLogger(ReporteController.class);
	
	List<Reportes_v2> reportes=null;
	
	@GetMapping("/to/list/reportes")
	public String listReportes(@ModelAttribute("SpringWeb") Reportes_v2 reportes, ModelMap model) {
		
		//model.addAttribute("sedes", listarSedes());
		//model.addAttribute("infoUser", infoUser(HomeController.idusurio));
		model.addAttribute("reportes",listarReportes());

		return "reporte/reporteList";
	}
	
	
	
	private List<Reportes_v2> listarReportes()
	{
		
		ApiService service = ApiServiceGenerator.createService(ApiService.class);

        Call<List<Reportes_v2>> call = service.getReportes_v2();

        call.enqueue(new Callback<List<Reportes_v2>>() {
            @Override
            public void onResponse(Call<List<Reportes_v2>> call, Response<List<Reportes_v2>> response) {
                try {

                    int statusCode = response.code();
                    System.out.println("HTTP status code: " + statusCode);

                    if (response.isSuccessful()) {

                        reportes = response.body();
                        System.out.println("reportes: " + reportes);

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
            public void onFailure(Call<List<Reportes_v2>> call, Throwable t) {
            	System.out.println(t.toString());
                System.out.println( t.getMessage());
            }

        });
	
		return  reportes;
	}	
	
	
}
