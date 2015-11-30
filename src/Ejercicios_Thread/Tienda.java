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
public class Tienda {
    
    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente("Cliente1", new int[] {2,2,1,5,2,3});
        Cliente cliente2 = new Cliente("Cliente2", new int[] {1,3,5,1,1});
        
        Cajera cajera1 = new Cajera("Cajera 1");
        Cajera cajera2 = new Cajera("Cajera 2");
        
        long initialTime = System.currentTimeMillis();
        
        cajera1.procesarCompra(cliente2, initialTime);
        cajera2.procesarCompra(cliente2, initialTime);
        
        CajeraThread cajera3 = new CajeraThread("CajeraT  3", cliente1, initialTime);
        CajeraThread cajera4 = new CajeraThread("CajeraT  4", cliente2, initialTime);
        
        cajera3.start();
        cajera4.start();
    }
}
