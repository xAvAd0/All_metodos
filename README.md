
Tema 1:

Desbordamiento (Overflow):
El desbordamiento ocurre cuando el resultado de una operación excede los límites del rango de representación de un tipo de dato específico. En otros términos, el número resultante es demasiado grande (o demasiado pequeño en el caso de un desbordamiento negativo) para ser almacenado dentro del tipo de dato utilizado.

Ejemplo: Si estamos trabajando con números enteros de 32 bits, el rango típico es de -2,147,483,648 a 2,147,483,647. Si intentamos sumar dos números que resultan en un valor mayor a 2,147,483,647, se producirá un desbordamiento.

Redondeo (Rounding):
El redondeo es el proceso de ajustar un número a otro valor con menos precisión. Esto se hace generalmente para limitar la cantidad de cifras significativas o para representar un número en un formato más manejable.
https://www.ninjaexcel.com/wp-content/uploads/2022/09/thumb_1479_news_big.jpg
Fórmula General de Redondeo:

Para redondear un número 
𝑥
x a 
𝑛
n cifras decimales:
Redondeo hacia arriba: 
⌈
𝑥
⌉
⌈x⌉
Redondeo hacia abajo: 
⌊
𝑥
⌋
⌊x⌋
Redondeo al más cercano: 
round
(
𝑥
)
round(x)
Ejemplo: Si tenemos el número 
3.14159
3.14159 y queremos redondearlo a dos cifras decimales, utilizando el redondeo al más cercano obtendríamos 
3.14
3.14.

Truncamiento (Truncation):
El truncamiento es el proceso de eliminar los dígitos menos significativos de un número, conservando únicamente una cantidad específica de dígitos.

Fórmula General de Truncamiento:

Para truncar un número 
𝑥
x a 
𝑛
n cifras decimales:
Eliminar los dígitos después de la 
𝑛
n-ésima cifra decimal.
Ejemplo: Si tenemos el número 
3.14159
3.14159 y queremos truncarlo a dos cifras decimales, simplemente eliminamos los dígitos después de la segunda cifra decimal, obteniendo 
3.14
3.14.

Es importante tener en cuenta que tanto el redondeo como el truncamiento pueden introducir cierto error en los cálculos, ya que pueden alterar el valor original del número. Por lo tanto, es fundamental utilizar estas operaciones con precaución y comprender cómo afectan la precisión de los resultados en el contexto de los métodos numéricos.


Tema 3
# Tema-3
<h2 align = "center"> <font color = "darkorange" size = "+6"  font face = "bauhaus 93">  Indice </font> </h2>
<header> <font color = "red" size="+1" font face = "aharoni">
                <nav class="navegacion">
                    <ul class="Indice">
                       <li> <a href="#Descripción"> Descripción del Problemario </a> <br> </li>
                        <li> <a href="#Sobre la materia"> Sobre la materia </a> <br> </li>
                            <ul class="subindice"> 
                                <li> <a href="#Competencia de la Asignatura"> Competencia de la Asignatura </a> </li>
                                <li> <a href="#Competencia del tema"> Competencia del TEMA </a> </li>
                            </ul>
     <li> <a href="#Métodos numéricos para encontrar las raíces de ecuaciones que se encuentran en nuestro repositorio"> Sistemas de ecuaciones </a> <br> </li>
                            <ul class="subindice"> 
                                <li> <a href="#Eliminacion"> Eliminación-Gaussiana </a> </li>
                                <li> <a href="#Gauss"> Gauss-Jordan </a> </li>
                                <li> <a href="#Seidel"> Gauss-Seidel </a> </li> 
                                <li> <a href="#Jacobi"> Método de Jacobi </a> </li> 
                            </ul>
                    </ul>
                </nav>
            </font> </header>

# Descripción
En este documento vamos a ver varios ejercicios sobre los distintos metodos como lo son:
  <li>1.- Eliminación-Gaussiana</li>
  <li>2.- Gauss-Jordan</li>
  <li>3.- Gauss-Seidel</li>
  <li>4.- Jacobi</li>
  
# Sobre la materia 
<h2 align = "center"> <font  size = "+6" > <a name="Competencia de la Asignatura">Competencia de la asignatura</font></a> </h2>
Aplica los métodos numéricos para resolver problemas científicos y de ingeniería utilizando la computadora.
<h2 align = "center"> <font size = "+6"  > <a name="Competencia del tema">Competencia del tema</font> </a></h2>
Aplica los métodos numéricos con el objeto de solucionar ecuaciones mediante los métodos de intervalo e interpolación apoyada de un lenguaje de programación.  

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
<h1 align = "center"> <font  font face = "bauhaus 93"> <a name="Sistemas de ecuaciones"> Sistemas de ecuaciones </font></a> </h1>

<h2 align = "center"> <font font face = "forte"><a name="Eliminacion">  1. Eliminación Gaussiana </h2></a>

<h3> <font font face = "arial"> DESCRIPCIÓN: </h3>

La eliminación gaussiana es un método utilizado en álgebra lineal para resolver sistemas de ecuaciones lineales de una manera sistemática y paso a paso. Este método consiste en llevar un sistema de ecuaciones a una forma matricial, convertir una matriz cuadrada en una matriz triangular superior equivalente a la original y luego resolver el sistema sustituyendo las variables en cada ecuación resultante:

<h3> <font font face = "arial">Pasos de la eliminación Gaussiana:</h3>
<h5>Formar la matriz aumentada:</h5> Combinar la matriz de coeficientes y el vector de términos independientes en una sola matriz aumentada.
<h5>Pivoteo parcial: </h5> Si es necesario, intercambiar filas para asegurar que el elemento en la posición de pivote sea el mayor en valor absoluto en su columna.
<h5>Escalonar la matriz: </h5> Comenzar con la primera fila y hacer ceros debajo del elemento de pivote, utilizando operaciones elementales de fila.
<h5>Repetir el proceso: </h5> Aplicar el mismo procedimiento a las filas restantes, avanzando hacia abajo y creando ceros debajo de los pivotes.
<h5>Sustitución hacia atrás: </h5> Una vez que la matriz está en forma triangular superior, resolver el sistema de ecuaciones resultante mediante sustitución hacia atrás, empezando por la última ecuación y despejando las incógnitas hacia arriba.
<h5>Verificar la solución: </h5> Sustituir las soluciones encontradas en las ecuaciones originales para comprobar si satisfacen todas las ecuaciones del sistema.
   
<h5> <font font face = "arial"> <b> <i> Ejemplo 1: </i> </b> </h5>

package Eliminacion_Gaussiana;


public class Ejercicio1 {

      public static void main(String[] args) {
        int n = 3; // Número de incógnitas
        double[][] matrix = {
                {2.0, 1.0, -1.0, 8.0},
                {-3.0, -1.0, 2.0, -11.0},
                {-2.0, 1.0, 2.0, -3.0}
        };
        double[] result = Eliminacion(matrix, n);
        for (int i = 0; i < n; i++) {
            System.out.println("x[" + i + "] = " + result[i]);
        }
    }

    public static double[] Eliminacion(double[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                double factor = matrix[j][i] / matrix[i][i];
                for (int k = i; k < n + 1; k++) {
                    matrix[j][k] -= factor * matrix[i][k];
                }
            }
        }

        double[] result = new double[n];
        for (int i = n - 1; i >= 0; i--) {
            result[i] = matrix[i][n];
            for (int j = i + 1; j < n; j++) {
                result[i] -= matrix[i][j] * result[j];
            }
            result[i] /= matrix[i][i];
        }

        return result;
    }}


![1](https://github.com/Hante990/Tema-3/assets/107586879/adcd5200-7d62-47ac-834b-378bfeeb70ac)


      
<h5> <font font face = "arial"> <b> <i> Ejemplo 2: </i> </b> </h5>
package Eliminacion_Gaussiana;


public class Ejercicio2 {

      public static void main(String[] args) {
        int n = 3; // Número de incógnitas
        double[][] matrix = {
                {10, 4.0, -1.0, 8.0},
                {-7.0, -1.0, 8.0, -11.0},
                {6.0, 14.0, 0.0, -3.0}
        };
        double[] result = Eliminacion(matrix, n);
        for (int i = 0; i < n; i++) {
            System.out.println("x[" + i + "] = " + result[i]);
        }
    }

    public static double[] Eliminacion(double[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                double factor = matrix[j][i] / matrix[i][i];
                for (int k = i; k < n + 1; k++) {
                    matrix[j][k] -= factor * matrix[i][k];
                }
            }
        }

        double[] result = new double[n];
        for (int i = n - 1; i >= 0; i--) {
            result[i] = matrix[i][n];
            for (int j = i + 1; j < n; j++) {
                result[i] -= matrix[i][j] * result[j];
            }
            result[i] /= matrix[i][i];
        }

        return result;
    }}



