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
        return "--Animal_terrestre--" +
                "tiene patas=" + patas +
                ", tiene cola=" + cola +
                ", tiene pelaje=" + pelaje +
                ", Su nombre='" + nombre + '\'' +
                ", pertenece a la especie='" + especie + '\'' +
                ", tiene buena salud=" + salud +
                ", tiene buen comportamiento=" + comportamiento +
                ", su alimentacion es='" + alimentacion + '\'' +
                ", ID=" + ID +
                '}';
    }
}