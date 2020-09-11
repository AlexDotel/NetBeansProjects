/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mialeatorio;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author DELL
 */
public class MiAleatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        String[] retos1 = {"Come","Bebe","Duerme"};
        
        ArrayList<String> retos2 = new ArrayList<String>();
        
        
    //---------------------------------------------------**
        
        
        int tamano = retos2.size();
        
        int size = retos1.length;
        
        
        
    //---------------------------------------------------**
        
        retos2.add("INICIA");
        
        for(int i = 0; i < size; i++){
            
            
            int aleatorio = (int) (Math.random()*retos2.size());
        
            System.out.println(retos1[i]);
           
            
                
            if ( !retos2.get(i).equals(retos1[aleatorio]) ){
                
                    retos2.add(retos1[aleatorio]);
            
                }
            
            //System.out.println("*"+retos2.get(i));
        
        }
        
        for (int a = 0 ; a < retos2.size() ; a++){
        
            System.out.println("*"+retos2.get(a));
        
        }
        
        
        
        
        
    }
    
}
