package ro.uvt;

import java.util.Collection;

public class Capitol {
    private String name;
    private Collection<Element> elemente;

    public Capitol(String nume) {
    }

    public Capitol(String nume, Collection<Element> elemente) {
        this.name = name;
        this.elemente = elemente;
    }

    public void rander(){
        elemente.forEach(Capitol::rander);
    }

}
