/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author acer
 */
public class Koneksi_db {
    private static Connection koneksi;
    public static Connection koneksiDB()throws SQLException{
        try{
            String url="jdbc:mysql://localhost/poliklinik";
            String user="root";
            String pass="";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            koneksi=DriverManager.getConnection(url,user,pass);
        }catch (Exception e){
            System.err.println("koneksi gagal "+e.getMessage());
        }
        return koneksi;
    }
    
}
