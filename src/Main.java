 import  java.util.Scanner;

public static void main(String[] args) {
    System .out.println("____CALCULADORA DEL AREA DE UN CIRCULO____\n");
    System .out.println("Ingrese el radio del circulo: ");
    Scanner scanner = new Scanner(System.in);
    //Variables:
    double radio = scanner.nextDouble();
    //Llamado de la funcion
    areaCirculo(radio);
}

//Metodo para calcular el area
public static void areaCirculo(double radio){
    double area = Math.PI * radio * radio;
    System.out.println("\nEl area del circulo cuyo radio es "+radio+" es: "+area);
}
