package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Introduzca la nota a convertir:\n");
        Scanner sc=new Scanner(System.in);
        int nota=sc.nextInt();
        switch(nota){
            case 0: {
                System.out.println("Cero.");
                break;
            }
            case 1: {
                System.out.println("Uno.");
                break;
            }
            case 2: {
                System.out.println("Dos.");
                break;
            }
            case 3: {
                System.out.println("Tres.");
                break;
            }
            case 4: {
                System.out.println("Cuatro.");
                break;
            }
            case 5: {
                System.out.println("Cinco.");
                break;
            }
            case 6: {
                System.out.println("Seis.");
                break;
            }
            case 7: {
                System.out.println("Siete.");
                break;
            }
            case 8: {
                System.out.println("Ocho.");
                break;
            }
            case 9: {
                System.out.println("Nueve.");
                break;
            }
            case 10: {
                System.out.println("Diez.");
                break;
            }
        }
    }
}
