package gt.edu.usac.ingenieria.java;

import java.util.Scanner;

public class Ejemplo1 {
    public static void main (String [] args ) {
        
        Scanner sc = new Scanner(System.in);
        
        // Entrada
        System.out.println("Ingrese el sueldo base: ");
        double sueldoBase = sc.nextDouble();
        
        System.out.println("Ingrese su nombre: ");
        sc.nextLine();
        String nombre = sc.nextLine();
        
        // Proceso
        double igss = 0.0483 * sueldoBase;
        double irtra = 0.01 * sueldoBase;
        final double BONIFICACION = 250.00;
        double sueldoLiquido = sueldoBase - igss - irtra + BONIFICACION;
        
        // Salida
        System.out.println("Señor(a): " + nombre);
        System.out.printf("IGSS: %.2f Quetzales \n" , igss);
        System.out.println("IRTRA: " + irtra);
        System.out.println("Bonificación: " + BONIFICACION);
        System.out.println("Suledo Liquido: " + sueldoLiquido);
    }
}