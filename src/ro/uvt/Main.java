package ro.uvt;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	Cuprins cuprins = new Cuprins();
	List<Autor> autori = Arrays.asList(new Autor("Jonel Barbu"));
	Carte c = new Carte("Titlu", new Cuprins(), autori);

	c.createCapitol("Introducere", Arrays.asList(new Paragraf(), new Imagine(), new Tabel()));

	c.render();
    }
}
