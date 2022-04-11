# invacapp-backend (Inventario Vacunación APP)
Inventario Vacunación Empleados


## Comenzando 🚀
---
_Estas instrucciones te permitirán obtener una copia del proyecto en funcionamiento en tu máquina local para propósitos de desarrollo y pruebas._

Mira **Deployment** para conocer como desplegar el proyecto.

## Construido con 🛠️
---
* **Spring Boot 2**
* **Java11**
* **PostgreSQL Version 13**
### Instalación 🔧
---
_1. Clone el backend localmente_

### Pre-requisitos 📋
---
Crear una una nueva base de datos ejemplo: **invacappbd** o puede utilizar la base de datos por defecto: **postgres** y reemplazar la cadena de conexion por el nombre de la base, usuario y contraseña en el archivo **application.properties** del proyecto
```
spring.datasource.driver-class-name=org.postgresql.Driver
spring.datasource.url=jdbc:postgresql://localhost/invacappbd
spring.datasource.username=postgres
spring.datasource.password=4060

```
## Despliegue 📦
---
_* Limpie y construya el proyecto con maven_
_* Deploye el proyecto localmente_

### Modelo de Datos 📋
---
![image](https://user-images.githubusercontent.com/6717560/162783380-43f42054-62e1-4e9c-bd9b-b2b39419574d.png)



**Ejecutar el siguiente DML que es la tabla de parametrización del Pico y Placa**
```
INSERT INTO public.circula(
id_circula, nombre_dia, placa0, placa1, placa2, placa3, placa4, placa5, placa6, placa7, placa8, placa9)
VALUES (1, 'Lunes', '', 'X', 'X', '', '', '', '', '', '', '');
INSERT INTO public.circula(
id_circula, nombre_dia, placa0, placa1, placa2, placa3, placa4, placa5, placa6, placa7, placa8, placa9)
VALUES (2, 'Martes', '', '', '', 'X', 'X', '', '', '', '', '');
INSERT INTO public.circula(
id_circula, nombre_dia, placa0, placa1, placa2, placa3, placa4, placa5, placa6, placa7, placa8, placa9)
VALUES (3, 'Miercoles', '', '', '', '', '', 'X', 'X', '', '', '');
INSERT INTO public.circula(
id_circula, nombre_dia, placa0, placa1, placa2, placa3, placa4, placa5, placa6, placa7, placa8, placa9)
VALUES (4, 'Jueves', '', '', '', '', '', '', '', 'X', 'X', '');
INSERT INTO public.circula(
id_circula, nombre_dia, placa0, placa1, placa2, placa3, placa4, placa5, placa6, placa7, placa8, placa9)
VALUES (5, 'Viernes', 'X', '', '', '', '', '', '', '', '', 'X');
INSERT INTO public.circula(
id_circula, nombre_dia, placa0, placa1, placa2, placa3, placa4, placa5, placa6, placa7, placa8, placa9)
VALUES (6, 'Sabado', '', '', '', '', '', '', '', '', '', '');
INSERT INTO public.circula(
id_circula, nombre_dia, placa0, placa1, placa2, placa3, placa4, placa5, placa6, placa7, placa8, placa9)
VALUES (7, 'Domingo', '', '', '', '', '', '', '', '', '', '');
```

## Autor ✒️

* **Gustavo Parco** - *Evalución* - [Gustav4060](https://github.com/Gustav4060)
