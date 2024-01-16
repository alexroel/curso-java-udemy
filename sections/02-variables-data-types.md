# Variables y tipos de datos



---
## Introducción

La programación es el arte de instruir a una computadora para realizar tareas específicas. En el corazón de este proceso se encuentran las variables y los tipos de datos, elementos fundamentales que permiten a los programadores almacenar, manipular y procesar información de manera eficiente.

### **Variables: La Base de la Manipulación de Datos**

Las variables son contenedores que almacenan información. Imagina un programa como una serie de instrucciones que la computadora debe seguir. Las variables actúan como "cajas" etiquetadas donde podemos almacenar diferentes tipos de datos, como números, texto o valores booleanos.

Cuando creamos una variable, le asignamos un nombre significativo y especificamos su tipo. Este acto de "declaración" reserva un espacio en la memoria de la computadora para almacenar el valor asociado a esa variable. A lo largo del programa, podemos cambiar el contenido de estas variables según sea necesario.

### **Tipos de Datos: La Naturaleza de la Información**

Los tipos de datos especifican qué tipo de valores pueden almacenarse en una variable. Algunos de los tipos de datos más comunes en Java incluyen:

- **Enteros (`int`):** Almacenan números enteros como 1, 42, -5.

- **Decimales (`double`):** Almacenan números con decimales, como 3.14, 2.0, -0.5.

- **Cadenas de Texto (`String`):** Almacenan secuencias de caracteres, como "Hola, Mundo!".

- **Booleanos (`boolean`):** Almacenan valores de verdad o falsedad, `true` o `false`.

La elección del tipo de dato adecuado es crucial, ya que determina la forma en que la información se almacena y se procesa en la memoria de la computadora.


En resumen, las variables y los tipos de datos son los cimientos de la programación. Su elección cuidadosa y su correcto uso son esenciales para escribir código eficiente, legible y libre de errores, contribuyendo así al desarrollo exitoso de aplicaciones y sistemas de software.

---
## Variables 
En Java, las variables y los tipos de datos son fundamentales para almacenar y manipular información en un programa. Aquí te presento una descripción general de las variables y algunos tipos de datos básicos en Java:

### Declaración de Variables con `var` en Java:

A partir de Java 10, se introdujo la palabra clave `var` que permite la inferencia de tipos, facilitando la declaración de variables sin tener que especificar el tipo de dato de manera explícita. La inferencia se realiza automáticamente por el compilador. Aquí hay un ejemplo:

```java
var numero = 10; // Inferencia de tipo int
var texto = "Hola, Mundo!"; // Inferencia de tipo String
var pi = 3.14; // Inferencia de tipo double
```

Es importante destacar que, aunque `var` permite una declaración más concisa, se debe utilizar con moderación. En muchos casos, es recomendable especificar el tipo de dato de manera explícita para mejorar la legibilidad del código.

### Usando el Tipo de Datos:

En Java, las variables deben declararse con un tipo de dato específico antes de su uso. Aquí hay algunos ejemplos:

```java
int edad = 25; // Variable de tipo entero
double salario = 35000.50; // Variable de tipo double
String nombre = "Juan"; // Variable de tipo String
boolean esEstudiante = true; // Variable de tipo boolean
```

Al declarar una variable, se reserva espacio en la memoria para almacenar el tipo de dato especificado.

### Nomenclatura de Variables en Java:

La nomenclatura de variables en Java sigue algunas convenciones ampliamente aceptadas para mejorar la legibilidad del código. Aquí hay algunas reglas y prácticas comunes:

- **Camel Case:** Se utiliza para nombrar variables comenzando con minúscula y capitalizando cada palabra adicional. Ejemplo: `nombreDeVariable`.

- **Nombres Significativos:** Los nombres de variables deben ser descriptivos y significativos. Por ejemplo, en lugar de `x` o `y`, preferiríamos `edad` o `salario`.

- **Evitar Palabras Reservadas:** No debes usar palabras reservadas de Java como nombres de variables. Por ejemplo, `int` o `class` no son válidos.

- **Evitar Nombres Genéricos:** Evita nombres de variables genéricos como `dato` o `temp`. Es preferible usar nombres que reflejen el propósito o contenido de la variable.

Ejemplo:

```java
int edadUsuario; // Camel case, nombre significativo
double promedioCalificaciones; // Camel case, nombre significativo
String mensajeSalida; // Camel case, nombre significativo
boolean estaActivo; // Camel case, nombre significativo
```

Seguir estas convenciones ayuda a crear un código más legible y comprensible, facilitando la colaboración entre programadores y el mantenimiento del código a lo largo del tiempo.

---
## Tipos de datos
Java es un lenguaje de programación fuertemente tipado, lo que significa que cada variable debe ser declarada con un tipo de dato específico. Aquí tienes una lista de los tipos de datos básicos en Java, divididos en dos categorías: tipos de datos primitivos y tipos de datos de referencia.

### Tipos de Datos Primitivos:

