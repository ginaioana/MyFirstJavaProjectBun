package gina;

public class OperatiiLogice {

    public void celMaiMare(int a, int b){
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }


    public void textAfisat(String text){
        if (text.equals("FastTrack")){
            System.out.println("Learning text comparison");
        }else{
            System.out.println("Got to try some more");
        }
    }

    public void numarAfisat( int a ){
        if ((a >= 2 ) && (a <= 8)){
            System.out.println(a);
        }
    }

    public void textSiNumar(String text, int a ){
        if( text.equals("FastTrack") && a <= 3){
            System.out.println(text + " " + a);
        }else {
            if ( a >= 4){
                System.out.println( a +" " + text);
            }
        }
    }

    public void afisatText( int a){
        if ((a > 8 ) || (a == 6)){
            System.out.println("The amount of snow this winter was(cm) :" + " " + a );
        }else{
            System.out.println("The forecast snow is(cm):"+ " " + a);
        }
    }

}



