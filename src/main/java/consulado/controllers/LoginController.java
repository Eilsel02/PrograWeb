package consulado.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import consulado.entities.Usuario;
import consulado.services.UsuarioService;


@Controller
public class LoginController {
    
	@Autowired
    private UsuarioService usuarioService;

   
    @GetMapping("/")
    public String showHome(Model model){
    	model.addAttribute("usuario",new Usuario() );
        return "index";
    }

    @GetMapping("/doValidaUsuario")
    public String doValidaUsuario(@Valid Usuario usuario, BindingResult result, Model model){
    	if (result.hasErrors()) {
            return "index";
        }
    	usuario=usuarioService.validaUsuarioPassword(usuario.getUsuario(), usuario.getPassword());
    	if (usuario==null) {
    		return "index";
    	}
    	
    	model.addAttribute("usuario", usuario);
        return "home";
    }
}
