package gina;

import java.util.ArrayList;
import java.util.List;

public class OperatiiLogice {

    public void celMaiMare(int a, int b) {
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }


    public void textAfisat(String text) {
        if (text.equals("FastTrack")) {
            System.out.println("Learning text comparison");
        } else {
            System.out.println("Got to try some more");
        }
    }

    public void numarAfisat(int a) {
        if ((a >= 2) && (a <= 8)) {
            System.out.println(a);
        }
    }

    public void textSiNumar(String text, int a) {
        if (text.equals("FastTrack") && a <= 3) {
            System.out.println(text + " " + a);
        } else {
            if (a >= 4) {
                System.out.println(a + " " + text);
            }
        }
    }

    public void afisatText(int a) {
        if ((a > 8) || (a == 6)) {
            System.out.println("The amount of snow this winter was(cm) :" + " " + a);
        } else {
            System.out.println("The forecast snow is(cm):" + " " + a);
        }
    }

    public void comparaNumarulCuTrei(int numar) {
        if (numar > 3 && numar != 4) {
            System.out.println("The number is greater than 3 and not equal to 4");
        } else if (numar == 4) {
            System.out.println("The number is equal to 4");

        } else if (numar < 3) {
            System.out.println("The number is equal to 4");
        }
    }

    public void getListHundred(List<Integer> myList) {
        for (int i = 1; i <= 10; i++) {
            myList.add(i);
            System.out.println(myList.get(i - 1));
        }
    }

    public List getNumberFromList(List<Integer> myList, Integer a) {
        for (int i = 1; i <= 5; i++) {
            myList.add(i);
        }
        myList.add(a);
        return myList;
    }

    public void getListFromNumber(List<Integer> myList, Integer b) {
        for (int i = 1; i <= 10; i++) {
            myList.add(i);
        }
        if (myList.contains(b)) {
            int bPosition = myList.indexOf(b);
            for (int i = bPosition; i < myList.size(); i++) {
                System.out.println(myList.get(i));
            }
        }
    }

    public void getBackForward(List<Integer> myList) {
        for (int i = myList.size() - 1; i >= 0; i--) {
            System.out.println(myList.get(i));
        }
    }


    public void show3Parameters(List<String> myList, int a, String b) {
        List finalList = new ArrayList();
        for (int i = 0; i < myList.size(); i++) {
            if (i == a) {
                finalList.add(b);
            } else {
                finalList.add(myList.get(i));
            }

        }
        System.out.println(finalList);
    }

    public void showAtFirstPosition(List<Integer> myList, Integer a) {
        List secondList = new ArrayList();
        secondList.add(a);
        for (int i = 0; i < myList.size(); i++) {
            secondList.add(myList.get(i));
        }
        System.out.println(secondList);
    }

    public void displayPosition(List<Integer> myList) {
        for (int i = 0; i < myList.size(); i++) {
            System.out.println("Pe pozitia " + i + " valoare este " + myList.get(i));
        }

    }

    public int getMaxFromList(List<Integer> myList) {
        int a = myList.get(0);
        for (int i = 0; i < myList.size(); i++) {
            if (a < myList.get(i)) {
                a = myList.get(i);
            }
        }

        return a;
    }
}




