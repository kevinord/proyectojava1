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
Scanner sc2 = new Scanner(System.in);
    
//------------------------------------------------------------------------------     
    public abstract BigDecimal calcularImpuesto();
    
        private String codigoNacional ;
        private String direccion;
        private double area;
        private BigDecimal valorComercial;
        private int estrato;
        private tipoInmueble tipoDeInmueble;

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
 public enum tipoInmueble{
        uno("casa"), dos("Apartamento"), tres("Lote");
private final String inmueble;
private tipoInmueble(String a ){
    inmueble= a;
}
    public String getInmueble(){
        return inmueble;
    } 
    
    }

     /*  public tipoInmueble getTipoDeInmueble(){
      
      System.out.println("Tipo de inmueble");
      System.out.println("1.Casa");
      System.out.println("2.Apartamento");
      System.out.println("3.Lote");
      System.out.println();
     
     return tipoDeInmueble;
     
 }*/
//-------------------------------------------------------------------------------

 //------------------------------------------------------------------------------

    @Override
    public String toString() {
        return "inmueble{" + "sc2=" + sc2 + ", codigoNacional=" + codigoNacional + ", direccion=" + direccion + ", area=" + area + ", valorComercial=" + valorComercial + ", estrato=" + estrato + ", tipoDeInmueble=" + tipoDeInmueble + '}';
    }

}
