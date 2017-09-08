/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabajoFinal;

import static TrabajoFinal.apartamento.select;
import java.util.Scanner;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author LIFE
 */
public class Gobierno {
    static Scanner scanner = new Scanner(System.in);
    String consulta, consulta2;
//-------------------------Variables de Estratos------------------------------------------------------------------------------------
    static int select = -1;
    
//----------------------------------------conexion a la base de datos--------------------------------------------------------------------------------------
    Connection conexion = null;
    Statement comando = null;
    ResultSet registro;
      public Connection MySQLConnect() {
                  try {
            //JDBC
            Class.forName("com.mysql.jdbc.Driver");
            //Nombre del servidor. localhost:8000
            //proyecto_java :nombre de la base de datos
            String servidor = "jdbc:mysql://localhost:8000/proyecto_java";
            //El root es el nombre de usuario por default. No hay contraseña
            String usuario = "root";
            String pass = "";
            //------------------------------ inicio de conexión----------------------------------------------------------------------------------------------
            conexion = DriverManager.getConnection(servidor, usuario, pass);
      }
          catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error en la conexión a la base de datos: " + ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            conexion = null;
        } 
          catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error en la conexión a la base de datos: " + ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            conexion = null;
        } 
          catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "Error en la conexión a la base de datos: " + ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            conexion = null;
        } 
          finally {
            JOptionPane.showMessageDialog(null, "Conexión Exitosa");
            return conexion;
        }
    }
      
//----------------------------------------------------------------------------------------------------------------------------------
      
        
public static void main (String[]args){
       inmueble Inmue = new inmueble() {
           @Override
           public BigDecimal calcularImpuesto() {
               throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }
       };
       ciudadano persona = new ciudadano();
       lote Lote = new lote();
       casa Casa = new casa();
       apartamento Apt = new apartamento();
    persona.getId();
    persona.getNombre();
    persona.getApellido();
    System.out.println("--------------------------------------");
   //--------------------------------------------------------------------------
   //Apt.calcularImpuesto();
while(select != 0){
    try{
        System.out.println("Elige opción:"+
                          "\n1.- Casa" +
	  		  "\n2.- Apartamento\n" +
			  "3.- Lote\n"+
                "--------------------------------------");
				//Recoger una variable por consola 
                                 select = Integer.parseInt(scanner.nextLine()); 
    switch(select){
            case 1:
               Casa.calcularImpuesto();
                
		break;
            case 2: 
                 Apt.calcularImpuesto();
                break;
            case 3: 
		Lote.calcularImpuesto();
		break;
            default:
                System.out.println("Eleccion no valida");
        }
   }
                catch(Exception e){
				System.out.println("Uoop! Error!");
                }
      break;
   }

//--------------------------------------------------------------------------------------------------------------------------------------



//-------------------------------consulta --------------------------------------------------------------------------------------------------------------------
      try {
        Gobierno db = new Gobierno();
        db.MySQLConnect();
        String proyecto_java = "Registro";
        String Query = "SELECT * FROM " + proyecto_java;
        db.comando = db.conexion.createStatement();
        db.registro = db.comando.executeQuery(Query);
          
            while (db.registro.next()) {
                
                System.out.println("Id: " + db.registro.getString(1) + 
                        "\nNombre: " + db.registro.getString(2) +
                        "\nApellido: " + db.registro.getString(3));
              
                System.out.println("------------------------------------------");
            break;
            }
            
      }
          catch (SQLException ex) {
            Logger.getLogger(inmueble.class.getName()).log(Level.SEVERE, null, ex);
        }   
         
      }
   }

 