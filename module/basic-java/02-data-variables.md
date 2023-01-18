# Datos y Variables
 
1. [Variables](#Variables)
2. [Declarar Variables](#Declarar-Variables)
3. [Tipos de datos](#Tipos-de-datos)
4. [Entrada de datos](#Entrada-de-datos)
5. [Salida de datos](#Salida-de-datos )
6. [Casting de tipos primitivos](#Casting-de-tipos-primitivos)
 
---
## Variables
### Datos en programación
- La programación es manipular datos  
- Sin los datos la programación no tendría sentido
- Los datos son:
    - Números enteros y flotantes
    - Textos
    - Imágenes
    - Audio
    - Video
    - Etc.  
    
### Variables
- Las variables almacenan datos para su procesamiento
- Las variables representan un espacio en la memoria RAM
- Las variables almacenan datos temporalmente
- Las variables te ayuda a manipular datos
- A una variable se le da un nombre (o identificador ), como area, edad, altura y similares.
- El nombre identifica de forma única cada variable, asignando un valor a la variable y recuperando el valor almacenado.
- Las variables tienen tipos:
    - `int`: para enteros (números enteros) como `123 `y` -456`
    - `double`: para números reales o de coma flotante con puntos decimales opcionales y partes fraccionarias en notaciones fijas o científicas, como `3.1416`, `-55.66`.
    - `String`: para cadena de caracteres o textos que va entre comillas dobles `"Hola"`.
    - `char`:para un carácter y va entre comillas simples como `'A'`,

#### Declaración de una variable:
Con tipo de datos 
~~~
tipo-dato nombre-variable;
~~~

Sin tipo de datos 
~~~
var nombre-variable = inicializar-con-tipo-de-dato-que-va-almacenar;
~~~
 
### Reglas para definir una variable
 
- Por convecino en nombre de variable inicia con letra minúscula.
- Debe ser un juego de caracteres comprendido en la codificación Unicode.
- No puede ser una palabra clave de Java (int, public, static void, true, false, etc).
- No deben tener el mismo nombre que otra variable o método.
- El nombre de variable usa la nomenclatura de CamelCase
 
Ejemplo de Variable:
~~~java
int numeroEntero;
~~~
 
---
## Declarar Variables
Para declarar variables:
~~~java
String name;
int age;
~~~
Asignación de valor a una variable declarada:
~~~java
name = "Alex";
age = 27;
~~~
 
Modificar el valor de una variable.
~~~java
name = "Alex Roel"
~~~
 
Declarar variables inicializada con un valor:
 
~~~java
double size = 1.67
char group = 'Z'
~~~
### Declarar múltiples Variables
 
Ejemplo de declaración de múltiples variables variables.
 
~~~java
 
int a, b, c;
 
a = 10; b = 20; c = 30;
 
int suma = a + b + c;
 
suma;
~~~
 
 
### Declarar Variables dinámica
 
~~~java
 
var numInt = 100;
 
numInt;
~~~
 
 
---
## Tipos de datos
### Tipos de datos primitivos
Son aquellos que nos proporciona el lenguaje y con los que podemos construir tipos de datos abstractos y estructuras de datos.
 
|Tipo de datos|Byte|Tamaño en Bits|Descripción|Valor por defecto|
|--------------|----|--------------|-----------|-----------------|
|`byte`|`1 byte`| `8 bits`|Almacena números enteros de -128 a 127|`0`|
|`short`|`2 byte`| `16 bits`|Almacena números enteros de -32,768 a 32,767|`0`|
|`int`|`4 byte`| `32 bits`|Almacena números enteros de -2,147,483,648 a 2,147,483,647|`0`|
|`long`|`8 byte`| `64 bits`|Almacena números enteros de -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807|`0L` o `0`|
|`float`|`4 byte`| `32 bits`|Para números más grandes que long o números decimales. Su valor mínimo es 1.4E-45 y el máximo 3.4028235E38|`0.0f` o `0.0`|
|`double`|`8 byte`| `64 bits`|Almacena números decimales con suficiente para almacenar 15 dígitos decimales, o números grandes con doble precisión. 4.9e-324 a 1.7976931348623157e308 |`0.0d` o `0.0`|
|`char`|`2 byte`| `16 bits`|Almacena un carácter, código ASCII o Unicode|`u0000` o `\000`|
|`boolean`|| `1 bits`|Almacena valores verdaderos o falsos (true y false)|`false`|
 
### Tipos Estructurados
- `String` - Para cadena de caracteres.
- Arrays - para colecciones de datos
- Clases de la biblioteca estándar Java
- Clase de terceros
- Clase propias
- Interfaces
- Clases Wrapper
- Etc.  
 
Ejemplo de String.
~~~java
String nombreCompleto;
~~~
 
Declaración para números enteros primitivos.
 
Tipo primitivo Byte:
~~~java
byte numByte;
numByte = 127;
~~~
 
---
## Entrada de datos
- Clase Scanner es de api de Java para entrada de datos por la terminal.
- Con esta clase podemos escanear datos desde el teclado.
 
### Métodos de la clase Scanner
- nextLine() o next()
- nexByte()
- nextShort()
- nextInt()
- nextLong()
- nextDouble()
- nextFloat()
- next().charAt(0)
- nextBoolean(): 
 
~~~java
import java.util.Scanner;
public class EntraDatos {
    public static void main(String[] args){
        //Definición de Variables
        String name;
        int age;
 
        //Instanciar o crear el objeto leer de clase scanner
        Scanner leer = new Scanner(System.in);
 
        //Ingresar datos desde la consola
        System.out.println("Ingrese su Nombre: ");
        name = leer.nextLine();
 
        System.out.println("Ingrese su Edad: ");
        age = leer.nextInt();
 
        //Salida de datos
        System.out.println("☺============☺==================☺");
        System.out.println("Hola "+ name + " tu edad es " + age);
        System.out.println("☺============☺==================☺");
~~~
 
---
## Salida de datos
 
- Más métodos de la clase System
    - println()
    - print()
    - printf()
 
- Caracteres para formateara información
    - %s -> Imprime cadena de caracteres
    - %d -> Imprime números enteros
    - %f -> Imprime números decimales
- Los caracteres especiales por demos se usan dentro de comillas dobles para realizar acciones como nueva línea, tabulador o escapar algún carácter.
    - \’  -> Realiza un escape para que se imprima la comillas simple dentro de comillas simples.
    - \”  -> Realiza un escape para que se imprima las comillas dobles dentro de comillas dobles.
    - \\\  -> Realiza un escape para que imprima el contra barra diagonal como un carácter.
    - \n  -> Realiza un salto de línea.
    - \t  -> Genera un espacio de un tabulador.
    - \b  -> Borra un carácter hacia la izquierda.
 
 
 
~~~java
import java.util.Scanner;
public class EntraDatos {
    public static void main(String[] args){
        //Definición de Variables
        String name;
        int age;
 
        //Instanciar o crear el objeto leer de clase scanner
        Scanner leer = new Scanner(System.in);
 
        //Ingresar datos desde la consola
        System.out.print("Ingrese su Nombre: ");
        name = leer.nextLine();
 
        System.out.print("Ingrese su Edad: ");
        age = leer.nextInt();
 
        //Salida de datos
        System.out.println("☺============☺==================☺");
        System.out.printf("Hola %s, tu edad es %d\n", name, age);
        System.out.println("☺============☺==================☺");
~~~
 
---
## Casting de tipos primitivos
Para convertir de un tipo de dato primitivo a otro, solo colocamos el tipo de dato antes del valor. Como se muestra en los siguientes ejemplos.
 
Flotante a entero.
~~~java
int numInt = (int) 4.5;
int numInt = (int) 4.5f;
~~~
 
Entero a flotante:
 
~~~java
double numDouble = (double) 100;
~~~
 
De enteros a Char:
~~~java
char valorChar = (char) 4; // '\004'
char valorChar = (char) 64; //'@'
~~~
 
De Flotante a Char
~~~java
char valorChar = (char) 4.5; // '\004'
char valorChar = (char) 64.45; //'@'
~~~
 
De char a entero.
~~~java
int valorInt = (int) '\004'; // '\004'
int valorInt = (int) '@'; //'@'
~~~

---

## Practica: Precio de venta

~~~java
import java.util.Scanner;

public class PrecioVenta {
    public static void main(String[] args) {
        var leer = new Scanner(System.in);
        
        System.out.print("Ingrese valor de Venta: ");
        var vv = leer.nextDouble();
        //IGV 18%
        var igv = vv * 0.18;
        var pv = vv + igv;
        
        System.out.println("Valor Venta: "+vv);
        System.out.println("IGV: "+ igv);
        System.out.println("Precio de Venta: "+ pv);
    }
}
~~~