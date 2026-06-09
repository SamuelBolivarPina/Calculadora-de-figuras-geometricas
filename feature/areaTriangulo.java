package feature;
import java.util.Scanner;
public class areaTriangulo {
    public static void Area(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar base");
        double base = sc.nextDouble();
         System.out.println("Ingresar altura");
        double altura = sc.nextDouble();
          double area = base * altura / 2;
          System.out.println("El area del triangulo es: " + area);
    }
}