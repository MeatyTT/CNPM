/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author letri
 */
public class Khach implements Serializable{
    private String ten;
    private String soID;
    private String loaiID;
    private String soDT;
    private String email;
    private String diaChi;

    public Khach() {
    }

    public Khach(String ten, String soID, String loaiID, String soDT, String email, String diaChi) {
        this.ten = ten;
        this.soID = soID;
        this.loaiID = loaiID;
        this.soDT = soDT;
        this.email = email;
        this.diaChi = diaChi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSoID() {
        return soID;
    }

    public void setSoID(String soID) {
        this.soID = soID;
    }

    public String getLoaiID() {
        return loaiID;
    }

    public void setLoaiID(String loaiID) {
        this.loaiID = loaiID;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
}
