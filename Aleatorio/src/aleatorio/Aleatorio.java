/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aleatorio;

/**
 *
 * @author DELL
 */
public class Aleatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
      String[] ordenadas = {"o1", "o2", "o3", "o4", "o5"};
        boolean[] impresas = new boolean[ordenadas.length];
 
        String[] desordenadas = new String [ordenadas.length];
        
        
        for(int i = 0; i < ordenadas.length;){
            int posicion = (int)(Math.random() * ordenadas.length);
            if(!impresas[posicion]){
                impresas[posicion] = true;
                System.out.println(ordenadas[posicion]);
                
                int contd = 0;
                desordenadas[contd] = ordenadas[posicion];
                System.out.println(desordenadas[contd]);
                
                
                contd++;   
                i++;
                
                
              
            }
        }
        
        
        
        
        
        
    }
    
}
