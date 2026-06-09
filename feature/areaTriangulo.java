package feature;

import java.util.Scanner;

public class areaTriangulo {

    // 1. El método main ahora solo ejecuta el programa
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresar base");
        double base = sc.nextDouble();
        
        System.out.println("Ingresar altura");
        double altura = sc.nextDouble();
        
        // 2. Llamamos al método que creó tu compañera y guardamos lo que retorna
        double resultado = calcularArea(base, altura);
        
        System.out.println("El area del triangulo es: " + resultado);
        
        sc.close();
    }

    // 3. ¡AQUÍ ESTÁ SU EXIGENCIA! Un método que SÍ recibe parámetros y RETORNA el área
    public static double calcularArea(double base, double altura) {
        double area = (base * altura) / 2;
        return area; // Es double, así que un return aquí sí es 100% válido
    }
}