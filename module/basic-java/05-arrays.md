# Arrays

1. [Arreglos](#arreglos)
2. [Bucle y Array](#Bucle-y-Array)
3. [Iterador FOR EACH](#Iterador-FOR-EACH)
4. [Array-Multidimensional](#Array-Multidimensional)

---
## Arreglos
Una matriz es una colección de variables del mismo tipo. Cuando necesite almacenar una lista de valores, como números, puede almacenarlos en una matriz, en lugar de declarar variables separadas para cada número. Para declarar una matriz, debe definir el tipo de los elementos entre corchetes.

Declarar un matriz: 

~~~java
int[] array1; 
~~~

### Una matriz con cantidad de elementos 

- El tipo de elementos que contendrá es `int`.
- El nombre de la matriz `array1`.
- Ahora, debe definir la capacidad de la matriz o la cantidad de elementos que contendrá. Para lograr esto, use la palabra clave `new`. 

~~~java

int[] array1 = new int[5]; 

/*
-------------------------------
Elementos |   |   |   |   |   |  => 0
-------------------------------
Índices   | 0 | 1 | 2 | 3 | 4 |
-------------------------------
*/

~~~

Asignar valores a la matriz: 

~~~java

array1[0] = 100;
array1[1] = 200;
array1[2] = 300;
array1[3] = 400;
array1[4] = 500;

/*
-------------------------------
Elementos |100|200|300|400|500| 
-------------------------------
Índices   | 0 | 1 | 2 | 3 | 4 |
-------------------------------
*/

~~~
### Matriz Inicializada

~~~java

int[] array1 = {10, 20, 30, 40, 50}; 
/*
-------------------------------
Elementos |10 |20 |30 |40 |50 |  
-------------------------------
Índices   | 0 | 1 | 2 | 3 | 4 |
-------------------------------
*/

~~~

---
## Bucle y Array 

### Longitud de la matriz 
Puede acceder a la longitud de una matriz (la cantidad de elementos que almacena) a través de su propiedad de longitud .

~~~java

int[] array1 = {10, 20, 30, 40, 50}; 

array1.length; // 5
/*
-------------------------------
Elementos |10 |20 |30 |40 |50 |  => 5 Elementos 
-------------------------------
Índices   | 0 | 1 | 2 | 3 | 4 |
-------------------------------
*/

~~~

### Suma de elementos de array 
- Ahora que sabemos cómo configurar y obtener elementos de matriz, podemos calcular la suma de todos los elementos de una matriz mediante el uso de bucles.
- El ciclo for es el ciclo más utilizado cuando se trabaja con arreglos, ya que podemos usar la longitud del arreglo para determinar cuántas veces ejecutar el ciclo.

~~~java

int[] array1 = {10, 20, 30, 40, 50}; 
int sum = 0; 

for (int i = 0; i < array1.length; i++){
    sum += array1[i];
}

System.out.println(sum); //150
~~~

--- 
## Iterador FOR EACH
El bucle for mejorado (llamado bucle "for each") se utiliza para atravesar elementos en matrices. Las ventajas son que elimina la posibilidad de errores y hace que el código sea más fácil de leer.

~~~java

String[] names = {"Alex", "Roel", "Juan", "Pedro", "Carlos"};

for (int i = 0; i < names.length; i++){
    System.out.println(names[i]);
}
~~~
Usando el For Mejorado. 
~~~java

String[] names = {"Alex", "Roel", "Juan", "Pedro", "Carlos"};

for (String name : names){
    System.out.println(name);
}
~~~

---
## Array Multidimensional 
Los arreglos multidimensionales son arreglos que contienen otros arreglos. La matriz bidimensional es la matriz multidimensional más básica.
Para crear matrices multidimensionales, coloque cada matriz dentro de su propio conjunto de corchetes.

### Matriz Bidimensional 
~~~java

int[ ][ ] x = { {1, 2, 3}, {4, 5, 6}, {7, 8} };

/*
Filas / Columnas    Columna 1       Columna 2       Columna 3
-----------------------------------------------------------------
Fila 1              x [0][0] = 1    x [0][1] = 2    x [0][2] = 3
Fila 2              x [1][0] = 4    x [1][1] = 5    x [1][2] = 6
Fila 3              x [2][0] = 7    x [2][1] = 8
*/

x[2][1]; //Acceder un alimento

for (int[] row : x){
    for (int value : row){
        System.out.println(value);
    }
}

~~~

### Array tridimensional java
Una matriz tridimensional es una matriz que contiene matrices, pero a la ves estos matrices contienen otros matrices.

~~~java
int [][][] x = {
        {
            {1,2,3},
            {4,5,6},
        },
        {
            {-1,-2,-3},
            {-4,-5,-6},
        },
    };

    // El primer for recorre el matriz de 3D que itera matrices en 2D 
    for (int[][] matriz2D: x) {
        //El Segundo for recorre matrices de 2D que itera matrices en 1D 
        for (int[] matriz1D: matriz2D) {
            //El tercer for recorre matrices de 1D que itera los datos 
            for(int dato: matriz1D) {
                System.out.println(dato);
            }
        }
    }
~~~


