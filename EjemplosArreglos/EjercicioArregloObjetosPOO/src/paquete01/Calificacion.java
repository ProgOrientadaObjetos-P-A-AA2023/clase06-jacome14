/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

/**
 *
 * @author reroes
 */
public class Calificacion {

    private double nota;
    private String nombreMateria;
    private Profesor profesor;

    public Calificacion(double n, String nombre, Profesor p) {
        nota = n;
        nombreMateria = nombre;
        profesor = p;
    }

    public Calificacion(int i, String computación) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void establecerNota(double n) {
        nota = n;
    }

    public void establecerNombreMateria(String n) {
        nombreMateria = n;
    }
    
    public void establecerProfesor(Profesor n) {
        profesor = n;
    }

    public double obtenerNota() {
        return nota;
    }

    public String obtenerNombreMateria() {
        return nombreMateria;
    }
    
    public Profesor obtenerProfesor() {
        return profesor;
    }

}
