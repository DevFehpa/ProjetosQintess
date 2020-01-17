package br.com.resource.webapp.alocados.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.resource.webapp.alocados.dao.DaoFormulario;
import br.com.resource.webapp.alocados.entity.Formulario;

@Controller
@RequestMapping("/index/formulario")
public class FormularioController {

	@Autowired
	private DaoFormulario daoFormulario;
	

	public String carregaFormulario(Model model) {
		model.addAttribute("formulario", new Formulario());
		return "Formulario";
	}

	@RequestMapping(value = "/cadastroForm", method = RequestMethod.GET)
	public String salvaFormulario() {
		return "formulario";
	}

	@PostMapping(value = "/cadastroForm")
	public String salvaFormulario(@ModelAttribute("formulario") Formulario formulario) {

		daoFormulario.save(formulario);

		return "redirect:/index/formulario/cadastroForm";
	}

}
