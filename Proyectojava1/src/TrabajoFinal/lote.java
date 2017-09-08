/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabajoFinal;

import static TrabajoFinal.apartamento.sc;
import java.math.BigDecimal;

/**
 *
 * @author LIFE
 */
public class lote extends inmueble{
   

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
    return null;    
    }
    
}
