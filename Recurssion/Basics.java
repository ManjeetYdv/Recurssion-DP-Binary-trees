package com.company;

public class Basics {

    static void funcName(int n){

        if(n<1){
            return;
        }
        System.out.println("Striver");
        funcName(n-1);
    }

    public static void printNTO1(int n){

        if(n<1){
            return;
        }
        System.out.println(n);
        printNTO1(n-1);
    }

    public static void print1toN(int i , int n){
        if(i>n) return;
        System.out.println(i);
        print1toN(i+1 , n);
    }

    public static void print1ToN(int n){     //Backtracking

        if(n<1) return;

        print1ToN(n-1);
        System.out.println(n);
    }
    public static void printNto1(int i , int n){
        if(i>n) return;

        printNto1(i+1 ,n);
        System.out.println(i);
    }

    static int sumN(int n){          //Functional recurssion

        if(n<1) return n;
        return n + sumN(n-1);
    }

    static void sumN(int n , int sum){      //Parameterized recurssion

        if(n<1){
            System.out.println(sum);
            return;
        }
        sumN(n-1 , sum+n);
    }

    static int factorial(int n){       //functional
        if(n<1) return 1;
        return n* factorial(n-1);
    }

    static void factorial(int n , int fac){       //parameterized
        if(n<1){
            System.out.println(fac);
            return;
        }
        factorial(n-1 , fac*n);
    }
    public static void main(String[] args) {
//        funcName(5);
//        printNTO1(10);
//        print1ToN(6);
//          print1toN(1 , 5);
//          printNto1(1 , 5);

//        System.out.println(sumN(1));
        sumN(5 , 0);
        int k= factorial(5);
        System.out.println(k);
        factorial(5 ,1);
    }

}
