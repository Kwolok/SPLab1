package ro.uvt;

public class Autor {
    private String name;

    public Autor(String s) {
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "name='" + name + '\'' +
                '}';
    }

    public void setAutor(String name) {
        this.name = name;
    }
}
