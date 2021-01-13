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
        System.out.println("Ingresa un valor para r");
        r = input.nextInt();

        int x = n;
        int res = x;


        int recursive = (RecursiveFunction(n - 1, r) + RecursiveFunction(n, n - 1));

       // if (x == -x) return  0;
         if(r >= 0){

                    return (RecursiveFunction(n - 1, r) + RecursiveFunction(n, n - 1));
                   // else if (r == 0 && n >= 3)
                      //  return (n * RecursiveFunction(n - 1, r)) / (x * RecursiveFunction(x - 1, r)) * (RecursiveFunction((n - x) - 1, r) + RecursiveFunction((n - x) - 1, r));
                }
            return res;
    }

    public static void main(String[] args){
        int r = 0;
        int n = 0; //N

        System.out.println(RecursiveFunction(r, n));

    }
}
