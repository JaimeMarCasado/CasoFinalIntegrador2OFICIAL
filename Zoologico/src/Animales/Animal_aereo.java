package Animales;
public class Animal_aereo extends Animal{
    boolean vuela;
    boolean pico;
    boolean plumaje;

    public Animal_aereo(String nombre, String especie, Boolean salud, Boolean comportamiento, String alimentacion, int ID, boolean vuela, boolean pico, boolean plumaje) {
        super(nombre, especie, salud, comportamiento, alimentacion, ID);
        this.vuela = vuela;
        this.pico = pico;
        this.plumaje = plumaje;
    }

    public boolean isVuela() {
        return vuela;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }

    public boolean isPico() {
        return pico;
    }

    public void setPico(boolean pico) {
        this.pico = pico;
    }

    public boolean isPlumaje() {
        return plumaje;
    }

    public void setPlumaje(boolean plumaje) {
        this.plumaje = plumaje;
    }

    @Override
    public String toString() {
        return "--Animal_aereo--" +
                "\n vuela=" + vuela +
                "\n pico=" + pico +
                "\n plumaje=" + plumaje +
                "\n nombre='" + nombre +
                "\n especie='" + especie +
                "\n salud=" + salud +
                "\n comportamiento=" + comportamiento +
                "\n alimentacion='" + alimentacion +
                "\n ID=" + ID;
    }
}