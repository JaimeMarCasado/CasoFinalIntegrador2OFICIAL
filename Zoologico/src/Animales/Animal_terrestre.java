package Animales;

public class Animal_terrestre extends Animal{
    boolean patas;
    boolean cola;
    boolean pelaje;


    public Animal_terrestre(String nombre, String especie, Boolean salud, Boolean comportamiento, String alimentacion,
                            int ID, boolean patas, boolean cola, boolean pelaje) {
        super(nombre, especie, salud, comportamiento, alimentacion, ID);
        this.patas = patas;
        this.cola = cola;
        this.pelaje = pelaje;
    }

    public boolean isPatas() {
        return patas;
    }

    public void setPatas(boolean patas) {
        this.patas = patas;
    }

    public boolean isCola() {
        return cola;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public boolean isPelaje() {
        return pelaje;
    }

    public void setPelaje(boolean pelaje) {
        this.pelaje = pelaje;
    }

    @Override
    public String toString() {
        return "--Animal_terrestre-- \n" +
                "Tiene patas=" + patas +
                "\nTiene cola=" + cola +
                "\nTiene pelaje=" + pelaje+
                "\nSu nombre='" + nombre +
                "\nPertenece a la especie='" + especie +
                "\nTiene buena salud=" + salud +
                "\nTiene buen comportamiento=" + comportamiento +
                "\nSu alimentacion es='" + alimentacion +
                "\nID=" + ID;
    }
}