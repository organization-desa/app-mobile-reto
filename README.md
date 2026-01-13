# app-mobile-reto

Aplicación Android nativa en Java con pruebas unitarias y CI/CD integrado.

## 🚀 Características

- ✅ Android Nativo en Java
- ✅ Pruebas unitarias con JUnit
- ✅ Pipeline CI/CD con GitHub Actions
- ✅ Generación automática de APKs
- ✅ Keystores dummy para desarrollo
- ✅ Compilación automática en push/pull requests

## 📁 Branching Strategy — Trunk-Based Development (TBD)

Mantener una rama principal (trunk) estable y desplegable, reduciendo la complejidad del branching y mejorando la velocidad de entrega.

- 🚫 No se permite commits directos a main, solo atraves de PRs.
- 🌱 Ramas de trabajo de corta duración.

Convenciones de nombres
feature/<descripcion-corta>
bugfix/<descripcion-corta>
hotfix/<descripcion-corta>

🚀 Releases
Los releases se generan desde main, usando una de las siguientes nomeclaturas:
release/1.0.0
release/1.1.0
release/1.1.1

Convenciones de versiones (major.minor.patch)
1.1.1
MAJOR: Cambios incompatibles con versiones anteriores.
MINOR: Nuevas funcionalidades compatibles hacia atrás.
PATCH: Correcciones de bugs sin cambiar funcionalidad.

Cuando se hacen los despliegues a producción se usan — Tags
v1.0.0
v1.1.0
v1.1.1

## 📁 Generation certificate / signing keys

Tenemos un script linux generate-keystores.sh encargado de generar los certificados dummy.
Estos certificados se almacena como secret del repositorio GitHub.

## 📁 Setup Local

**Pre-Requisito:**

* Java 17
* Packages de android:
    - platforms;android-34
    - build-tools;34.0.0
    - platform-tools
    - ndk;25.2.9519653
    - cmake;3.22.1

* **Ejecuta unit test**

    ./gradlew testDebugUnitTest
    
* **Build apk en modo debug**

    ./gradlew assembleDebug \
    -Pandroid.injected.signing.store.file=keystores/debug.keystore \
    -Pandroid.injected.signing.store.password=${{ KEYSTORE_PASSWORD }} \
    -Pandroid.injected.signing.key.alias=${{ KEY_ALIAS_DEBUG }} \
    -Pandroid.injected.signing.key.password=${{ KEY_PASSWORD }}

* **Build apk en modo release**

    ./gradlew assembleRelease 
    -Pandroid.injected.signing.store.file=keystores/release.keystore \
    -Pandroid.injected.signing.store.password=${{ KEYSTORE_PASSWORD }} \
    -Pandroid.injected.signing.key.alias=${{ KEY_ALIAS_RELEASE }} \
    -Pandroid.injected.signing.key.password=${{ KEY_PASSWORD }}


## 📁 Obtener APK generado

Dentro de cada workflow run se encuentra archivado el apk generado

**Android CI:**         Genera el apk para debug (Al hacer push a main).

**Android Release:**    Genera el apk para release.

**Nomeclatura del nombre:**

**Para DEV:**       Nombre del proyecto-debug-build.apk

**Para QA y PRD:**  Nombre del proyecto-release-build-tag.apk
