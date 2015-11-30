/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Thread;

/**
 *
 * @author STT-12
 */
public class Cajera {
    
    private String nombre;

    public Cajera(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void procesarCompra(Cliente cliente, long timeStamp) {
        System.out.println("La cajera " + this.nombre +
                " COMIENZA A PROCESAR LA COMPRA DE CLIENTE " + cliente.getNombre() + 
                " EN EL TIEMPO: " + (System.currentTimeMillis() - timeStamp) / 1000 + "seg");
        
        for(int i=0; i < cliente.getCarroCompra().length; i++){
            this.esperarXSegundos(cliente.getCarroCompra()[i]);
            System.out.println("Procesando el producto " + (i + 1 ) +
                    " -> Tiempo: " + (System.currentTimeMillis() - timeStamp) / 1000 + "seg");
        }
        
        System.out.println("La cajera " + this.nombre + " HA TERMINADO DE PROCESAR " + 
                cliente.getNombre() + " EN EL TIEMPO: " + 
                (System.currentTimeMillis() - timeStamp) / 1000 + "seg");
    }
    
    public void esperarXSegundos(int segundos){
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
