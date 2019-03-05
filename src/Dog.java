public class Dog {

    String culoare;
    int varsta;
    float greutate;
    String rasa;
    String nume;

    public void alearga() {
        System.out.println("tropa tropa");
    }

    public void mananca() {
        System.out.println("a fost bun");
    }

    public void latra() {
        System.out.println("Ham ham");
    }


    public void setNume(String nume) {
        this.nume = nume;

    }
     public String getNume(){
        return this.nume;
     }
}