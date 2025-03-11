package org.example;
import java.util.ArrayList;

import java.util.List;

public class Empresa {
    private String Ncabina;
    private double precio;
    private int duracion;
    private int Nllamdas;
    private List<Empresa> cabinas = new ArrayList<>();

    public Empresa(String ncabina, double precio, int duracion, int nllamdas) {
        Ncabina = ncabina;
        this.precio = precio;
        this.duracion = duracion;
        Nllamdas = nllamdas;
    }

    public Empresa() {
    }

    public String getNcabina() {
        return Ncabina;
    }

    public double getPrecio() {
        return precio;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getNllamdas() {
        return Nllamdas;
    }

    public void setNcabina(String ncabina) {
        Ncabina = ncabina;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setNllamdas(int nllamdas) {
        Nllamdas = nllamdas;
    }

    //CREAR CABINA
    public void CrearCabina(String Ncabina, double precio) {
        this.Ncabina = Ncabina;
        this.precio = precio;
        System.out.println("Cabina creada correctamente");
        // almacenar cabinas
        cabinas.add(new Empresa(Ncabina, precio, 0, 0));
        System.out.println("Nombre: " + this.Ncabina);
        System.out.println("Precio: " + this.precio);
        //listar cabinas
        System.out.println("\nCabinas disponibles:");
        for (Empresa cabina : cabinas) {
            System.out.println("Nombre: " + cabina.getNcabina() + ", Precio: $" + cabina.getPrecio());
        }


    }
    //Seleccion cabinas

    public void SeleccionarCabina(String nombreCabina) {
        boolean encontrada = false;
        for (Empresa cabina : cabinas) {
            if (cabina.getNcabina().equalsIgnoreCase(nombreCabina)) {
                System.out.println("Cabina seleccionada:");
                System.out.println("Nombre: " + cabina.getNcabina());
                System.out.println("Precio: $" + cabina.getPrecio());
                encontrada = true;
                break;
            }
        }
        if (!encontrada) {
            System.out.println("Nombre incorrecto '" + nombreCabina + "'.");

        }
    }
    public void registrarllamada(){

    }
}