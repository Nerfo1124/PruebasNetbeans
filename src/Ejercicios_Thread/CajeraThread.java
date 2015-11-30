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
public class CajeraThread extends Thread {
    
    private String nombre;
    private Cliente cliente;
    private long initialTime;

    public CajeraThread(String nombre, Cliente cliente, long initialTime) {
        this.nombre = nombre;
        this.cliente = cliente;
        this.initialTime = initialTime;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public long getInitialTime() {
        return initialTime;
    }

    public void setInitialTime(long initialTime) {
        this.initialTime = initialTime;
    }
    
    @Override
    public void run(){
        System.out.println("La cajera " + this.nombre +
                " COMIENZA A PROCESAR LA COMPRA DE CLIENTE " + cliente.getNombre() + 
                " EN EL TIEMPO: " + (System.currentTimeMillis() - this.initialTime) / 1000 + "seg");
        
        for(int i=0; i < cliente.getCarroCompra().length; i++){
            this.esperarXSegundos(cliente.getCarroCompra()[i]);
            System.out.println("Procesando el producto " + (i + 1 ) +
                    " -> Tiempo: " + (System.currentTimeMillis() - this.initialTime) / 1000 + "seg");
        }
        
        System.out.println("La cajera " + this.nombre + " HA TERMINADO DE PROCESAR " + 
                cliente.getNombre() + " EN EL TIEMPO: " + 
                (System.currentTimeMillis() - this.initialTime) / 1000 + "seg");
    }
    
    public void esperarXSegundos(int segundos){
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
