# Condicionales y lógicos



---
## Introdución


---
## Operadores de comparación

Los operadores de comparación en Java son elementos fundamentales para realizar evaluaciones lógicas en programas. Estos operadores permiten comparar valores y determinar la relación entre ellos. En este artículo, exploraremos los operadores de comparación clave y cómo se utilizan en el lenguaje de programación Java.

1. **Operador de Igualdad (`==`):**
   - El operador `==` compara si dos valores son iguales. Es importante distinguirlo del operador de asignación (`=`), que se utiliza para asignar valores a variables.

   ```java
   int a = 5;
   int b = 7;
   if (a == b) {
       System.out.println("a y b son iguales");
   }
   ```

2. **Operador de Desigualdad (`!=`):**
   - El operador `!=` evalúa si dos valores no son iguales. Se utiliza para determinar si hay diferencia entre ellos.

   ```java
   int x = 10;
   int y = 20;
   if (x != y) {
       System.out.println("x y y son diferentes");
   }
   ```

### Relaciones Numéricas

3. **Mayor que (`>`), Menor que (`<`), Mayor o Igual que (`>=`), Menor o Igual que (`<=`):**
   - Estos operadores se utilizan para comparar relaciones numéricas entre dos valores. 

   ```java
   int num1 = 15;
   int num2 = 10;
   if (num1 > num2) {
       System.out.println("num1 es mayor que num2");
   }
   ```

### Comparación de Cadenas de Texto

4. **Método equals para Cadenas:**
   - En Java, para comparar cadenas de texto de manera precisa, se utiliza el método `equals()`.

   ```java
   String texto1 = "Hola";
   String texto2 = "Hola";
   if (texto1.equals(texto2)) {
       System.out.println("Las cadenas son iguales");
   }
   ```

---
## Operadores lógicos

En Java, los operadores lógicos son herramientas fundamentales que permiten combinar y evaluar condiciones para tomar decisiones en un programa. Estos operadores se utilizan en estructuras condicionales para realizar comparaciones más complejas y tomar decisiones basadas en múltiples condiciones. Vamos a explorar los operadores lógicos clave en Java.

### Operador lógico AND (`&&`)

El operador `&&` realiza una operación lógica "y". Devuelve `true` si ambas condiciones que conecta son verdaderas, de lo contrario, devuelve `false`.

```java
int edad = 25;
boolean esEstudiante = false;

if (edad > 18 && !esEstudiante) {
    System.out.println("La persona es mayor de edad y no es estudiante");
}
```

### Operador lógico OR (`||`)

El operador `||` realiza una operación lógica "o". Devuelve `true` si al menos una de las condiciones es verdadera.

```java
boolean esDiaLaboral = true;
boolean esVacaciones = false;

if (esDiaLaboral || esVacaciones) {
    System.out.println("La persona puede descansar en casa");
}
```

### Operador lógico NOT (`!`)

El operador `!` realiza una operación de negación lógica. Cambia el valor de verdad de una condición.

```java
boolean estaLloviendo = false;

if (!estaLloviendo) {
    System.out.println("Puedes salir sin llevar paraguas");
}
```

**Expresiones en Java**

```java
public class EjemploExpresion {
    public static void main(String[] args) {
        // Variables
        int x = 10;
        int y = 5;
        int z = 3;

        // Expresión
        var condicion = ((x + y) * z > x * 2) && (y < z);

        // Resultado
        System.out.println("La condición es: " + condicion);
    }
}
```
La expresión `condicion = ((x + y) * z > x * 2) && (y < z);` evalúa si la suma de `x` e `y`, multiplicada por `z`, es mayor que el doble de `x`, y al mismo tiempo, si `y` es menor que `z`. Si ambas condiciones son verdaderas, `condicion` se establece en `true`, de lo contrario, se establece en `false`.

---
## Operadores ternarios
Los operadores ternarios son una forma concisa de escribir expresiones condicionales en Java. La forma básica de un operador ternario es:

```java
variable = (condición) ? valor_si_cierto : valor_si_falso;
```

Aquí hay un ejemplo simple para ilustrar su uso:

```java
public class OperadorTernario {
    public static void main(String[] args) {
        int numero = 10;
        
        // Usando operador ternario para determinar si el número es par o impar
        String resultado = (numero % 2 == 0 && numero > 0) ? "Par positivo" : "Impar positivo";
        
        System.out.println("El número es: " + resultado);
    }
}
```

1. Se asigna el valor 10 a la variable `numero`.
2. Se utiliza un operador ternario para determinar si `numero` es par y positivo.
3. Si es verdad, la variable `resultado` se establece como "Par positivo"; de lo contrario, se establece como "Impar positivo".
4. Se imprime el resultado, que será "Par positivo" en este caso.

En resumen, el operador ternario asigna un valor a `resultado` basado en si `numero` cumple ciertas condiciones.

---
## Condiciones if-else
Las condiciones `if-else` son una estructura fundamental en programación que permite tomar decisiones en función de ciertas condiciones. La sintaxis básica de una declaración `if-else` en Java es la siguiente:

```java
if (condicion) {
    // Bloque de código si la condición es verdadera
} else {
    // Bloque de código si la condición es falsa
}
```

Aquí hay un ejemplo sencillo para ilustrar su uso:

```java
public class EjemploAnidacionCondiciones {
    public static void main(String[] args) {
        int numero = -5;

        // Usando if-else con anidación para determinar si el número es par o impar, positivo, negativo o cero
        if (numero == 0) {
            System.out.println("El número es Cero");
        } else {
            if (numero > 0) {
                if (numero % 2 == 0) {
                    System.out.println("El número es Par positivo");
                } else {
                    System.out.println("El número es Impar positivo");
                }
            } else {
                if (numero % 2 == 0) {
                    System.out.println("El número es Par negativo");
                } else {
                    System.out.println("El número es Impar negativo");
                }
            }
        }
    }
}


```