![2](https://github.com/Hante990/Tema-3/assets/107586879/99caa84e-e57b-49e4-88f6-17c09123c868)


    
<h5> <font font face = "arial"> <b> <i> Ejemplo 3: </i> </b> </h5>
package Eliminacion_Gaussiana;



public class Ejercicio3 {
   public static void main(String[] args) {
        
        int n = 3; // Número de incógnitas
        
        double[][] matrix = {
                
                {15, 2.0, 6.0, -8.0},
                
                {-8.0, -5.0, -8.0, 1.0},
        
                {-6.0, 3.0, 5.0, 13.0}
        
        };
        
        double[] result = Eliminacion(matrix, n);
        
        for (int i = 0; i < n; i++) {
        
            System.out.println("x[" + i + "] = " + result[i]);
       
        }
   
    }

    public static double[] Eliminacion(double[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                double factor = matrix[j][i] / matrix[i][i];
                for (int k = i; k < n + 1; k++) {
                    matrix[j][k] -= factor * matrix[i][k];
                }
            }
        }

        double[] result = new double[n];
        for (int i = n - 1; i >= 0; i--) {
            result[i] = matrix[i][n];
            for (int j = i + 1; j < n; j++) {
                result[i] -= matrix[i][j] * result[j];
            }
            result[i] /= matrix[i][i];
        }

        return result;
    }}


![3](https://github.com/Hante990/Tema-3/assets/107586879/66a42f0f-9a07-48f3-ac86-6d47d6ce41eb)


    
<h5> <font font face = "arial"> <b> <i> Ejemplo 4: </i> </b> </h5>
package Eliminacion_Gaussiana;


public class Ejercicio4 {
   public static void main(String[] args) {
        
        int n = 3; // Número de incógnitas
       
        double[][] matrix = {
                
                {-8, -5.0, 7.0, 22.0},
                
                {4.0, 1.0, -9.0, 21.0},
        
                {-12.0, -14.0, 4.0, -3.0}
        
        };
        
        double[] result = Eliminacion(matrix, n);
        
        for (int i = 0; i < n; i++) {
        
            System.out.println("x[" + i + "] = " + result[i]);
    
        }
   
    }

    public static double[] Eliminacion(double[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                double factor = matrix[j][i] / matrix[i][i];
                for (int k = i; k < n + 1; k++) {
                    matrix[j][k] -= factor * matrix[i][k];
                }
            }
        }

        double[] result = new double[n];
        for (int i = n - 1; i >= 0; i--) {
            result[i] = matrix[i][n];
            for (int j = i + 1; j < n; j++) {
                result[i] -= matrix[i][j] * result[j];
            }
            result[i] /= matrix[i][i];
        }

        return result;
    }}


![4](https://github.com/Hante990/Tema-3/assets/107586879/fdcd0fb1-38e5-47f9-9989-bfafd2fbb262)


    
<h5> <font font face = "arial"> <b> <i> Ejemplo 5: </i> </b> </h5>
package Eliminacion_Gaussiana;


public class Ejercicio5 {
   public static void main(String[] args) {
        
        int n = 3; // Número de incógnitas
        
        double[][] matrix = {
                
                {17, 14.0, -15.0, 18.0},
                
                {-7.0, 21.0, 8.0, -21.0},
        
                {16.0, 4.0, 10.0, 3.0}
        
        };
        
        double[] result = Eliminacion(matrix, n);
        
        for (int i = 0; i < n; i++) {
        
            System.out.println("x[" + i + "] = " + result[i]);
    
        }
   
    }

    public static double[] Eliminacion(double[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                double factor = matrix[j][i] / matrix[i][i];
                for (int k = i; k < n + 1; k++) {
                    matrix[j][k] -= factor * matrix[i][k];
                }
            }
        }

        double[] result = new double[n];
        for (int i = n - 1; i >= 0; i--) {
            result[i] = matrix[i][n];
            for (int j = i + 1; j < n; j++) {
                result[i] -= matrix[i][j] * result[j];
            }
            result[i] /= matrix[i][i];
        }

        return result;
    }}



![5](https://github.com/Hante990/Tema-3/assets/107586879/15945e2b-010f-4498-b5a2-fc9a45620ebf)



<h2 align = "center"> <font font face = "forte"> <a name="Gauss">  2.- Gauss-Jordan </h2></a>

<h3> <font font face = "arial"> DESCRIPCIÓN: </h3>

El método de Gauss-Jordan es una variante del método de eliminación gaussiana que se utiliza para resolver sistemas de ecuaciones lineales. En este método, al igual que en la eliminación gaussiana, se busca llevar la matriz de coeficientes a una forma escalonada, pero con la diferencia de que se busca obtener una matriz escalonada reducida a su forma más simple, conocida como forma escalonada reducida por filas o forma canónica.

<h3> <font font face = "arial">Pasos del Método de Gauss Jordan: </h3>
<h5>Formar la Matriz Aumentada: </h5> Se comienza escribiendo el sistema de ecuaciones en forma matricial, creando una matriz aumentada que incluya tanto los coeficientes de las variables como los términos independientes.
<h5>Escalonar la Matriz: </h5>Se aplican operaciones elementales de fila para obtener ceros debajo de la diagonal principal y unos en la diagonal principal. Esto implica realizar operaciones como intercambiar filas, multiplicar filas por constantes y sumar múltiplos de unas filas a otras.
<h5>Reducir la Matriz a su Forma Escalonada Reducida: </h5>Se continúa escalonando la matriz hasta obtener una forma escalonada reducida, donde la parte de los coeficientes de las variables se convierte en una matriz identidad.
<h5>Obtener las Soluciones: </h5>Una vez se ha alcanzado la forma escalonada reducida, se leen las soluciones directamente de la matriz identidad. Cada fila de la matriz identidad corresponde a una variable del sistema de ecuaciones.
<h5>Verificar las Soluciones: </h5> Es importante comprobar las soluciones obtenidas sustituyéndolas en las ecuaciones originales para asegurarse de que satisfacen todas las ecuaciones del sistema.
   
<h5> <font font face = "arial"> <b> <i> Ejemplo 1: </i> </b> </h5>

package com.mycompany.gauss.jordan;

public class GaussJordan {

    public static void main(String[] args) {
       System.out.println("GAUSS-JORDAN");
        double[][] matriz = 
        {   {4,2,-2,1},
            {10,4,4,-4},
            {6,2,2,5}    };
        double[][] resultados = operaciones(matriz);
        Resultados(resultados);
    }
    public static double[][] operaciones(double[][] matriz) {
        int fila = matriz.length;
        int columna = matriz[0].length;
        for (int i = 0; i < fila; i++) {
            double pivote = matriz[i][i];
            for (int j = i + 1; j < columna; j++) {
                matriz[i][j] /= pivote;
            }
            matriz[i][i] = 1;
            for (int j = 0; j < fila; j++) {
                if (i != j) {
                    double epala = matriz[j][i];
                    for (int k = i; k < columna; k++) {
                        matriz[j][k] -= epala * matriz[i][k];
                    }
                }
            }
        }
        return matriz;
    }
    public static void Resultados(double[][] matriz) {
        System.out.println("Los resultados soooon: ");
        System.out.println("X = " + matriz[0][3] + " :)");
        System.out.println("Y = " + matriz[1][3] + " :)");
        System.out.println("Y = " + matriz[2][3] + " :)");
    }}



![1](https://github.com/Hante990/Tema-3/assets/107586879/dfa61392-6b67-4e1f-b58e-dc3cb3e00b85)

   
    
<h5> <font font face = "arial"> <b> <i> Ejemplo 2: </i> </b> </h5>
package com.mycompany.gauss.jordan3;

import java.util.Scanner;

public class GaussJordan3 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
      
        System.out.println("Ingrese el tamaño de la matriz cuadrada (n x n): ");
        int n = scanner.nextInt();
        
        double[][] matriz = new double[n][n+1];
        
        System.out.println("Ingrese los elementos de la matriz extendida (separados por espacios y por fila): ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n+1; j++) {
                matriz[i][j] = scanner.nextDouble();
            }
        }
        
        double[][] resultados = operaciones(matriz);
        Resultados(resultados);
        
        scanner.close();
    }

    public static double[][] operaciones(double[][] matriz) {
        int fila = matriz.length;
        int columna = matriz[0].length;
        for (int i = 0; i < fila; i++) {
            double pivote = matriz[i][i];
            for (int j = i + 1; j < columna; j++) {
                matriz[i][j] /= pivote;
            }
            matriz[i][i] = 1;
            for (int j = 0; j < fila; j++) {
                if (i != j) {
                    double epala = matriz[j][i];
                    for (int k = i; k < columna; k++) {
                        matriz[j][k] -= epala * matriz[i][k];
                    }
                }
            }
        }
        return matriz;
    }

    public static void Resultados(double[][] matriz) {
        System.out.println("Los resultados son: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.println((char)('X' + i) + " = " + matriz[i][matriz[i].length - 1]);
        }
    }}


