/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aleatorionumero;



import java.util.ArrayList;
import java.lang.Integer;



public class AleatorioNumero {

    public static void main(String[] args) {
        
       
        
        ArrayList<Integer> nLista = new ArrayList<>();
        
        int limite = 100;
        
           numeroAleatorio(nLista, limite);
           
           System.out.println(nLista);
        
            
        }
        
    
    public static void numeroAleatorio (ArrayList a, int b){    
    
        
       do{ 
            for (int i = 0; i < b; i++) {
           
                int na =(int) Math.random()*100;
            
                    if(!a.contains(na)){
        
                    a.add(na);
           
        
                    }else{
        
                    numeroAleatorio(a,b);
        
                    }
        
            }
        
        
       }while(a.size()<=b);
       
       
       
       
       
       
       
        
    }
    
}
