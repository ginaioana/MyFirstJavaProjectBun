public class Animal {
    private String culoare;
    private int varsta;
    private float greutate;
    private String rasa;
    private String nume;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public float getGreutate() {
        return greutate;
    }

    public void setGreutate(float greutate) {
        this.greutate = greutate;
    }


    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }




    public void mananca() {
        System.out.println("a fost bun");
    }

    public void latra() {
        System.out.println("Ham ham");
    }
    public void seJoaca(){
        System.out.println("tusti");
    }
    public void doarme(){
        System.out.println("tot timpu");
    }
}
