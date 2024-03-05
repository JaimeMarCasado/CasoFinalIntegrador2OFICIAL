package Gestion_habitats;

public class Habitats {
    float temperatura;
    float humedad;
    boolean limpieza;

    public Habitats (float temperatura, float humedad, boolean limpieza){
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.limpieza = limpieza;
    }

    @Override
    public String toString() {
        return "--Habitats--" +
                "\nTemperatura=" + temperatura +
                "\nHumedad=" + humedad +
                "\nLimpieza=" + limpieza;
    }
}
