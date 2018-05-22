package com.guerra.tecsup;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.guerra.tecsup.model.Sede;
import com.guerra.tecsup.services.ApiService;
import com.guerra.tecsup.services.ApiServiceGenerator;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
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
		initialize();
		return "login";
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
