# Clase String 

1. [¿Qué es String?](#¿Qué-es-String?)
2. [Comparar y Concatenar String](#Comparar-y-Concatenar-String)
3. [Métodos de instancia](#Métodos-de-instancia)
4. [Métodos Estáticos](#Métodos-Estáticos)
5. [Invertir una Cadena](#Invertir-una-Cadena )
6. [Clase StringBuilder](#Clase-StringBuilder)

---
## ¿Qué es String?
- La clase String representa cadenas de caracteres. Todos los literales de cadena en los programas Java, como "abc", se implementan como instancias de esta clase.
- Los String son objetos de Java, de tipo de referencia. Aunque también los String se pueden representar con una sintaxis especialmente cómoda. 
- El tipo String tiene una característica especial, que permite crear objetos como si estaríamos declarando una literal. 

~~~java
String name = "alex";

char data[] = {'a', 'l', 'e', 'x'};
String name = new String(data);

String nombre = "Alex Roel";

String nombre = new String("Alex Roel");
~~~

Mas sobre la Clase String: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html

---
### Comparar y Concatenar String 
- String es un objeto por lo tanto si usamos el operador relacional igualdad `==` lo comparara por referencia de la memoria. 
- Para comparar String se usa `equals()` para comparar por valor. 
~~~java
String name1 = "Alex";
String name2 = new String ("Alex"); 

name1 == name2; //false

name1.equals(name2); //true

String name3 = "Alex";

name1 == name3 //true

~~~

- Con el operador suma `+` podemos concatenar cadena de caracteres como Strings.

~~~java
String primerNombre = "Alex";

String segundoNombre = "Roel";

//Operador de suma 
String nombreCompleto = primerNombre + " " + segundoNombre;

// Método concat()

String nombreCompleto = primerNombre.concat(" ").concat(segundoNombre);
~~~

--- 
## Métodos de instancia
### charAt(x)
Este con este método puedes acceder a cada índice de esta cadena, ósea a cada carácter de una cadena de caracteres.

~~~java
/* 
+----+----+---+---+
| J | a  | v | a | 
+----+----+---+---+
| 0  | 1  | 2 | 3 | 
+----+----+---+---+
 */
        
String nombre = "Java";
System.out.println(nombre.charAt(3));

char a = nombre.charAt(3);
        
//Salida 
 // a
~~~
### length()
Este método te devuelve la cantidad de caracteres de una cadena de carácter. Con esto podemos iterar los caracteres de una cadena.   

~~~java  

String nombre = "Java";
nombre.length(); //4

~~~

### substring(x,y)
Este método usando los índices que saca un trozo de una cadena, ose una su cadena de una cadena.  Si le enviar un valore te devolverá una sub cadena dese ese índice hasta final.

~~~java
String nombre = "Java";
nombre.substring(2);
//Salida
// va
        
nombre.substring(0, 2);
 //Salida
// Ja
~~~

### toLowerCase()
Este método convierte una cadena de carácter a minúscula.

~~~java
String nombre = "Java";
nombre.toLowerCase();
//Salida
// java
~~~

### toUpperCase()
Este método convierte una cadena de carácter a mayúscula.
~~~java
String nombre = "Java";
nombre.toUpperCase();
//Salida
// JAVA
~~~

### replace(x, y)
A este método se envía dos argumentos el primero el carácter que quieres remplazar por segundo argumento
~~~java
String nombre = "J a v a";
nombre.replace(" ", "-");
//Salida
// JAVA
~~~

### toCharArray()
A este método convierte un String a un array de Char 
~~~java
String nombre = "Java";
char[] data = nombre.toCharArray();
//Salida
// JAVA
~~~

### split(x)
A este método convierte un String a un array.
~~~java
String nombres = "Alex Roel Code";
nombres.split(" ");
//Salida
// JAVA
~~~

### equals()
Este método se usa para comprar dos valores de cadena de carácter si son iguales o no y devuelve un valor booleano.

~~~java
String nombre = "Java";
nombre.equals("Java");
//Salida
// true
~~~

### concat()
Para concatenar dos o más Strings. 

~~~java
String nombre = "Java";
nombre.concat("Java");
//Salida
// JavaJava
~~~

---
## Métodos Estáticos 

### Caracteres especiales para formato de una cadena 

-----------------------------------------------------------------
|Tipo de formato    |Tipo de datos  |Salida                     
|-------------------|---------------|---------------------------
|`%a`   |Punto flotante |Valor hexadecimal del número de coma flotante
|`%b`   |Cualquier tipo |"Verdadero" si no es nulo y "Falso" si no es nulo
|`%c`   |Carácter   |Personaje Unicode
|`%d`   |Entero |Entero decimal
|`%e`   |Punto flotante |Número decimal en notación científica
|`%f`   |Punto flotante |Número decimal
|`%g`   |Punto flotante |Número decimal en notación científica basado en precisión y valor
|`%h`   |Cualquier tipo |Valor de cadena hexadecimal del método hashCode ()
|`%n`   |Ninguna    |Separador de línea específico de la plataforma
|`%o`   |Entero |Número octal
|`%s`   |Cadena de caracteres   

### Formatear información y guardar en una variable. 

~~~java
String nombre = "Alex";

int edad = 27;

String salida = String.format("Nombre: %s Edad: %d ", nombre, edad);
~~~

### Convertir tipos primitivos a String 

~~~java
String.valueOf(453);
String.valueOf(45);

String.valueOf(4.5);

String.valueOf(true);

String.valueOf('A');

char a = 97;

String.valueOf(a);

String.valueOf('\u0040')

char[] data = {'J', 'a', 'v', 'a'};
String.valueOf(data);
~~~

### Convertir un array de String a String 
Convertir un Array a String 

~~~java 
String[] names = {"Alex", "Roel", "Juan" };

String.join(" ", names)
//Salida ==> "Alex Roel Juan"
~~~

---
## Invertir una Cadena 
Ingrese un texto el sistema que devuelva un texto invertido. Para resolver este problema usa los métodos de la Clase String y todo lo que aprendiste hasta ahora. 

~~~

Ingrese un texto: Hola Java

Texto Invertido: avaJ aloH

~~~
~~~java
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Ingresar datos
        System.out.print("Ingrese un texto: ");
        String text = scanner.nextLine();

        //your code goes here
        char[] inverArr = new char[text.length()];

        int j = 0;
        for(int i = text.length()-1; i >= 0; i--){
            inverArr[j] = text.charAt(i);
            j++;
        }

        String textInver = String.valueOf(inverArr);
        System.out.println(textInver);
    }
}
~~~

---
## Clase StringBuilder
Una vez creado un objeto String, su contenido ya no puede variar. Ahora veremos las características de la clase StringBuilder para crear y manipular información de cadenas dinámicas. Cada objeto StringBuilder es capaz de almacenar diferentes caracteres especificados por su capacidad. Si se excede la capacidad de un objeto StringBuilder, esta se expande de forma automática para dar cabida a los caracteres adicionales.

### Costructores de StringBuilder

~~~java
StringBuilder obj1 =  new StringBuilder();
StringBuilder obj1 =  new StringBuilder(10);
StringBuilder obj1 =  new StringBuilder("Hola");
~~~

### Métodos de StringBuilder 

~~~java
obj1.capacity();

obj1.length();

obj1.reverse();

obj1.append("Mundo");

obj1.delete(0, 4);

obj1.insert(0, "Hola");

obj1.toString();

StringBuilder obj1 =  new StringBuilder("Hola");
//Salida ==> Hola

obj1.replace(2,4,"ja")
//Salida ==> Hoja

~~~

