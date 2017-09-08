/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabajoFinal;

import java.util.Scanner;
import java.math.BigDecimal;
import java.util.Objects;
import java.util.ArrayList;
/**
 *
 * @author LIFE
 */
public abstract class inmueble {
//--------------------------------Scann-----------------------------------------    
Scanner sc2 = new Scanner(System.in);
//--------------------------------atributos-------------------------------------     
    public abstract BigDecimal calcularImpuesto();
    
        public String codigoNacional ;
        public String direccion;
        public double area;
        public BigDecimal valorComercial;
        public int estrato;
        public tipoInmueble tipoDeInmueble;
//------------------------------------------------------------------------------
    static int E1, E2, E3, E4,E5, E6; //Variables
//-------------------------Variables Area--------------------------------------------------------------------------------------------------    
    static double A1 = 10.5, A2 = 15.5, A3 = 11.5, A4 = 14.5, A5 = 16.5, A6 = 13.5;
//-----------------------------------------------------------------------------------------------------------------------------------------
   static double Vc1 = 1.000000, Vc2 = 2.050000 ,Vc3 = 78.600300, Vc4 = 500.645000,Vc5 = 90.855000, Vc6 = 540.540000;
   
//------------------------------hashCode Equals---------------------------------

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + Objects.hashCode(this.sc2);
        hash = 11 * hash + Objects.hashCode(this.codigoNacional);
        hash = 11 * hash + Objects.hashCode(this.direccion);
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.area) ^ (Double.doubleToLongBits(this.area) >>> 32));
        hash = 11 * hash + Objects.hashCode(this.valorComercial);
        hash = 11 * hash + this.estrato;
        hash = 11 * hash + Objects.hashCode(this.tipoDeInmueble);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final inmueble other = (inmueble) obj;
        if (Double.doubleToLongBits(this.area) != Double.doubleToLongBits(other.area)) {
            return false;
        }
        if (this.estrato != other.estrato) {
            return false;
        }
        if (!Objects.equals(this.codigoNacional, other.codigoNacional)) {
            return false;
        }
        if (!Objects.equals(this.direccion, other.direccion)) {
            return false;
        }
        if (!Objects.equals(this.sc2, other.sc2)) {
            return false;
        }
        if (!Objects.equals(this.valorComercial, other.valorComercial)) {
            return false;
        }
        if (this.tipoDeInmueble != other.tipoDeInmueble) {
            return false;
        }
        return true;
    }

//-------------------------------------------------------------------------------
    public void setCodigoNacional(String codigoNacional){
        this.codigoNacional = codigoNacional;
    }
    String getCodigoNacional(){
       return codigoNacional;
   }
//-------------------------------------------------------------------------------    
  
    String getDirecion(){
       return direccion;
   }
//-------------------------------------------------------------------------------    
   
    double getArea(){
       return area;
   }
//-------------------------------------------------------------------------------
  
   public BigDecimal getValorComercial(){
       return valorComercial;
   }
//-------------------------------------------------------------------------------
   
   public int getEstrato(){
       return estrato;
   }
//-------------------------------------------------------------------------------


    public tipoInmueble getInmueble(){
        return tipoDeInmueble;
    } 

    @Override
    public String toString() {
        return "inmueble{" + "sc2=" + sc2 + ", codigoNacional=" + codigoNacional + ", direccion=" + direccion + ", area=" + area + ", valorComercial=" + valorComercial + ", estrato=" + estrato + ", tipoDeInmueble=" + tipoDeInmueble + '}';
    }
    
    

     /*  public tipoInmueble getTipoDeInmueble(){
      
      System.out.println("Tipo de inmueble");
      System.out.println("1.Casa");
      System.out.println("2.Apartamento");
      System.out.println("3.Lote");
      System.out.println();
     
     return tipoDeInmueble;
     
 }*/

}



