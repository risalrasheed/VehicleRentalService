/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author rr1
 */
public class Connector {
    Connection con=null;
    public Connector() throws ClassNotFoundException, SQLException {
    Class.forName("com.mysql.cj.jdbc.Driver");
    //Class.forName("com.mysql.jdbc.Driver");    
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicle_rental?zeroDateTimeBehavior=CONVERT_TO_NULL","root","root");
    }
    Connection getCon() {
        return con;
    }
}
