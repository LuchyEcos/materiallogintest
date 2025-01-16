# materiallogintest
Este proyecto utiliza Appium, Node.js, Java, y Gradle para la automatización de pruebas en aplicaciones móviles en dispositivos Android. Las pruebas están diseñadas para garantizar la funcionalidad y la estabilidad de la aplicación bajo diferentes escenarios.
Descripción
Este proyecto se centra en la automatización de pruebas funcionales para aplicaciones móviles en dispositivos Android.
Tecnologías utilizadas:
Appium: Para la interacción con dispositivos móviles.
Node.js: Para gestionar dependencias de Appium.
Java y Gradle: Como lenguaje principal para escribir pruebas.
Android Studio: Para ejecutar y administrar emuladores o dispositivos físicos Android.
Requisitos Previos
Asegúrate de tener los siguientes componentes instalados y configurados:

Java Development Kit (JDK) 8 o superior

Configura la variable de entorno JAVA_HOME.
Android Studio

Asegúrate de que el SDK de Android esté configurado correctamente.
Configura las variables de entorno ANDROID_HOME y agrega las rutas platform-tools y tools al PATH.
Node.js (v14 o superior)

Necesario para ejecutar Appium. Descarga desde Node.js.
Appium

Instala Appium globalmente usando npm:
npm install -g appium
Verifica la instalación:
appium --version
Gradle

Incluido con Android Studio, pero también puedes instalarlo manualmente si prefieres ejecutarlo desde la línea de comandos.
Dispositivo Android o Emulador

Un emulador configurado en Android Studio o un dispositivo físico conectado por USB con depuración USB habilitada.
Configuración del Entorno
Clona este repositorio:
git clone https://github.com/LuchyEcos/materiallogintest.git
cd tu_proyecto

Configura las dependencias del proyecto en el archivo build.gradle y sincroniza con Gradle en Android Studio.

Configura las capacidades de Appium


{
  "appium:deviceName": "DIPLOMADO",
  "appium:platformVersion": "9.0",
  "appium:appPackage": "com.sourcey.materialloginexample",
  "appium:appActivity": "com.sourcey.materiallogindemo.LoginActivity",
  "platformName": "Android",
  "appium:automationName": "uiautomator2"
}

Inicia el servidor de Appium:

appium --base-path=/wd/hub

