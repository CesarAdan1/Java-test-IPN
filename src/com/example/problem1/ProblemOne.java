package com.example.problem1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class ProblemOne {

    public static void main(String[] args){

        int r = 0;
        int n = 0; //N
        int result = recursiveFunction(r, n);

        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de coeficientes a calcular ");
        n = input.nextInt();

        System.out.println("Ingresa un valor para r");
        r = input.nextInt();
        System.out.println("Los coeficientes son: " + result);

    }

    public static int recursiveFunction(int n, int r){
        if (r >= 0 && n >= 0){
            //if(r < 0) return 0;
                //else
            return (recursiveFunction(n - 1, r) + recursiveFunction(n, r - 1));

         } else {
            return n;
        }
    }
}
