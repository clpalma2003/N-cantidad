package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner leer = new Scanner(System.in);

        int n, sum;

        sum = 0;

        System.out.println("Cuantos numeros desea sumar: ");

        n = leer.nextInt();

        for (int i = 0; i < n; i++ ){
            System.out.println("Ingrese el numero: " + (i+1) + ":");
            sum+= leer.nextInt();

        }
        System.out.println("suma de " + n  + " numero es : " + sum );









    }
}
