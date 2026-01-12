#!/bin/bash

# Crear directorio para keystores
mkdir -p keystores

echo "Generando keystore de debug..."
keytool -genkey -v -keystore keystores/debug.keystore \
  -storepass android -alias androiddebugkey -keypass android \
  -keyalg RSA -keysize 2048 -validity 10000 \
  -dname "CN=Android Debug,O=Android,C=US"

echo "Generando keystore de release..."
keytool -genkey -v -keystore keystores/release.keystore \
  -storepass android -alias releasekey -keypass android \
  -keyalg RSA -keysize 2048 -validity 10000 \
  -dname "CN=My App,O=My Company,C=US"

echo "Keystores generados exitosamente en la carpeta 'keystores/'"