package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*
        Эгерде берилген сан,квадрат эмес болсо,анда Errorду ыргытыныз.
        (4,9,16 булсандар 2,3,4 сандарынын квадраты болуп саналат)*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check, if number is square or not?");
        int number = scanner.nextInt();

        while (number<=0){
            System.out.println("Enter a positive number to check, if number is square or not?");
            number = scanner.nextInt();
        }

        if(!isSquare(number)){
            System.out.println(number+" is not a square of any number, i will throw error now");
            throw  new Error();
        }else{
            try {
                System.out.println("This is try block, here we will try some code, if it throws exception catch block will run");
                System.out.println(number/0);
            }catch (ArithmeticException e){
                System.out.println("This is catch block "+number+" is not divisible by 0");
            }finally {
                System.out.println("This is final block, it will run in any case. "+number+" is square of "
                        +(int)Math.sqrt(number)+" * "+(int)Math.sqrt(number));
            }
        }

    }


    static boolean isSquare(int x) //boolean method to check number is square or not
    {
        if (x >= 0) {
            int num = (int)Math.sqrt(x);
            return ((num * num) == x);
        }
        return false;
    }
}
