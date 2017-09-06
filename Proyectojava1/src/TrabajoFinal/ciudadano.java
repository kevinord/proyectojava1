/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabajoFinal;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 *
 * @author LIFE
 */
public class ciudadano extends inmueble{
    Scanner sc = new Scanner(System.in);
 //-----------------------------------------------------------------------------   
    private String id, nombre, apellido;
 //-----------------------------------------------------------------------------
   
    public String getId (){
        System.out.println("Ingrese su numero de identificación");
        id = sc.next();
        return id;
    }
 //-----------------------------------------------------------------------
   
    public String getNombre (){
    System.out.println("Nombre");
        id = sc.next();
        return nombre;
    }
 //----------------------------------------------------------------------
 
    public String getApellido (){
     System.out.println("Apellido");
        id = sc.next();
        return apellido;
    }
 //-----------------------------------------------------------------------
    
//------------------------------------------------------------------------
    @Override
    public BigDecimal calcularImpuesto() {
        return null;
    }
     //public tipoInmueble inmueble = Casa ;
  
   
}
