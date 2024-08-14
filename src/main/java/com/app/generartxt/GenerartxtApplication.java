package com.app.generartxt;

import com.app.generartxt.services.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
public class GenerartxtApplication implements CommandLineRunner {

    @Autowired
    FileService fileService;

    public static void main(String[] args) {
        SpringApplication.run(GenerartxtApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        fileService.generarArchivo();
    }
}
