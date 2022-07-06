

//all sequence of a arrays
package com.company;

import java.util.ArrayList;
import java.util.List;

public class allSubsequenceOfArrays {

   static List<List<Integer>> seq ;

   static void allSeq(int[]arr , int index , List<Integer>list ){

       if(index==arr.length){
           seq.add(new ArrayList<>(list));
           return;
       }

       list.add(arr[index]);
       allSeq(arr , index+1 , list);
       list.remove(list.size()-1);

       allSeq(arr , index+1 , list);

       
   }
    public static void main(String[] args) {

        int[]arr ={1 ,2,3};
        seq = new ArrayList<>();

        allSeq(arr ,0 , new ArrayList<>());

        for(List<Integer> list :seq){
            for(int i : list){
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
}


//all sequences of a string...
package com.company;


import java.util.Vector;

public class PrintAllSubsequences {

    static Vector<String> vector;
    
     static void allSeq(String str,  int index  , String sub ){

        if(index==str.length()){
            vector.add(sub);
            return;
        }

        allSeq(str , index+1 , sub+str.charAt(index));
        allSeq(str , index+1 , sub);


    }
    
    


    public static void main(String[] args) {

        String s ="abc";
        vector = new Vector<>();
       
        allSeq(s , 0 ,"");

        for(String str : vector){
            System.out.print(str+" ");
        }
        
        
       


    }
    
}

