# generar_txt

## Descripción
programa que lee un archivo de configuracion y genera un archivo con los datos obtenidos.

## Características Principales
- **genera un archivo segun las especificacnoes:**  


## Instalación y Configuración
#### Reqerimientos
- JDK 17
- mvn 3.9.8


#### Descargar el código base

``` shell
   git clone https://github.com/eduardob1324/generar_txt.git
```

#### ruta del archivo 
- El archivo se genera por defecto en la ruta de linux:
``` shell
    /home/nombre_usuario/Documentos/
```
- pero tiene habilitadas rutas para windows 
```shell
  C:\Users\nombre_usuario\Documents\  -> ruta para windows
```
-solo hay que descomentar la linea de la ruta valores.properties del sistema host y cambiar el "nombre_usuario" con el usuario del host.

#### compilar y ejecutar el proyecto
- para compilar habrimos una terminal desde la carpera raiz del proyecto y ejecutamos.
  
``` shell
   mvn install -DskipTests=true 
```
- para ejecutar habrimos una terminal desde la carpera target del proyecto y ejecutamos.
``` shell
   java -jar genera-txt-0.0.1-SNAPSHOT.jar
```

#### nombre del archivo 
-El archivo se encontrara en la ruta: /home/nombre_usuario/Documentos/ en linux o C:\Users\nombre_usuario\Documents\ en windows


