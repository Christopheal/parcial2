import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la cafeteria de Christopher. ¿Desea Café o Té? (c/t)");
        String opcion = scanner.nextLine();

        Bebida bebida = null;

        if (opcion.equalsIgnoreCase("c")) {
            bebida = new Cafe();
        } else if (opcion.equalsIgnoreCase("t")) {
            bebida = new Te();

        } else {
            System.out.println("Opción no válida. Saliendo.");
            System.exit(0);
        }

        System.out.println("¿Desea agregar Leche? (s/n)");
        opcion = scanner.nextLine();

        if (opcion.equalsIgnoreCase("s")) {
            bebida = new Leche(bebida);
        }

        System.out.println("¿Desea agregar Chocolate? (s/n)");
        opcion = scanner.nextLine();

        if (opcion.equalsIgnoreCase("s")) {
            bebida = new Chocolate(bebida);
        }

        System.out.println("¿Desea agregar Canela? (s/n)");
        opcion = scanner.nextLine();

        if (opcion.equalsIgnoreCase("s")) {
            bebida = new Canela(bebida);
        }

        System.out.println("Su bebida personalizada es:");
        System.out.println("Descripción: " + bebida.getDescripcion());
        System.out.println("Costo total: Q. " + bebida.calcularCosto());

        scanner.close();
    }
}