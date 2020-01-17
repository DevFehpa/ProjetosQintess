package br.com.resource.webapp.alocados.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/formulario")
	public String index() {
		return "formulario";
	}

}
