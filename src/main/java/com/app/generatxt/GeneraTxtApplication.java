package com.app.generatxt;

import com.app.generatxt.services.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GeneraTxtApplication implements CommandLineRunner {

    @Autowired
    FileService fileService;

    public static void main(String[] args) {
        SpringApplication.run(GeneraTxtApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        fileService.generarArchivo();
    }
}
