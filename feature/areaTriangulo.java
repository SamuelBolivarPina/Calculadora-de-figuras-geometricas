package feature;
import java.util.Scanner;
public class areaTriangulo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float base, altura,area;
        System.out.println("Ingresar base");
        base = sc.nextFloat();
         System.out.println("Ingresar altura");
          altura = sc.nextFloat();
          area = base * altura / 2;
          System.out.println("El area del triangulo es: " + area);
          sc.close();
    }
}