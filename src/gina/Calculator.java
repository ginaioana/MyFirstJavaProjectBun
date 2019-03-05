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
    public void adunareScadere(int x , int y) {
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        int adunare = x + y;
        System.out.println("prima adunare = " + adunare);

        int scadere = x - y;
        System.out.println("rezultatul scaderii dinte " + x + " si " + y + " este " + scadere);


    }



}
