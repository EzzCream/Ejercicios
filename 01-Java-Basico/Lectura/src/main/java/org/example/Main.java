package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Vamos a hacer la suma, resta, multiplicacion y division de dos numeros");
        System.out.println("Ingrese el primer numero:");
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        System.out.println("Ingrese el segundo numero:");
        Scanner sc2 = new Scanner(System.in);
        double num2 = sc2.nextDouble();
        double suma = num + num2;
        double resta = num - num2;
        double multiplicacion = num * num2;
        double division = num / num2;

        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicacion es: " + multiplicacion);
        System.out.println("La division es: " + division);
        System.out.println("Te tkm usuario");

    }
}