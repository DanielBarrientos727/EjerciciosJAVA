import java.util.Scanner;

public class Transporte {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pues esto va a dar como una lista pa el usuario pa que vea lo que ofrece la empresa de transporte
        System.out.println("1. Bus urbano");
        System.out.println("2. Bus intermunicipal");
        System.out.println("3. Servicio especial");
        System.out.println("4. Taxi compartido");
        System.out.print("Buen día usuario, por favor, ingresar una de las cuatro opciones: "); //Aca el usuario pues va a ingresa ya sea 1,2,3 o 4 y pues le va a salir la otra cosa de los km
        int opcion = scanner.nextInt();

        if (opcion < 1 || opcion > 4) {
            System.out.println("La opción ingresada no es válida"); // esto si coloca otra cosa que no sea las opciones dichas
            return;
        }

        System.out.print("Por favor ingrese los kilómetros recorridos :v "); // Y por ultimo se le pide al usuario los km que hizo en el transporte elegido por el mismo
        double kilometros = scanner.nextDouble();
        calcularPago(opcion, kilometros);
    }

    public static void calcularPago(int opcion, double kilometros) {
        String servicio = "";
        double valorKm = 0;

        //El ejercicio ya propuesto nos da de una vez los precios por Km
        switch (opcion) {

            case 1:
                servicio = "Bus urbano";
                valorKm = 1200;
                break;
            case 2:
                servicio = "Bus intermunicipal";
                valorKm = 1800;
                break;
            case 3:
                servicio = "Servicio especial";
                valorKm = 2500;
                break;
            case 4:
                servicio = "Taxi compartido";
                valorKm = 3000;
                break;
        }
        
        // si es la 1, pues se rompe alli y ya
        
        double total = kilometros * valorKm;

        System.out.println("Servicio: " + servicio);
        System.out.println("Kilómetros: " + kilometros);
        System.out.println("Valor por kilómetro: $" + valorKm);
        System.out.println("Valor total: $" + total);
    }
}

// Aca use profe este video para estudiar https://www.youtube.com/watch?v=JOAqpdM36wI&t=5118s
// Y este https://www.youtube.com/watch?v=HEOdd2RnAko