1. **Enteros:**
   - `byte`: 8 bits, rango de -128 a 127.
   - `short`: 16 bits, rango de -32,768 a 32,767.
   - `int`: 32 bits, rango de -2^31 a 2^31 - 1.
   - `long`: 64 bits, rango de -2^63 a 2^63 - 1.

   Ejemplo:
   ```java
   int edad = 25;
   long poblacionMundial = 7800000000L;
   ```

2. **Decimales:**
   - `float`: 32 bits, precisión de 7 dígitos decimales.
   - `double`: 64 bits, precisión de 15 dígitos decimales.

   Ejemplo:
   ```java
   double pi = 3.14159;
   float precio = 19.99f;
   ```

3. **Caracteres:**
   - `char`: 16 bits, almacena un único carácter Unicode.

   Ejemplo:
   ```java
   char letra = 'A';
   ```

4. **Booleano:**
   - `boolean`: Almacena valores `true` o `false`.

   Ejemplo:
   ```java
   boolean esEstudiante = true;
   ```

### Tipos de Datos de Referencia:

5. **Cadenas de Texto:**
   - `String`: Secuencia de caracteres.

   Ejemplo:
   ```java
   String nombre = "Juan";
   ```

6. **Arreglos:**
   - Conjunto de elementos del mismo tipo.

   Ejemplo:
   ```java
   int[] numeros = {1, 2, 3, 4, 5};
   ```

7. **Clases y Objetos:**
   - Puedes crear tus propios tipos de datos utilizando clases y objetos.

   Ejemplo:
   ```java
   class Persona {
       String nombre;
       int edad;
   }
   ```

8. **Enumeraciones:**
   - Conjunto fijo de constantes.

   Ejemplo:
   ```java
   enum DiaSemana { LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO };
   ```

Estos son los tipos de datos fundamentales en Java. La elección del tipo de dato adecuado depende de la naturaleza de la información que deseas almacenar. Los tipos de datos primitivos son eficientes en términos de memoria, mientras que los tipos de datos de referencia ofrecen mayor flexibilidad y complejidad.

---
## Conversiones de tipos
En Java, es común necesitar convertir un tipo de dato a otro, ya sea porque deseas realizar operaciones entre tipos diferentes o porque estás almacenando un valor en un tipo diferente. Aquí hay algunas conversiones de tipos comunes en Java:

### Conversión Implícita:

En algunas situaciones, Java realiza conversiones implícitas automáticamente si no hay pérdida de datos. Por ejemplo, cuando asignas un valor de un tipo más pequeño a un tipo más grande:

```java
int entero = 42;
long largo = entero; // Conversión implícita de int a long
```

### Conversión Explícita (Casting):

Cuando hay posibilidad de pérdida de datos, se requiere una conversión explícita, también conocida como "casting". Esto se hace colocando el tipo de dato deseado entre paréntesis y antes de la variable que deseas convertir:

```java
double decimal = 3.14;
int enteroConvertido = (int) decimal; // Conversión explícita de double a int (pérdida de la parte decimal)
```

### Conversiones entre Tipos de Datos Primitivos:

```java
// Conversiones entre enteros y decimales
int entero = 42;
double decimal = (double) entero; // Conversión de int a double

// Conversión de char a int
char caracter = 'A';
int valorAscii = (int) caracter;

// Conversión de int a char
int valorAscii2 = 66;
char caracter2 = (char) valorAscii2;
```

### Conversión de Tipos de Datos de Referencia:

```java
// Conversión entre String y números
String numeroComoTexto = "123";
int numero = Integer.parseInt(numeroComoTexto); // String a int

String decimalComoTexto = "3.14";
double numeroDecimal = Double.parseDouble(decimalComoTexto); // String a double

// Conversión de números a String
int enteroParaString = 42;
String enteroComoString = Integer.toString(enteroParaString); // int a String

double decimalParaString = 3.14;
String decimalComoString2 = Double.toString(decimalParaString); // double a String
```

### Nota Importante:

Cuando se realizan conversiones, es importante tener en cuenta que pueden producirse pérdidas de información, especialmente cuando se convierten tipos de datos más grandes a tipos más pequeños. Siempre verifica que la conversión sea segura para evitar resultados inesperados en tu programa. Además, ten en cuenta que las conversiones entre tipos incompatibles pueden lanzar excepciones, por lo que es necesario manejarlas adecuadamente.

---
## Entrada de datos
En Java, la entrada de datos se realiza comúnmente a través de la clase `Scanner` que se encuentra en el paquete `java.util`. La clase `Scanner` permite leer datos de diferentes fuentes, como la entrada estándar (teclado) o archivos. Aquí te dejo un ejemplo básico de cómo utilizar `Scanner` para obtener la entrada del usuario desde la consola:

