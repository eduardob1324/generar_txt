package com.app.generatxt.services;

import java.io.BufferedWriter;
import java.io.File;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import com.app.generatxt.config.AppConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class FileService {


    private static final Logger logger = LoggerFactory.getLogger(FileService.class);

    private final AppConfig appConfig;

    @Autowired
    public FileService (AppConfig appConfig){
        this.appConfig = appConfig;
    }


    //@PostConstruct
    public void generarArchivo() {

        logger.info("Generando archivo");
        List<String> valores = appConfig.obtenerValores();

        File archivo = new File(valores.get(2) + "archivo.txt");

        try {
            if (!archivo.exists()) {
                archivo.createNewFile();
                logger.info("Archivo creando en la ruta:".concat(archivo.getAbsolutePath()));
            }
            escribirArchivo(archivo, valores.get(0), valores.get(1));
        } catch (IOException e) {
            logger.error("Error al crear el archivo", e);

        }

    }

    private void escribirArchivo(File archivo, String regiones, String ciclos){

        String[] registrosArray = regiones.split(",");
        String[] ciclosArray = ciclos.split(",");

        List<String> vals = new ArrayList<>();

        for (int i = 0; i < registrosArray.length; i++) {
            vals.add(registrosArray[i] + "-" + ciclosArray[i]);
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {
            writer.write(String.join(", " ,  vals));
            writer.newLine();
            Collections.sort(vals);
            for(String valor : vals){
                writer.newLine();
                writer.write(valor);
            }

            Collections.sort(vals, Comparator.reverseOrder());
            writer.newLine();
            for (String valor : vals) {
                writer.newLine();
                writer.write(valor);
            }

            logger.info("Archivo escrito exitosamente");
        } catch (IOException e) {
            logger.error("Error al crear o escribir el archivo", e);
        }

    }

}
