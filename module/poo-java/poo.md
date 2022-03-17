# Introducción a POO

1. [Qué es POO](#Qué-es-POO)
2. [Clases y Objetos](#Clases-y-Objetos)
3. [Alcance de Variables](#Alcance-de-Variables)
4. [Uso de This](#Uso-de-This)
5. [Constructores](#Constructores)
6. [Sobrecarga de Constructores](#Sobrecarga-de-Constructores )

---
## Qué es POO

Java utiliza Programación Orientada a Objetos ( POO ), un estilo de programación que pretende hacer que pensar en la programación se acerque más a pensar en el mundo real. En POO, cada objeto es una unidad independiente con una identidad única , tal como lo son los objetos en el mundo real.


### Paradigma de Programación 
- Teoría que se aplica para resolver problemas en la programación.
    - Programación estructura 
    - Programación Orientada a Objetos 
    - Programación Funcional 
    - Otros 

### Elementos de POO
- Clases        - Molde o modelo 
- Propiedades   - Atributos 
- Métodos       - Comportamientos 
- Objetos       - Instancia de una Clase 

### Pilares de POO 
- Abstracción 
- Herencia 
- Polimorfismo
- Ecapsulamiento 

### ¿Qué son los Objetos?
Para resolver problemas en programación con esta paradigma tenemos  que identificar Objetos en el problema.

En la programación orientada a objetos, cada objeto tiene tres dimensiones: 
- Identidad 
- Atributos 
- Comportamiento

Los atributos describen el estado actual del objeto y lo que el objeto es capaz de hacer se demuestra a través del comportamiento del objeto.
- Identidad : Auto 
- Propiedades 
    - Nombre 
    - Color 
    - Modelo 
    - Tamaño 
    - Forma 
- Comportamiento
    - Mover 
    - Frenar 
    - Girar a la derecha 
    - Girar a la Isquierda 

### Objeto Conceptual y Físico
- Los objetos conceptuales son aquellos que no se puede tocar. 
- Los objetos físicos son aquellos objetos que se pueden tocar. 

![Abstraccion ](img/objetos.jpg) 


### ¿Qué son las Clases?
- Es el modelo sobre el cual se construye los objetos.
- Una clase describe lo que será el objeto, pero está separada del objeto mismo.
- Las clases se pueden describir como planos, descripciones o definiciones para un objeto. Puede usar la misma clase como modelo para crear varios objetos. 
- El primer paso es definir la clase luego de identificar un objeto, que luego se convierte en un modelo para la creación de objetos. 
- Cada clase tiene un nombre y cada una se usa para definir atributos y comportamiento .

### Absttracción 
Analiza objetos para crear clases

![Abstraccion ](img/abstraccion.jpg) 

### Partes de una Clase 
- Indentidad        -> Nombre de la Clase  
- Estado            -> Atributos 
- Comportamientos   -> Métodos

Ejemplo de Clases y Objetos 

![clases-objetos ](img/clases-objetos.jpg) 



---
## Clases y Objetos 
### Crear clases
Para crear sus propios objetos personalizados, primero debe crear las clases correspondientes.

~~~java
//Crear clase 
public class Person{
    //Atributos 
    String name;
    int age; 
    double heigth; 

    //Métodos 
    public void showData(){
        System.out.printf("Nombre: %s\nEdad: %d\nAltura: %f\n", name, age, heigth);
    }
}
~~~

### Crear objetos 
Para crear objetos de una clase se usa el nombre de clase y la palabra clave `new`;
~~~java
//Crear clase 
public class Poo{
    
    public static void mian(String[] args){

        Peroson p1 = new Person();
        p1.name = "Alex";
        p1.age = 27;
        p1.heigth = 1.67;

        p1.showData();
    }
}
~~~

---
## Uso de This 
La mejor forma de trabajar con los atributos de la clase es usando `this`, con esta instrucción podemos referirnes especificamente al atributo de  clase. 

~~~java
package models;

public class Person {
    //Atributos
    public String name;
    public int age;
    public double heigth;

    //Métodos
    public void editData(String name, int age, double heigth){
        this.name = name;
        this.age = age;
        this.heigth = heigth;
    }

    public void showData(){
        String name = "Carlos";
        System.out.printf("Nombre: %s\nEdad: %d\nAltura: %f\n",
                this.name, this.age, this.heigth);
    }
}
~~~


---
## Constructores 
Los construtores construyen Objetos de manera mas directa y facil. 

~~~java
    //Costructores
    public Person(String name, int age, double heigth){
        this.name = name;
        this.age = age;
        this.heigth = heigth;
    }
~~~

---
## Sobrecarga de Constructores 
Podemos hacer sobre carga de construtores para crear diferentes tipos de objetos. 

~~~java
    //Costructores
    public Person(){
        //Costructor vacio}
    }

    //Costructor con un solo atributo
    public Person(String name){
        this.name = name;
    }

    //Costructor con todos los atrbutos
    public Person(String name, int age, double heigth){
        this.name = name;
        this.age = age;
        this.heigth = heigth;
    }
~~~

---
## Modificadores de acceso 
Los modificador de acceso se utiliza para establecer el nivel de acceso. Puede utilizar modificadores de acceso para clases, atributos y métodos. Para las clases, los modificadores disponibles son públicos o predeterminados (se dejan en blanco), como se describe a continuación: 

- `public` : la clase, variable o método es accesible para cualquier otra clase. 
- `default` : solo las clases del mismo paquete pueden acceder a la clase. Las siguientes opciones están disponibles para atributos y métodos, una variable o método declarado sin modificador de control de acceso está disponible para cualquier otra clase en el mismo paquete. 
- `private` : Accesible solo dentro de la propia clase declarada.
- `protected`: proporciona el mismo acceso que el modificador de acceso predeterminado, con la adición de que las subclases pueden acceder a métodos y variables protegidos de la superclase (las subclases y las superclases se tratan en las próximas lecciones).

~~~java
package models;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}
~~~

---
## Encapsulamiento

- Ocultar el estado de los datos.
- Acceder y modificar mediante métodos creados para cada atributo.

### Getters y Setters

Ocultas los datos con el modificador de acceso `private`. 

~~~java
private String name;
private int age;
~~~

Para modificar y optener los datos usas métodos Getters y Setters. 

~~~java
    //Getters y Setters
    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
~~~

---
## Variables y Objetos 
Variables son entidades elementales (muy sencillas)
- Un número
- Un caractér
- Un valor verdadero falso

Objetos son entidades complejas que pueden estar formadas por la agrupación de muchas variables y métodos.

~~~java
        Person p1 = new Person("Alex", 27);
        Person p2 = new Person("Roel", 30);

        //Referencia de la memoria
        System.out.println(p1);
        System.out.println(p2);

        //Comparar dos objetos
        System.out.println(p1 == p2);

        //Asignar la referencia
        p2 = p1;


        System.out.println(p1.getName());
        System.out.println(p2.getName());

        p2.setName("Calos");

        System.out.println(p1.getName());
        System.out.println(p2.getName());

        System.out.println(p1 == p1);   
~~~




