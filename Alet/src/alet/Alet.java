/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alet;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class Alet {

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
        nativo.add("Sabado");
        nativo.add("Domingo");
        nativo.add("Enero");
        nativo.add("Febrero");
        nativo.add("Marzo");
        nativo.add("Abril");
        nativo.add("Mayo");
        nativo.add("Junio");
        nativo.add("Julio");
        nativo.add("Agosto");
        nativo.add("Septiembre");
        nativo.add("Octubre");
        nativo.add("Noviembre");
        nativo.add("Diciembre");
        nativo.add("01");
        nativo.add("02");
        nativo.add("03");
        nativo.add("04");
        nativo.add("05");
        nativo.add("06");
        nativo.add("07");
        nativo.add("08");
        nativo.add("09");
        nativo.add("10");
        nativo.add("011");
        nativo.add("012");
        nativo.add("013");
        nativo.add("014");
        nativo.add("015");
        nativo.add("016");
        nativo.add("017");
        nativo.add("018");
        nativo.add("019");
        nativo.add("020");
        nativo.add("021");
        nativo.add("022");
        nativo.add("023");
        nativo.add("024");
        nativo.add("025");
        
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
            
     /*   
        for (int i = 0 ; i < tamano ; i++){
        
            int na = (int) (Math.random() * tamano);
            
            if(!b.contains(a.get(na))){
                
                b.add(a.get(na));
                
            }else if(b.size()==5){
                
                break;
                
            }else{
            
                rellenar(a,b,tamano);
                    }
            
        
        }
        */
        
        
                for (int i = 0 ; i < tamano ; i++){

            int na = (int) (Math.random() * tamano);

            if(!b.contains(a.get(na))){

                b.add(a.get(na));

            }else if(b.size()==tamano){

                break;

            }else{

                rellenar(a,b,tamano);
            }


        }
        
    }
    
}
