package com.unla.grupo13OO22023.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.unla.grupo13OO22023.helpers.ViewRouteHelper;
import com.unla.grupo13OO22023.services.IDispositivoService;

@Controller
@RequestMapping("/dispositivo")
public class DispositivoController {
	@Autowired
	@Qualifier("dispositivoService")
	private IDispositivoService dispositivoService;

	private ModelMapper modelMapper = new ModelMapper();

//	@GetMapping("lista")
//	public String listaDisposotivos() {
//		return "ListaDispositivos";
//	}
//	@GetMapping("/agregardispositivo")
//    public String agregarDispositvo(/*Model model*/) {
//        //Employee employee = new Employee(); //implementacion logica luego
//        //model.addAttribute("employee", employee);
//        return "AgregarDispositivo";
//    }
	@GetMapping("")
	public ModelAndView lista() {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.DISPOSITIVO_LISTA);
		mAV.addObject("dispositivos", dispositivoService.getAll());
		return mAV;
	}
	// IMPLEMENTAR EL CREAR

	// vista de 1 dispositivo
	@GetMapping("/{idDispositivo}")
	public ModelAndView get(@PathVariable("idDispositivo") int idDispositivo) {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.DISPOSITIVO_UPDATE);
		mAV.addObject("dispositivo", dispositivoService.findByIdDispositivo(idDispositivo));
		return mAV;
	}

//	@PostMapping("/update")
//	public RedirectView update(@ModelAttribute("dispositivo") Dispositivo dispositivo) {
//		dispositivoService.insertOrUpdate(dispositivo);
//		return new RedirectView(ViewRouteHelper.DISPOSITIVO_ROOT);
//	}

	@PostMapping("/delete/{idDispositivo}")
	public RedirectView delete(@PathVariable("idDispositivo") int idDispositivo) {
		dispositivoService.remove(idDispositivo);
		return new RedirectView(ViewRouteHelper.DISPOSITIVO_ROOT);
	}

}
