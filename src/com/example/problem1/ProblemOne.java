package com.example.problem1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class ProblemOne {

    static int RecursiveFunction(int r, int n){
        Scanner input = new Scanner(System.in);
        //int resultado = RecursiveFunction();
        System.out.println("Ingresa el valor mayor o igual a 3 para N el coeficiente");
        n = input.nextInt();

        System.out.println("Ingresa un valor para r");
        r = input.nextInt();

        if(r >= 0 && n >= 3){
            for(int i = 0; i < n; i++){
                if(r == 0 || r == n){
                    int res = (RecursiveFunction(n - 1, r) + RecursiveFunction(n - 1, r - 1));
                    return res;
                }
            }
        } else
            return  0;

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
