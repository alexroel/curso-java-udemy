# Primeros pasos en Java

1. [Introducción](#introducción)
2. [Instalación de Java Development Kit (JDK)](#instalación-de-java-development-kit-jdk)
3. [Instalación de ItellijIDEA](#instalación-de-itellijidea)
4. [Jshell](#)
5. [Tu primer programa con Java](#tu-primer-programa-con-java)
6. [Compilación y ejecución de programas Java](#compilación-y-ejecución-de-programas-java)
7. [Sintaxis y semántica](#sintaxis-y-semántica)
8. [Resumen](#resumen)

---
## Introducción 

Java es un lenguaje de programación ampliamente utilizado en el ámbito del desarrollo de software, conocido por su portabilidad, versatilidad y seguridad. En este artículo, exploraremos los aspectos fundamentales de Java, desde su definición hasta sus diversas aplicaciones y las herramientas necesarias para comenzar a desarrollar con este poderoso lenguaje.

**¿Qué es Java?**

Java es un lenguaje de programación de alto nivel que se caracteriza por ser orientado a objetos, lo que significa que se organiza alrededor de objetos y clases que interactúan entre sí. Fue desarrollado por Sun Microsystems en la década de 1990 y se ha convertido en una herramienta fundamental en el desarrollo de software gracias a su capacidad de ejecutarse en múltiples plataformas sin necesidad de recompilación.

**¿Qué se puede hacer con Java?**

Las posibilidades de desarrollo con Java son vastas. Desde la creación de aplicaciones de escritorio hasta el desarrollo de aplicaciones web y móviles, Java se ha consolidado como un lenguaje versátil. Además, es ampliamente utilizado en la creación de aplicaciones empresariales, sistemas embebidos, juegos y software de servidor, gracias a su robustez y escalabilidad.

**En qué se usa más Java**

Java se ha convertido en la columna vertebral de muchas aplicaciones empresariales y sistemas críticos. Grandes empresas confían en Java para desarrollar aplicaciones que van desde sistemas de gestión empresarial (ERP) hasta sistemas de procesamiento de transacciones en línea (OLTP). También es esencial en el desarrollo de aplicaciones Android, lo que contribuye a su presencia dominante en el mercado de dispositivos móviles.

**¿Qué necesitas para aprender Java o crear aplicaciones con Java?**

Aprender Java no requiere de una infraestructura costosa. Aquí hay algunos elementos clave que necesitarás para comenzar:

1. **Entorno de Desarrollo Integrado (IDE):** Utilizar un IDE facilita enormemente el desarrollo en Java. Ejemplos de IDE populares son Eclipse, IntelliJ IDEA y NetBeans.

2. **JDK (Java Development Kit):** Es esencial tener instalado el JDK, que incluye el compilador necesario para traducir el código fuente Java a bytecode ejecutable.

3. **Conocimientos Básicos de Programación:** Aunque Java es conocido por ser amigable para principiantes, es beneficioso tener una comprensión básica de los conceptos de programación, como variables, bucles y estructuras de control.


---
## Instalación de Java Development Kit (JDK)
La instalación del Java Development Kit (JDK) es un paso fundamental para comenzar a desarrollar en Java. Aquí tienes una guía paso a paso para instalar el JDK en sistemas operativos Windows, macOS y Linux.

### Windows:

1. **Descarga del JDK:**
   - Accede al sitio oficial de Oracle JDK: [Oracle JDK Downloads](https://www.oracle.com/java/technologies/javase-downloads.html).
   - Selecciona la versión de JDK que deseas descargar (por ejemplo, JDK 11).
   - Acepta los términos de la licencia y elige el instalador adecuado para tu sistema operativo (Windows en este caso).
   - Haz clic en el enlace de descarga y guarda el archivo.

2. **Instalación del JDK:**
   - Ejecuta el archivo de instalación descargado.
   - Sigue las instrucciones del asistente de instalación.
   - Define la ruta de instalación del JDK. Por defecto, se instalará en `C:\Program Files\Java\jdk-version`.
   - Completa la instalación.

3. **Configuración de las Variables de Entorno:**
   - Abre el Panel de Control de Windows y busca "Variables de entorno".
   - Haz clic en "Editar las variables de entorno del sistema".
   - En la sección "Variables del sistema", selecciona la variable `Path` y haz clic en "Editar".
   - Agrega la ruta de la carpeta `bin` del JDK al final de la variable `Path`. Por ejemplo, `C:\Program Files\Java\jdk-version\bin`.

4. **Verificación de la Instalación:**
   - Abre una nueva ventana de línea de comandos (cmd).
   - Escribe `java -version` y presiona Enter. Deberías ver la versión instalada del JDK.

### macOS:

1. **Instalación con Homebrew (opcional pero recomendado):**
   - Abre la Terminal.
   - Instala Homebrew si aún no lo tienes instalado:
     ```
     /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
     ```
   - Instala el JDK usando Homebrew:
     ```
     brew install --cask adoptopenjdk
     ```

2. **Verificación de la Instalación:**
   - En la Terminal, escribe `java -version` para verificar que la instalación fue exitosa.

### Linux (Ubuntu como ejemplo):

1. **Instalación con apt:**
   - Abre la Terminal.
   - Actualiza el índice de paquetes:
     ```
     sudo apt update
     ```
   - Instala el JDK:
     ```
     sudo apt install default-jdk
     ```

2. **Verificación de la Instalación:**
   - En la Terminal, escribe `java -version` para confirmar que la instalación se completó correctamente.

Una vez que hayas completado estos pasos, habrás instalado el JDK en tu sistema y estarás listo para empezar a desarrollar en Java. Recuerda que la configuración de las variables de entorno es crucial para que puedas ejecutar comandos Java desde cualquier ubicación en tu sistema.

---
## Instalación de ItellijIDEA
La instalación de IntelliJ IDEA es un paso importante para empezar a desarrollar en Java, ya que IntelliJ IDEA es uno de los entornos de desarrollo integrado (IDE) más populares. A continuación, te proporciono una guía paso a paso para instalar IntelliJ IDEA en sistemas operativos Windows, macOS y Linux.

### Windows:

1. **Descarga de IntelliJ IDEA:**
   - Accede al sitio oficial de JetBrains: [JetBrains IntelliJ IDEA](https://www.jetbrains.com/idea/download/).
   - Descarga la versión Community o Ultimate según tus necesidades.
   - Ejecuta el instalador descargado.

2. **Instalación de IntelliJ IDEA:**
   - Sigue las instrucciones del instalador.
   - Puedes aceptar las configuraciones predeterminadas o personalizarlas según tus preferencias.
   - Completa la instalación.

### macOS:

1. **Descarga de IntelliJ IDEA:**
   - Accede al sitio oficial de JetBrains: [JetBrains IntelliJ IDEA](https://www.jetbrains.com/idea/download/).
   - Descarga la versión Community o Ultimate según tus necesidades.
   - Abre el archivo DMG descargado.

2. **Instalación de IntelliJ IDEA:**
   - Arrastra el ícono de IntelliJ IDEA a la carpeta de Aplicaciones.
   - Abre la carpeta de Aplicaciones y haz doble clic en IntelliJ IDEA para iniciarlo.

### Linux:

1. **Descarga de IntelliJ IDEA:**
   - Accede al sitio oficial de JetBrains: [JetBrains IntelliJ IDEA](https://www.jetbrains.com/idea/download/).
   - Descarga la versión Community o Ultimate según tus necesidades.
   - Extrae el archivo tar.gz descargado.

2. **Instalación de IntelliJ IDEA:**
   - Abre una terminal y navega hasta la carpeta donde extrajiste IntelliJ IDEA.
   - Ejecuta el script `idea.sh` para iniciar IntelliJ IDEA.

### Configuración Inicial:

Después de instalar IntelliJ IDEA, es posible que desees realizar algunas configuraciones iniciales:

1. **Configuración de JDK:**
   - Abre IntelliJ IDEA.
   - Ve a "File" (Archivo) > "Project Structure" (Estructura del Proyecto).
   - En "Project" (Proyecto) > "Project SDK", selecciona la versión del JDK que instalaste previamente.

2. **Plugins (Opcional):**
   - Explora los plugins disponibles según tus necesidades.
   - Ve a "File" (Archivo) > "Settings" (Configuración) > "Plugins" para gestionar los plugins instalados.

3. **Creación de un Nuevo Proyecto:**
   - Crea un nuevo proyecto en IntelliJ IDEA para comenzar a programar en Java.

¡Con estos pasos, habrás instalado y configurado IntelliJ IDEA en tu sistema y estarás listo para empezar a desarrollar aplicaciones Java de manera eficiente!

---
## JShell en Java

**¿Qué es JShell de Java?**
JShell es una herramienta de línea de comandos introducida en Java SE 9 que proporciona un entorno interactivo para escribir, probar y ejecutar fragmentos de código Java de manera rápida y sencilla. Con JShell, los desarrolladores pueden experimentar con el lenguaje Java sin necesidad de crear un archivo fuente completo ni compilarlo antes de ejecutarlo.

**¿Para qué es JShell?**
JShell es útil para realizar pruebas rápidas, prototipos y experimentar con el código de Java. Algunos de los casos de uso comunes incluyen:
- Experimentar con nuevas características del lenguaje.
- Probar algoritmos o fragmentos de código.
- Aprender Java de manera interactiva.
- Realizar pruebas rápidas y verificar la salida de diferentes expresiones.

**Operadores Aritméticos en JShell:**

En JShell, al igual que en Java, se pueden utilizar los operadores aritméticos estándar para realizar operaciones matemáticas básicas. Aquí tienes algunos ejemplos:

1. **Suma (+):**
   ```java
   jshell> 5 + 3;
   $1 ==> 8
   ```

2. **Resta (-):**
   ```java
   jshell> 10 - 4;
   $2 ==> 6
   ```

3. **Multiplicación (*):**
   ```java
   jshell> 6 * 3;
   $3 ==> 18
   ```

4. **División (/):**
   ```java
   jshell> 15.0 / 4.0;
   $4 ==> 3.75
   ```

5. **Módulo (%):**
   ```java
   jshell> 17 % 5;
   $5 ==> 2
   ```

Estos son solo ejemplos básicos de operadores aritméticos en JShell. Puedes utilizar JShell para probar rápidamente expresiones y operaciones, lo que facilita la comprensión del comportamiento de estas operaciones en Java.


---
## Tu primer programa con Java
¡Por supuesto! Vamos a escribir un simple programa "Hola Mundo" en Java. Este programa imprimirá el mensaje "Hola, Mundo" en la consola. Aquí está el código:

```java
public class HolaMundo {
    public static void main(String[] args) {
        // Imprime el mensaje en la consola
        System.out.println("Hola, Mundo");
    }
}
```

Ahora, aquí hay una breve explicación del código:

- `public class HolaMundo`: Define una clase llamada `HolaMundo`. En Java, cada aplicación se organiza en clases, y al menos una clase debe contener un método llamado `main` para que la ejecución del programa comience.

- `public static void main(String[] args)`: Este es el método principal (`main`) donde comienza la ejecución del programa. La máquina virtual de Java (JVM) buscará este método específico cuando se inicie la aplicación.

- `System.out.println("Hola, Mundo");`: Esta línea imprime el mensaje "Hola, Mundo" en la consola. `System.out` se refiere al objeto de salida estándar (la consola), y `println` es un método que imprime una línea de texto.

### Pasos para Ejecutar el Programa:

1. **Asegúrate de tener el JDK y IntelliJ IDEA instalados, como se explicó en las respuestas anteriores.**

2. **Crea un Nuevo Proyecto en IntelliJ IDEA:**
   - Abre IntelliJ IDEA.
   - Selecciona "Create New Project".
   - Elige "Java" en la lista de categorías y "SDK" como "Project SDK". Haz clic en "Next".
   - Dale un nombre al proyecto (por ejemplo, "HolaMundoJava") y elige la ubicación del proyecto. Haz clic en "Finish".

3. **Crea una Clase Java:**
   - En IntelliJ IDEA, ve al menú "File" > "New" > "Java Class".
   - Dale un nombre a la clase, por ejemplo, "HolaMundo", y haz clic en "OK".

4. **Escribe el Código:**
   - En el archivo de la clase recién creada, reemplaza cualquier código existente con el código "Hola Mundo" proporcionado anteriormente.

5. **Ejecuta el Programa:**
   - Coloca el cursor dentro del método `main`.
   - Haz clic derecho y selecciona "Run 'HolaMundo.main()'".

Deberías ver la salida "Hola, Mundo" en la consola de IntelliJ IDEA. ¡Has ejecutado con éxito tu primer programa en Java! Este es un punto de partida simple, y a medida que te familiarices con Java, podrás explorar conceptos más avanzados y escribir programas más complejos. ¡Buena suerte en tu viaje de programación con Java!

---
## Compilación y ejecución de programas Java
La compilación y ejecución de programas Java implican varios pasos. Aquí hay una guía paso a paso para compilar y ejecutar programas Java utilizando la línea de comandos. Utilizaré el programa "Hola Mundo" que creamos anteriormente como ejemplo.

### Compilación y Ejecución en la Línea de Comandos:

1. **Abre tu Editor de Texto:**
   - Abre tu editor de texto favorito (como Notepad, Visual Studio Code, Sublime Text, etc.) y copia el código del programa "Hola Mundo" en él.

2. **Guarda el Archivo:**
   - Guarda el archivo con la extensión ".java". Por ejemplo, puedes guardarlo como "HolaMundo.java".

3. **Abre la Línea de Comandos:**
   - Abre la línea de comandos (cmd) en Windows, la terminal en Linux o macOS.

4. **Navega al Directorio del Archivo Java:**
   - Usa el comando `cd` para cambiar al directorio donde guardaste el archivo Java. Por ejemplo:
     ```bash
     cd ruta/del/archivo
     ```

5. **Compilación del Programa:**
   - Utiliza el comando `javac` para compilar el programa. Esto generará un archivo de bytecode ".class". Por ejemplo:
     ```bash
     javac HolaMundo.java
     ```

6. **Ejecución del Programa:**
   - Usa el comando `java` para ejecutar el programa compilado. Por ejemplo:
     ```bash
     java HolaMundo
     ```

   Deberías ver la salida "Hola, Mundo" en la consola.

### Compilación y Ejecución en IntelliJ IDEA:

Si estás utilizando IntelliJ IDEA, el proceso es más sencillo:

1. **Abre tu Proyecto en IntelliJ IDEA:**
   - Abre el proyecto en IntelliJ IDEA que contiene tu archivo Java.

2. **Compilación Automática:**
   - IntelliJ IDEA compila automáticamente los archivos Java cuando los guardas. No es necesario ejecutar manualmente `javac`.

3. **Ejecución del Programa:**
   - Coloca el cursor dentro del método `main` en tu archivo Java.
   - Haz clic derecho y selecciona "Run 'NombreDeTuClase.main()'". También puedes usar el atajo de teclado, por lo general, `Shift + F10`.

   Verás la salida del programa en la consola de IntelliJ IDEA.

Esta guía te proporciona tanto la forma tradicional de compilar y ejecutar programas Java desde la línea de comandos como la forma más conveniente si estás utilizando IntelliJ IDEA. ¡Ahora estás listo para compilar y ejecutar tus programas Java!

---
## Sintaxis y semántica

Java es un lenguaje de programación de alto nivel ampliamente utilizado en el desarrollo de aplicaciones empresariales, aplicaciones móviles y sistemas embebidos. Su popularidad se debe en gran medida a su sintaxis clara, orientación a objetos y portabilidad. En este artículo, exploraremos los conceptos fundamentales de sintaxis y semántica en Java, utilizando un ejemplo básico para ilustrar los principios clave.

### Sintaxis en Java:

La sintaxis en Java se refiere a las reglas y estructuras que se deben seguir para escribir un programa Java válido. A continuación, se presenta una descripción de la sintaxis utilizada en el ejemplo proporcionado:

1. **Clases y Métodos:**
   ```java
   public class HolaMundo {
       public static void main(String[] args) {
   ```
   En Java, un programa comienza con la declaración de una clase. En este caso, la clase se llama `HolaMundo`. Dentro de la clase, el método `main` es el punto de entrada del programa. La palabra clave `public` indica que el método es accesible desde fuera de la clase.

2. **Instrucciones:**
   ```java
           System.out.println("Hola Mundo");
           System.out.println(200);
   ```
   Las líneas de código dentro del método `main` son instrucciones. En Java, las instrucciones terminan con punto y coma (;). La función `System.out.println()` se utiliza para imprimir en la consola. En el primer caso, se imprime la cadena "Hola Mundo", y en el segundo caso, se imprime el número entero 200.

### Semántica en Java:

La semántica se refiere al significado de las construcciones del lenguaje. A continuación, se analiza la semántica del ejemplo proporcionado:

1. **Tipos de Datos:**
   ```java
   System.out.println("Hola Mundo");
   System.out.println(200);
   ```
   En Java, se especifica el tipo de datos al declarar variables o imprimir valores. En el primer `println`, se imprime una cadena de texto (`String`), mientras que en el segundo, se imprime un número entero (`int`).

2. **Comentarios:**
   ```java
   // Este es un comentario de una sola línea
   /* Este es un comentario
      de varias líneas */
   ```
   Los comentarios se utilizan para documentar el código. En Java, los comentarios de una sola línea comienzan con `//`, y los comentarios de varias líneas están delimitados por `/*` y `*/`.

En resumen, la sintaxis y semántica en Java son elementos cruciales para escribir programas eficientes y comprensibles. Comprender estos conceptos fundamentales es esencial para cualquier desarrollador que trabaje con Java y sienta las bases para explorar características más avanzadas del lenguaje.

---
## Resumen 
En esta sección de Primeros Pasos en Java, aprendió a configurar su entorno de desarrollo, crear y ejecutar programas Java, utilizar herramientas como JShell y agregar comentarios al código. Ahora posee habilidades básicas para programar en Java.

**Sigue aprendiendo y explorando con tutoriales en línea**
Continúa tu camino de aprendizaje con recursos adicionales:

1. [Oracle Java Tutorials](https://docs.oracle.com/javase/tutorial/): Documentación oficial con tutoriales detallados.
2. [Getting Started - Oracle Java Tutorials](https://docs.oracle.com/javase/tutorial/getStarted/index.html): Sección específica sobre los primeros pasos en Java.
3. [W3Schools - Java Tutorial](https://www.w3schools.com/java/default.asp): Tutoriales interactivos para aprender Java.
4. [JavaTpoint - Java Tutorial](https://www.javatpoint.com/java-tutorial): Recurso con explicaciones claras y ejemplos prácticos sobre Java.

**Nota:**
Si te gustó esta sección, apoya el curso con una calificación de 5 estrellas: ⭐⭐⭐⭐⭐ Tu opinión es valiosa. Deja un mensaje expresando tus impresiones y agradecimientos. Estamos emocionados de ser parte de tu viaje en el fascinante mundo de Python. ¡Sigamos construyendo conocimiento juntos!