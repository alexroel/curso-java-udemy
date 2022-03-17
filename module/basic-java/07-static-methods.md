# Métodos Estáticos 
1. [Función o Método en Java](#Función-o-Método-en-Java)
2. [Declarar Métodos](#Declarar-Métodos)
3. [Alcance de Variables](#Alcance-de-Variables)
4. [Métodos y Variables estáticas](#Métodos-y-Variables-estáticas)
5. [Sobrecarga de métodos](#Sobrecarga-de-métodos)
6. [Uso de Final](#Uso-de-Final)
7. [Argumentos indefinidos](#Argumentos-indefinidos)
8. [Método Recursivo](#Método-Recursivo)

---
## Función o Método en Java
### ¿Qué es una Función?
- Una función es un bloque de código que realiza una tarea o una función.
- Este bloque de código se puede ejecutar llamando directamente el nombre de la función. 
- Una funcione puede ejecutar un bloque de código, también puede realizar una petición médiate parámetros y puede devolver un valor de acuerdo a la petición.

### Diferencia entre una Función y Método 
- Una función y un método pude funcionar similar ya que ambos pueden realizar las mismas tareas o funciones y también pueden ejecutarse al llamar su nombre o también puede recibir valore médiate parámetros y devolver valores.

- La diferencia entre función y método es que un método está asociado a un objeto ósea es una función de un objeto, pero una función trabaja por si sola, a un método tienes que acceder médiate un objeto, pero a una función no.

- En otros lenguajes de programación una función va dentro de un módulo o archivo.
- En Java se le llama métodos estáticos ya tiene las características de una función y tiene que ir dentro de una clase. 

#### Método
~~~java 
//Ejemplo de Definición 
class String{
    method nextInt(){}
    method nextLine(){}
}

//Ejemplo de Ejecución 
Scanner read = new Scanner(System.in);

read.nextInt()
~~~

#### Función
~~~java 
//Ejemplo de Definición 
class Functions{
    function sum(int a, int b){}
    function subtract(int a, int b){}
}

//Ejemplo de Ejecución 
sum()
subtract()
~~~

### Modularidad
El modularidad en programación modular y más específicamente en programación orientada a objetos, la propiedad que permite subdividir una aplicación en partes más pequeñas, cada una de las cuales debe ser tan independiente como sea posible de la aplicación en sí y de las restantes partes.

- Reutilizar 
- Evitar Colapsos
- Mantenible 
- Legibilidad 
- Solución rápida de Problemas

### Modularidad en Java  
- Dividir el programa en diferentes partes de módulos / clases
- Separara las clases u otro tipo de estructuras en archivos / paquetes

---
## Declarar Métodos
Un método es una colección de instrucciones que se agrupan para realizar una operación. `System.out.println()` es un ejemplo de un método.
Puede definir sus propios métodos para realizar las tareas deseadas.

~~~java
public class Methods {

    public static void main(String[] args) {

        //Run method greet()
        greet("Alex", 26);
    }

    //My Methods
    public static void greet(String name, int age){
        System.out.printf("Hola %s y tu edad es %d ", name, age);
    }
}

~~~

## Módulos y Paquetes
Para modularizar nuestra aplicación con módulos y paquetes, podemos crear un paquete y dentro de una clase con sus funciones. 

- Nombre de paquete `mate`
- Nombre de modulo o clase `Geometry`

### Métodos dentro de la clase 

~~~java
    //Métodos estáticos 
    public static int areaSquare(int side){
        return side * side;
    }

    public static  int perimeterSquare(int side){
        return 4 * side;
    }
~~~

### Llamada de método
- Cuando trabajas con paquetes, para acceder a funciones de otras clases tenemos que importar.
- Puede llamar a un método tantas veces como sea necesario.
- Cuando se ejecuta un método, el código salta a donde está definido el método, ejecuta el código dentro de él, luego retrocede y pasa a la siguiente línea.

~~~java
//Iportar la clase de métodos estáticos 
import mate.Geometry;

        //Llamado de métodos
        Geometry.areaSquare(4);
        Geometry.perimeterSquare(4);

~~~
---
## Alcance de Variables
Las variables definida en una clase es para toda la clase como los atributos, pero variables definida en métodos solo es para ese método o función. 

~~~java
    public void anotherMethod(){
        String text = "Hola Mundo";
    }
~~~

las atributos y métodos sin la palabra reservada public solo solo se puede acceder del archivo o del mismo paquete. 

---
## Métodos y Variables estaticas 
También podemos trabajar con variables estáticas que se puedan acceder de manera directa desde otras partes del proyecto.

~~~java
    //Variable estática 
    public static double pi;

~~~

Los métodos y variables estáticas puedes importar usando `static` para usar de manera directa.
~~~java
//Importar la clase de métodos estáticos
import static  mate.Geometry. *;

        //llamado de variable
        pi = 3.141592;

        //Llamado de métodos
        areaSquare(4);
        perimeterSquare(4);
~~~

---
## Sobrecarga de métodos 
Con la sobre carga de métodos al igual que los constructores podemos crear métodos con el mismo nombre pero que realice  diferente acción. 

~~~java
    //Métodos estáticos
    public static int areaSquare(int side){
        return side * side;
    }

    public static double areaSquare(double side){
        return side * side;
    }

    public static  int perimeterSquare(int side){
        return 4 * side;
    }
    public static  double perimeterSquare(double side){
        return 4 * side;
    }
~~~

---
## Uso de Final 
Los `final` son constantes en java, solo se puede asignar una vez el valor y luego ya no se puede modificar. Para diferenciar de las variables la nomenclatura de los constantes son de pura mayúscula. 

~~~java
    //Variable estática y Constante
    public static final double PI = 3.14159265;

    //Uso de constantes
    public static double areaCircle(double radio){
        return 2 * PI * radio;
    }

    public static double perimeterCircle(double radio){
        return PI*(radio * radio);
    }

~~~

---
## Argumentos indefinidos 
Hasta ahora podemos crear métodos que tengan dos o más parámetros, pero si tenemos un problema de que no sabemos exactamente cuántos argumentos se enviaran a una función o método, como por ejemplo: queremos un método que realice n sumas de números. 

~~~java
//Método con argumentos indefinidos
    public  static  int sum(int... nums ){
        int sum = 0;
        for (int num : nums ){
            sum += num;
        }

        return sum;
    }
~~~

---
## Método Recursivo

Un método recursivo o función recursiva es aquel método o función que se ejecuta así misma. 

~~~java
    //Método recursivo
    public static int factorial(int n){
        if (n > 1){
            n = n * factorial(n - 1);
        }

        return n;
    }

    //Cuenta regresiva con Recursivo
    public static void countdown(int n){
        n--;

        if (n > 0){
            System.out.println(n);
            countdown(n);
        }else{
            System.out.println("Llego hasta 0");
        }
    }
~~~











