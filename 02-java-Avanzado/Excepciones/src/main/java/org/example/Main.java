package org.example;

import logica.ExcepcionDatoIncorrecto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ExcepcionDatoIncorrecto {

        int dato = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entre 1 o 10; ");
        dato = sc.nextInt();

        if(dato < 0 || dato > 10){
            throw new ExcepcionDatoIncorrecto("Ingrese un dato no valido");
        }
    }
}