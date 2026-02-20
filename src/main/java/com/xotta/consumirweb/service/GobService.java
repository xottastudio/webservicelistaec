package com.xotta.consumirweb.service;

import com.xotta.consumirweb.dto.InstitucionDTO; // Importa tu DTO
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.ArrayList;
import java.util.List;

@Service // Le dice a Spring que esta clase contiene lógica de negocio
public class GobService {

    private final WebClient webClient;

    // Spring inyecta automáticamente el WebClient que configuramos en el Bean
    public GobService(WebClient webClient) {
        this.webClient = webClient;
    }

    public List<InstitucionDTO> obtenerInstituciones() {
    	try {    	
        return this.webClient.get()
                .uri("/instituciones") // Se suma a la baseUrl: https://www.gob.ec/api/v1/instituciones
                .retrieve()           // Ejecuta la petición
                .bodyToFlux(InstitucionDTO.class) // Convierte el JSON a un flujo de objetos
                .collectList()        // Junta todos los objetos en una Lista
                .block();             // Espera la respuesta (modo síncrono para facilitar la prueba)
    	} catch (Exception e) {
            // Imprimimos el error en la consola para saber qué pasó
            System.err.println("Error al consumir la API de gob.ec: " + e.getMessage());
            // Devolvemos una lista vacía para que la tabla simplemente se vea sin datos
            // pero la página cargue correctamente.
            return new ArrayList<>();
        }
    }
}