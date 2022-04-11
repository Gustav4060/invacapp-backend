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



**EJECUCION**

**Creación del usuario administrador por Test o DML**
```
	@Test
	void escenario1() {
		Usuario us = new Usuario();
		us.setUsername("Admin");
		us.setPassword(bcrypt.encode("Admin"));
		us.setEnabled(true);
		us.setCedula("0604462937");

		Usuario retorno = repo.save(us);
		assertTrue(retorno.getPassword().equals(us.getPassword()));
	}
```
**Si ejecuto el test no ejecutar el siguiente DML**
```
INSERT INTO public.usuario (cedula,estado,clave,nombre) VALUES
	 ('0604462937',true,'$2a$10$S.7M5utc8CXKUVtVOLMGXO3nqFYwFcr1kCPWA3YXU.l1/UQog4902','Admin');
```
**DML para roles**
```
	INSERT INTO public.rol (id_rol,descripcion,nombre) VALUES
	 (1,'Administrador','ADMIN'),
	 (2,'Empleado','EMP');
```
**Relación roles usuario**
```
	INSERT INTO public.usuario_rol (id_usuario,id_rol) VALUES
	 (1,1);
```

## Autor ✒️

* **Gustavo Parco** - *Evalución* - [Gustav4060](https://github.com/Gustav4060)
