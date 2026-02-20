# webservicelistaec
  Aplicación desarrollada con Spring Boot para el consumo de servicios web del gobierno de Ecuador.
Este proyecto está construido con Gradle y sigue una arquitectura limpia y organizada para facilitar mantenimiento y escalabilidad.

🚀 Tecnologías Utilizadas
  * Java 17
  * Spring Boot
  * Gradle
  * REST Client (RestTemplate / WebClient según implementación)
  * JSON Processing (Jackson)

📂 Estructura del Proyecto

  webservicelistaec/
  │── src/
  
  │   ├── main/
  
  │   │   ├── java/
  
  │   │   └── resources/
  
  │── build.gradle
  
  │── settings.gradle
  
  │── gradlew
  
  │── gradlew.bat
  
  │── README.md

⚙️ Requisitos Previos

  Antes de ejecutar el proyecto asegúrate de tener instalado:
  
  * Java 17 o superior
  * Git
  * Gradle (opcional, ya incluye wrapper)

▶️ Cómo Ejecutar el Proyecto

  🔹 Clonar el repositorio
      git clone https://github.com/xottastudio/webservicelistaec.git
      cd webservicelistaec
      
  🔹 Ejecutar con Gradle Wrapper
  
    En Windows:
      gradlew bootRun
      
    En Linux / Mac:
      ./gradlew bootRun
      
    La aplicación iniciará en:
      http://localhost:9090

🛠️ Compilar el Proyecto
    gradlew build  
    
  El archivo .jar se generará en:
    build/libs/
    
  Para ejecutarlo:
    java -jar build/libs/nombre-del-archivo.jar

🌐 Endpoints Disponibles

    GET http://localhost:9090/api/ver-instituciones

🔐 Configuración


  Si el proyecto utiliza variables de entorno o configuración externa, puedes definirlas en:
  
    src/main/resources/application.properties

Ejemplo:

  server.port=9090
  spring.application.name=webservicelistaec

📦 Buenas Prácticas Implementadas
  * por capas (Controller, Service, Repository)
  * Manejo centralizado de excepciones
  * Uso de DTOs para transferencia de datos
  * Configuración externa desacoplada


👨‍💻 Autor

  Desarrollado por Xotta Studio & Ing. Xavier Aucanshala 
  
  Desarrollo de software, infraestructura y soluciones tecnológicas.


📄 Licencia

  Este proyecto está bajo la licencia MIT.

📄 Contiene

  1. paginación
  2. buscador
  3. tabla dinamica
  4. boton descarga PDF y excel e impresion

