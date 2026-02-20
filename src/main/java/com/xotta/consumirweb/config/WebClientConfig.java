package com.xotta.consumirweb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

import io.netty.channel.ChannelOption;
import io.netty.handler.timeout.ReadTimeoutHandler;
import io.netty.handler.timeout.WriteTimeoutHandler;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import reactor.netty.http.client.HttpClient;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

@Configuration // Indica que esta clase contiene configuraciones de Spring
public class WebClientConfig {


	@Bean // Este método crea el objeto que Spring "inyectará" en tus servicios
	public WebClient webClient() {
	    // Configuramos el cliente de red (HttpClient) con los tiempos de espera
	    HttpClient httpClient = HttpClient.create()
	            .option(ChannelOption.CONNECT_TIMEOUT_MILLIS, 5000) // Tiempo para conectar (5s)
	            .responseTimeout(Duration.ofSeconds(5))            // Tiempo para recibir respuesta (5s)
	            .doOnConnected(conn -> 
	                conn.addHandlerLast(new ReadTimeoutHandler(5, TimeUnit.SECONDS))
	                    .addHandlerLast(new WriteTimeoutHandler(5, TimeUnit.SECONDS)));
	
	    return WebClient.builder()
	            .baseUrl("https://www.gob.ec/api/v1") // URL base para no repetirla luego
	            .clientConnector(new ReactorClientHttpConnector(httpClient)) // Conectamos el motor
	            .build();
	}
}


