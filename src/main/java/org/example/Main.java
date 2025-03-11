package org.example;

import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Empresa op1= new Empresa();
    System.out.println("Bienvenido a comunicaiones Topaipi, por favor seleccione una opción");

    while (true){
        System.out.println("1, Crear cabina");
        System.out.println("2, Slecciona una cabina local 50$, Lasrga distancia 350$,Celular 150$");
        System.out.println("Hacer una llamada en la cabina seleccionada");
        //System.out.println("");
       // System.out.println("");
       // System.out.println("");
        int opcion =scanner.nextInt();
        scanner.nextLine();
    switch (opcion) {
        case 1:

        System.out.println("ingrese el nombre de la cabina");
        String Ncabina = scanner.nextLine();
        System.out.println("ingrese El precio local 50$, Larga distancia 350$, Celular 150$");
        double precio = scanner.nextDouble();
        op1.CrearCabina(Ncabina, precio);
        break;
        case 2:
        System.out.println("Seleccione una cabina del listado");
        String nombreCabina = scanner.nextLine();
        op1.SeleccionarCabina(nombreCabina);
            break;
        case 3:
            System.out.println("Hacer una llamada en la cabina seleccionada");

        default:
            System.out.println("opcion invalida");
    }
    }
    }
}