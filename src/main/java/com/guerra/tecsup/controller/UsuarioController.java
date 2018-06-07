package com.guerra.tecsup.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.guerra.tecsup.model.Usuario;
import com.guerra.tecsup.services.ApiService;
import com.guerra.tecsup.services.ApiServiceGenerator;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

@Controller
public class UsuarioController {
	
private static final Logger logger = LoggerFactory.getLogger(UsuarioController.class);
	
	List<Usuario> usuarios=null;
	
	@GetMapping("/to/list/usuarios")
	public String listUsuarios(@ModelAttribute("SpringWeb") Usuario usuarios, ModelMap model) {
		
		model.addAttribute("usuarios",listarUsuarios());

		return "usuario/UsuarioList";
	}
	
	
	
	private List<Usuario> listarUsuarios()
	{
		
		ApiService service = ApiServiceGenerator.createService(ApiService.class);

        Call<List<Usuario>> call = service.getUsuarios();

        call.enqueue(new Callback<List<Usuario>>() {
            @Override
            public void onResponse(Call<List<Usuario>> call, Response<List<Usuario>> response) {
                try {

                    int statusCode = response.code();
                    System.out.println("HTTP status code: " + statusCode);

                    if (response.isSuccessful()) {

                        usuarios = response.body();
                        System.out.println("usuarios: " + usuarios);

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
            public void onFailure(Call<List<Usuario>> call, Throwable t) {
            	System.out.println(t.toString());
                System.out.println( t.getMessage());
            }

        });
	
		return  usuarios;
	}	
	
}
