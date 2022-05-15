/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.sql.*;
import model.Khach;
/**
 *
 * @author letri
 */
public class khachDAO extends DAO{
    PreparedStatement statement = null;
    ResultSet result = null;
    public void themKhach(Khach khach){
        String sql = "INSERT INTO tblkhachhang(ten, soID, loaiID, soDT, email, diaChi) VALUES(?,?,?,?,?,?)";
        try{
            statement = con.prepareStatement(sql);
            statement.setString(1, khach.getTen());
            statement.setString(2, khach.getSoID());
            statement.setString(3, khach.getLoaiID());
            statement.setString(4, khach.getSoDT());
            statement.setString(5, khach.getEmail());
            statement.setString(6, khach.getDiaChi());      
            statement.executeUpdate();
        }catch(SQLException e){
            System.out.println(e);
        }       
    }
    public ResultSet timKhach(String sdt){
        Khach khach=null;
        String sql = "SELECT * FROM tblkhachhang WHERE soDT = '"+sdt+"'";
        try{
            statement = con.prepareStatement(sql);
            result=statement.executeQuery();
        }catch(SQLException e){
            System.out.println(e);
        }   
        return result;
    }
}
