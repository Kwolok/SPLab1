package ro.uvt;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
       // System.out.println("Hi!");

        Cuprins cuprins = new Cuprins();
        List<Autor> autori = Arrays.asList(new Autor("Ion Barbu"));

        Carte c = new Carte(autori, cuprins, "CarteX");

        c.createCapitol("Introducere", Arrays.asList(new Paragraf(), new Imagine(), new Tabel(), new Tabel()));

        c.render();

    }
}