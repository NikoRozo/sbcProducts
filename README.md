# sbcProducts

## Descripción

`sbcProducts` es un proyecto basado en Spring Boot que proporciona una API para gestionar productos. Utiliza Spring Data JPA para la persistencia de datos y PostgreSQL como base de datos.

## Requisitos

- Java 21
- Maven
- PostgreSQL

## Instalación

1. Clona el repositorio:
    ```sh
    git clone <URL_DEL_REPOSITORIO>
    cd sbcProducts
    ```

2. Configura la base de datos PostgreSQL:
    - Crea una base de datos llamada `sbc_products`.
    - Actualiza las credenciales de la base de datos en el archivo `application.properties`.

3. Compila y ejecuta la aplicación:
    ```sh
    mvn clean install
    mvn spring-boot:run
    ```

## Uso

La API proporciona los siguientes endpoints para gestionar productos:

- `GET /products`: Obtiene todos los productos.
- `GET /products/{id}`: Obtiene un producto por su ID.
- `POST /products`: Crea un nuevo producto.
- `PUT /products/{id}`: Actualiza un producto existente.
- `DELETE /products/{id}`: Elimina un producto por su ID.

## Dependencias

- `spring-boot-starter-data-jpa`
- `spring-boot-starter-web`
- `spring-boot-devtools`
- `postgresql`
- `lombok`
- `spring-boot-starter-test`

## Licencia

Este proyecto está licenciado bajo los términos de la licencia MIT.