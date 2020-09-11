/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toma;

/**
 *
 * @author DELL
 */
public class Toma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[] aOrigen = {"Hola","Adios","Como estas","Bye","Maniga"};
        String[] aDestino = {};
        
        for (int x=0;x<aOrigen.length;x++)
        aDestino[aDestino.length] = aOrigen[x];
        
    }
    
}
