# Microservicio de Tickets - Evaluación DevOps (EP1)

**Integrantes:** Yeider Catari y Yaquelin Rugel
**Asignatura:** Ingeniería DevOps_007V_OLS
**Institución:** Duoc UC, sede Plaza Oeste

## 1. Descripción
Este proyecto consiste en un microservicio de gestión de tickets desarrollado con Java 17 y Spring Boot, utilizando una **Arquitectura Hexagonal**. El objetivo de esta evaluación es establecer una base sólida de control de versiones y automatización para el pipeline DevOps que se construirá durante el semestre.

## 2. Estrategia de Ramificación
Hemos implementado la estrategia **GitFlow** para gestionar el desarrollo del software.

* **Justificación:** Elegimos GitFlow porque permite separar claramente el código en producción de las funciones en desarrollo. Al usar ramas específicas para `features` y `hotfixes`, evitamos errores en la rama principal (`main`) y facilitamos el trabajo en equipo, asegurando que cada cambio sea revisado antes de integrarse.

## 3. Guía de Buenas Prácticas y Convenciones 

### 3.1 Naming de Ramas 
* **main:** Código estable y productivo.
* **develop:** Rama de integración para desarrollo.
* **feature/<nombre>:** Para nuevas funcionalidades (ej. `feature/endpoint-prueba`).
* **hotfix/<nombre>:** Para correcciones críticas (ej. `hotfix/corregir-notificacion`).

### 3.2 Mensajes de Commit (Conventional Commits) 
Para mantener un historial claro, usamos los siguientes prefijos:
* `feat:` Nuevas funcionalidades.
* `fix:` Corrección de errores.
* `chore:` Tareas de mantenimiento o configuración (ej. configuración de GitHub Actions).
* `docs:` Cambios solo en documentación.

### 3.3 Estructura de Carpetas 
El proyecto sigue el patrón hexagonal para separar la lógica de negocio de la tecnología:
* `application/`: Casos de uso y lógica de orquestación.
* `domain/`: Entidades de negocio y puertos (interfaces).
* `entrypoints/`: Controladores REST (puntos de entrada).
* `infrastructure/`: Adaptadores de base de datos y servicios externos.

### 3.4 Flujo de Trabajo y Merges 
Todo cambio debe realizarse mediante un **Pull Request (PR)** hacia la rama `develop`. Los PRs permiten la revisión de código por parte del otro integrante antes de la fusión final, garantizando la calidad del microservicio.

## 4. Automatización (GitHub Actions) 
Se configuró un flujo de trabajo en `.github/workflows/ci.yml` que se activa automáticamente con cada `push` a `develop` o `pull request` a `main`.
* **Función:** El pipeline compila el proyecto usando Maven, verifica las dependencias y genera el artefacto (archivo .jar), asegurando que el código sea funcional en un entorno simulado de nube.

---

## 5. Declaración de Uso de Inteligencia Artificial
En este trabajo utilizamos herramientas de IA para los siguientes puntos:
* **Redacción:** Nos ayudó a estructurar este archivo README y a redactar de forma más clara las explicaciones técnicas de la arquitectura.
* **Revisión:** Se usó para verificar que la sintaxis de los archivos de configuración de GitHub Actions fuera correcta.
* **Validación:** Todas las sugerencias de la IA fueron revisadas y ajustadas por nosotros para que coincidieran con lo que pedía la rúbrica de la asignatura.

## 6. Reflexiones Individuales 

**Reflexión de Yeider Catari:**
La verdad es que al principio me sentí un poco perdido con tanto comando de Git, sobre todo con el tema de los Pull Requests y la creación de ramas para cumplir con GitFlow, pero al aplicarlo entendí rápido y logre trabajar bien junto a mi compañera.




**Reflexión de Yaquelin Rugel:**
Al inicio me resultó un poco complejo entender cómo funcionaban los comandos de Git, especialmente el manejo de ramas y el flujo de trabajo con GitFlow. Sin embargo, a medida que fui practicando y aplicando los conceptos en el proyecto, logré comprender mejor su utilidad. El trabajo en equipo también fue clave, ya que permitió apoyarnos mutuamente y avanzar de manera más organizada. Finalmente, esta experiencia me ayudó a fortalecer mis habilidades y a sentirme más seguro utilizando herramientas de control de versiones.

