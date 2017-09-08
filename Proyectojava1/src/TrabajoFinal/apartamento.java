/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabajoFinal;

import static TrabajoFinal.Gobierno.select;
import java.math.BigDecimal;
import java.util.Scanner;

/**
 *
 * @author LIFE
 */
public class apartamento extends inmueble{
static Scanner sc = new Scanner(System.in);
static int select = -1; //opción elegida del usuario
static int estrato0 = 1, estrato1 = 1, estrato2 = 2,estrato3 = 3, estrato4 = 4; //Variables
 private BigDecimal valorComercial;
    private BigDecimal calculo ;
    static final double APTCAL = 0.8;
  	
    @Override
    public BigDecimal calcularImpuesto() {
        System.out.println("Codigo nacional");
            codigoNacional = sc.next();
        System.out.println("Direcion:");
            direccion =sc.next();
        System.out.println("area");
            area = sc.nextDouble();
        System.out.println("valor comercial");        
            valorComercial =sc.nextBigDecimal();
        System.out.println("Estrato:");
            estrato = sc.nextInt();

     // calculo= 8;
  return calculo;
    }
}
    
    


