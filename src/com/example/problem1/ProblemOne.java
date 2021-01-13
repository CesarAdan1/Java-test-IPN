package com.example.problem1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class ProblemOne {

    static int RecursiveFunction(int r, int n){
        Scanner input = new Scanner(System.in);
        //int resultado = RecursiveFunction();
        System.out.println("Ingresa la cantidad de coeficientes a calcular ");
        n = input.nextInt();


        int[] x = {n};
        int[] res = x;

        System.out.println("Ingresa un valor para r");
        r = input.nextInt();

        if(r >= 0 && n >= 3)  return (RecursiveFunction(x - 1, r) + RecursiveFunction(x, x - 1));
            else if(x < 0) return x = [0] ;
            else if(r == 0 && n >= 3) return (n * RecursiveFunction(n - 1, r))/( x * RecursiveFunction(x - 1, r)) * (RecursiveFunction((n - x) -1, r) + RecursiveFunction((n-x) - 1, r)) ;

            return res[];
    }

    public static void main(String[] args){
        int r = 0;
        int n = 0; //N
        int x = 0;
        int[] response;
        int operacion;

        RecursiveFunction(r, n);

    }
}
