package Gestion_habitats;

public class HabitatTerrestre extends Habitats {
    private boolean puede_caminar ;
    public HabitatTerrestre (float temperatura, float humedad, boolean limpieza, boolean puede_caminar ){
        super(temperatura, humedad, limpieza);
        this.puede_caminar = puede_caminar;
    }
    public boolean getPuede_caminar(){
        return puede_caminar;
    }
    public void setPuede_caminar(boolean puede_caminar){
        this.puede_caminar = puede_caminar;
    }
    @Override
    public String toString() {
        return "HabitatAereo:" +
                "\n puede_caminar =" + puede_caminar +
                "\n temperatura =" + temperatura +
                "\n humedad =" + humedad +
                "\n limpieza =" + limpieza;
    }

}
