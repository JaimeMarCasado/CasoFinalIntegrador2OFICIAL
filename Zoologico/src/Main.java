
import Animales.*;
import Gestion_habitats.*;

import java.util.Scanner;


public class Main {
    public static int PedirPorTecladoAnimal(){
        System.out.println("Introduzca que tipo de animal quiere crear:");
        System.out.println("1-Terrestre");
        System.out.println("2-Acuatico");
        System.out.println("3-Aereo");
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        return i;
    }
    public static int PedirPorTecladoHabitat(){
        System.out.println("Introduzca que tipo de habitat quiere crear:");
        System.out.println("1-Terrestre");
        System.out.println("2-Acuatico");
        System.out.println("3-Aereo");
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        return i;
    }

    public static Animal_terrestre CrearAnimalTerrestre(){
        Scanner scan = new Scanner(System.in);
        System.out.println("HA ELEGIDO UN ANIMAL TERRESTRE: \n");
        System.out.println("Seleccione las características de su animal ");
        System.out.println("Nombre: ");
        String nombre = scan.next();
        System.out.println("Especie: ");
        String especie = scan.next();
        System.out.println("Si la salud es buena introduzca 1 // si es mala 0: ");
        Boolean salud = scan.hasNext();
        System.out.println("Si el comportamiento es bueno introduzca 1 // si es malo 0: ");
        Boolean comportamiento = scan.hasNext();
        System.out.println("Introduzca su alimentacion(Carnivora, herbivoro, omnivoro: ");
        String alimentacion = scan.next();
        System.out.println("Introduzca el ID: ");
        int ID = scan.nextInt();
        System.out.println("Si tiene patas introduzca 1 // si no 0: ");
        Boolean patas = scan.hasNext();
        System.out.println("Si tiene cola introduzca 1 // si no 0: ");
        Boolean cola = scan.hasNext();
        System.out.println("Si tiene pelaje introduzca 1 // si no 0: ");
        Boolean pelaje = scan.hasNext();
        Animal_terrestre Animal1 = new Animal_terrestre(nombre, especie, salud, comportamiento,alimentacion,ID , patas, cola, pelaje);
        return Animal1;
    }
    public static Animal_acuatico CrearAnimalAcuatico(){
        Scanner scan = new Scanner(System.in);
        System.out.println("HA ELEGIDO UN ANIMAL ACUATICO: \n");
        System.out.println("Seleccione las características de su animal ");
        System.out.println("Nombre: ");
        String nombre = scan.next();
        System.out.println("Especie: ");
        String especie = scan.next();
        System.out.println("Si la salud es buena introduzca 1 // si es mala 0: ");
        Boolean salud = scan.hasNext();
        System.out.println("Si el comportamiento es bueno introduzca 1 // si es malo 0: ");
        Boolean comportamiento = scan.hasNext();
        System.out.println("Introduzca su alimentacion(Carnivora, herbivoro, omnivoro: ");
        String alimentacion = scan.next();
        System.out.println("Introduzca el ID: ");
        int ID = scan.nextInt();
        System.out.println("Si tiene aletas 1 // si no 0: ");
        Boolean aletas = scan.hasNext();
        System.out.println("Si tiene branquias introduzca 1 // si no 0: ");
        Boolean branquias = scan.hasNext();
        System.out.println("Si tiene escamas introduzca 1 // si no 0: ");
        Boolean escamas = scan.hasNext();
        System.out.println("Introduzca el tipo de agua: ");
        String tipo_agua = scan.next();
        Animal_acuatico Animal1 = new Animal_acuatico(nombre, especie, salud, comportamiento,alimentacion,ID , aletas, branquias, escamas, tipo_agua);
        return Animal1;
    }
    public static Animal_aereo CrearAnimalAereo(){
        Scanner scan = new Scanner(System.in);
        System.out.println("HA ELEGIDO UN ANIMAL ACUATICO: \n");
        System.out.println("Seleccione las características de su animal ");
        System.out.println("Nombre: ");
        String nombre = scan.next();
        System.out.println("Especie: ");
        String especie = scan.next();
        System.out.println("Si la salud es buena introduzca 1 // si es mala 0: ");
        Boolean salud = scan.hasNext();
        System.out.println("Si el comportamiento es bueno introduzca 1 // si es malo 0: ");
        Boolean comportamiento = scan.hasNext();
        System.out.println("Introduzca su alimentacion(Carnivora, herbivoro, omnivoro: ");
        String alimentacion = scan.next();
        System.out.println("Introduzca el ID: ");
        int ID = scan.nextInt();
        System.out.println("Si animal vuela introduzca 1 // si no 0: ");
        Boolean vuela = scan.hasNext();
        System.out.println("Si animal tiene pico introduzca 1 // si no 0: ");
        Boolean pico = scan.hasNext();
        System.out.println("Si tiene plumaje introduzca 1 // si no 0: ");
        Boolean plumaje = scan.hasNext();
        Animal_aereo Animal1 = new Animal_aereo(nombre, especie, salud, comportamiento,alimentacion, ID, vuela, pico, plumaje);
        return Animal1;

    }

