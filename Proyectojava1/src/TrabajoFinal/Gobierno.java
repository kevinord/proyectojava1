/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabajoFinal;
import java.util.Scanner;
import java.math.BigDecimal;

/**
 *
 * @author LIFE
 */
public class Gobierno {
    private static inmueble.tipoInmueble tipoDeInmueble;/*(){
        return null;
    }*/
    Scanner sc = new Scanner(System.in); 
    public static void main (String[]args){
        
       // inmueble Casa = new inmueble();
       // inmueble Apartamento = new inmueble();
       // inmueble lote = new inmueble()
     
       ciudadano persona = new ciudadano();
     
    //persona.getId();
    //persona.getNombre();
    //persona.getApellido();
   // persona.getTipoDeInmueble();
    
    for(tipoInmueble inmuebles: tipoInmueble.values()){
        System.out.printf("%s %d", inmuebles, inmuebles.getDeclaringClass());
        System.out.println("--------------");
        
    }

       
             
    }

    
    
}
