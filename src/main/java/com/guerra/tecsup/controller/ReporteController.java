package com.guerra.tecsup.controller;

import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.guerra.tecsup.model.Reporte;
import com.guerra.tecsup.model.Respuesta;
import com.guerra.tecsup.services.ApiService;
import com.guerra.tecsup.services.ApiServiceGenerator;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

@Controller
public class ReporteController {

	private static final Logger logger = LoggerFactory.getLogger(ReporteController.class);
	
	List<Reporte> reportes=null;
	Respuesta respuesta=null;
	
	
	@GetMapping("/to/list/reportes")
	public String listReportes(@ModelAttribute("SpringWeb") Reporte reportes, ModelMap model) {
		model.addAttribute("reportes",listarReportes());

		return "reporte/reporteList";
	}
	
	
	@GetMapping("/to/list/reportes/editar/{id}")
	public String editReportes(@ModelAttribute("SpringWeb") Respuesta respuesta, ModelMap model) {
		model.addAttribute("reportes",editarReportes());

		return "reporte/reporteList";
	}
	
	private List<Reporte> listarReportes()
	{
		
		ApiService service = ApiServiceGenerator.createService(ApiService.class);

        Call<List<Reporte>> call = service.getReportes();

        call.enqueue(new Callback<List<Reporte>>() {
            @Override
            public void onResponse(Call<List<Reporte>> call, Response<List<Reporte>> response) {
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
            public void onFailure(Call<List<Reporte>> call, Throwable t) {
            	System.out.println(t.toString());
                System.out.println( t.getMessage());
            }

        });
	
		return  reportes;
	}
	

	private Respuesta editarReportes()
	{
		
		ApiService service = ApiServiceGenerator.createService(ApiService.class);

       int id = 0;
	Call<Respuesta> call = service.postRespuesta(id);

       call.enqueue(new Callback <Respuesta>() {
           @Override
           public void onResponse(Call<Respuesta> call, Response<Respuesta> response) {
               try {

                   int statusCode = response.code();
                   System.out.println("HTTP status code: " + statusCode);

                   if (response.isSuccessful()) {

                       respuesta = response.body();
                       System.out.println("respuesta: " + respuesta);

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
           public void onFailure(Call<Respuesta> call, Throwable t) {
           	System.out.println(t.toString());
               System.out.println( t.getMessage());
           }

       });
	
		return  respuesta;
	}
	
	
}
