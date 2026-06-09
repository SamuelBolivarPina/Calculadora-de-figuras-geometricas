import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class menu {
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Bienvenido a la calculadora geometrica");
            System.out.println("1. Área de cuadrado\n" +
                    "2. Área de rectángulo\n" +
                    "3. Área de triángulo\n" +
                    "4. Área de círculo\n" +
                    "5. Salir\n");
            System.out.println("Ingrese la opcion que desea:");

            // También protegemos el menú principal de letras
            while (!teclado.hasNextInt()) {
                System.out.println("Por favor, ingresa un número válido del 1 al 5:");
                teclado.next();
            }
            opcion = teclado.nextInt();
            switch (opcion) {

                case 1:
                    double lado = pedirNumero(teclado, "ingresa el lado del cuadrado:");
                    double area = area_del_cuadrado.areacuadrado(lado);
                    System.out.println("el area del cuadrado es: " + area);

                    break;

                case 2:
                    double baseRec = pedirNumero(teclado, "Ingresa la base del rectángulo:");


                    break;

                case 3:
                    double areatrigufeature = feature.areaTriangulo.main(null);
                    break;
                case 4:
                    double radio = pedirNumero(teclado, "Ingresa el radio del círculo:");
                    double areacir =  AreaCirculo.areaCirculo(radio);

                    break;
                case 5:
                    System.out.println("Saliendo del programa...");

                    break;
                default:
                    System.out.println("el numero que ingreso no esta en el menu");


            }
        }while (opcion != 5);

    }

        public static double pedirNumero(Scanner teclado, String mensaje) {
        System.out.println(mensaje);
        while (!teclado.hasNextDouble()) {
            System.out.println("Error: ¡Eso no es un número! Inténtalo de nuevo:");
            teclado.next(); // Limpia la letra de la memoria
        }
        return teclado.nextDouble();
    }
}