
package paquete03;

import paquete01.Calificacion;

public class EjemploDos {
    public static void main(String[] args) {
        // crear un arreglo de objetos de tipo Calificacion
        Calificacion c = new Calificacion(10, "Computación");
        Calificacion c2 = new Calificacion(9, "Electrónica");
        
        Calificacion [] calificaciones = {c, c2};
        
        for (Calificacion objetoCalificacion : calificaciones) {
            System.out.printf("%s - %.2f\n", 
                    objetoCalificacion.obtenerNombreMateria(),
                    objetoCalificacion.obtenerNota());
        }
        
    }
}
