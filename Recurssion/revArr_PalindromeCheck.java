package com.company;

public class ReverseArray {

    static void revArr(int[] arr , int left , int right){       //2 pointers

        if((left>=right)){
            return;
        }
        int temp = arr[left];
        arr[left]=arr[right];
        arr[right] =temp;
        revArr(arr, left+1 , right-1);
    }

    static void revArr(int i , int []arr){
        if(i>=arr.length/2){
            return;
        }
        int temp=arr[i];
        arr[i]=arr[arr.length-1-i];
        arr[arr.length-1-i]=temp;
        revArr(i+1  ,arr);
    }

    static boolean checkPalindrome(String str){

        if(str.length()<=1){
            return true;
        }
         if(str.charAt(0)!=str.charAt(str.length()-1)) return false;
         return checkPalindrome(str.substring(1, str.length()-1));
    }

    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};


        revArr(0 ,arr);

        for(int i: arr){
            System.out.print(i+" ");
        }

        String x ="abcde";
        System.out.println(checkPalindrome("aaca"));


    }
}
