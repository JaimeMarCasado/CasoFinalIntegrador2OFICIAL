package Gestion_habitats;

public class HabitatAcuatico extends Habitats{
    private boolean puede_nadar;

    public HabitatAcuatico (float temperatura, float humedad, boolean limpieza, boolean puede_nadar){
        super(temperatura,humedad,limpieza);
        this.puede_nadar = puede_nadar;
    }

    public boolean getPuede_nadar(){
        return puede_nadar;
    }

    public void setPuede_nadar(boolean puede_nadar){
        this.puede_nadar = puede_nadar;
    }
    @Override
    public String toString() {
        return "HabitatAereo:" +
                "\n puede_nadar =" + puede_nadar +
                "\n temperatura =" + temperatura +
                "\n humedad =" + humedad +
                "\n limpieza =" + limpieza;
    }
}
