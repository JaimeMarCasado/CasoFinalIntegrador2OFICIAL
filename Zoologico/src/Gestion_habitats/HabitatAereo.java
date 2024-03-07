package Gestion_habitats;

public class HabitatAereo extends Habitats{
    private boolean puede_volar;

    public HabitatAereo (float temperatura, float humedad, boolean limpieza, boolean puede_volar){
        super(temperatura, humedad, limpieza);
        this.puede_volar = puede_volar;
    }

    public boolean isPuede_volar() {
        return puede_volar;
    }

    public void setPuede_volar(boolean puede_volar) {
        this.puede_volar = puede_volar;
    }

    @Override
    public String toString() {
        return "HabitatAereo:" +
                "\n puede_volar =" + puede_volar +
                "\n temperatura =" + temperatura +
                "\n humedad =" + humedad +
                "\n limpieza =" + limpieza;
    }
}
