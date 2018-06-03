package com.guerra.tecsup.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;


@Controller
public class EstadisticaController {
	private static final Logger logger = LoggerFactory.getLogger(ReporteController.class);

	
	@GetMapping("/to/menu/estadistica")
	public String estadisticaMenu(@ModelAttribute("SpringWeb") String reportes, ModelMap model) {
		

		return "estadisticas/menu_estd";
	}
	
	@GetMapping("/to/menu/estadistica/reportxdias")
	public String reportxdias(@ModelAttribute("SpringWeb") String reportes, ModelMap model) {
		

		return "estadisticas/reporxdias";
	}	
}