    public static Habitats CrearHabitatTerrestre(){
        Scanner scan = new Scanner(System.in);
        System.out.println("HA ELEGIDO UN HABITAT TERRESTRE:\n");
        System.out.println("Introduzca la temperatura en grados del habitat: ");
        float temperatura = scan.nextFloat();
        System.out.println("Introduzca la humedad en porcentaje del habitat: ");
        float humedad = scan.nextFloat();
        System.out.println("Si su habitat esta limpio introduzca 1 // si no introduzca 0: ");
        boolean limpieza = scan.hasNext();
        Habitats habitat1 = new Habitats(temperatura, humedad, limpieza);
        return habitat1;
    }
    public static Habitats CrearHabitatAcuatico(){
        Scanner scan = new Scanner(System.in);
        System.out.println("HA ELEGIDO UN HABITAT ACUATICO:\n");
        System.out.println("Introduzca la temperatura en grados del habitat: ");
        float temperatura = scan.nextFloat();
        System.out.println("Introduzca la humedad en porcentaje del habitat: ");
        float humedad = scan.nextFloat();
        System.out.println("Si su habitat esta limpio introduzca 1 // si no introduzca 0: ");
        boolean limpieza = scan.hasNext();
        Habitats habitat1 = new Habitats(temperatura, humedad, limpieza);
        return habitat1;

    }
    public static Habitats CrearHabitatAereo(){
        Scanner scan = new Scanner(System.in);
        System.out.println("HA ELEGIDO UN HABITAT AEREO:\n");
        System.out.println("Introduzca la temperatura en grados del habitat: ");
        float temperatura = scan.nextFloat();
        System.out.println("Introduzca la humedad en porcentaje del habitat: ");
        float humedad = scan.nextFloat();
        System.out.println("Si su habitat esta limpio introduzca 1 // si no introduzca 0: ");
        boolean limpieza = scan.hasNext();
        Habitats habitat1 = new Habitats(temperatura, humedad, limpieza);
        return habitat1;

    }

    private static Habitats CrearHabitat(int i){
        switch(i){
            case 1: return CrearHabitatTerrestre();
            case 2: return CrearHabitatAcuatico();
            case 3: return CrearHabitatAereo();
            default: {
                System.out.println("INTRODUZCA UNA DE LAS OPCIONES CAZURRO \n");
                PedirPorTecladoHabitat();
            }
        }
        return null;
    }
    private static Animal CrearAnimal(int i){
        switch (i){
            case 1: CrearAnimalTerrestre();
                break;
            case 2: CrearAnimalAcuatico();
                break;
            case 3: CrearAnimalAereo();
                break;
            default: {
                System.out.println("INTRODUZCA UNA OPCION VALIDA");
                PedirPorTecladoAnimal();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Animal_terrestre Lola = new Animal_terrestre("Lola", "Canido", Boolean.TRUE, Boolean.TRUE, "Carnivoro", 51515, Boolean.TRUE, Boolean.TRUE, Boolean.TRUE);
        System.out.println(Lola);
        System.out.println(CrearAnimal(PedirPorTecladoAnimal()));
        System.out.println(CrearHabitat(PedirPorTecladoHabitat()));
    }
}
