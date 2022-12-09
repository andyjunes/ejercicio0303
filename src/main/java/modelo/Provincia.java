/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author andyj
 */
public class Provincia {
    
    private Pais pais;
    private int numeroCantones;
    private int numeroCiudades;
    private int numeroHabitantes;
    private int habitantesRemunerados;
    private int habitantesSinTrabajo;

    public Provincia(int numeroCantones, int numeroCiudades, int numeroHabitantes, int habitantesRemuneardos, int habitantesSinTrabajo,Pais pais) {
        this.numeroCantones = numeroCantones;
        this.numeroCiudades = numeroCiudades;
        this.numeroHabitantes = numeroHabitantes;
        this.habitantesRemunerados = habitantesRemuneardos;
        this.habitantesSinTrabajo = habitantesSinTrabajo;
        this.pais=pais;
    }

    public int getNumeroCantones() {
        return numeroCantones;
    }

    public void setNumeroCantones(int numeroCantones) {
        this.numeroCantones = numeroCantones;
    }

    public int getNumeroCiudades() {
        return numeroCiudades;
    }

    public void setNumeroCiudades(int numeroCiudades) {
        this.numeroCiudades = numeroCiudades;
    }

    public int getNumeroHabitantes() {
        return numeroHabitantes;
    }

    public void setNumeroHabitantes(int numeroHabitantes) {
        this.numeroHabitantes = numeroHabitantes;
    }

    public int getHabitantesRemunerados() {
        return habitantesRemunerados;
    }

    public void setHabitantesRemunerados(int habitantesRemunerados) {
        this.habitantesRemunerados = habitantesRemunerados;
    }

    public int getHabitantesSinTrabajo() {
        return habitantesSinTrabajo;
    }

    public void setHabitantesSinTrabajo(int habitantesSinTrabajo) {
        this.habitantesSinTrabajo = habitantesSinTrabajo;
    }

    @Override
    public String toString() {
        return "Provincia{" + "numeroCantones=" + numeroCantones + ", "
                + "numeroCiudades=" + numeroCiudades + ", numeroHabitantes=" + 
                numeroHabitantes + ", habitantesRemuneardos=" + 
                habitantesRemunerados + ", habitantesSinTrabajo=" + 
                habitantesSinTrabajo + this.pais.toString();
    }

    public int getCodigo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
