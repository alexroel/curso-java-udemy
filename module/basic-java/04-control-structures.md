# Estructuras de Control 

1. [Condiciones IF ELSE](#Condiciones-if-else)
2. [Condiciones Anidadas](#Condiciones-Anidadas)
3. [Múltiples Condiciones ELSE IF](#Múltiples-Condiciones-ELSE-IF)
4. [Declaración Switch](#Declaración-Switch)
5. [Expresión Switch](#Expresión-Switch)
6. [Bucle While](#Bucle-While)
7. [Bucle For](#Bucle-For)
8. [Bucle DO WHILE](#Bucle-DO-WHILE)
9. [Control de Bucles](#Control-de-Bucles)

---
## Condiciones IF ELSE
- Las declaraciones condicionales se utilizan para realizar diferentes acciones basadas en diferentes condiciones.
- La sentencia `if` es una de las sentencias condicionales más utilizadas.
- Si la expresión de condición de la declaración `if` se evalúa como verdadera, se ejecuta el bloque de código dentro de la declaración `if` . Si se determina que la expresión es falsa, se ejecuta el primer conjunto de código después del final de la instrucción `if` (después de la llave de cierre).

~~~java
if (condición){
    //Se ejecuta cuando la condición es verdadera 
}
~~~

~~~java
if (true){
    System.out.println("Se cumple la condición");
}else{
    System.out.println("No se cumple la condición");
}
~~~

Evaluar si un número es negativo o positivo: 

~~~java
import java.util.Scanner;

public class Condiciones {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese un Número: ");
        int n = leer.nextInt();
        
        
        if(n > 0){
            System.out.printf("El número %d es POSITIVO \n", n);
        }else{
            System.out.printf("El número %d NO es POSITIVO \n", n);
        }
    }
        
}
~~~

---
## Condiciones Anidadas 

Puede usar una instrucción if-else dentro de otra instrucción if o else.
Por ejemplo:

~~~java
import java.util.Scanner;

public class Espar {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese un Número: ");
        int n = leer.nextInt();
        
        if(n != 0){
            if(n > 0){
                if(n % 2 == 0){
                    System.out.printf("El número %d es PAR POSITIVO\n", n);
                }else{
                    System.out.printf("El número %d es IMPAR POSITIVO\n", n);
                }
            }else{
                if(n % 2 == 0){
                    System.out.printf("El número %d es PAR NEGATIVO\n", n);
                }else{
                    System.out.printf("El número %d es IMPAR NEGATIVO\n", n);
                }
            }
        }else{
            System.out.printf("El número %d es NEUTRO\n", n);
        }
    }
        
}
~~~

---
## Múltiples Condiciones ELSE IF
En lugar de usar sentencias `if-else` anidadas, puede usar la sentencia else `if` para verificar varias condiciones.

Por ejemplo:

~~~java
import java.util.Scanner;

public class MultiplesCondiciones {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese una Letra: ");
        char c = leer.next().charAt(0);
        

        if (c == 'a' || c == 'A'){
            System.out.printf("%s es VOCAL\n", c);
        }else if(c == 'e' || c == 'E'){
            System.out.printf("%s es VOCAL\n", c);
        }
        else if(c == 'i' || c == 'I'){
            System.out.printf("%s es VOCAL\n", c);
        }
        else if(c == 'o' || c == 'O'){
            System.out.printf("%s es VOCAL\n", c);
        }
        else if(c == 'u' || c == 'U'){
            System.out.printf("%s es VOCAL\n", c);
        }else{
            System.out.printf("%s NO es VOCAL\n", c);
        }
    }
}
~~~

---
## Declaración Switch 
Una instrucción switch prueba la igualdad de una variable con una lista de valores. Cada valor se llama un caso, y la variable que se activa se comprueba para cada caso.

~~~java
switch (expresión){
    case valor1:
        //Declaraciones 
        break;
    case valor2:
        //Declaraciones 
        break;
    default: 
        //Declaraciones 
}
~~~

~~~java
int day = 1;

    switch (day){
        case 1:
            System.out.println("Uno");
            break;
        case 2:
            System.out.println("Dos");
            break;
        default:
            System.out.println("Día no registrado");
    }
~~~

---
## Expresión Switch 
La expresión `switch` permite múltiples valores separados por comas por `case` y devuelve un valor para todo el bloque `switch-case`.

~~~java
int day = 5;

String dayType = switch(day){

    case 1,2,3,4,5 -> "Día laborable";

    case 7,6 -> "Fin de semana";

    default -> "Día Inválido;"

};
~~~

---
## Bucle While 
- Una declaración de bucle permite ejecutar repetidamente una declaración o grupo de declaraciones. 
- Una declaración de bucle `while` ejecuta repetidamente una declaración de destino siempre que una condición dada sea verdadera.

~~~java
while (expresión){
    //Declaraciones 
}
~~~

~~~java
int c = 0; 

while (c <= 10){
    System.out.println(c);
    c++;  
}
~~~

---
## Bucle For
Otra estructura de bucle es el bucle for . Un ciclo for le permite escribir eficientemente un ciclo que necesita ejecutarse un número específico de veces.
- Inicialización: la expresión se ejecuta solo una vez durante el comienzo del ciclo.
- Condición: se evalúa cada vez que el ciclo itera. El ciclo ejecuta la declaración repetidamente, hasta que esta condición devuelve falso.
- Incremento/Decremento: se ejecuta después de cada iteración del ciclo. 

~~~java
for (inicialización; condición; incremento o decremento) {
   //Sentecias
}
~~~

El siguiente ejemplo imprime los número de 1 al 10:
~~~java
for (int i = 1; i <= 10; i++){
    System.out.println(i);
}
~~~
Operadores en Asignación 
~~~java
for (int i = 0; i <= 10; i+=2){
    System.out.println(i);
}
~~~
~~~java
for (int i = 2; i <= 10; i*=i){
    System.out.println(i);
}
~~~

---
## Bucle DO WHILE
- Un ciclo do... while es similar a un ciclo while, excepto que se garantiza que un ciclo do... while se ejecutará al menos una vez.

~~~java
int a = 1;

do{
    System.out.printl(a);
    a++
}while(a < 5);

~~~

Tenga en cuenta que la condición aparece al final del ciclo, por lo que las declaraciones en el ciclo se ejecutan una vez antes de que se pruebe.
Incluso con una condición falsa, el código se ejecutará una vez.

~~~java
int a = 1;

do{
    System.out.printl(a);
    a++
}while(a < 0);

~~~

---
## Control de Bucles 
Las sentencias `break` y `continue` cambian el flujo de ejecución del bucle.
### Break
La sentencia `break` termina el bucle y transfiere la ejecución a la sentencia que sigue inmediatamente al bucle.

~~~java
for(int i = 0; i <= 10; i++){
    System.out.println(i);

    if (i == 5){
        break;
    }
}

~~~

### Continue 
La declaración de `continue` hace que el bucle omita el resto de su cuerpo y luego vuelva a probar inmediatamente su condición antes de reiterar. En otras palabras, hace que el ciclo salte a su siguiente iteración.

~~~java
for(int i = 0; i <= 10; i++){
    if (i == 5){
        continue;
    }
    System.out.println(i);
}

~~~

