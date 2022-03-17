# Operadores y Expresiones
 
1. [Operadores Aritméticos](#Operadores-aritméticos)
2. [Operadores en Asignación](#Operadores-en-Asignación)
3. [Operadores Relacionales](#Operadores-Relacionales)
4. [Operadores Lógicos](#Operadores-Lógicos)
5. [Operadores de Incremento y Decremento](#Operadores-de-Incremento-y-Decremento)
6. [Operadores Unarios](#Operadores-Unarios)
7. [Operador Ternario](#Operador-Ternario)
8. [Clase Math](#Clase-Math)
 
 
---
## Operadores aritméticos
Java proporciona un rico conjunto de operadores para usar en la manipulación de variables. Un valor que se usa a ambos lados de un operador se llama operando.
- `+` suma
- `-` resta
- `*` multiplicación
- `/` división
- `%` módulo
 
Los operadores aritméticos se usan en expresiones matemáticas de la misma manera que se usan en ecuaciones algebraicas.
 
 
### Adición
El operador `+` suma dos valores, como dos constantes, una constante y una variable, o una variable y una variable.
 
~~~java
int a = 10;
int b = 20;
 
int suma1 = a + b;
 
int suma2 = suma1 + 50;
 
double suma3 = 4.5 + 7.5;
~~~
 
### Resta
El operador `-` resta un valor al otro.
 
~~~java
int a = 50;
int b = 20;
 
a - b
~~~
 
### Multiplicación
El operador `*` multiplica dos valores.
~~~java
int a = 4;
int b = 5;
 
a - b  
~~~
 
### División
El operador `/` divide un valor por otro.
 
~~~java
int a = 20;
int b = 2;
 
int dive1 = a / b; //División entera
 
int a = 3;
int b = 2;
 
double dive2 = 3.0 / 2.0 // División exacta
dive2 = (double) a / b
~~~
 
### Módulo
La operación matemática módulo (o resto) realiza una división entera de un valor por otro y devuelve el resto de esa división.El operador para la operación de módulo es el carácter de porcentaje (%).
 
~~~java
4 % 2 // Resto es 0
 
3 % 2 // Resto es 1
 
int a = 23
int res = a % 6; // Resto es 5
~~~
 
### Expresiones
Al igual que en álgebra, puedes usar todas las operaciones en una sola línea. Por ejemplo: `int x = 10 + 5 - 2 * 3`;
 
~~~java
int x = 10 + 5 - 2 * 3 // Resultado 9
 
int x = 2 * 5 + (4 - 4 * 2) // Resultado 6
int x = (2 * 5 + (4 - 4 * 2))/2 // Resultado 3
 
int a = 2
int b = 5
int c = 4
 
int y = (a * b + (c - c * a))/a
~~~
 
---
## Operadores en Asignación
Los operadores en asignación asignan un valor a una variable y también se puede realizar suma en asignación y de todos los operadores aritméticos.
- `=` Asigna un valor
- `+=` Suma en asignación
- `-=` Resta en asignación
- `*=` Multiplicación en asignación
- `/=` División en asignación
- `%=` Módulo en asignación
 
 
~~~java
int a = 0
 
a = a + 2
 
a += 2
a += 2
a += 2
~~~
 
Potencia de 3 a 4:
 
~~~java
// r = 3 * 3 * 3 * 3
int a = 3
 
a *= 3 //3 * 3 = 9
a *= 3 // * 3 = 27
a *= 3 // * 3 = 81
a
~~~
 
---
## Operadores Relacionales
Los operadores relacionales son para comparar dos valores literales o valores de las variables, y de acuerdo a la comparación devuelve un valor booleano si es verdad o falso (true o false).
- `==` Igualdad
- `!=` Distinto
- `>` Mayor que
- `<` Menor que
- `>=` Mayor o Igual que
- `<=` Menor o Igual que
 
~~~java
4 == 4
4 == 4.5
 
int a = 2
int b = 3
 
boolean r = a == b
boolean r = a != b
boolean r = a > b
boolean r = a < b
boolean r = a >= b
boolean r = a <= b
~~~
 
Comparaciones con tipos de datos de tipo char:
 
~~~java
boolean r = 'a' == 'a'
boolean r = 'a' == 97
 
int a = 97
 
boolean r = 'a' == a
 
boolean r = 'a' < 'b'
boolean r = 'a' != 'b'
 
~~~
 
---
## Operadores Lógicos
Los operadores lógicos niegan y comparan dos valores booleanos y devuelve otro valor booleano, cada uno tiene sus propios reglamentos.
 
### Not(!):
El operador NOT niega un valor booleano;
~~~java
boolean r = ! true
boolean r = ! false
~~~
 
### AND(&&):
El operador AND compara dos valores booleanos y devuelve true cuando ambos valores son true, si uno o todos son false  devuelve false.
 
~~~java
boolean r = true && true // True
boolean r = true && false // false
boolean r = false && true // false
boolean r = false && false // false
~~~
 
### OR( || ):
Operador or también compara dos valores booleanos y devuelve otro valor booleano, devuelve true cuando al menos uno es true y devuelve false cuando todos son false;
~~~java
boolean r = true || true // True
boolean r = true || false // True
boolean r = false || true // True
boolean r = false || false // false
~~~
 
### Expresiones anidadas
En la forma como se resuelve una expresión es de la siguiente manera
- `()` Primero todo lo  que va estar dentro de paréntesis
- Operadores aritméticos
- Operadores Relacionales
- Operadores Lógicos
 
~~~java
int a = 10;
int b = 5;
 
boolean r = a * b - 2*b >= 20 && ! ((a % b) != 0)
 
~~~
 
---
## Operadores de Incremento y Decremento
Los operadores de incremento se usan para incrementar en 1 un valor automáticamente en cada ejecución y los operadores de decremento para disminuir su valor en 1 automáticamente en cada ejecución.
 
Postincremento o Postdecremento
 
~~~java
int a = 0
a++
a++
a++
a++
a++
a
 
a--
a--
a--
a--
a--
a--
a
~~~
 
Preincremento y Postdecremento
 
~~~java
int a = 0
++a
++a
++a
++a
++a
a
 
--a
--a
--a
--a
--a
a
~~~
 
---
### Operadores Unarios
Los operadores unarios podemos usar para cambiar el signo de un número.
- `(+) * (-) == (-) `
- `(-) * (+) == (-) `
- `(+) * (+) == (+) `
- `(-) * (-) == (+) `
 
~~~java
int a = 5;
 
int r = -a // r = (-1) * +5 => -5
int r = +b // r = (+1) * +5 => 5
 
int a = -5;
 
int r = -a // r = (-1) * -5 => 5
int r = +b // r = (+1) * -5 => -5
~~~
 
---
## Operador Ternario
Com operadores ternarios podemos hacer pequeñas condiciones dependiendo como devuelve una evaluación con operadores relacionales y lógicos.
 
~~~
variable = condición ? si-es-verdad : si-es.-falso;
~~~
 
Podemos evaluar si un número entero es positivos o no;
 
~~~java
String valor = 4 > 0 ? "Positivo" : "Negativo"
String valor = -4 > 0 ? "Positivo" : "Negativo"
~~~
 
## Clase Math
Los Métodos de la clase Math, son para realizar operaciones matemáticas, como exponenciales, operaciones trigonométricas, logarítmicas, raíz cuadrada entre otros.
 
Estos métodos ya están implantados en Java que podemos reutilizar para crear nuestras aplicaciones en Java. Para acceder a estas funciones podemos acceder de manera directa sin tener que crear un objeto ya que confusiones de clase Math.
 
## Constantes de la Clase Math
- PI
- E
 
## Métodos de la Clase Math
- Math.pow(x,y)
~~~java
Math.pow(4, 2);
~~~
 
- Math.random()
~~~java
Math.random(); // Aleatorio 0.0 a 1.0
 
int numRandon = (int)(Math.random()*101); //Aleatorio ente 0 a 100
~~~
- Math.sqrt(x)
~~~java
double x = Math.sqrt(64); // Raiz es 8
~~~
- Math.max(x,y)
~~~java
int mayor = Math.max(8, 5); // El mayor es 8
~~~
- Math.mim(x,y)
~~~java
int mayor = Math.min(8, 5); // El mayor es 5
~~~
- Math.round(x)
 
~~~java
double x = Math.round(1.5); // Resultado 2.0
int x = Math.round(1.5); // Resultado 2
double moneda = (double)Math.round(3.4289 * 100d)/100; // Resultado 3.43
double moneda = (double)Math.round(3.4289 * 1000d)/1000; // Resultado 3.43
 
~~~
 
La clase Math tiene más funciones para que puedas realizar diferentes operaciones matemáticas. Aqui te dejo la documentación oficial de la clase Math.
Clase Math: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Math.html
 

