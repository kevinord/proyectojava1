/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabajoFinal;

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
    Scanner sc = new Scanner(System.in);
    String consulta, consulta2;

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
      

public static void main (String[]args){
       ciudadano persona = new ciudadano();
       lote Lote = new lote();
       casa Casa = new casa();
       apartamento Apt = new apartamento();
    persona.getId();
    persona.getNombre();
    persona.getApellido();
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
            }
      }
          catch (SQLException ex) {
            Logger.getLogger(inmueble.class.getName()).log(Level.SEVERE, null, ex);
        }   
         
      }
   }

 