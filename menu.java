import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class menu {
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        int opcion;

        System.out.println("Bienvenido a la calculadora geometrica");
        System.out.println("1. Área de cuadrado\n" +
                "2. Área de rectángulo\n" +
                "3. Área de triángulo\n" +
                "4. Área de círculo\n" +
                "5. Salir\n");
        System.out.println("Ingrese la opcion que desea:");
        opcion = teclado.nextInt();

        switch(opcion) {

            case 1:
        double lado;
            System.out.println("ingresa el lado del cuadrado");
            lado =teclado.nextDouble();
            double area= area_del_cuadrado.areacuadrado(lado);
                System.out.println("el area del cuadrado es: "+ area);

                break;

            case 2:

                break;

            case 3:


                break;
            case 4:
                System .out.println("Ingrese el radio del circulo: ");
                double radio = teclado.nextDouble();


                break;
            case 5:

                break;
            default:
                System.out.println("el numero que ingreso no esta en el menu");


        }



    }
}