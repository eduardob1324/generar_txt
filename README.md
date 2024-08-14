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
- El archivo se genera por defecto en la ruta:
``` shell
   src/main/resources/static/
```
- pero tiene habilitadas rutas para windows y linux
```shell
  /home/nombre_usuario/Documentos/archivoGenerado.txt -> ruta para linux
  C:\Users\nombre_usuario\Documents\archivoGenerado.txt  -> ruta para windows
```
--solo hay que descomentar la linea de la ruta valores.rpoperties del sistema host y cambiar el "nombre_usuario" con el usuario del host.




#### Crear el bot en Discord
- Se pueden apoyar en los pasos 1 y 2 del siguiente enlace:
- Enlace de ayuda:  [crear un Bot](https://www.hostinger.mx/tutoriales/como-alojar-un-bot-de-discord)

#### se requiere modificar el archivo 'docker-compose.yml'
- El archivo se encuentra en la carpeta principal del proyecto
- Las lineas que se requiere modificar son:
 ```
 10    - key_bot=
 11    - server=
 ```
- Ahi se deben condigurar la clave del Bot y el ID del servidor.
- link de ayuda: [ver id server](https://support.discord.com/hc/es/articles/206346498--D%C3%B3nde-puedo-encontrar-mi-ID-de-usuario-servidor-mensaje)

#### Configurar las tareas programadas 
- Se requiere modificar el archivo ScheduledTask.java
```
 src/main/java/tasks/ScheduledTask.java
```
- La tarea encargada de enviar los mensajes a los mienbros del servidos los dias lunes, miércoles y viernes es: **sendScheduledMessageOfDay**
- La tarea encargada de validar que los usuarios enviaron una respuesta es **sendScheduledUpdateResponseUser** en dado caso de que no respondan antes del siguiente envío de mensaje, los campos respuesta serán null.
- Las tareas porgramadas estan programadas para ejecutarse cada 2 minutos.
- Para modificar el tiempo de ejecución de las tarear programadas modificar el cron:
```
  @Scheduled(cron = "2 * * * * *")
```
- link de ayuda para configuracion del cron: [cron spring](https://spring.io/blog/2020/11/10/new-in-spring-5-3-improved-cron-expressions)
- Para modificar el mensaje que aparece cuando se ejecuta la tarea programada modificar el retorno en el método **getDayOfWeek** solo retorna respuesta los dias (1, 3, 5) lunes, miércoles y viernes respectivamente.
```
    public static int getDayOfWeek(){
        LocalDate currentDate = LocalDate.now();
        //return currentDate.getDayOfWeek().getValue();
        return 1;
    }
```

#### Compilar el proyecto

``` shell
   mvn install -DskipTests=true 
```

#### Para levantar el proyecto
- Abre una terminal desde la carpeta raíz del proyecto y ejecuta;
``` shell
   docker-compose up
```
- Una vez que la aplicación esté desplegada, verás en Discord que el bot está activo.

## Funcionalidades en desarrollo.
- Creación de interfaz para poder crear eventos a los que asistan los miembros del servidor.
- Integración de listener para recepción de mensajes con #
- Creación de reportes para manejo de métricas.
