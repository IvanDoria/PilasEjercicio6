import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Operacion op = new Operacion();
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Ingrese el tamaño de la Matriz:");
            System.out.println("Cantidad de Filas: ");
            int fi = sc.nextInt();
            System.out.println("Cantidad de Columnas: ");
            int co = sc.nextInt();
            op.operaciones(fi, co);

        }
    }
}