1. Se inicializa la variable `numero` con el valor -5.

2. Se utiliza una estructura de control `if-else` anidada para determinar diferentes condiciones:
   - Si `numero` es igual a cero, imprime "El número es Cero".
   - Si `numero` es positivo, se anidan dos condiciones adicionales:
      - Si `numero` es par, imprime "El número es Par positivo".
      - Si no es par, imprime "El número es Impar positivo".
   - Si `numero` es negativo, se anidan dos condiciones adicionales:
      - Si `numero` es par, imprime "El número es Par negativo".
      - Si no es par, imprime "El número es Impar negativo".

En resumen, este código clasifica y describe el número en función de su paridad y signo. Cada nivel de anidación agrega una capa de condiciones para determinar más detalles sobre el número.

---
## Intrucción Switch
La instrucción `switch` en Java es una estructura de control que permite evaluar una expresión y realizar diferentes acciones dependiendo del valor de esa expresión. La sintaxis básica de un `switch` es la siguiente:

```java
switch (expresion) {
    case valor1:
        // Código a ejecutar si la expresión es igual a valor1
        break;
    case valor2:
        // Código a ejecutar si la expresión es igual a valor2
        break;
    // Otros casos...
    default:
        // Código a ejecutar si la expresión no coincide con ningún valor anterior
}
```

Aquí hay un ejemplo sencillo de cómo se utiliza la instrucción `switch`:

```java
char genero = 'M';

switch (genero) {
    case 'M':
        System.out.println("Es Hombre");
        break;
    case 'F':
        System.out.println("Es Mujer");
        break;
    default:
        System.out.println("Otro Caso");
        break;
}
```

1. Se declara una variable `genero` de tipo `char` y se le asigna el valor 'M'.

2. Se utiliza la instrucción `switch` para evaluar la expresión `genero`.

3. Dentro del `switch`, hay tres casos:
   - `case 'M':` verifica si `genero` es igual a 'M'. Si es así, se ejecuta el bloque de código dentro de este caso, que imprime "Es Hombre".
   - `case 'F':` verifica si `genero` es igual a 'F'. Si es así, se ejecuta el bloque de código dentro de este caso, que imprime "Es Mujer".
   - `default:` es el caso por defecto que se ejecutará si `genero` no coincide con ninguno de los casos anteriores. En este caso, imprime "Otro Caso".

4. La palabra clave `break` se utiliza para salir del `switch` después de que se ha ejecutado un caso. Sin `break`, la ejecución continuaría al siguiente caso.

En resumen, este código determina el género según el valor de la variable `genero` y imprime un mensaje correspondiente. Si `genero` es 'M', imprime "Es Hombre"; si es 'F', imprime "Es Mujer"; de lo contrario, imprime "Otro Caso".

**Otra forma de trabajar con switch**
```java
    public static void main(String[] args) {
        int edad = 25;
        char genero = 'M';

        // Evaluación de múltiples condiciones utilizando switch y operadores ternarios
        String resultado = switch (genero) {
            case 'M' -> (edad >= 18) ? "Hombre adulto" : "Joven hombre";
            case 'F' -> (edad >= 18) ? "Mujer adulta" : "Joven mujer";
            default -> "Otro caso";
        };

        System.out.println(resultado);
    }
```
En este código, se mantienen las mismas estructuras, pero se eliminan algunas líneas para hacerlo más conciso. La idea es la misma: evaluar el género y la edad, y asignar un resultado utilizando el operador ternario dentro de la instrucción `switch`.

---
## Proyecto de sección: Sistema de Descuentos en un Restaurante
Crea un programa en Python que simule un sistema de descuentos en un restaurante según el monto de consumo. El programa debe seguir las siguientes instrucciones:

1. Solicita al usuario que ingrese el monto de consumo en el restaurante.
2. Aplica descuentos según las siguientes reglas:
    - Si el monto de consumo es mayor a $50 pero igual o menor a $100, aplica un descuento del 10%.
    - Si el monto de consumo es mayor a $100 pero igual o menor a $200, aplica un descuento del 20%.
    - Si el monto de consumo es mayor a $200, aplica un descuento del 30%.
    - Si el monto de consumo es igual o menor a $50, no aplica ningún descuento.
3. Muestra al usuario un resumen de la cuenta con el monto de consumo, el descuento aplicado y el monto final con descuento.

```java
import java.util.Scanner;

public class DescuentoRestaurante {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        // Solicitar al usuario el monto de consumo
        System.out.print("Ingrese el monto de consumo en el restaurante: $");
        var montoConsumo = scanner.nextDouble();

        // Calcular descuento según las reglas
        var descuento = 0.0;
        if (montoConsumo > 50 && montoConsumo <= 100) {
            descuento = 0.1; // 10%
        } else if (montoConsumo > 100 && montoConsumo <= 200) {
            descuento = 0.2; // 20%
        } else if (montoConsumo > 200) {
            descuento = 0.3; // 30%
        }


        // Calcular monto final con descuento
        var montoFinal = montoConsumo - (montoConsumo * descuento);

        // Mostrar resumen de la cuenta
        System.out.println("\nResumen de la cuenta:");
        System.out.println("Monto de consumo: $" + montoConsumo);
        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
        System.out.println("Monto final con descuento: $" + montoFinal);

        // Cerrar el scanner
        scanner.close();
    }
}
```


---
## Resumen