package read;

import java.util.List;

public class Main {

    public static void main (String[] args){
        Read read = new Read();
          // ex 1//
       read.readNumbersFromKey();

       //ex 2//
       read.readFloatNumbersFromKey();
       read.readDoubleNumbersFromKey();

       // ex 3//
        int a = 2;
        int[] myArray =read.readMyArray(a);

            for (int i = 0; i < a; i++){
                System.out.println(myArray[i]);
        }
        // ex 4//
        List myArray2 =read.readMyArray2();
        System.out.println(myArray2);



    }




}
