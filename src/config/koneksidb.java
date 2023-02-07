package config;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Bhatito
 */
public class koneksidb {
private static Connection cn;
   
    public static Connection getKoneksi() {
        if (cn == null) {
            try {
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bengkel", "root", "");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return cn;
    }
}
