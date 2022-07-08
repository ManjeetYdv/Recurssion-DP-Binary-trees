package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class printAllSub_with_SumK {


    static  List<List<Integer>> res;


    static void subK(int[]arr , int index, int target ,  List<Integer>list){              //Print all subsequence

        if(index==arr.length){

            if(target==0){
                res.add(new ArrayList<>(list));

            }
            return;
        }

        list.add(arr[index]);
        subK(arr, index+1 , target-arr[index] , list );
        list.remove(list.size()-1);

        subK(arr , index+1 , target  , list);
    }


    static boolean sum_k(int[]arr , int index , int target , List<Integer> list){          //Print only 1 subsequence


        if(index==arr.length){

            if(target==0){
                res.add(new ArrayList<>(list));
                return true;
            }

            return false;
        }

        list.add(arr[index]);
        if(sum_k(arr , index+1 , target-arr[index] , list)==true){
            return true;
        }
        list.remove(list.size()-1);


        if(sum_k(arr , index+1 ,target , list)==true){
            return true;
        }

        return false;

    }


    static int sum_k_count(int[]arr ,int index , int target ){                       //Print count of sum target subsequence

        if(index==arr.length){
            if(target==0){
                return 1;
            }
            else return 0;
        }

        int left = sum_k_count(arr,  index+1 , target-arr[index]);
        int right = sum_k_count(arr ,index+1 , target);

        return left+right;

    }


    public static void main(String[] args) {

        int[] arr ={1 ,1 ,1 , 3};
        int target = 3;


        res = new ArrayList<>();

        sum_k(arr , 0 , target   , new ArrayList<>());

        for(List<Integer> l:res){

            for(int i : l){
                System.out.print(i+" ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println(sum_k_count(arr , 0 ,target));

    }
}
