package ro.uvt;

import java.sql.Struct;
import java.util.Collection;
import java.util.List;
import java.util.Vector;

public class Carte {
    private String titlu;
    private Cuprins cup;
    private List<Autor> aut;
    private List<Capitol> capitole;

    public Carte(String titlu, Cuprins cup, List<Autor> aut){
        this.titlu = titlu;
        this.cup = cup;
        this.aut = aut;
        this.capitole = new Vector<Capitol>();
    }

    public Capitol getCapitol(int poz){
        return capitole.get(poz);
    }
    public Collection<Autor> getAut() {
        return aut;
    }

    public Cuprins getCup() {
        return cup;
    }

    public Capitol createCapitol(String nume, Collection<Element>element){
        Capitol capitol = new Capitol(nume);
        capitole.add(capitol);
        return capitol;
    }
    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public void render(){
        System.out.println(titlu);
        System.out.println(aut);
        System.out.println(cup);
        System.out.println(capitole);

    }
}
