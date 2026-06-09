package feature;

import java.util.Scanner;

public class areaTriangulo {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresar base");
        double base = sc.nextDouble();
        
        System.out.println("Ingresar altura");
        double altura = sc.nextDouble();
        
    
        double resultado = calcularArea(base, altura);
        
        System.out.println("El area del triangulo es: " + resultado);
        
        sc.close();
    }

    
    public static double calcularArea(double base, double altura) {
        double area = (base * altura) / 2;
        return area;
    }
}