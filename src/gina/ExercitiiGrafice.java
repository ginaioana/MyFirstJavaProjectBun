package gina;

import java.util.Scanner;

public class ExercitiiGrafice {

    public void deseneazaJava() {
        System.out.println("  J   a v     v a ");
        System.out.println("  J  a a v   v a a ");
        System.out.println("J J aaaaa V V aaaaa ");
        System.out.println(" JJ a    a V a     a");
    }

    public void deseneazaOmulet() {
        System.out.println(" +\"\"\"\"\"+ ");
        System.out.println("[| o o |] ");
        System.out.println(" |  ^  | ");
        System.out.println(" | '-' | ");
        System.out.println(" +-----+");
    }

    public void afisareHelloNume(String name) {
//        return "Hello \n Gina";
        System.out.println(name);
    }

    public void afisareHelloGina() {
        System.out.println("Hello \n Gina");
    }

    public void citesteNumereDeLa0La9() {
        Scanner scanner = new Scanner(System.in);
        int numarulCitit = scanner.nextInt();
        switch (numarulCitit) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println(numarulCitit);
                break;
            default:
                System.out.println("Not allowed");
        }

    }

    public void citesteNumarParSiImpar() {
        Scanner scanner = new Scanner(System.in);
        int numarulCitit = scanner.nextInt();
        switch (numarulCitit % 2) {
            case 0:
                System.out.println("este numar par");
                break;
            case 1:
                System.out.println("este numar impar");
                break;
        }
    }

    public void afiseazaVarsta() {
        Scanner scanner = new Scanner(System.in);
        int numarulCitit = scanner.nextInt();

        if (numarulCitit >= 18) {
            System.out.println("this person is eligible to vote");
        } else {
            System.out.println("this person is not eligible to vote");
        }
    }

    public void afiseazaCelMaiMareNumar() {
        Scanner scanner = new Scanner(System.in);
        int primulNumarCitit = scanner.nextInt();
        int alDoileaNumarCitit = scanner.nextInt();
        int alTreileaNumarCitit = scanner.nextInt();

        int maxDintrePrimulSiAlDoilea = celMaiMareDintre2Numere(primulNumarCitit, alDoileaNumarCitit);
        int celMaiMare = celMaiMareDintre2Numere(maxDintrePrimulSiAlDoilea, alTreileaNumarCitit);
        System.out.println(celMaiMare);
    }

    private int celMaiMareDintre2Numere(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public void afiseazaNumar() {
        Scanner scanner = new Scanner(System.in);
        float numarulCitit = scanner.nextFloat();
        System.out.println(numarulCitit);
    }


    public void afiseazaPatratulNumarului() {
        Scanner scanner = new Scanner(System.in);
        int numarulCitit = scanner.nextInt();
        System.out.println(numarulCitit * numarulCitit);
    }

    public void afiseazaImpartire() {
        Scanner scanner = new Scanner(System.in);
        int primulNumarCitit = scanner.nextInt();
        int alDoileaNumarCitit = scanner.nextInt();

        Calculator calculator = new Calculator();
        int resultat;
        resultat = calculator.impartire10(primulNumarCitit, alDoileaNumarCitit);
        System.out.println(resultat);

    }

    public void afiseazaCelMaiMareNumarDin4() {
        Scanner scanner = new Scanner(System.in);
        int primulNumarCitit = scanner.nextInt();
        int alDoileaNumarCitit = scanner.nextInt();
        int alTreileaNumarCitit = scanner.nextInt();
        int alPatruleaNumarCitit = scanner.nextInt();

        int maxDintrePrimulSiAlDoilea = celMaiMareDintre2Numere(primulNumarCitit, alDoileaNumarCitit);
        int celMaiMare = celMaiMareDintre2Numere(maxDintrePrimulSiAlDoilea, alTreileaNumarCitit);
        int celMaiCelMare = celMaiMareDintre2Numere(celMaiMare, alPatruleaNumarCitit);
        System.out.println(celMaiCelMare);
    }

    public void afiseazaCelMaiMareNumarSiCelMaimic() {
        Scanner scanner = new Scanner(System.in);
        int primulNumarCitit = scanner.nextInt();
        int alDoileaNumarCitit = scanner.nextInt();
        int alTreileaNumarCitit = scanner.nextInt();

        int maxDintrePrimulSiAlDoilea = celMaiMareDintre2Numere(primulNumarCitit, alDoileaNumarCitit);
        int celMaiMare = celMaiMareDintre2Numere(maxDintrePrimulSiAlDoilea, alTreileaNumarCitit);
        System.out.println(celMaiMare);

        int minDintrePrimulSiAlDoilea = celMaiMicDintre2Numere(primulNumarCitit, alDoileaNumarCitit);
        int celMaiMic = celMaiMicDintre2Numere(minDintrePrimulSiAlDoilea, alTreileaNumarCitit);
        System.out.println(celMaiMic);
    }

    private int celMaiMicDintre2Numere(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public void afiseazaInOrdine() {
        Scanner scanner = new Scanner(System.in);
        int primulNumarCitit = scanner.nextInt();
        int alDoileaNumarCitit = scanner.nextInt();

        if (primulNumarCitit < alDoileaNumarCitit) {
            System.out.println(primulNumarCitit + " si " + alDoileaNumarCitit);
        } else {
            System.out.println(alDoileaNumarCitit + " si " + primulNumarCitit);
        }
    }

    public void numaraPanaLa100() {
        Scanner scanner = new Scanner(System.in);
        int numar = scanner.nextInt();

        for (int i = numar; i <= 100; i++)
            System.out.println(i);
    }

    public void numaraDescrescator() {
        Scanner scanner = new Scanner(System.in);
        int numar = scanner.nextInt();
        int numar2 = scanner.nextInt();

        if (numar > numar2) {

            for (int i = numar; i >= numar2; i--) {
                System.out.println(i);
            }
        } else {
            System.out.println("nu sunt bune numerele");
        }

    }

    public void desen() {

        for (int i = 0; i <= 6; i++) {
            for (int a = 1; a <= 7 - i; a++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printArrayPicture() {
        String[] myArray = new String[10];
        for (int i = 0; i < 10; i++) {
            myArray[i] = " _ ";
        }


        for (int i = 0; i < 10; i++) {
            for ( int a= 1; a  < 10; a++){
            System.out.print(myArray[i]);

        }
        System.out.println();
    }

}
}