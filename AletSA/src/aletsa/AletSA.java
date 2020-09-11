/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aletsa;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class AletSA {

    /**
     * @param args the command line arguments
    */
    
    
   
    
    
    public static void main(String[] args) {
        
        
        ArrayList<String> nativo = new ArrayList<>();
        
        nativo.add("Lunes");
        nativo.add("Martes");
        nativo.add("Miercoles");
        nativo.add("Jueves");
        nativo.add("Viernes");
        
        ArrayList<String> original = (ArrayList) nativo.clone();
        
        ArrayList<String> copia = new ArrayList<>();
        
        int tamano = original.size();
        
        
        rellenar(original, copia, tamano);
        
        
        System.out.println("Listo");
        
            System.out.println(original); 
           
        
        for (int c = 0 ; c < tamano ; c++){
        
            System.out.println("*"+copia.get(c));
            
        }
        
    }
    
    public static void rellenar(ArrayList a, ArrayList b, int tamano){
            
        do{
            
            for (int i = 0 ; i < tamano ; i++){
        
            int na = (int) (Math.random() * tamano);
            
            if(!b.contains(a.get(na))){
                
                b.add(a.get(na));
               
            }
            
        
        }
            
            
        }while(b.size()==tamano);    
            
            
            
            
            
            
            
            
            
        
    }
    
}
