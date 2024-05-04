import Animales.*;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Mascota> mascotas = new ArrayList<>();
    public static void main(String[] args) {
        run();
    }

    public static void registrarAnimal(){
        int tipoAnimal = obtenerTipoAnimal();
        Mascota mascota = null;

        //Pidiendo los datos de la mascota
        System.out.println("Ingrese nombre de la mascota:");
        String nombre = readString();
        String especie;
        if (tipoAnimal == 1){
            especie = "gato";
        } else{
            especie = "camaleon";
        }
        String raza = readString();
        System.out.println("Ingrese la raza de la especie");
        Animal animal = new Animal(nombre, especie, raza);
        String metodoBanio;String modoAlimentacion;
        switch (tipoAnimal){
            case 1:
                int tipoPelaje = obtenerTipoPelaje(tipoAnimal);
                String pelaje = "idk";
                switch (tipoPelaje){
                    case 1:
                        pelaje = "Pelo Corto";
                        break;
                    case 2:
                        pelaje = "Pelo Largo";
                        break;
                    case 3:
                        pelaje = "Pelo Rizado";
                        break;
                    case 4:
                        pelaje = "Sin Pelaje/otros...";
                        break;
                };
                mascota = new Gato(animal, "Whiskas, 3 veces al dia","2 a la semana", pelaje);
            break;
            case 2:
                int tipoPiel = obtenerTipoPelaje(tipoAnimal);
                String piel = "idk";
                switch (tipoPiel){
                    case 1:
                        piel = "Pelo Corto";
                        break;
                    case 2:
                        piel = "Pelo Largo";
                        break;
                }
                mascota = new Camaleon(animal, "3 insectos","2", piel);

                break;
        }
        mascotas.add(mascota);
    }

    public static void mostrarMascotas(){
        System.out.println("Ingrese el nombre de la mascota");
        String nombre = readString();
        for (int i = 0; i < mascotas.size(); i++) {
            Mascota mascota = mascotas.get(i);
            //Imprimiendo los datos

            System.out.println("Nombre de mascota: "+mascota.getNombre());
            System.out.println("Especie de mascota: "+mascota.getEspecie());
            System.out.println("Raza de mascota: "+mascota.getRaza());
            System.out.println("Metodo Baño de mascota: "+mascota.getMetodoBanio());
            System.out.println("Modo de alimentacion de mascota: "+mascota.getModoAlimentacion());

        }
    }

    public  static void eliminarMascota(){
        System.out.println("Ingrese el nombre de la mascota");
        String nombre = readString();
        for (int i = 0; i < mascotas.size(); i++) {
            if (mascotas.get(i).getNombre().equals(nombre)){
                mascotas.remove(i);
                System.out.println("Mascota eliminada exitosamente...\n");

                return;
            }
        }
    }
    public static void menuPrincipal(){
        int opcion;
        while (true){
            System.out.println("Opciones: \n" +
                    "1. Agregar Mascota \n" +
                    "2. Eliminar Mascota \n" +
                    "3. Consultar Mascotas \n" +
                    "0. Salir");
            System.out.print("Opcion > ");
            opcion = readInt();
            if (opcion == 0){
                break;
            }
            switch (opcion){
                case 1:
                    registrarAnimal();
                    break;
                case 2:
                    eliminarMascota();
                    break;
                case 3:
                    mostrarMascotas();
                    break;
                default:
                    break;
            }
        }

    }

    public static int obtenerTipoPelaje(int tipoAnimal){
        int opcion;
        while (true){
            if (tipoAnimal == 1){
                System.out.println("Seleccione un tipo de pelaje: \n" +
                        "1. Pelo Corto \n" +
                        "2. Pelo Largo \n" +
                        "3. Pelo Rizado \n" +
                        "4. Sin Pelo/otros...");

            }
            else{
                System.out.println("Seleccione un tipo de piel: \n" +
                        "1. Normal \n" +
                        "2. Recien Mudada ");
            }
            System.out.print("Opcion > ");
            opcion = readInt();
            if (opcion != -1){
                break;
            }
            System.out.println("Seleccione un animal valido");
        }
        return opcion;
    }
    public static int obtenerTipoAnimal(){
        int opcion;
        while (true){
            System.out.println("Seleccione una accion: \n" +
                    "1. Gato \n" +
                    "2. Camaleon");
            System.out.print("Opcion > ");
            opcion = readInt();
            if (opcion == 1 || opcion == 2){
                break;
            }
            System.out.println("Seleccione un animal valido");
        }
        return opcion;
    }

    public static void run(){
        int opcion;
        while (true){
            System.out.println("Bienvendo a MascoHealth \n" +
                    "Seleccione una accion: \n" +
                    "1. Manejo de Mascotas \n" +
                    "0. Salir");
            System.out.print("Opcion > ");
            opcion = readInt();
            if (opcion == 0){
                System.out.println("Hasta Pronto....");
                break;
            } else if (opcion == 1){
                menuPrincipal();
            } else{
                System.out.println("Ingrese una opcion valida");
            }
        }

    }
    public static int readInt(){
        Scanner input = new Scanner(System.in);
        try{
            return input.nextInt();
        } catch (Exception e){
            System.out.println("Introduzca un valor valido");
            return -1;
        }
    }
    public static String readString(){
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
}