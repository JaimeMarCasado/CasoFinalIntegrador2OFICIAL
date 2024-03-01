package Animales;

public class Animal_acuatico extends Animal {
    boolean aletas;
    boolean branquias;
    boolean escamas;
    String tipo_agua;

    public Animal_acuatico(String nombre, String especie, Boolean salud, Boolean comportamiento, String alimentacion, int ID, boolean aletas, boolean branquias, boolean escamas, String tipo_agua ){
        super(nombre, especie, salud, comportamiento , alimentacion, ID);
        this.aletas = aletas;
        this.branquias = branquias;
        this.escamas = escamas;
        this.tipo_agua = tipo_agua;
    }

    public boolean isAletas() {
        return aletas;
    }

    public void setAletas(boolean aletas) {
        this.aletas = aletas;
    }

    public boolean isBranquias() {
        return branquias;
    }

    public void setBranquias(boolean branquias) {
        this.branquias = branquias;
    }

    public boolean isEscamas() {
        return escamas;
    }

    public void setEscamas(boolean escamas) {
        this.escamas = escamas;
    }

    public String getTipo_agua() {
        return tipo_agua;
    }

    public void setTipo_agua(String tipo_agua) {
        this.tipo_agua = tipo_agua;
    }

    @Override
    public String toString() {
        return "Animal_acuatico{" +
                "aletas=" + aletas +
                ", branquias=" + branquias +
                ", escamas=" + escamas +
                ", tipo_agua='" + tipo_agua + '\'' +
                ", nombre='" + nombre + '\'' +
                ", especie='" + especie + '\'' +
                ", salud=" + salud +
                ", comportamiento=" + comportamiento +
                ", alimentacion='" + alimentacion + '\'' +
                ", ID=" + ID +
                '}';
    }
}
