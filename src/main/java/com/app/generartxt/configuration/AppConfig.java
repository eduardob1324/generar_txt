package com.app.generartxt.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


import java.util.ArrayList;
import java.util.List;


@Configuration
@PropertySource("classpath:valores.properties")
public class AppConfig {

    @Value("${config.regiones}")
    private String regiones;

    @Value("${config.ciclos}")
    private String ciclos;

    @Value("${config.ruta.archivo}")
    private String rutaArchivo;

    @Bean
    public List obtenerValores (){
        List<String> valores = new ArrayList<>();
        valores.add(regiones);
        valores.add(ciclos);
        valores.add(rutaArchivo);

        return valores;
    }

}
