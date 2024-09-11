/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lo;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author luis
 */
public class Conecta
  {
    private static Connection conn;
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String user="root";
    private static final String pass="luis123";
    private static final String url="jdbc:mysql://localhost:3306/proceso_produccion?characterEncoding=UTF-8";
    public Conecta()
      {
          Tools to = new Tools();
        conn=null;
        try 
          {
            Class.forName(driver);
            conn= DriverManager.getConnection(url,user,pass);
              if (conn!=null)
                {
                  
                }
          }catch(Exception e)
                  {
                    to.error("No se pudo conectar la base de datos perro"+e, "Error en la conexión");
                  }
      }
    public Connection getConnection()
      {
        return conn;
      }
    public void desconectar()
      {
        conn=null;
          System.out.println("desconectado");
      }
  }
