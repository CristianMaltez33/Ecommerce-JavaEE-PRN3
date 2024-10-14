package com.proyecto02.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ConnectionDB implements ServletContextListener {
    
    private Connection connection;

    public ConnectionDB() throws ClassNotFoundException {
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
            
            String connectionUrl =
                    "jdbc:sqlserver://localhost:1433;" + // <- URL CON PUERTO DE LA BASE DE DATOS
                    "database=proyecto02;"+ // <- NOMBRE DE LA BASE DE DATOS
                    "user=sa;password=sa;"+ // <- CREDENCIALES DE USUARIO
                    "encrypt=true;trustServerCertificate=true;"; // OTROS ARGUMENTOS
            
            this.connection = DriverManager.getConnection(connectionUrl);
            
            System.out.println("Conectado a la base de datos XDDD");
                
        } catch ( Exception e ){
            throw new Error(e.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }
    
   public void CloseConnection() throws SQLException{ 
       
       connection.close();
   
   }
   
   @Override
    public void contextInitialized(ServletContextEvent sce) {
        // Esto se ejecuta cuando la aplicación se despliega
        try {
            // Puedes guardar la conexión en el contexto de la aplicación si lo necesitas
            sce.getServletContext().setAttribute("DBConnection", this.connection);
            System.out.println("Conexión a la base de datos establecida al iniciar la aplicación.");
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error al establecer la conexión a la base de datos", e);
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        try { 
            connection.close();
        } catch (Exception e){ 
        
        }
        System.out.println("Conexión cerrada");
    }
    
}
