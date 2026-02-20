package com.xotta.consumirweb;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.xotta.consumirweb.service.GobService;


@SpringBootApplication
public class ConsumirwebApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumirwebApplication.class, args);
	}
	
	@Bean
    CommandLineRunner run(GobService gobService) {
        return args -> {
            System.out.println("--- INICIANDO CONSUMO DE API ---");
            
            var instituciones = gobService.obtenerInstituciones();
            
            // Imprimimos las primeras 3 instituciones para probar
            instituciones.stream().limit(3).forEach(inst -> {
                System.out.println("Institución: " + inst.getInstitucion());
                System.out.println("URL: " + inst.getUrl());
            });
            
            System.out.println("--- FIN DEL CONSUMO ---");
        };
    }
}
