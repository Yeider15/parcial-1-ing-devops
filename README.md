# Microservicio - Evaluación DevOps (EP1)

## Estrategia de Ramificación
Para este proyecto hemos decidido implementar **GitFlow**. 

**Justificación:** GitFlow proporciona un entorno robusto y estructurado ideal para aislar el desarrollo de nuevas características (`feature/`) y la resolución de errores críticos en producción (`hotfix/`) sin desestabilizar el código base. Dado que el ciclo de vida de este microservicio requiere control estricto antes de llegar a producción, aislar el trabajo en `develop` garantiza una integración segura.

## Convenciones y Buenas Prácticas

### Naming de Ramas
- **Principal:** `main` (Código en producción, estable).
- **Desarrollo:** `develop` (Integración de features, pre-producción).
- **Nuevas características:** `feature/<nombre-descriptivo>` 
- **Correcciones urgentes:** `hotfix/<nombre-descriptivo>` 

### Convención de Commits (Conventional Commits)
Seguimos el estándar para facilitar la lectura del historial:
- `feat:` Para nuevas funcionalidades (ej. `feat: agregar endpoint de login`).
- `fix:` Para solución de bugs (ej. `fix: corregir parseo de JSON`).
- `chore:` Tareas de mantenimiento o configuración (ej. `chore: configurar github actions`).
- `docs:` Cambios en la documentación.

### Flujos de Merge y Estrategias de Revisión
- Todo código nuevo debe nacer de `develop` (como `feature/`) y volver a `develop` mediante un **Pull Request (PR)**.
- Los PRs deben tener al menos 1 aprobación (review) antes de realizar el merge.
- Los `hotfix/` nacen de `main` y deben fusionarse tanto en `main` como en `develop` .