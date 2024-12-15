package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ingrese el articulo al cual se le va a poner un precio: ");
        Scanner sc = new Scanner(System.in);
        String prooducto = sc.nextLine();
        System.out.println("Ingrese el precio de " + prooducto + ": ");
        Scanner sc1 = new Scanner(System.in);
        double precio = sc1.nextDouble();

        if(precio < 50){
            System.out.println("El precio es: " + precio + " Barato como la carne de gato (barato)");
        }else if(precio > 50 && precio < 100){
            System.out.println("El precio es: " + precio + " (accesible)");
        }else if(precio > 100 && precio < 200){
            System.out.println("El precio es: " + precio + " (Estandar)");
        }else if(precio > 200){
            System.out.println("El precio es: " + precio + " (Premium)");
        }
    }
}