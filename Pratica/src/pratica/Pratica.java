/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author DELL
 */
public class Pratica {

    
    
    static int multiplicaPorCinco(int a){
     
        int c = a * 5;
        return c;
        
        
    }
    
    
    public static void main(String[] args) throws IOException {
        
        
        int valor = 4;
        int resultado = multiplicaPorCinco(valor);
        
        System.out.println(resultado);
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String b = br.readLine();
       
        
       
    
    
    }
        
        
    }
    

