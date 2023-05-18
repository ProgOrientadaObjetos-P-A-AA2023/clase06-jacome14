
package paquete03;

public class Ejemplos {
    public static void main(String[] args) {
        // Declaración de arreglos
        String [] lista = new String[3];
        lista[0] = "Loja";
        lista[1] = "Quito";
        lista[2] = "Cuenca";
        
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }
        
        for (String lista1 : lista) {
            System.out.println(lista1);
        }
                
    }
}
