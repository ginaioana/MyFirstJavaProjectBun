import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//      int res=scadere(  3,  1) ;
//      System.out.println(res);
//      System.out.println(scadere(30,10));


        Dog lisa = new Dog();
        lisa.culoare= "maro";
        lisa.greutate= 6.5f;
        lisa.nume= "Lisa";
        lisa.rasa="lup";
        lisa.varsta=1;


        System.out.println(lisa.culoare);
        System.out.println(lisa.greutate);
        System.out.println(lisa.nume);
        System.out.println(lisa.rasa);
        System.out.println(lisa.varsta);




        Cat figaro = new Cat();
        figaro.culoare = "roscovan";
        figaro.greutate = 1.5f;
        figaro.nume = "Figaro";
        figaro.rasa = "cea mai frumoasa";
        figaro.varsta= 1;

        System.out.println(figaro.culoare);
        System.out.println(figaro.greutate);
        System.out.println(figaro.nume);
        System.out.println(figaro.rasa);
        System.out.println(figaro.varsta);





    }
//
    public static int scadere( int primulNumar, int alDoileaNumar){
    int resultat = primulNumar - alDoileaNumar;
    return resultat;
    }





    public static int inmultire( int primulNumar, int alDoileaNumar){
        int resultat = primulNumar * alDoileaNumar;
        return resultat;
    }






    public static int impartire(int primulNumar, int alDoileaNumar) {
        int resultat = primulNumar / alDoileaNumar;
        return resultat;
    }



}


