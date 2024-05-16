/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nerdzsocialasocials;

import java.sql.*;
/**
 *
 * @author Ayşe Elif Çelik
 */
public class DbHelper {
    
    static String username = "root";
    static String password = "123456789AEC";
    static String sqlconn = "jdbc:mysql://localhost:3306/first_app";
    
    public Connection getConnection() throws SQLException{
        return(Connection) DriverManager.getConnection(sqlconn, username, password);
    }
    
    public void showError(SQLException exception){
        System.out.println("Error: " + exception.getMessage());
        System.out.println("Error Code: " + exception.getErrorCode());
    }
}
