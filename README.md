# generar_txt

## Descripción
Programa que lee un archivo de configuración y genera un archivo con los datos obtenidos.

## Características Principales
- **Genera un archivo según las especificaciones:**  


## Instalación y Configuración
#### Reqerimientos
- JDK 17
- mvn 3.9.8


#### Descargar el código base

``` shell
   git clone https://github.com/eduardob1324/generar_txt.git
```

#### Ruta del archivo
- El archivo se genera por defecto en la ruta de Linux:
``` shell
    /home/nombre_usuario/Documentos/
```
- También tiene habilitadas rutas para Windows:
```shell
  C:\Users\nombre_usuario\Documents\  -> ruta para windows
```
- Solo hay que descomentar la línea de la ruta en valores.properties del sistema host y cambiar "nombre_usuario" por el nombre de usuario del host.

#### Compilar y ejecutar el proyecto
- Para compilar, abre una terminal desde la carpeta raíz del proyecto y ejecuta:
  
``` shell
   mvn install -DskipTests=true 
```
- Para ejecutar, abre una terminal desde la carpeta target del proyecto y ejecuta:
``` shell
   java -jar genera-txt-0.0.1-SNAPSHOT.jar
```

#### Nombre del archivo
- El archivo tiene el nombre archivoGenerado.txt.
- El archivo se encontrará en la ruta: /home/nombre_usuario/Documentos/ en Linux o C:\Users\nombre_usuario\Documents\ en Windows según la configuración realizada.


