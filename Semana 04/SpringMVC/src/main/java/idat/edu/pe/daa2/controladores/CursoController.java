package idat.edu.pe.daa2.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cursos")
public class CursoController {

	// verbos http :
	// GET (consulta)
	// POST (Registro o guardar información)
	// PUT (Modificación o actualización)
	// DELETE (Eliminar)
	
	//localhost:8085/cursos/inicio
	
	 @GetMapping("/inicio")
	public String greeting (Model model) {
		model.addAttribute("nombreModulo", "CONSULTA DE CURSOS");
		return "resultado";
	}
	
	
	
	
	
}
