import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//      int res=scadere(  3,  1) ;
//      System.out.println(res);
//      System.out.println(scadere(30,10));


//    }
//
//    public static int scadere( int primulNumar, int alDoileaNumar){
//    int resultat = primulNumar - alDoileaNumar;
//    return resultat;
//    }


//
//        int res=inmultire(  1,  1) ;
//        System.out.println(res);
//        System.out.println(inmultire(10,10));
//
//
//    }
//
//    public static int inmultire( int primulNumar, int alDoileaNumar){
//        int resultat = primulNumar * alDoileaNumar;
//        return resultat;
//    }


        int res = impartire(20, 5);
        System.out.println(res);
        System.out.println(impartire(200, 5));


    }

    public static int impartire(int primulNumar, int alDoileaNumar) {
        int resultat = primulNumar / alDoileaNumar;
        return resultat;
    }
}