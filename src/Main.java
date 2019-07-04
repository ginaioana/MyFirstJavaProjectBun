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

      //ex 2, lab 13
      calculator.myArray100();

      // ex 4, lab 13
      calculator.medMyArray();

      // ex 3, lab13
      int[] a = new int[50];
      int[] arrayDePare = calculator.parMyArray(a);
      for (int i=0; i<50; i++) {
          System.out.println(arrayDePare[i]);
      }

      //ex 5 lab 13
      String[] array= new String[]{"1","2","3","4"};
      boolean aGasit = calculator.checkIfMyStringIsInArray(array, "3");
      System.out.println("ex 5: " + aGasit);


      // ex 6 lab 13
      int[] arrayNew= new int[]{1,2,3,4};
      calculator.checkIfMyArrayPossiton(arrayNew, 3);
      int pozitie=  calculator.checkIfMyArrayPossiton(arrayNew, 3);
      System.out.println(pozitie);

      // ex.8 lab 13
      int[] c = new int[50];
      int[] arreySecond = calculator.returnMyArray(a, 3);
      for (int i=0; i<50; i++) {
          System.out.println("ex 8: " + arreySecond[i]);
      }



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

     // ex 7 lab 13
      exercitiiGrafice.printArrayPicture();




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
      operatiiLogice.comparaNumarulCuTrei(8);



      Dog lisa = new Dog();
      lisa.setCuloare("maro");
      lisa.setGreutate(6.5f);
      lisa.setNume("Lisa");
      lisa.setRasa("lup");
      lisa.setVarsta(2);


      System.out.println(lisa.getCuloare());
      System.out.println(lisa.getGreutate());
      System.out.println(lisa.getNume());
      System.out.println(lisa.getRasa());
      System.out.println(lisa.getVarsta());


      Cat figaro = new Cat();
      figaro.setCuloare("roscovan");
      figaro.setGreutate(1.5f);
      figaro.setNume("Figaro");
      figaro.setRasa("cea mai frumoasa");
      figaro.setVarsta(1);

      System.out.println(figaro.getCuloare());
      System.out.println(figaro.getGreutate());
      System.out.println(figaro.getNume());
      System.out.println(figaro.getRasa());
      System.out.println(figaro.getVarsta());


      Doctor doctor = new Doctor();

      doctor.setCasatorit(true);
      doctor.setKilograme( 65 );
      doctor.setNume("Fanel");
      doctor.setPar("roscat");
      doctor.setVarsta(30);

      System.out.println(doctor.getCasatorit());
      System.out.println(doctor.getKilograme());
      System.out.println(doctor.getNume());
      System.out.println(doctor.getPar());
      System.out.println(doctor.getVarsta());




  }



}



