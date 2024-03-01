import Animales.Animal;
import Animales.Animal_terrestre;

import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static int PedirPorTeclado(){
        System.out.println("Introduzca que tipo de animal quiere crear:");
        System.out.println("1-Terrestre");
        System.out.println("2-Acuatico");
        System.out.println("3-Aereo");
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        return i;
    }
    private static Animal CrearAnimal(int i){
        Scanner scan = new Scanner(System.in);
        if(i == 1){
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
            System.out.println("Si tiene patas introduzca 1 // si no 0: ");
            Boolean patas = scan.hasNext();
            System.out.println("Si tiene cola introduzca 1 // si no 0: ");
            Boolean cola = scan.hasNext();
            System.out.println("Si tiene pelaje introduzca 1 // si no 0: ");
            Boolean pelaje = scan.hasNext();
            Animal_terrestre Animal1 = new Animal_terrestre(nombre, especie, salud, comportamiento,alimentacion, patas, cola, pelaje);
            return Animal1;

        }

    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Animal_terrestre Lola = new Animal_terrestre("Lola", "Canino", Boolean.TRUE, Boolean.TRUE, "Carnivoro", 51515, Boolean.TRUE, Boolean.TRUE, Boolean.TRUE);
        System.out.println(Lola);
        CrearAnimal(PedirPorTeclado());
    }
}