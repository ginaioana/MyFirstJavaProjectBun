public class Doctor extends Human {

   private String par;
   private int varsta;
   private int kilograme;
   private boolean casatorit;



    public String getPar(){
        return par;
    }

    public void setPar (String par){
        this.par = par;
    }
    public void consulta(){
        System.out.println("hai aici");
    }

    public void mananca (){
        System.out.println("a fost bun");
    }

    public void prescrieMedicamente(){
        System.out.println("o sa te faci bine");
    }
}