```java
import java.util.Scanner;

public class EntradaDatos {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada estándar (teclado)
        Scanner scanner = new Scanner(System.in);

        // Solicitar y leer datos de tipo entero
        System.out.print("Ingrese un número entero: ");
        int numeroEntero = scanner.nextInt();

        // Solicitar y leer datos de tipo decimal
        System.out.print("Ingrese un número decimal: ");
        double numeroDecimal = scanner.nextDouble();

        // Solicitar y leer datos de tipo cadena (String)
        System.out.print("Ingrese una cadena de texto: ");
        String texto = scanner.next(); // Lee la siguiente palabra

        // Mostrar los datos ingresados
        System.out.println("Número entero: " + numeroEntero);
        System.out.println("Número decimal: " + numeroDecimal);
        System.out.println("Texto ingresado: " + texto);

        // Cerrar el objeto Scanner para liberar recursos
        scanner.close();
    }
}
```

Este programa solicita al usuario que ingrese un número entero, un número decimal y una cadena de texto. Luego, imprime estos valores en la consola.

Ten en cuenta que:
- `scanner.nextInt()` lee un número entero.
- `scanner.nextDouble()` lee un número decimal.
- `scanner.next()` lee una palabra (hasta encontrar un espacio en blanco).

Recuerda cerrar el objeto `Scanner` utilizando el método `close()` cuando hayas terminado de usarlo para evitar posibles fugas de recursos.

Este es un ejemplo básico, y dependiendo de tus necesidades, podrías necesitar manejar excepciones (por ejemplo, `InputMismatchException`) y utilizar métodos adicionales de `Scanner` para leer líneas completas, etc.

---
## Salida de datos
En Java, la salida de datos se realiza comúnmente a través de la clase `System.out`, que representa la salida estándar (generalmente la consola). Puedes usar el método `println` para imprimir datos seguido de un salto de línea o `print` para imprimir sin salto de línea. Aquí te dejo un ejemplo básico:

```java
public class SalidaDatos {
    public static void main(String[] args) {
        // Imprimir datos usando println
        System.out.println("Hola, Mundo!");
        
        // Imprimir datos usando print
        System.out.print("Este es ");
        System.out.print("un mensaje ");
        System.out.print("sin salto de línea.");

        // Imprimir variables
        int numero = 42;
        double decimal = 3.14;
        String texto = "¡Java es genial!";
        
        System.out.println("\nNúmero: " + numero);
        System.out.println("Número Decimal: " + decimal);
        System.out.println("Texto: " + texto);
    }
}
```

En este ejemplo:

- `System.out.println("Hola, Mundo!");` imprime el mensaje "Hola, Mundo!" con un salto de línea al final.
- `System.out.print("Este es ");`, `System.out.print("un mensaje ");`, y `System.out.print("sin salto de línea.");` imprimen tres mensajes consecutivos sin saltos de línea.
- Las variables `numero`, `decimal`, y `texto` se imprimen utilizando la concatenación con el operador `+`.

Ten en cuenta que `\n` se utiliza para representar un carácter de nueva línea, generando un salto de línea.

Además, puedes formatear la salida usando el método `printf`:

```java
public class FormatoSalida {
    public static void main(String[] args) {
        String nombre = "Juan";
        int edad = 25;
        double altura = 1.75;

        // Formatear la salida usando printf
        System.out.printf("Nombre: %s\nEdad: %d\nAltura: %.2f metros", nombre, edad, altura);
    }
}
```

En este ejemplo, `%s`, `%d`, y `%.2f` son marcadores de posición que serán reemplazados por los valores de `nombre`, `edad`, y `altura`, respectivamente. `%d` es para enteros, `%f` para decimales y `%.2f` limita el número de decimales a dos. 

Estas son solo algunas de las formas comunes de realizar la salida de datos en Java. La elección entre `println`, `print`, `printf` u otras formas dependerá de tus necesidades específicas.

---
## Proyecto de sección: Precio de venta
- Enunciado: Dado el valor de venta de un producto, se debe calcular el Impuesto General a las Ventas (IGV) que es del 18%, y a partir de eso, determinar el precio de venta final.

- Mejora: En esta práctica, vamos a crear un programa en Java que permita al usuario ingresar el valor de venta del producto. Luego, el sistema realizará los cálculos necesarios para hallar el IGV y el precio de venta final. Esta mejora incluirá un código Java que automatiza todo el proceso.

```java
import java.util.Scanner;
public class PrecioVenta {
    public static void main(String[] args) {
        //Instanciar o crear el objeto leer de clase scanner
        var leer = new Scanner(System.in);

        //Ingresar datos desde la consola
        System.out.print("Ingrese valor de venta: ");
        var vv = leer.nextDouble();
        var igv = vv * 0.18;
        var pv = vv + igv;

        System.out.println("Valor de venta: "+ vv);
        System.out.println("IGV: "+igv);
        System.out.println("Precio de venta: " + pv);

    }
}
```
---
## Resumen
En la sección "Variables y Tipos de Datos", el aprendiz consolidó conceptos fundamentales de programación esenciales para la manipulación de información. Ahora, además de comprender variables y tipos de datos, ha adquirido la destreza necesaria para crear aplicaciones simples que gestionan de manera eficaz la entrada y salida de datos, marcando así un avance significativo en su habilidad para desarrollar programas en Java.


