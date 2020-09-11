/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicionumerosprimos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author DELL
 */
public class EjercicioNumerosPrimos {

   
    static int factorial(int a){
    

        int num = a;
        int fact = 0;
        
        for(int i = a-1 ; i >=1 ; i--){
            
           fact = num * i;
           num = fact;
       
            
        }
           
        return fact;
    
    }
    
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String b = br.readLine();
        
        int n = Integer.parseInt(b);
        
        int resultado = factorial(n);
        System.out.println(resultado);
        
        
    }
    
}
