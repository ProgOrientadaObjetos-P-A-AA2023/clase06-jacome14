/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

public class Colegio {

    private String nombre;
    private String ciudad;

    public Colegio(String n, String c) {
        nombre = n;
        ciudad = c;

    }

    public void establecerNombre(String n) {
        this.nombre = n;
    }

    public void establecerCiudad(String c) {
        this.ciudad = c;
    }

    public String obtenerCiudad() {
        return ciudad;
    }

    public String obtenerNombre() {
        return nombre;
    }

}
