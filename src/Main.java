//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import  java.util.Scanner;

public static void main(String[] args) {
    System .out.println("____CALCULADORA DEL AREA DE UN CIRCULO____\n");
    System.out.println("El radio del circulo es: ");
    areaCirculo();
}

public static void areaCirculo(){
    System .out.println("Ingrese el radio del circulo: ");
    Scanner scanner = new Scanner(System.in);
    //Variables:
    double radio = scanner.nextDouble();
    double area = Math.PI * radio * radio;

}
