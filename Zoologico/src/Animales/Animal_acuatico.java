package Animales;

import Animales.Animal;

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
    



}
