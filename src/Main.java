import gina.Calculator;
import gina.ExercitiiGrafice;
import gina.OperatiiLogice;


public class Main {

  public static void main(String[] args) {
      Calculator calculator = new Calculator();
      calculator.adunare();
      calculator.impartire();
      calculator.operatii1();
      calculator.operatii2();
      calculator.operatii3();
      calculator.operatii4();
      calculator.adunareScadere(10,10);
      calculator.afisareProdus(4, 5);
      calculator.convertesteTemperatura(70);
      calculator.calculeazaMedie(3,4,7);
      calculator.convertesteInchMetri(34);
      calculator.calculExercitiu5(125,24);
      calculator.convertesteTemperatura(100);
      calculator.sumAndAverage();
      calculator.sumAndAverage2();
      calculator.sumAndAverage3();
      calculator.sumAndCount();
      calculator.calculeazaSumaNrImpare();
      calculator.calculeazaNrDiv();
      calculator.fibonacci();
      calculator.cozaLozaWoza();

      ExercitiiGrafice exercitiiGrafice= new ExercitiiGrafice();
      exercitiiGrafice.deseneazaJava();
      exercitiiGrafice.deseneazaOmulet();
      System.out.println("Introdu un numar de la 0-9");
      exercitiiGrafice.citesteNumereDeLa0La9();
      System.out.println("Introdu orice numar sa verifici daca e par sau impar");
      exercitiiGrafice.citesteNumarParSiImpar();
      System.out.println("Introdu varsta unei persoane");
      exercitiiGrafice.afiseazaVarsta();
      System.out.println("Introdu 3 numere");
      exercitiiGrafice.afiseazaCelMaiMareNumar();
      System.out.println("Introdu un numar");
      exercitiiGrafice.afiseazaNumar();
      System.out.println("Introdu un numar");
       exercitiiGrafice.afiseazaPatratulNumarului();
      System.out.println("Introdu doua numere");
      exercitiiGrafice.afiseazaImpartire();
      System.out.println("Introdu patru numere");
      exercitiiGrafice.afiseazaCelMaiMareNumarDin4();
      System.out.println("Introdu trei numere");
      exercitiiGrafice.afiseazaCelMaiMareNumarSiCelMaimic();
      System.out.println("Introdu doua numere");
      exercitiiGrafice.afiseazaInOrdine();
      System.out.println("Introdu ce numer doresti");
      exercitiiGrafice.numaraPanaLa100();
      System.out.println("Introdu ce numer doresti");
      exercitiiGrafice.numaraDescrescator();
         exercitiiGrafice.desen();




      int res = calculator.adunare10(2, 3);
      System.out.println(res);

      int resscadere = calculator.scadere10(4, 3);
      System.out.println(resscadere);

      int resinmultire = calculator.inmultire10(2, 3);
      System.out.println(resinmultire);

      int resimpartire = calculator.impartire10(10, 5);
      System.out.println(resimpartire);
      OperatiiLogice operatiiLogice = new OperatiiLogice();
      operatiiLogice.celMaiMare(10, 20);
      operatiiLogice.textAfisat("text afisat");
      operatiiLogice.numarAfisat(8);
      operatiiLogice.textSiNumar("este soare afara", 4);
      operatiiLogice.afisatText(7);
      operatiiLogice.comparaNumarulCuTrei( 8);



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


      Doctor doctor = new Doctor();

      doctor.casatorit=true;
      doctor.kilograme=65;
      doctor.setNume("Fanel");
      doctor.setPar("roscat");
      doctor.varsta= 30;

      System.out.println(doctor.casatorit);
      System.out.println(doctor.kilograme);
      System.out.println(doctor.getNume());
      System.out.println(doctor.getPar());
      System.out.println(doctor.varsta);
  }


}



