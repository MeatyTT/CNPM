package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.User;

public class UserDAO extends DAO{
    
    public static User currentUser = null;
	
    public UserDAO() {
        super();
    }

    public boolean checkLogin(User user) {
        boolean result = false;
        String sql = "SELECT idUser, nameUser, position FROM tblUser WHERE username = ? AND password = ?";
        try {
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, user.getUsername());
                ps.setString(2, user.getPassword());
                ResultSet rs = ps.executeQuery();
                if(rs.next()) {
                        user.setId(Integer.parseInt(rs.getString("idUser")));
                        user.setName(rs.getString("nameUser"));
                        user.setPosition(rs.getString("position"));
                        currentUser = user;
                        result = true;
                }
        }catch(Exception e) {
                e.printStackTrace();
        }
        return result;
    }
}