![2-1](https://github.com/Hante990/Tema-3/assets/107586879/9f2e75da-ccd4-46f8-8ce8-13d6413f674a)


    
<h5> <font font face = "arial"> <b> <i> Ejemplo 3: </i> </b> </h5>
package com.mycompany.gauss.jordan4;

public class GaussJordan4 {

    public static void main(String[] args) {
        System.out.println("GAUSS-JORDAN");
        double[][] matriz = 
        {   {4,-2,2,1},
            {10,4,4,-4},
            {3,1,1,5}    };
        double[][] resultados = operaciones(matriz);
        Resultados(resultados);
    }
    public static double[][] operaciones(double[][] matriz) {
        int fila = matriz.length;
        int columna = matriz[0].length;
        for (int i = 0; i < fila; i++) {
            double pivote = matriz[i][i];
            for (int j = i + 1; j < columna; j++) {
                matriz[i][j] /= pivote;
            }
            matriz[i][i] = 1;
            for (int j = 0; j < fila; j++) {
                if (i != j) {
                    double epala = matriz[j][i];
                    for (int k = i; k < columna; k++) {
                        matriz[j][k] -= epala * matriz[i][k];
                    }
                }
            }
        }
        return matriz;
    }
    public static void Resultados(double[][] matriz) {
        System.out.println("Los resultados soooon: ");
        System.out.println("X = " + matriz[0][3] + " :)");
        System.out.println("Y = " + matriz[1][3] + " :)");
        System.out.println("Y = " + matriz[2][3] + " :)");
    }}



![2-2](https://github.com/Hante990/Tema-3/assets/107586879/0fd5353d-3a28-49a8-ae74-912cc342b4c6)


    
<h5> <font font face = "arial"> <b> <i> Ejemplo 4: </i> </b> </h5>
package com.mycompany.gauss_jordan;

public class Gauss_jordan {

    public static void main(String[] args) {
        System.out.println("GAUSS-JORDAN");
        double[][] matriz = 
        {   {2,1,-1,1},
            {5,2,2,-4},
            {3,1,1,5}    };
        double[][] resultados = operaciones(matriz);
        Resultados(resultados);
    }
    public static double[][] operaciones(double[][] matriz) {
        int fila = matriz.length;
        int columna = matriz[0].length;
        for (int i = 0; i < fila; i++) {
            double pivote = matriz[i][i];
            for (int j = i + 1; j < columna; j++) {
                matriz[i][j] /= pivote;
            }
            matriz[i][i] = 1;
            for (int j = 0; j < fila; j++) {
                if (i != j) {
                    double epala = matriz[j][i];
                    for (int k = i; k < columna; k++) {
                        matriz[j][k] -= epala * matriz[i][k];
                    }
                }
            }
        }
        return matriz;
    }
    public static void Resultados(double[][] matriz) {
        System.out.println("Los resultados soooon: ");
        System.out.println("X = " + matriz[0][3] + " :)");
        System.out.println("Y = " + matriz[1][3] + " :)");
        System.out.println("Y = " + matriz[2][3] + " :)");
    }}



![2-4](https://github.com/Hante990/Tema-3/assets/107586879/5597f8c7-f6ee-4cae-8587-9286ec540628)


    
<h2 align = "center"> <font font face = "forte"> <a name="Seidel">  3.- Gauss-Seidel </h2></a>

<h3> <font font face = "arial"> DESCRIPCIÓN: </h3>

El método de Gauss-Seidel es una técnica iterativa utilizada para resolver sistemas de ecuaciones lineales. En este método, se mejora el método de Jacobi al utilizar las soluciones más recientes a medida que se calculan, en lugar de esperar a completar una iteración completa. Esto significa que las soluciones se actualizan en cada paso, lo que puede acelerar la convergencia del método.

<h3> <font font face = "arial">Pasos de Gauss-Seidel:</h3>
<h5>Inicialización de las Variables: </h5> Se comienza con una estimación inicial de las soluciones del sistema de ecuaciones lineales.
<h5>Iteración:</h5>Para cada ecuación en el sistema:
<li>Utilizar los valores más recientes de las variables ya calculadas.</li>
<li>Resolver la ecuación para encontrar una nueva estimación de la variable.</li>
<li>Actualizar el valor de la variable con la nueva estimación.</li>
<li>Repetir este proceso para todas las ecuaciones del sistema en cada iteración.</li>
<h5>Criterio de parada:</h5><li>Establecer un criterio de convergencia, como una tolerancia o un número máximo de iteraciones.</li>
<li>Verificar si se ha alcanzado la precisión deseada o el número máximo de iteraciones.</li>
<h5>Convergencia:</h5><li> Comprobar si el método converge hacia la solución del sistema de ecuaciones lineales.</li>
<li>Ajustar los parámetros, como la elección inicial y la precisión, si es necesario para mejorar la convergencia.</li>
<h5>Obtencion de soluciones:</h5> <li>Una vez que se alcanza la convergencia, las soluciones obtenidas en la última iteración se consideran como las soluciones aproximadas del sistema de ecuaciones lineales.</li>
   
<h5> <font font face = "arial"> <b> <i> Ejemplo 1: </i> </b> </h5>

package gausseseidel;

public class GausseSeidel1 {

    public static void main(String[] args) {
        double[][] A = {
                {4.0, -1.0, 0.0},
                {-1.0, 4.0, -1.0},
                {0.0, -1.0, 4.0}
        };
        double[] b = {1, -4,5};
        double[] x = gaussSeidel(A, b);
        for (int i = 0; i < x.length; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }
        
        System.out.println("Me da ese redondeo por la tolerancia de los puntos decimales. ");

    }

    public static double[] gaussSeidel(double[][] A, double[] b) {
        int n = A.length;
        double[] x = new double[n];
        double[] newX = new double[n];
        int max = 100;
        double epsilon = 1e-50;

        for (int iter = 0; iter < max; iter++) {
            for (int i = 0; i < n; i++) {
                newX[i] = b[i];
                for (int j = 0; j < n; j++) {
                    if (j != i) {
                        newX[i] -= A[i][j] * x[j];
                    }
                }
                newX[i] /= A[i][i];
            }

            boolean stop = true;
            for (int i = 0; i < n; i++) {
                if (Math.abs(newX[i] - x[i]) > epsilon) {
                    stop = false;
                    break;
                }
            }

            if (stop) {
                break;
            }

            System.arraycopy(newX, 0, x, 0, n);
           
        }
        return x;
    }}


![e1](https://github.com/Hante990/Tema-3/assets/107586879/e8ae6a06-3793-4c18-a150-9393cfcb946a)


    
<h5> <font font face = "arial"> <b> <i> Ejemplo 2: </i> </b> </h5>
package gausseseidel;

public class GausseSeidel2 {

    public static void main(String[] args) {
        double[][] A = {
            {2, 1, -1},
            {5, 2, 2},
            {3, 1, 1}
        };
        double[] b = {1, -4,5};
        double[] x = gaussSeidel(A, b);
        for (int i = 0; i < x.length; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }

    }

    public static double[] gaussSeidel(double[][] A, double[] b) {
        int n = A.length;
        double[] x = new double[n];
        double[] newX = new double[n];
        int max = 100;
        double epsilon = 1e-50;

        for (int iter = 0; iter < max; iter++) {
            for (int i = 0; i < n; i++) {
                newX[i] = b[i];
                for (int j = 0; j < n; j++) {
                    if (j != i) {
                        newX[i] -= A[i][j] * x[j];
                    }
                }
                newX[i] /= A[i][i];
            }

            boolean stop = true;
            for (int i = 0; i < n; i++) {
                if (Math.abs(newX[i] - x[i]) > epsilon) {
                    stop = false;
                    break;
                }
            }

            if (stop) {
                break;
            }

            System.arraycopy(newX, 0, x, 0, n);
           
        }
        return x;
    }}



![e2](https://github.com/Hante990/Tema-3/assets/107586879/8513a426-a403-4018-bf01-6889f991e930)


    

<h5> <font font face = "arial"> <b> <i> Ejemplo 3: </i> </b> </h5>
package gausseseidel;

public class GausseSeidel3 {

    public static void main(String[] args) {
        double[][] A = {
            {5, 7, 1},
            {6, 4, 2},
            {2, 3, 1}
        };
        double[] b = {4, 1,3};
        double[] x = gaussSeidel(A, b);
        for (int i = 0; i < x.length; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }

    }

    public static double[] gaussSeidel(double[][] A, double[] b) {
        int n = A.length;
        double[] x = new double[n];
        double[] newX = new double[n];
        int max = 100;
        double epsilon = 1e-50;

        for (int iter = 0; iter < max; iter++) {
            for (int i = 0; i < n; i++) {
                newX[i] = b[i];
                for (int j = 0; j < n; j++) {
                    if (j != i) {
                        newX[i] -= A[i][j] * x[j];
                    }
                }
                newX[i] /= A[i][i];
            }

            boolean stop = true;
            for (int i = 0; i < n; i++) {
                if (Math.abs(newX[i] - x[i]) > epsilon) {
                    stop = false;
                    break;
                }
            }

            if (stop) {
                break;
            }

            System.arraycopy(newX, 0, x, 0, n);
           
        }
        return x;
    }}



![e3](https://github.com/Hante990/Tema-3/assets/107586879/758c3cb5-95bd-435c-b3a8-a858556487f9)




<h5> <font font face = "arial"> <b> <i> Ejemplo 4: </i> </b> </h5>
package gausseseidel;

public class GausseSeidel4 {

    public static void main(String[] args) {
        double[][] A = {
            {1, 7, 2},
            {3, 5, 6},
            {3, 4, 8}
        };
        double[] b = {2, -1,7};
        double[] x = gaussSeidel(A, b);
        for (int i = 0; i < x.length; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }
    }

    public static double[] gaussSeidel(double[][] A, double[] b) {
        int n = A.length;
        double[] x = new double[n];
        double[] newX = new double[n];
        int max = 100;
        double epsilon = 1e-50;

        for (int iter = 0; iter < max; iter++) {
            for (int i = 0; i < n; i++) {
                newX[i] = b[i];
                for (int j = 0; j < n; j++) {
                    if (j != i) {
                        newX[i] -= A[i][j] * x[j];
                    }
                }
                newX[i] /= A[i][i];
            }

            boolean stop = true;
            for (int i = 0; i < n; i++) {
                if (Math.abs(newX[i] - x[i]) > epsilon) {
                    stop = false;
                    break;
                }
            }

            if (stop) {
                break;
            }

            System.arraycopy(newX, 0, x, 0, n);
           
        }
        return x;
    }}


![e4](https://github.com/Hante990/Tema-3/assets/107586879/f20b688e-d5cb-4dc8-8547-45114649fd31)


    

<h5> <font font face = "arial"> <b> <i> Ejemplo 5: </i> </b> </h5>
package gausseseidel;

public class GausseSeidel5 {

    public static void main(String[] args) {
        double[][] A = {
            {2, 1, 4},
            {9, 5, 2},
            {7, 1, 6}
        };
        double[] b = {9,6,3};
        double[] x = gaussSeidel(A, b);
        for (int i = 0; i < x.length; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }
    }

    public static double[] gaussSeidel(double[][] A, double[] b) {
        int n = A.length;
        double[] x = new double[n];
        double[] newX = new double[n];
        int max = 100;
        double epsilon = 1e-50;

        for (int iter = 0; iter < max; iter++) {
            for (int i = 0; i < n; i++) {
                newX[i] = b[i];
                for (int j = 0; j < n; j++) {
                    if (j != i) {
                        newX[i] -= A[i][j] * x[j];
                    }
                }
                newX[i] /= A[i][i];
            }

            boolean stop = true;
            for (int i = 0; i < n; i++) {
                if (Math.abs(newX[i] - x[i]) > epsilon) {
                    stop = false;
                    break;
                }
            }

            if (stop) {
                break;
            }

            System.arraycopy(newX, 0, x, 0, n);
           
        }
        return x;
    }}



![e5](https://github.com/Hante990/Tema-3/assets/107586879/ba4fc671-7e49-4b86-9396-c08d3811c685)




    
<h2 align = "center"> <font font face = "forte"> <a name="Jacobi">  4. Jacobi </h2></a>

<h3> <font font face = "arial"> DESCRIPCIÓN: </h3>

El método de Jacobi es un algoritmo iterativo utilizado para resolver sistemas de ecuaciones lineales. En este método, se descompone la matriz de coeficientes del sistema en una suma de una matriz diagonal y dos matrices complementarias. Luego, se utiliza esta descomposición para iterar y encontrar soluciones aproximadas para el sistema de ecuaciones.

<h3> <font font face = "arial">Pasos del método de Jacobi:</h3>
<h5>Descomposición de la matriz: </h5><li> Descomponer la matriz de coeficientes del sistema en una matriz diagonal 
D y dos matrices complementarias L y U, de forma que = ++A=D+L+U, donde:</li>
<li>D es la matriz diagonal que contiene los elementos diagonales de A.
<li>L es la matriz triangular inferior con ceros en la diagonal.</li>
<li>U es la matriz triangular superior con ceros en la diagonal.</li>
<h5>Inicialización: </h5><li>Inicializar un vector de soluciones inicial x(0).</li>
<li>Establecer un criterio de convergencia, como una tolerancia ϵ o un número máximo de iteraciones.</li>
<h5>Iteración: </h5><li>Establecer un criterio de convergencia, como una tolerancia o un número máximo de iteraciones.</li>
<li>Verificar si se ha alcanzado la precisión deseada o el número máximo de iteraciones.</li>
<h5>Criterio de Parada: </h5><li>Verificar si se ha alcanzado la convergencia comparando la diferencia entre las soluciones actuales y las anteriores con la tolerancia establecida.</li>
<li>Detener las iteraciones si se cumple el criterio de convergencia o se alcanza el número máximo de iteraciones.</li>
<h5>Obtencion de soluciones:</h5> <li>Las soluciones aproximadas obtenidas en la última iteración se consideran como las soluciones del sistema de ecuaciones lineales.</li>
   
<h5> <font font face = "arial"> <b> <i> Ejemplo 1: </i> </b> </h5>
public class JacobiMethod {
    public static final double EPSILON = 0.0001;
   public static final int MAX_ITERATIONS = 100;

    public static void main(String[] args) {
        double[][] coefficients = {{5, 1, 1}, {1, 4, 1}, {2, 1, 3}}; 
        double[] constants = {10, 11, 12}; 

        double[] solution = solveJacobi(coefficients, constants);
        
        System.out.println("Solución encontrada:");
        for (int i = 0; i < solution.length; i++) {
            System.out.println("x" + (i + 1) + " = " + solution[i]);
        }
    }

    public static double[] solveJacobi(double[][] coefficients, double[] constants) {
        int n = constants.length;
        double[] solution = new double[n];
        double[] nextSolution = new double[n];
        int iterations = 0;
        boolean converged = false;

        while (!converged && iterations < MAX_ITERATIONS) {
            for (int i = 0; i < n; i++) {
                double sum = constants[i];
                for (int j = 0; j < n; j++) {
                    if (j != i) {
                        sum -= coefficients[i][j] * solution[j];
                    }
                }
                nextSolution[i] = sum / coefficients[i][i];
            }

            double maxDifference = 0.0;
            for (int i = 0; i < n; i++) {
                double difference = Math.abs(nextSolution[i] - solution[i]);
                if (difference > maxDifference) {
                    maxDifference = difference;
                }
            }

            if (maxDifference < EPSILON) {
                converged = true;
            }

            for (int i = 0; i < n; i++) {
                solution[i] = nextSolution[i];
            }

            iterations++;
        }

        if (iterations == MAX_ITERATIONS) {
            System.out.println("El método no converge después de " + MAX_ITERATIONS + " iteraciones.");
        }

        return solution;
    }}



![ee1](https://github.com/Hante990/Tema-3/assets/107586879/68e40cb6-5a78-4667-a24c-0378d8c6f12e)


    
<h5> <font font face = "arial"> <b> <i> Ejemplo 2: </i> </b> </h5>
public class JacobiMethod {
    public static final double EPSILON = 0.0001;
    public static final int MAX_ITERATIONS = 100;

    public static void main(String[] args) {
        double[][] coefficients = {{4, -1, 0}, {-1, 4, -1}, {0, -1, 3}}; 
        double[] constants = {5, -7, 6}; 

        double[] solution = solveJacobi(coefficients, constants);
        
        System.out.println("Solución encontrada:");
        for (int i = 0; i < solution.length; i++) {
            System.out.println("x" + (i + 1) + " = " + solution[i]);
        }
    }

    public static double[] solveJacobi(double[][] coefficients, double[] constants) {
        int n = constants.length;
        double[] solution = new double[n];
        double[] nextSolution = new double[n];
        int iterations = 0;
        boolean converged = false;

        while (!converged && iterations < MAX_ITERATIONS) {
            for (int i = 0; i < n; i++) {
                double sum = constants[i];
                for (int j = 0; j < n; j++) {
                    if (j != i) {
                        sum -= coefficients[i][j] * solution[j];
                    }
                }
                nextSolution[i] = sum / coefficients[i][i];
            }

            double maxDifference = 0.0;
            for (int i = 0; i < n; i++) {
                double difference = Math.abs(nextSolution[i] - solution[i]);
                if (difference > maxDifference) {
                    maxDifference = difference;
                }
            }

            if (maxDifference < EPSILON) {
                converged = true;
            }

            for (int i = 0; i < n; i++) {
                solution[i] = nextSolution[i];
            }

            iterations++;
        }

        if (iterations == MAX_ITERATIONS) {
            System.out.println("El método no converge después de " + MAX_ITERATIONS + " iteraciones.");
        }

        return solution;
    }}



![ee2](https://github.com/Hante990/Tema-3/assets/107586879/3ec8cab9-5632-4255-9534-3d542ecb27ea)


    
<h5> <font font face = "arial"> <b> <i> Ejemplo 3: </i> </b> </h5>
public class JacobiMethod {
    public static final double EPSILON = 0.0001;
    public static final int MAX_ITERATIONS = 100;

    public static void main(String[] args) {
        double[][] coefficients = {{3, 1, 1}, {2, 5, 1}, {1, 1, 4}}; 
        double[] constants = {5, 6, 7}; 
        double[] solution = solveJacobi(coefficients, constants);
        
        System.out.println("Solución encontrada:");
        for (int i = 0; i < solution.length; i++) {
            System.out.println("x" + (i + 1) + " = " + solution[i]);
        }
    }

    public static double[] solveJacobi(double[][] coefficients, double[] constants) {
        int n = constants.length;
        double[] solution = new double[n];
        double[] nextSolution = new double[n];
        int iterations = 0;
        boolean converged = false;

        while (!converged && iterations < MAX_ITERATIONS) {
            for (int i = 0; i < n; i++) {
                double sum = constants[i];
                for (int j = 0; j < n; j++) {
                    if (j != i) {
                        sum -= coefficients[i][j] * solution[j];
                    }
                }
                nextSolution[i] = sum / coefficients[i][i];
            }

            double maxDifference = 0.0;
            for (int i = 0; i < n; i++) {
                double difference = Math.abs(nextSolution[i] - solution[i]);
                if (difference > maxDifference) {
                    maxDifference = difference;
                }
            }

            if (maxDifference < EPSILON) {
                converged = true;
            }

            for (int i = 0; i < n; i++) {
                solution[i] = nextSolution[i];
            }

            iterations++;
        }

        if (iterations == MAX_ITERATIONS) {
            System.out.println("El método no converge después de " + MAX_ITERATIONS + " iteraciones.");
        }

        return solution;
    }}


![ee3](https://github.com/Hante990/Tema-3/assets/107586879/276fab49-748c-4641-af03-8c3b21f326ec)



    
<h5> <font font face = "arial"> <b> <i> Ejemplo 4: </i> </b> </h5>
public class JacobiMethod {
    public static final double EPSILON = 0.0001;
    public static final int MAX_ITERATIONS = 100;

    public static void main(String[] args) {
        double[][] coefficients = {{4, -1, 0}, {-1, 5, -1}, {0, -1, 3}};
        double[] constants = {8, -3, 6}; 
        double[] solution = solveJacobi(coefficients, constants);
        
        System.out.println("Solución encontrada:");
        for (int i = 0; i < solution.length; i++) {
            System.out.println("x" + (i + 1) + " = " + solution[i]);
        }
    }

    public static double[] solveJacobi(double[][] coefficients, double[] constants) {
        int n = constants.length;
        double[] solution = new double[n];
        double[] nextSolution = new double[n];
        int iterations = 0;
        boolean converged = false;

        while (!converged && iterations < MAX_ITERATIONS) {
            for (int i = 0; i < n; i++) {
                double sum = constants[i];
                for (int j = 0; j < n; j++) {
                    if (j != i) {
                        sum -= coefficients[i][j] * solution[j];
                    }
                }
                nextSolution[i] = sum / coefficients[i][i];
            }

            double maxDifference = 0.0;
            for (int i = 0; i < n; i++) {
                double difference = Math.abs(nextSolution[i] - solution[i]);
                if (difference > maxDifference) {
                    maxDifference = difference;
                }
            }

            if (maxDifference < EPSILON) {
                converged = true;
            }

            for (int i = 0; i < n; i++) {
                solution[i] = nextSolution[i];
            }

            iterations++;
        }

        if (iterations == MAX_ITERATIONS) {
            System.out.println("El método no converge después de " + MAX_ITERATIONS + " iteraciones.");
        }

        return solution;
    }}


![ee4](https://github.com/Hante990/Tema-3/assets/107586879/b2875573-1064-4780-8b5a-ced76725dca7)


    
<h5> <font font face = "arial"> <b> <i> Ejemplo 5: </i> </b> </h5>
public class JacobiMethod {
    public static final double EPSILON = 0.0001;
    public static final int MAX_ITERATIONS = 100;

    public static void main(String[] args) {
        double[][] coefficients = {{2, -1, 0}, {-1, 2, -1}, {0, -1, 2}}; 
        double[] constants = {1, 0, 1}; 

        double[] solution = solveJacobi(coefficients, constants);
        
        System.out.println("Solución encontrada:");
        for (int i = 0; i < solution.length; i++) {
            System.out.println("x" + (i + 1) + " = " + solution[i]);
        }
    }

    public static double[] solveJacobi(double[][] coefficients, double[] constants) {
        int n = constants.length;
        double[] solution = new double[n];
        double[] nextSolution = new double[n];
        int iterations = 0;
        boolean converged = false;

        while (!converged && iterations < MAX_ITERATIONS) {
            for (int i = 0; i < n; i++) {
                double sum = constants[i];
                for (int j = 0; j < n; j++) {
                    if (j != i) {
                        sum -= coefficients[i][j] * solution[j];
                    }
                }
                nextSolution[i] = sum / coefficients[i][i];
            }

            double maxDifference = 0.0;
            for (int i = 0; i < n; i++) {
                double difference = Math.abs(nextSolution[i] - solution[i]);
                if (difference > maxDifference) {
                    maxDifference = difference;
                }
            }

            if (maxDifference < EPSILON) {
                converged = true;
            }

            for (int i = 0; i < n; i++) {
                solution[i] = nextSolution[i];
            }

            iterations++;
        }

        if (iterations == MAX_ITERATIONS) {
            System.out.println("El método no converge después de " + MAX_ITERATIONS + " iteraciones.");
        }

        return solution;
    }}






![ee5](https://github.com/Hante990/Tema-3/assets/107586879/19658622-1d53-44ed-9891-412fe75136ba)

    
Realizado por:
  <li>Diego Alonso Fernández Delagadillo</li>
  <li> Antonio Guerrero Lazcano</li>
  <li>Miguel Angel Flores Lopez</li>
  <li>Xavier Valle Dorantes</li>
  <li>Kevin Espejel Huerta  </li>

Tema 4

<h1> <font color = "darkred" size="+5" font face = "cooper black"> <b> <i> Tema 4: Métodos de solución de problemas aplicando diferenciación y integración<i> </b> </font> </h1>

<h4> <font color = "darkred" size="+5" font face = "cooper black"> <b> <i>Integrantes </i> </b> </font> </h4>


<li>Xavier Valle Dorantes</li>


-----------------------------------------------------------------------------------------

<h3 align = "center"> <font color = "darkorange" size = "+6"  font face =  "cooper black">  Índice </font> </h3>

<header> <font color = "red" size="+1" font face = "aharoni">
    <nav class = "navegacion">
      <ul class = "Indice">
        <li> <a href = "#Descripción"> Descripción </a> <br> </li>
        <li> <a href = "#Temario"> Temario </a> <br> </li>
        <li> <a href = "#Métodos"> Métodos </a> <br> </li>
          <ul class = "subindice">
              <li> <a href="# Método del Trapecio "> Método del Trapecio </a> <br> </li>
              <li> <a href="# Método de Simpson 1/3 "> Método de Simpson 1/3 </a> <br> </li>
              <li> <a href="# Método de Simpson 3/8"> Método de Simpson 3/8 </a> <br> </li> 
              <li> <a href="# Método de la Cuadratura Gaussiana "> Método de la Cuadratura Gaussiana </a> <br> </li> 
          </ul>
      </ul>
    </nav>
</font> </header>

-----------------------------------------------------------------------------------------

<h3 align = "center"> <font  font face = "bauhaus 93">  <a name="Descripción"> Descripción</a> </font> </h3>

En este documento podremos obser el funcionamiento de diversos métodos aplicandolos en funciones de diferenciación e integración númerica, los cuales son:

  1. Método del Trapecio 
  2. Método de Simpson 1/3
  3. Método de Simpson 3/8
  4. Método de la Cuadratura Gaussiana

En cada una de las carpetas podremos encontrar lo que son los códigos de cada método, tanto de su diferenciación como la de integración, y en cada carpeta podremos encontrar cinco programas los cuales estan desarrollados en el lenguaje de programación Java, en los cuales estarán documentados para un mayor entendimiento del programa.

-----------------------------------------------------------------------------------------

<h3 align = "center"> <font  font face = "bauhaus 93">  <a name="Temario"> Temario</a> </font> </h3>

   4.1 Diferenciación Numérica 
   
   4.2 Integración Numérica
   
   4.3 Integración Múltiple
   
   4.4 Aplicación

-----------------------------------------------------------------------------------------

<h2 align = "center"> <font  font face = "bauhaus 93"> <a name="Métodos"> Métodos</a> </font> </h2>

<h3 align = "center"> <font  font face = "bauhaus 93"> <a name=" Método del Trapecio ">  Método del Trapecio </a> </font> </h3>

<h4> <font font face = "arial"> Descripción </h4>
  
Este método es útil cuando la función a integrar es difícil o imposible de integrar analíticamente, o cuando se necesita una solución numérica rápida y aceptable. Sin embargo, su precisión depende de la cantidad de segmentos utilizados y puede ser superado por métodos más avanzados, como la regla de Simpson, para funciones que son suaves y continuamente diferenciables.

<h4> <font font face = "arial">Pseudocódigo </h4>
  
1. Pseudocódigo para realizar la integración

        Función Trapecio_Integración(f, a, b, n):
            h = (b - a) / n
            suma = 0.5 * (f(a) + f(b))
            Para i desde 1 hasta n-1:
                xi = a + i * h
                suma = suma + f(xi)
            resultado = h * suma
            Devolver resultado


2. Pseudocódigo para realizar la diferenciación

        Función Trapecio_Diferenciación(f, a, b, n):
            h = (b - a) / n
            suma = f(a) + f(b)
            Para i desde 1 hasta n-1:
                xi = a + i * h
                suma = suma + 2 * f(xi)
            resultado = h * suma / 2
            Devolver resultado

<h4> <font font face = "arial"> <b> <i> Ejemplo en código </i> </b> </h4>

    package Método_Trapecio;
    
    import java.util.function.Function;
    
    /**
     *
     * @author Migue
     */
    public class Ejercicio1 {
            
        
        // Método para calcular la integral numérica utilizando el Método del Trapecio
        public static double integrate(double a, double b, int n, Function<Double, Double> func) {
            double h = (b - a) / n;
            double sum = 0.5 * (func.apply(a) + func.apply(b));
            
            for (int i = 1; i < n; i++) {
                double x = a + i * h;
                sum += func.apply(x);
            }
            
            return h * sum;
        }
        
        // Método para calcular la derivada numérica utilizando el Método del Trapecio
        public static double differentiate(double x, double h, Function<Double, Double> func) {
            double result = (func.apply(x + h) - func.apply(x - h)) / (2 * h);
            return result;
        }
        
        public static void main(String[] args) {
            // Definir la función que se desea integrar y diferenciar
            Function<Double, Double> func = (x) -> Math.sin(x); // Ejemplo: función seno
            
            // Definir los límites de integración y el número de segmentos
            double a = 0; // Límite inferior
            double b = Math.PI / 2; // Límite superior
            int n = 1000; // Número de segmentos
            
            // Calcular la integral numérica utilizando el Método del Trapecio
            double integral = integrate(a, b, n, func);
            System.out.println("Resultado de la integración: " + integral);
            
            // Calcular la derivada numérica utilizando el Método del Trapecio
            double x0 = Math.PI / 4; // Punto en el que se desea calcular la derivada
            double h = 0.001; // Tamaño del paso
            double derivative = differentiate(x0, h, func);
            System.out.println("Resultado de la diferenciación en x = " + x0 + ": " + derivative);
            
        }
    }

<h4> <font font face = "arial"> Programa ejecutado </h4>

![Captura de pantalla 2024-04-21 134559](https://github.com/MiguelAngelFlores3/Metodos_T4/assets/167603831/dbc10aaf-0a47-49c8-9ebd-f0313ac94924)

<h3 align = "center"> <font  font face = "bauhaus 93"> <a name=" Método de Simpson 1/3 ">  Método de Simpson 1/3 </a> </font> </h3>

<h4> <font font face = "arial"> Descripción </h4>

Este método proporciona una mayor precisión que el Método del Trapecio para la misma cantidad de puntos de integración y es bastante eficaz para integrandos suaves. Sin embargo, para funciones con oscilaciones rápidas o discontinuidades, puede no ser tan eficaz. En esos casos, métodos más avanzados, como la regla de Simpson 3/8 o métodos adaptativos, pueden ser más apropiados.

<h4> <font font face = "arial">Pseudocódigo </h4>
  
1. Pseudocódigo para realizar la integración

        Función Simpson_Integración(f, a, b, n):
            h = (b - a) / n
            suma = f(a) + f(b)
            Para i desde 1 hasta n-1:
                xi = a + i * h
                Si i es impar:
                    suma = suma + 4 * f(xi)
                Sino:
                    suma = suma + 2 * f(xi)
            resultado = h * suma / 3
            Devolver resultado

2. Pseudocódigo para realizar la diferenciación
    
       Función Simpson_Diferenciación(f, a, b, n):
        h = (b - a) / n
        suma = f(a) + f(b)
        Para i desde 1 hasta n-1:
            xi = a + i * h
            Si i es impar:
                suma = suma + 4 * f(xi)
            Sino:
                suma = suma + 2 * f(xi)
        resultado = h * suma / 3
        resultado = resultado / h # Para la diferenciación
        Devolver resultado

<h4> <font font face = "arial"> <b> <i> Ejemplo en código </i> </b> </h4>

    package Método_Simpson1_3;
    
    import java.util.function.Function;
    /**
     *
     * @author Migue
     */
    public class Ejercicio1 {
        // Método para calcular la integral numérica utilizando el Método de Simpson 1/3
        public static double integrate(double a, double b, int n, Function<Double, Double> func) {
            double h = (b - a) / n;
            double sum = func.apply(a) + func.apply(b);
    
            for (int i = 1; i < n; i += 2) {
                double x = a + i * h;
                sum += 4 * func.apply(x);
            }
    
            for (int i = 2; i < n - 1; i += 2) {
                double x = a + i * h;
                sum += 2 * func.apply(x);
            }
    
            return (h / 3) * sum;
        }
        
        // Método para calcular la derivada numérica utilizando el Método de Simpson 1/3
        public static double differentiate(double x, double h, Function<Double, Double> func) {
            double result = (func.apply(x - 2 * h) - 8 * func.apply(x - h) + 8 * func.apply(x + h) - func.apply(x + 2 * h)) / (12 * h);
            return result;
        }
        
        public static void main(String[] args) {
            // Definir la función que se desea integrar y diferenciar
            Function<Double, Double> func = (x) -> Math.sin(x); // Ejemplo: función seno
            
            // Definir los límites de integración y el número de segmentos
            double a = 0; // Límite inferior
            double b = Math.PI / 2; // Límite superior
            int n = 4; // Número de segmentos (debe ser par para el Método de Simpson 1/3)
            
            // Calcular la integral numérica utilizando el Método de Simpson 1/3
            double integral = integrate(a, b, n, func);
            System.out.println("Resultado de la integración: " + integral);
            
            // Calcular la derivada numérica utilizando el Método de Simpson 1/3
            double x0 = Math.PI / 4; // Punto en el que se desea calcular la derivada
            double h = 0.1; // Tamaño del paso
            double derivative = differentiate(x0, h, func);
            System.out.println("Resultado de la diferenciación en x = " + x0 + ": " + derivative);
        }
    }

<h4> <font font face = "arial"> Programa ejecutado </h4>

![Captura de pantalla 2024-04-21 142010](https://github.com/MiguelAngelFlores3/M-TODOS_T4/assets/167603831/4790a5b1-9e8c-4d36-ac32-fc21be24a584)

<h3 align = "center"> <font  font face = "bauhaus 93"> <a name=" Método de Simpson 3/8 ">  Método de Simpson 3/8 </a> </font> </h3>

<h4> <font font face = "arial"> Descripción </h4>

El Método de Simpson 3/8 es una técnica de integración numérica que extiende el Método de Simpson 1/3 para mejorar aún más la precisión de la aproximación. Al igual que el Método de Simpson 1/3, utiliza polinomios de segundo grado (parábolas) para aproximar la función entre los puntos de integración. Sin embargo, en lugar de usar parábolas en cada subintervalo, el Método de Simpson 3/8 utiliza polinomios de tercer grado (cúbicos) para ajustar la función.

<h4> <font font face = "arial">Pseudocódigo </h4>
  
1. Pseudocódigo para realizar la integración

        Función Simpson_3_8_Integración(f, a, b, n):
            h = (b - a) / n
            suma = f(a) + f(b)
            Para i desde 1 hasta n-1:
                xi = a + i * h
                Si i es divisible por 3:
                    suma = suma + 2 * f(xi)
                Sino Si i no es divisible por 3 pero es impar:
                    suma = suma + 3 * f(xi)
                Sino:
                    suma = suma + 3 * f(xi)
            resultado = 3 * h * suma / 8
            Devolver resultado

2. Pseudocódigo para realizar la diferenciación

       Función Simpson_3_8_Diferenciación(f, a, b, n):
        h = (b - a) / n
        suma = f(a) + f(b)
        Para i desde 1 hasta n-1:
            xi = a + i * h
            Si i es divisible por 3:
                suma = suma + 2 * f(xi)
            Sino Si i no es divisible por 3 pero es impar:
                suma = suma + 3 * f(xi)
            Sino:
                suma = suma + 3 * f(xi)
        resultado = 3 * h * suma / 8
        resultado = resultado / h # Para la diferenciación
        Devolver resultado

<h4> <font font face = "arial"> <b> <i> Ejemplo en código </i> </b> </h4>

    package Método_Simpson3_8;
    
    import java.util.function.Function;
    
    /**
     *
     * @author Migue
     */
    public class Ejercicio1 {
        // Método para calcular la integral numérica utilizando el Método de Simpson 3/8
    
        public static double integrate(double a, double b, int n, Function<Double, Double> func) {
            double h = (b - a) / n;
            double sum = func.apply(a) + func.apply(b);
    
            for (int i = 1; i < n; i++) {
                double x = a + i * h;
                sum += i % 3 == 0 ? 2 * func.apply(x) : 3 * func.apply(x);
            }
    
            return (3 * h / 8) * sum;
        }
    
        // Método para calcular la derivada numérica utilizando el Método de Simpson 3/8
        public static double differentiate(double x, double h, Function<Double, Double> func) {
            double result = (-func.apply(x + 2 * h) + 9 * func.apply(x + h) - 9 * func.apply(x - h) + func.apply(x - 2 * h)) / (24 * h);
            return result;
        }
    
        public static void main(String[] args) {
            Function<Double, Double> func = (x) -> Math.sin(x); // Función a integrar y diferenciar: sin(x)
            double a = 0; // Límite inferior
            double b = Math.PI / 2; // Límite superior
            int n = 3; // Número de segmentos (debe ser múltiplo de 3 para el Método de Simpson 3/8)
            double x0 = Math.PI / 4; // Punto en el que se desea calcular la derivada
            double h = 0.1; // Tamaño del paso
    
            // Calcular la integral numérica utilizando el Método de Simpson 3/8
            double integral = integrate(a, b, n, func);
            System.out.println("Resultado de la integración: " + integral);
    
            // Calcular la derivada numérica utilizando el Método de Simpson 3/8
            double derivative = differentiate(x0, h, func);
            System.out.println("Resultado de la diferenciación en x = " + x0 + ": " + derivative);
        }
    }

<h4> <font font face = "arial"> Programa ejecutado </h4>

![Captura de pantalla 2024-04-21 144711](https://github.com/MiguelAngelFlores3/M-TODOS_T4/assets/167603831/2f81f60f-9961-47cc-b7d6-9cc7e679a7eb)

<h3 align = "center"> <font  font face = "bauhaus 93"> <a name=" Método de la Cuadratura Gaussiana ">  Método de la Cuadratura Gaussiana </a> </font> </h3>

<h4> <font font face = "arial"> Descripción </h4>
  
El Método de la Cuadratura Gaussiana es una técnica de integración numérica que utiliza una selección cuidadosa de puntos de evaluación y pesos para proporcionar una alta precisión en la aproximación de integrales definidas. A diferencia de los métodos de interpolación como el Método del Trapecio o el Método de Simpson, la Cuadratura Gaussiana no intenta ajustar polinomios a la función a integrar. En cambio, aprovecha las propiedades de ciertas funciones de peso para elegir de manera óptima los puntos de evaluación.

<h4> <font font face = "arial">Pseudocódigo </h4>
  
1. Pseudocódigo para realizar la integración

        Función Cuadratura_Gaussiana_Integración(f, a, b, n):
            coeficientes, nodos = obtener_coeficientes_y_nodos(n)
            suma = 0
            Para i desde 0 hasta n-1:
                xi = (b - a) / 2 * nodos[i] + (b + a) / 2
                suma = suma + coeficientes[i] * f(xi)
            resultado = (b - a) / 2 * suma
            Devolver resultado

2. Pseudocódigo para realizar la diferenciación

        Función Cuadratura_Gaussiana_Diferenciación(f, a, b, n):
            coeficientes, nodos = obtener_coeficientes_y_nodos(n)
            suma = 0
            Para i desde 0 hasta n-1:
                xi = (b - a) / 2 * nodos[i] + (b + a) / 2
                suma = suma + coeficientes[i] * f(xi)
            resultado = suma
            Devolver resultado

<h4> <font font face = "arial"> <b> <i> Ejemplo en código </i> </b> </h4>

    package Método_Cuadratura_Gaussiana;
    
    import java.util.function.Function;
    
    /**
     *
     * @author Migue
     */
    public class Ejercicio1 {
        // Coeficientes y nodos de Cuadratura Gaussiana para dos puntos
    
        private static final double[] nodes = {-0.5773502692, 0.5773502692};
        private static final double[] weights = {1.0, 1.0};
    
        // Método para calcular la integral numérica utilizando Cuadratura Gaussiana
        public static double integrate(double a, double b, Function<Double, Double> func) {
            double integral = 0.0;
            double transform = (b - a) / 2.0;
    
            for (int i = 0; i < nodes.length; i++) {
                double x = transform * nodes[i] + (a + b) / 2.0;
                integral += weights[i] * func.apply(x);
            }
    
            return transform * integral;
        }
    
        // Método para calcular la derivada numérica utilizando Cuadratura Gaussiana
        public static double differentiate(double x, double h, Function<Double, Double> func) {
            double derivative = 0.0;
    
            for (int i = 0; i < nodes.length; i++) {
                double xi = x + h * nodes[i];
                derivative += weights[i] * func.apply(xi);
            }
    
            return derivative / h;
        }
    
        public static void main(String[] args) {
            Function<Double, Double> func = (x) -> Math.sin(x); // Función a integrar y diferenciar: sin(x)
            double a = 0; // Límite inferior
            double b = Math.PI / 2; // Límite superior
            double x0 = Math.PI / 4; // Punto en el que se desea calcular la derivada
            double h = 0.1; // Tamaño del paso
    
            // Calcular la integral numérica utilizando Cuadratura Gaussiana
            double integral = integrate(a, b, func);
            System.out.println("Resultado de la integración: " + integral);
    
            // Calcular la derivada numérica utilizando Cuadratura Gaussiana
            double derivative = differentiate(x0, h, func);
            System.out.println("Resultado de la diferenciación en x = " + x0 + ": " + derivative);
        }
    }

<h4> <font font face = "arial"> Programa ejecutado </h4>

![Captura de pantalla 2024-04-21 145400](https://github.com/MiguelAngelFlores3/M-TODOS_T4/assets/167603831/33d51347-cb05-4cdf-9611-78a99cd6448d)



Tema 5

Interpolación de Lagrange
Características:

Utiliza un polinomio para pasar exactamente por un conjunto de puntos dados.
Cada punto contribuye a la forma del polinomio a través de una función base específica.
Ventajas:

Preciso para conjuntos de puntos pequeños.
Asegura que el polinomio pasa exactamente por todos los puntos dados.
Desventajas:

Se vuelve computacionalmente costoso y complejo para grandes conjuntos de datos.
Puede sufrir de oscilaciones entre puntos (fenómeno de Runge).
Aplicaciones:

Uso en análisis numérico y teoría de aproximación.
Reconstrucción de señales en procesamiento digital. 

![images](https://github.com/xAvAd0/Interpola/assets/161792284/5da665c1-0785-4d46-a617-1d77d172fd9e)

Interpolación Lineal
Características:

Aproxima la función mediante segmentos de líneas rectas entre pares de puntos consecutivos.
Es el método más simple de interpolación.
Ventajas:

Fácil de implementar y computacionalmente eficiente.
Buena aproximación para funciones que son aproximadamente lineales entre los puntos.
Desventajas:

No capta la curvatura de funciones no lineales.
Menos precisa si la función subyacente tiene variaciones significativas entre puntos.
Aplicaciones:

Gráficos por computadora y visualización.
Modelado rápido de datos donde se necesita una solución simple y rápida.

![maxresdefault](https://github.com/xAvAd0/Interpola/assets/161792284/f275ed3f-b22f-4035-9607-9fa83f88e3d5)

Interpolación Cuadrática
Características:

Utiliza un polinomio de grado dos para aproximar la función.
Requiere al menos tres puntos para construir el polinomio.
Ventajas:

Mejor captura de la curvatura de la función en comparación con la interpolación lineal.
Proporciona una aproximación más precisa para funciones suaves.
Desventajas:

Más compleja que la interpolación lineal.
Puede ser inadecuada para funciones con cambios bruscos entre puntos.
Aplicaciones:

Análisis y modelado en ciencias e ingeniería donde se requiere una mejor precisión que la ofrecida por la interpolación lineal.
Ajuste de curvas en gráficos y diseño.

![unnamed](https://github.com/xAvAd0/Interpola/assets/161792284/dba60dab-6fe0-4b86-944a-81e1def709ed)


Interpolación de Newton
Características:

Utiliza un enfoque basado en diferencias divididas y permite la construcción incremental del polinomio.
Adecuada para conjuntos de puntos que se actualizan dinámicamente.
Ventajas:

Eficiente para añadir nuevos puntos sin recalcular todo el polinomio.
Flexibilidad en la actualización y ajuste del modelo de interpolación.
Desventajas:

La formulación puede ser más compleja en comparación con otros métodos.
Similar a otros polinomios de alto grado, puede sufrir de oscilaciones para conjuntos grandes de puntos.
Aplicaciones:

Aplicaciones en computación científica donde los datos pueden cambiar y actualizarse frecuentemente.
Simulación y análisis numérico.

![download](https://github.com/xAvAd0/Interpola/assets/161792284/0f6cefd7-e4f5-465d-9aa1-e04ce0079097)

Los métodos de interpolación son herramientas fundamentales en la aproximación de funciones y el análisis de datos, cada uno con características únicas que los hacen adecuados para diferentes tipos de problemas.

Interpolación de Lagrange es muy precisa para conjuntos pequeños de datos, garantizando que el polinomio pase por todos los puntos, pero se vuelve ineficiente y propenso a oscilaciones con conjuntos más grandes.
Interpolación lineal es el método más sencillo y computacionalmente eficiente, ideal para situaciones donde se requiere una solución rápida y aproximada, aunque su precisión es limitada para funciones no lineales.
Interpolación cuadrática ofrece un compromiso entre simplicidad y precisión, capturando mejor la curvatura de las funciones en comparación con la interpolación lineal, pero puede no ser adecuada para funciones con cambios bruscos.
Interpolación de Newton es especialmente útil para conjuntos de datos dinámicos que se actualizan con frecuencia, proporcionando una manera eficiente de ajustar el polinomio sin recalcular completamente.
La elección del método de interpolación adecuado depende de factores como el tamaño del conjunto de datos, la naturaleza de la función subyacente y los requisitos de precisión y eficiencia del problema específico. En aplicaciones prácticas, desde el procesamiento de señales hasta la simulación numérica, estos métodos permiten aproximar funciones de manera efectiva, facilitando el análisis y la visualización de datos complejos.

Tema 6 :

Introducción a la Solución Numérica de Ecuaciones Diferenciales
Las ecuaciones diferenciales son herramientas fundamentales en las matemáticas y se utilizan para modelar fenómenos naturales y procesos en diversas disciplinas, como la física, la ingeniería, la biología y la economía. Una ecuación diferencial describe la relación entre una función desconocida y sus derivadas. Resolver una ecuación diferencial significa encontrar esta función desconocida que satisface la relación dada.

Existen dos tipos principales de ecuaciones diferenciales:

----Ecuaciones Diferenciales Ordinarias (EDOs): Involucran funciones de una sola variable independiente y sus derivadas. Un ejemplo típico es la ecuación de movimiento en física.
----Ecuaciones Diferenciales Parciales (EDPs): Involucran funciones de múltiples variables independientes y sus derivadas parciales. Un ejemplo común es la ecuación del calor en un material.

Métodos Numéricos para la Solución de Ecuaciones Diferenciales
Cuando las soluciones analíticas (exactas) de las ecuaciones diferenciales son difíciles o imposibles de obtener, se recurre a métodos numéricos. Estos métodos proporcionan aproximaciones de la solución en puntos discretos y son implementados mediante algoritmos computacionales. A continuación, se presentan algunos de los métodos numéricos más utilizados:


Método de Euler
El método de Euler es uno de los métodos más simples para resolver ecuaciones diferenciales ordinarias (EDOs). Se basa en la aproximación de la solución en intervalos pequeños.

![image](https://github.com/xAvAd0/Ecuaciones_Dif/assets/161792284/21f15f4d-1fd7-4dc9-bcc7-20e439d362bc)

Ventajas:

Fácil de implementar.
Bueno para obtener una comprensión inicial de la dinámica del sistema.

Desventajas:

Puede ser inexacto si el paso h no es lo suficientemente pequeño.
Es inestable para algunos problemas si h es grande.


Método de Euler Mejorado (o Método del Punto Medio)

Este método es una mejora del método de Euler que utiliza un punto intermedio para obtener una mejor estimación.

Fórmula:

![image](https://github.com/xAvAd0/Ecuaciones_Dif/assets/161792284/39f51d8b-8555-476f-8f6e-48f67fbc55ac)

Ventajas:

Más preciso que el método de Euler simple.
Relativamente fácil de implementar.

Desventajas:
Aún puede requerir pasos pequeños h para lograr alta precisión.

Método de Runge-Kutta de Cuarto Orden (RK4)

El método RK4 es uno de los métodos más populares debido a su precisión y estabilidad.
Formulas : 

![image](https://github.com/xAvAd0/Ecuaciones_Dif/assets/161792284/fdeb86de-598f-42da-ba06-e10e60b1d5cf)

Ventajas:

Muy preciso para muchos problemas.
Buena estabilidad.

Desventajas:

Más complicado de implementar que los métodos de Euler.

Método de Adams-Bashforth-Moulton (ABM)

Este es un método predictor-corrector que combina un método de múltiples pasos explícito (Adams-Bashforth) y uno implícito (Adams-Moulton).

![image](https://github.com/xAvAd0/Ecuaciones_Dif/assets/161792284/d56831af-aa3f-43bf-a4d7-d7888909e870)

Ventajas:

Puede ser muy eficiente para problemas de largo plazo.
Utiliza la información de pasos anteriores para mejorar la precisión.

Desventajas:

Requiere almacenamiento de valores de pasos anteriores.
Puede ser complejo de implementar correctamente.

Conclusión
Los métodos numéricos para la solución de ecuaciones diferenciales son herramientas poderosas que permiten aproximar soluciones donde los métodos analíticos fallan o son impracticables. La elección del método adecuado depende de la naturaleza del problema, los recursos computacionales disponibles y la precisión requerida. La comprensión de estos métodos es esencial para cualquier profesional que trabaje en campos donde las ecuaciones diferenciales desempeñan un papel crucial.









