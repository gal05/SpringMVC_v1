package com.guerra.tecsup.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.guerra.tecsup.model.Empleado;
import com.guerra.tecsup.model.Sede;


@Controller
public class InicioController {

	
	private static final Logger logger = LoggerFactory.getLogger(InicioController.class);	
	@GetMapping("/to/menu")
	public String list(@ModelAttribute("SpringWeb") Sede sedes, ModelMap model) {

		try {
			//model.addAttribute("employees", employeeService.findAll());
		} catch (Exception e) {
			logger.info(e.getMessage());
			model.addAttribute("message", e.getMessage());
		}

		return "menu";
	}
}
