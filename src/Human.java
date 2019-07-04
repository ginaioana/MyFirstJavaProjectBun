public class Human {
    private String nume;
    private String par;
    private boolean casatorit;
    private int varsta;
    private int kilograme;

    public String getNume(){
        return nume;
    }
    public void setNume(String nume){
        this.nume = nume;
    }

    public String getPar(){
        return par;
    }
    public void setPar (String par) { this.par = par;}

    public boolean getCasatorit(){ return casatorit;}
    public void setCasatorit (boolean casatorit) { this.casatorit = casatorit; }

    public int getVarsta () { return varsta; }
    public void setVarsta (int varsta ){this.varsta = varsta ;}

    public int getKilograme (){ return kilograme; }
    public void setKilograme (int kilograme){ this.kilograme = kilograme;}




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

