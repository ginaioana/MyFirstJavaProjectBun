package gina;

public class Calculator {

    public void adunare() {
        int resultat = 7 + 8;
        System.out.println(resultat);
    }

    public void impartire() {
        int resultat = 8 / 2;
        System.out.println(resultat);

    }

    public void operatii1() {
        int resultat = (-5 + (8 * 6));
        System.out.println(resultat);
    }

    public void operatii2() {
        int resultat = (20 + ((-3 * 5) / 8));
        System.out.println(resultat);
    }

    public void operatii3() {
        int resultat = ((55 + 9) % 9);
        System.out.println(resultat);
    }

    public void operatii4() {
        int resultat = (5 + ((15 / 3) * 2) - 8 % 3);
        System.out.println(resultat);
    }

    public int adunare10(int primulNumar, int alDoileaNumar) {
        int resultat = primulNumar + alDoileaNumar;
        return resultat;
    }

    public int scadere10(int primulNumar, int alDoileaNumar) {
        int resultat = primulNumar - alDoileaNumar;
        return resultat;
    }

    public int inmultire10(int primulNumar, int alDoileaNumar) {
        int resultat = primulNumar * alDoileaNumar;
        return resultat;
    }

    public int impartire10(int primulNumar, int alDoileaNumar) {
        int resultat = primulNumar / alDoileaNumar;
        return resultat;

    }

    public void calculeazaMedie(float a, float b, float c) {
        float resultat = (a + b + c) / 3;
        System.out.println(resultat);
    }

    public void calculExercitiu5(int a, int b) {
        int resultatAdunare = a + b;
        int resultatScadere = a - b;
        int resultatInmultire = a * b;
        int resultatImpartire = a / b;
        int resultatRest = a % b;
        System.out.println(resultatAdunare);
        System.out.println(resultatScadere);
        System.out.println(resultatInmultire);
        System.out.println(resultatImpartire);
        System.out.println(resultatRest);

    }

    public void convertesteTemperatura(float f) {
        float c = 5f / 9 * (f - 32);
        System.out.println(c);
    }

    public void convertesteInchMetri(int a) {
        double resultat = a * 0.0254;
        System.out.println(resultat);
    }

    public void afisareProdus(int z, int h) {
        int resultat = z * h;
        System.out.println(resultat);
    }

    public void adunareScadere(int x, int y) {
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        int adunare = x + y;
        System.out.println("prima adunare = " + adunare);

        int scadere = x - y;
        System.out.println("rezultatul scaderii dinte " + x + " si " + y + " este " + scadere);

    }

    public void sumAndAverage() {
        int suma = 0;
        for (int i = 1; i <= 100; i++) {
            suma = suma + i;
        }
        System.out.println(suma);
        System.out.println(suma / 100);
    }

    public void sumAndAverage2() {
        int suma = 0;
        int i = 1;
        do {
            suma = suma + i;
            i++;
        } while (i <= 100);

        System.out.println(suma);
        System.out.println(suma / 100);
    }

    public void sumAndAverage3() {
        int suma = 0;
        int i = 1;
        while (i <= 100) {
            suma = suma + i;
            i++;
        }

        System.out.println(suma);
        System.out.println(suma / 100);
    }

    public void sumAndCount() {
        int suma = 0;
        int count = 0;
        for (int i = 111; i <= 8899; i++) {
            suma = suma + i;
            count++;
        }
        System.out.println(suma);
        System.out.println(count);
    }

    public void calculeazaSumaNrImpare() {
        int suma = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                suma = suma + i;
            }
        }
        System.out.println(suma);
        System.out.println(suma / 50);
    }

    public void calculeazaNrDiv() {
        int suma = 0;
        int count = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                suma = suma + i;
                count++;
            }
        }
        System.out.println(suma);
        System.out.println(suma / count);
    }

    public void fibonacci() {
        System.out.println("Primele 20 Fibonacci:");
        int count = 2;
        int f1 = 1;
        int fn0 = 0;
        int fn1 = 1;
        System.out.print(fn0 + ", " + fn1);
        while (count < 20) {
            f1 = fn0 + fn1;
            count = count + 1;
            fn0 = fn1;
            fn1 = f1;

            System.out.print(", " + fn1);
        }

        System.out.println();
    }

    public void cozaLozaWoza() {

        int a = 0;
        for (int i = 1; i <= 110; i++) {
            a++;
            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    System.out.print(" CozaLoza ");
                } else {
                    System.out.print(" Coza ");
                }
            } else if (i % 5 == 0) {
                if (i % 7 == 0) {
                    System.out.print(" LozaWoza ");
                } else {
                    System.out.print(" Loza ");
                }
            } else if (i % 7 == 0) {
                if (i % 3 == 0) {
                    System.out.print(" CozaWoza ");
                } else {
                    System.out.print(" Woza ");
                }
            } else {
                System.out.print(i + " ");
            }
            if (a % 11 == 0) {
                System.out.println();
            }
        }
    }

    public void myArray100() {
        int[] myArray = new int[100];

        int j = 0;
        for (int i = 1; i <= 100; i++) {
            myArray[j] = i;
            j++;

        }
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);

        }
    }


    public void medMyArray() {
        int[] myArray = new int[100];

        int j = 0;
        for (int i = 1; i <= 100; i++) {
            myArray[j] = i;
            j++;

        }
        float sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum = sum + myArray[i];
        }
        System.out.println(sum / myArray.length);
    }

    public int[] parMyArray(int[] myArray) {
        int j = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                myArray[j++] = i;
            }
        }
        return myArray;
    }

    public boolean checkIfMyStringIsInArray(String[] a, String b) {

        boolean isFound = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                isFound = true;
            }
        }
        return isFound;
    }

    public int checkIfMyArrayPossiton(int[] a, int b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                return i;
            }
        }
        return -1;
    }

    public int[] returnMyArray(int[] a, int b) {
        int[] rezultat = new int[a.length];
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b) {
                rezultat[j] = a[i];
                j++;
            }

        }
        return rezultat;

    }


}
