/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peminjamanbarang;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author gerya
 */
public class SessionLogin {
    private static String username;
    private static String nip;
    private static String nama;
    private static SessionLogin sessionLogin;

    private final String driver = "com.mysql.jdbc.Driver";
    private final String url = "jdbc:mysql://localhost/db_penyewaan";
    private final String user = "root";
    private final String pass = "";
    
    private SessionLogin(){
        System.out.println("Telah dipanggil");
    }
    
    public static synchronized SessionLogin getSessionLogin(){
        if(sessionLogin == null)
            sessionLogin = new SessionLogin();
        return sessionLogin;
    }
    
    public boolean login(String username, String password) {
        Boolean login = false;
        Connection konek = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            konek = DriverManager.getConnection(url, user, pass);
            stmt = konek.createStatement();
            String sql = "SELECT nip,nama,username FROM admin WHERE username='" + username + "' AND "
                    + "password=Password('" + password + "')";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                sessionLogin.setNama(rs.getString("nama"));
                sessionLogin.setNip(rs.getString("nip"));
                sessionLogin.setUsername(rs.getString("username"));
            }
            rs.last();
            if (rs.getRow() == 1) {
                login = true;
            } else {
                login = false;
            }
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }//endcatch
        finally {
            try {
                stmt.close();
            } catch (Exception e) {
            }
            try {
                konek.close();
            } catch (Exception e) {
            }
        }
        
        return login;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        SessionLogin.nama = nama;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        SessionLogin.username = username;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        SessionLogin.nip = nip;
    }
    
}
