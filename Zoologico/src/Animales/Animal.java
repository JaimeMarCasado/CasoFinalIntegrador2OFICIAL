package Animales;
//Quiero ver si los cambios se guardan en github
public class Animal {
    String nombre;
    String especie;
    Boolean salud;
    Boolean comportamiento;
    String alimentacion;
    int ID;

    public Animal (){
        this.nombre = "";
        this.especie = "";
        Boolean salud = Boolean.FALSE;
        Boolean comportamiento = Boolean.FALSE;
        String alimentacion = "";
        this.ID = 0;

    }

    public Animal(String nombre, String especie, Boolean salud, Boolean comportamiento, String alimentacion, int ID) {
        this.nombre = nombre;
        this.especie = especie;
        this.salud = salud;
        this.comportamiento = comportamiento;
        this.alimentacion = alimentacion;
        this.ID = ID;
    }
    @Override
    public String toString(){

        return "";
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Boolean getSalud() {
        return salud;
    }

    public void setSalud(Boolean salud) {
        this.salud = salud;
    }

    public Boolean getComportamiento() {
        return comportamiento;
    }

    public void setComportamiento(Boolean comportamiento) {
        this.comportamiento = comportamiento;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public int getID (){
        return ID;
    }
    public void setID(int ID){
        this.ID = ID;
    }


}
