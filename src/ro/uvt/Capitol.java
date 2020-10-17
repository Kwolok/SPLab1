package ro.uvt;

import java.util.Collection;

public class Capitol {
    //atribute
    private String nume;
    private Collection<Element> elemente;//agregare

    //constructori
    public Capitol(String nume, Collection<Element> elemente) {
        this.nume=nume;
        this.elemente=elemente;
    }

    public Capitol() {
    }

    //metode
    public  void render(){
        elemente.forEach(Element::render);

    }

    @Override
    public String toString() {
        return "Capitol{" +
                "nume='" + nume + '\'' +
                ", elemente=" + elemente +
                '}';
    }
}
