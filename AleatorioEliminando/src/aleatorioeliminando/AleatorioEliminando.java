/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aleatorioeliminando;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class AleatorioEliminando {

    
    public static void main(String[] args) {
        
        
        ArrayList<String> semana = new ArrayList<>();
        
        semana.add("Lunes");
        semana.add("Martes");
        semana.add("Miercoles");
        semana.add("Jueves");
        semana.add("Viernes");
        semana.add("Sabado");
        semana.add("Domingo");
        
        int na = (int) Math.random()* semana.size();
        
        System.out.println(semana.size());
        System.out.println(na+" "+semana.get(na));
        
       
        
       
    }
    
    
    
    
    
    
    
    
    
    
    /*
    
    public static void imprimirAleatorio(ArrayList a, int size){
    
           
        int na = (int) Math.random() * size;
        
        System.out.println(na);
        
        System.out.println(a.get(na));
        
        a.remove(na);
            
        
        }*/
        
    
    
}
