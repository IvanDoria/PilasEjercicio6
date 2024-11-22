import java.util.Scanner;
import java.util.Stack;

public class Operacion {
    
    public void operaciones(int fi, int co){

        try (Scanner sc = new Scanner(System.in)) {
            double[][] matriz = new double[fi][co];
                int dato = 0;

                System.out.println("Ingrese los datos de la matriz:");
                for (int i = 0; i < fi; i++) {
                    for (int j = 0; j < co; j++) {
                        dato = dato + 1;
                        System.out.print("Ingrese el dato número " + dato + ": ");
                        matriz[i][j] = sc.nextInt();
                    }
                }

                System.out.println("Su matriz quedo de la siguiente manera: ");
                for (int i = 0; i < fi; i++) {
                    for (int j = 0; j < co; j++) {
                        System.out.print(matriz[i][j] + "\t" );
                    }
                    //Para pasar a la siguiente fila
                    System.out.println();
                }

                //Sumar las filas y promedio
                Stack<Double> sumas1 = new Stack<>();
                Stack<Double> promedios = new Stack<>();
                double promedio;
                for (int i = 0; i < fi; i++) {
                    double suma = 0;
                    for (int j = 0; j < co; j++) {
                        suma = suma + matriz[i][j];
                    }
                    promedio = suma / fi;
                    sumas1.push(suma);
                    promedios.push(promedio);
                }

                System.out.println();
                System.out.println("Solución del punto #1: ");
                System.out.println("Suma de las Filas: "+ sumas1);
                System.out.println("Promedio de las Filas: " + promedios);
                System.out.println();

                //Sumar columna y sacar raiz cuadrada
                Stack<Double> sumas2 = new Stack<>();
                Stack<Double> raices = new Stack<>();
                double raiz;
                for (int i = 0; i < co; i++) {
                    double suma = 0;
                    for (int j = 0; j < fi; j++) {
                        suma = suma + matriz[j][i];
                    }
                    raiz = Math.sqrt(suma);
                    sumas2.push(suma);
                    raices.push(raiz);
                }

                System.out.println("Solución del punto #2: ");
                System.out.println("Suma de las Columnas: "+ sumas2);
                System.out.println("Raiz cuadrada de las Columnas: " + raices);
                System.out.println();

                /*Creacion de otra matriz para multiplicar la primera, esta para este caso la voy a realizar automatica y
                del mismo tamaño inicial para que la multiplicacion si pueda ocurrir, ya que si son de diferente tamaño no funciona*/

                System.out.println("Solución del punto #3: ");
                double [][] MatrizAux = new double[fi][co];
                for (int i = 0; i < fi; i++) {
                    for (int j = 0; j < co; j++) {
                        MatrizAux[i][j] = (int)(Math.random()*10+1);
                    }
                }
                System.out.println("Creo una matriz auxiliar: ");
                for (int i = 0; i < fi; i++) {
                    for (int j = 0; j < co; j++) {
                        System.out.print(MatrizAux[i][j] + "\t" );
                    }
                    //Para pasar a la siguiente fila
                    System.out.println();
                }

                System.out.println("Ahora voy a multiplicar la matriz inicial con la nueva matriz: ");

                Stack<Double> Multiplicacion = new Stack<>();
                for (int i = 0; i < fi; i++) {
                    for (int j = 0; j < co; j++) {
                            Multiplicacion.push(matriz[i][j] * MatrizAux[i][j]);
                    }
                }

                System.out.println("La Multiplicación de las 2 matrices es: " + Multiplicacion);
        }
    }
}



