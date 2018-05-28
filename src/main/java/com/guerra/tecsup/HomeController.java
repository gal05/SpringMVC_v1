package com.guerra.tecsup;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.guerra.tecsup.exception.DAOException;
import com.guerra.tecsup.exception.EmptyResultException;
import com.guerra.tecsup.model.Github;
import com.guerra.tecsup.model.Login;
import com.guerra.tecsup.model.LoginOne;
import com.guerra.tecsup.model.Sede;
import com.guerra.tecsup.services.ApiService;
import com.guerra.tecsup.services.ApiServiceGenerator;
import com.guerra.tecsup.services.LoginService;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	public static int idusurio;
	
	private Login login=null;
	
	
	private String grant_type="password";
	private int client_id=2;
	private String client_secret="gBd87ZSFdOvjM1WWQn3bYkrIkfKywk6z2FBhEvJr";
	private boolean autenticado=false;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private LoginService loginService;
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome to Spring hell", locale);
		
		/**Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		**/
		//initialize();
		return "login/login3";
	}
	

	
	
	@PostMapping("/login")
	public ModelAndView login(@ModelAttribute("SpringWeb") Github github, ModelMap model) {
		logger.info("login()");
		logger.info(github.toString());
		ModelAndView modelAndView = null;
		//Login login=null;
		boolean esono = false;
		
		try {
			esono=verificacionLogin(github.getUsername(), github.getPassword());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (esono==true) {
			logger.info(github.toString());
			idusurio=login.getId();
			//System.out.println("puto login"+login.getId());
			//model.addAttribute("login", "dudasdasd");
			modelAndView = new ModelAndView("redirect:/to/menu", "command", github);
		}else {
			model.addAttribute("login", "Usuario y/o clave incorrectos");
			modelAndView = new ModelAndView("login/login3", "command", new Github());
		}
		return modelAndView;
	}
	
	
	

	private boolean verificacionLogin(String username, String password) throws Exception
	{
		Response<Login> response=null;
		ApiService service = ApiServiceGenerator.createService(ApiService.class);

	 	
        Call<Login> call = service.login2(username, password, grant_type, client_id, client_secret);
        
        try {
			response=call.execute();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        if (response.isSuccessful()) {

            login =  response.body();
            System.out.println("Login from DAO " + login);
            autenticado =true;

        } else {
            System.out.println( "onError: " + response.errorBody().string());
            throw new Exception("Error en el servicio");
            
        }
        return autenticado;
	}
	
	
	
	
	
	
	
	
	 private void initialize() {

	        ApiService service = ApiServiceGenerator.createService(ApiService.class);

	        Call<List<Sede>> call = service.getSedes();

	        call.enqueue(new Callback<List<Sede>>() {
	            @Override
	            public void onResponse(Call<List<Sede>> call, Response<List<Sede>> response) {
	                try {

	                    int statusCode = response.code();
	                    System.out.println("HTTP status code: " + statusCode);

	                    if (response.isSuccessful()) {

	                        List<Sede> productos = response.body();
	                        System.out.println("productos: " + productos);

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
	            public void onFailure(Call<List<Sede>> call, Throwable t) {
	                System.out.println("onFailure: " + t.toString());
	            }

	        });
	    }
	
	
}
