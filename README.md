
# Compilar y ejecutar el proyecto DESAFIO NIVEL 3 - JOSE DANIEL MOROS

Compilar y desplegar primero el proyecto api-periodos-1.0.0.jar para consumir el servicio REST.

Luego compilar el proyecto se requiere Java y Maven instalado.
Ingresar al directorio *Desafio_Uno* ejecutar el siguiente comando *maven*

```bash
mvn package
```

Luego de compilar el proyecto ingresar al directorio *target* ejecutar el siguiente comando *java*

```bash
java -jar .\test-0.0.1-SNAPSHOT.jar
```
*Nota*:
Debe estar disponible el puerto *8091* en el PC donde se ejecute esta API

# Visualizar Documentación y consumir la API

La documentación swagger del API (una vez que se levanta el API) queda disponible en

http://127.0.0.1:8091/swagger-ui.html#

Para consumir el servicio se debe invocar la siguiente URL -> http://127.0.0.1:8091/periodos/fechas-faltantes

```bash
curl -X GET --header 'Accept: application/json' 'http://127.0.0.1:8091/periodos/fechas-faltantes'
```
