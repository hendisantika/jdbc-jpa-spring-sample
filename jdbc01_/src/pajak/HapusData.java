/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pajak;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author user
 */
public class HapusData {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String url = "jdbc:mysql://localhost:3306/dblatihan";
            String user = "root";
            String pass = "admin";
            Connection conn = DriverManager.getConnection(url, user, pass);
            Statement st = conn.createStatement();

            String kode = "004";         
            st.executeUpdate("DELETE FROM tbl_produk WHERE kode='"+kode+"'");
            System.out.println("Done!");
            
            st.close();
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
