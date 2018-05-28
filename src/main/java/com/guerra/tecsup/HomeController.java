package com.guerra.tecsup;

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

	
	
	private Login login=null;
	private String grant_type="password";
	private int client_id=2;
	private String client_secret="q03flHoux0KNekRK0ICtEZ2CjfBTIDwGADx4094Y";
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
	
	
	/*@PostMapping("/login2")
	public ModelAndView login2(@ModelAttribute("SpringWeb") Github github, ModelMap model) {
		logger.info("login()");
		logger.info(github.toString());

		ModelAndView modelAndView = null;
		Login login=null;
		try {
			
			try {
				login=loginService.validacion(github.getUsername(), github.getPassword());
			} catch (com.guerra.tecsup.exception.Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				model.addAttribute("login", "Usuario y/o clave incorrectos");
				modelAndView = new ModelAndView("login", "command", new Github());
			}
			
				logger.info(github.toString());
				modelAndView = new ModelAndView("redirect:/to/menu", "command", github);
				//model.addAttribute("login",login.getAccess_token());
				//modelAndView = new ModelAndView("login", "command", new Login());
			

			//model.addAttribute("login",login.getExpires_in());
			//logger.info(github.toString());
			//modelAndView = new ModelAndView("redirect:/to/menu", "command", github);
			//modelAndView = new ModelAndView("login", "command", new Login());
		} catch (EmptyResultException e) {
			// TODO Auto-generated catch block
			model.addAttribute("login", "Usuario y/o clave incorrectos");
			modelAndView = new ModelAndView("login", "command", new Github());
		} catch (DAOException e) {
			// TODO Auto-generated catch block
			model.addAttribute("login", e.getMessage());
			modelAndView = new ModelAndView("login", "command", new Github());
		}

		return modelAndView;
	}*/
	
	
	@PostMapping("/login")
	public ModelAndView login(@ModelAttribute("SpringWeb") Github github, ModelMap model) {
		logger.info("login()");
		logger.info(github.toString());
		ModelAndView modelAndView = null;
		Login login=null;
		boolean esono;
		
		esono=verificacionLogin(github.getUsername(), github.getPassword());
		if (esono==true) {
			logger.info(github.toString());
			modelAndView = new ModelAndView("redirect:/to/menu", "command", github);
		}else {
			model.addAttribute("login", "Usuario y/o clave incorrectos");
			modelAndView = new ModelAndView("login", "command", new Github());
		}
		return modelAndView;
	}
	
	
	
	
	
	
	
	
	
	

	private boolean verificacionLogin(String username, String password)
	{
		
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
                        autenticado =true;

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
