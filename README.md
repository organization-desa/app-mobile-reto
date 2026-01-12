# app-mobile-reto

Aplicación Android nativa en Java con pruebas unitarias y CI/CD integrado

## 🚀 Características

- ✅ Android Nativo en Java
- ✅ Pruebas unitarias con JUnit
- ✅ Pipeline CI/CD con GitHub Actions
- ✅ Generación automática de APKs
- ✅ Keystores dummy para desarrollo
- ✅ Compilación automática en push/pull requests

## 📁 Branching Strategy — Trunk-Based Development (TBD)

El objetivo es mantener una sola rama principal (trunk) siempre estable y desplegable, reduciendo la complejidad del branching y mejorando la velocidad de entrega.

🌲 Ramas principales
Rama	Propósito
main	Trunk. Rama principal. Siempre estable, testeada y lista para release

🚫 No se permite hacer commits directos a main.

🌱 Ramas de trabajo (corta duración)

Las ramas de trabajo deben ser pequeñas y de vida corta (horas o pocos días) y siempre integrarse a main mediante Pull Request.

Convenciones de nombres
feature/<descripcion-corta>
bugfix/<descripcion-corta>
hotfix/<descripcion-corta>

Ejemplos
feature/login-biometrico
feature/push-notifications
bugfix/crash-on-startup
hotfix/release-signing

🚀 Releases

Los releases se generan desde main, usando una de las siguientes opciones:

Release branches (temporales)
release/1.0.0
release/1.1.0
release/1.1.1

Las ramas release/* existen solo mientras se prepara el release

Deben eliminarse después del despliegue

Cuando se hacen los despliegues a producción se usan — Tags
v1.0.0
v1.1.0
v1.1.1


❌ Lo que NO se permite

- ✅ Ramas persistentes como develop, staging, qa
- ✅ Commits directos a main
- ✅ Ramas de larga duración
- ✅ Releases desde ramas que no sean main o release/*

🛠️ Buenas prácticas recomendadas

- ✅ Commits pequeños y frecuentes
- ✅ Pull Requests enfocados y revisables
- ✅ Merge rápido a main
- ✅ Automatización mediante GitHub Actions
