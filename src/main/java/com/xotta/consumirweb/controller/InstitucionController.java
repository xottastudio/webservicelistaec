
package com.xotta.consumirweb.controller;

import com.xotta.consumirweb.service.GobService;
import org.springframework.stereotype.Controller; // ¡CUIDADO! Cambia @RestController por @Controller
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // Usamos @Controller para devolver una vista HTML
@RequestMapping("/api")
public class InstitucionController {

    private final GobService gobService;

    public InstitucionController(GobService gobService) {
        this.gobService = gobService;
    }

    /*
    @GetMapping("/hola")
    public String hola() {
        return "hola";
    }*/
    
    @GetMapping("/ver-instituciones")
    public String mostrarTabla(Model model) {
        // Obtenemos los datos del servicio
        var lista = gobService.obtenerInstituciones();
        
        // Pasamos la lista al HTML con el nombre "listaInstituciones"
        model.addAttribute("listaInstituciones", lista);
        
        return "instituciones"; // Debe coincidir con el nombre del archivo .html
    }
}

/*package com.xotta.consumirweb.controller;

import com.xotta.consumirweb.dto.InstitucionDTO;
import com.xotta.consumirweb.service.GobService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // Indica que esto es un punto de entrada para peticiones web
@RequestMapping("/api") // La URL base será http://localhost:9090/api
public class InstitucionController {

    private final GobService gobService;

    public InstitucionController(GobService gobService) {
        this.gobService = gobService;
    }

    @GetMapping("/instituciones") // La URL final: http://localhost:9090/api/instituciones
    public List<InstitucionDTO> listar() {
        return gobService.obtenerInstituciones();
    }
}*/