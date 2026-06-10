import java.util.Scanner;

class AreaCirculo {
    AreaCirculo() {
    }

    public static void main(String[] args) {
        System.out.println("____CALCULADORA DEL AREA DE UN CIRCULO____\n");
        System.out.println("Ingrese el radio del circulo: ");
        Scanner scanner = new Scanner(System.in);
        double radio = scanner.nextDouble();
        areaCirculo(radio);
    }

    public static void areaCirculo(double radio) {
        double area = Math.PI * radio * radio;
        System.out.println("\nEl area del circulo cuyo radio es " + radio + " es: " + area);

    }
}