# Crear tu primer juego en Java

1. [Iniciar con el Juego](#Iniciar-con-el-Juego)
2. [Crear menú de Navegación](#Crear-menú-de-Navegación)
3. [Optimizando el Código](#Obtimizando-el-Código)
4. [Java Doc](#java-doc)
5. [Archivo JAR](#Archivo-JAR)


---

## Iniciar con el Juego

-	Crear el un proyecto 
-	Programar la lógica del juego 
    - Generar numero rondón entre 0 y 101
    - Ingresar nuero elegido 
    - Escribir el código de adivinar un numero 
    - Agregar la cantidad de vidas o intentos  
-	Probar el juego 

---

### Crear menú de Navegación

-	Crear un bucle infinito y el usuario indique cuando detener el bucle. 
-	Dentro de ese bucle diseña un menú de navegación con niveles para escoger y la opción de salir del juego. 
-	Escribe el código donde el usuario ingrese la opción deseada 
-	Escribe el código para analizar las opciones 

--- 

### Optimizando el Código

-	Crear una clase y un método para la lógica del juego.
-	Trabajar con Switch el análisis de las opciones.  

---

### Java Doc 

- `@author`	Es el autor de la clase 
- `{@code}`	Muestra textos en formato de código sin que se interpretado como código HTML
- `{@docRoot}`	Indica la ruta relativa al directorio raíz del documento generado desde cualquier pagina generada. 
- `@deprecated`	Se pone indicando que esta API no de usarse más. 
- `@exception`	Se indica cuando es vulnerable en lanzar una excepción, en seguida se ponen las clases de excepciones posibles.
- `{@inheritDoc}`	Indica la herencia o implementación proceden tora. 
- `{@link}`	Hace un enlace al miembro indicado 
- `{@linkplain}`	Lo mismo que en anterior excepto que la etiqueta del enlace se muestra en texto plano. 
- `@param`	Añade parámetros con nombres específicos, seguido de su descripción.
- `@return` 	Asigna un parámetro de retorno, seguido de su descripción.
- `@see`	Se añade para manejar referencias, o información relaciona. 
- `@serial`	Se utiliza para indicar campos o clases serializables.
- `@serialData` 	Se utiliza para documentar métodos que generan una serialización. 
- `@serialField`	Se utiliza para documentar objetos serializados. 
- `@since` 	Se añade en el encabezado para especificar para cuando fue creado.
- `@throws`	Es sinónimo con la etiqueta @exception
- `{@values}`	Cuando es usado sin argumentos se usa para especificar un campo estático en otro caso se usa para mostrar el valor constante.
- `@version`	Se añade en el subtitulo con la versión especificada.
	

~~~
tool
    generate JavaDoc 
~~~


- Los primeros cuatro botones de radio controlan qué archivos queremos generar, que son el proyecto completo, archivos no enviados, archivos actuales y rangos personalizados
- Las casillas de verificación a continuación deben incluir código de prueba, incluir jdk y paquetes jar de terceros, y vincular a jdk
- El directorio de salida representa el directorio de salida
- De izquierda a derecha, los siguientes tres cuadros son el nivel de salida, el contenido del archivo de salida (incluido el árbol de jerarquía, el índice, etc., el valor predeterminado es correcto) y la información en el comentario de salida (los comentarios deben estar estandarizados aquí. No se emite normalmente)
- Los siguientes tres cuadros de texto solo necesitan agregar parámetros al segundo; de lo contrario, se indicará el problema de codificación

~~~
-encoding UTF-8 -charset UTF-8
~~~


---
## Archivo JAR 
Un archivo JAR es un tipo de archivo que permite ejecutar aplicaciones y herramientas escritas en el lenguaje Java. Las siglas están deliberadamente escogidas para que coincidan con la palabra inglesa "jar". Los archivos JAR están comprimidos con el formato ZIP y cambiada su extensión a `.jar`.

~~~
File/Project Structure
    /Artifacts/JAr/From module...
                    Selecciona clase con Main 
~~~

~~~
Build/Build Artifac..
            Build
~~~

Ejecutar el archivo JAR: 

~~~
java -jar nombre-archvo
~~~

----

## Código competo de Juego 
Clase Main
~~~java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Ejecutar menu del juego
        Game.menuGame();
    }

}
~~~

Clase Game
~~~java
import java.util.Scanner;

/**
 *
 * Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod
 * tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
 * quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.
 * Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat
 * nulla pariatur. Excepteur sint occaecat cupidatat non proident,
 * sunt in culpa qui officia deserunt mollit anim id est laborum
 *
 * @author alex roel code
 * @version 1.0
 * */
public class Game {

    /**Este método ejecuta del método {@code main()}  para jugar el juego.*/
    public static void menuGame(){
        OUTER://Para Terminar con el bucle
        while(true){
            System.out.println("   JUEGO ADIVA EL NÚMERO \n");
            System.out.println("1 - Nivel Facil\n"
                    + "2 - Nivel Intermedio \n"
                    + "3 - Nivel Dificil\n"
                    + "4 - Salir");

            Scanner read = new Scanner(System.in);
            System.out.print("INGRESE UNA OPCIÓN: ");
            int option = read.nextInt();

            switch(option){
                case 1: Game.play(10);break;
                case 2: Game.play(7);break;
                case 3: Game.play(5);break;
                case 4:
                    System.out.println("CERRANDO PROGRAMA");
                    break OUTER; //Termina con Switch y con While
                default:
                    System.out.println("OPCIÓN INCORRECTA");
            }
        }
    }

    /**
     * El método  {@code play(int lives)} recibe la cantidad de vidas para jugar, tendrá la cantidad
     * de intentos de acuerdo a la cantidad de vidas que recibió.
     * @param lives es valor entero
     * */
    public static void play(int lives){
        int numRandom = (int)(Math.random()*101);
        int numChosen = -1;

        Scanner read = new Scanner(System.in);

        while(numChosen != numRandom){
            System.out.print("Ingrese un número entre 1 y 100: ");
            numChosen = read.nextInt();

            if(numRandom < numChosen){
                System.out.println("El número mas pequeño");
                lives--;
            }else if(numRandom > numChosen){
                System.out.println("El número mas grande");
                lives--;
            }

            if(lives == 0){
                System.out.println("-------------------");
                System.out.println("|    GAME OVER    |");
                System.out.printf("| El número era  %d |\n",numRandom);
                System.out.println("-------------------");
                break;
            }
            System.out.println("-----------------------");
            System.out.printf("|  Te quedan %d vidas   |\n",lives);
            System.out.println("-----------------------");
        }

        if(numChosen == numRandom){
            System.out.println("--------------------------");
            System.out.println("|   FELICIDADES GANASTE  |");
            System.out.println("--------------------------");
        }
    }
}

~~~

