package ro.uvt;

import java.util.Collection;
import java.util.List;
import java.util.Vector;

public class Carte {
    // Atribute------------------------------------
    private String titlu;

    private List<Autor> autori;//agregare
    //private Vector<Autor> aut;
    private Cuprins cuprins;//compozitie

    private List<Capitol> capitole;// = new Vector<Capitol>();

    //----------------------------------------------
    //Constructori----------------------------------
    public Carte(List<Autor> autori, Cuprins cuprins, String titlu) {
        this.titlu=titlu;
        this.cuprins = cuprins;
        this.autori = autori;
        this.capitole=new Vector<Capitol>();
    }

    //----------------------------------------------
    //Metode----------------------------------------
    public Capitol createCapitol(String nume, Collection<Element> elemente){
        //Adauga un capitol in compozitia obiectului Carte
        Capitol c = new Capitol(nume=nume, elemente=elemente);
        capitole.add(c);
        return  c;
    }

    public String getTitlu(){return titlu;}

    public void setTitlu(String titlu){
        this.titlu=titlu;
    }


    public void setCuprins(Cuprins cuprins) {
        this.cuprins = cuprins;
    }

    public List<Autor> getAutori() {
        return autori;
    }

    public Cuprins getCuprins() {
        return cuprins;
    }

    public Capitol getCapitole(int poz) {
        return capitole.get(poz);
    }

    public  void render(){
        System.out.println(titlu);
        System.out.println(autori);
        System.out.println(cuprins);
        capitole.forEach(Capitol::render);

    }

}
