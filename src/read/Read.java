package read;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Read {



    public void readNumbersFromKey() {
        Scanner scanner = new Scanner(System.in);
        int numarulCitit = scanner.nextInt();
        System.out.println(numarulCitit);


    }

    public void readFloatNumbersFromKey() {
        Scanner scanner = new Scanner(System.in);
        float numarulCitit = scanner.nextFloat();
        System.out.println(numarulCitit);


    }

    public void readDoubleNumbersFromKey() {
        Scanner scanner = new Scanner(System.in);
        double numarulCitit = scanner.nextDouble();
        System.out.println(numarulCitit);
    }


    public int[] readMyArray(int a){
        Scanner scanner = new Scanner(System.in);
        int[] myArray = new int[a];

        int j = 0;
        for (int i = 1; i <= a; i++) {
            int numar =  scanner.nextInt();
            myArray[j] = numar;
            j++;

        }
        return myArray;
    }

    public  List readMyArray2() {
        Scanner scanner = new Scanner(System.in);
        List myList = new ArrayList();

        boolean repeat;
        do {
            try {
                Scanner scan = new Scanner(System.in);
                int numar = scan.nextInt();
                myList.add(numar);
                repeat = true;
            } catch (Exception e) {
                repeat = false;
                System.out.println(e);
            }
        } while (repeat);
        return myList;

    }


















}


