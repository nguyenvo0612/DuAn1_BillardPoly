/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author acer
 */
public class KhuyenMai {
    private int id;
    private String ma;
    private String ten;
    private int phanTramGiam;
    private String ngayApDung;
    private String ngayKetThuc;
    private int tinhTrang;

    public KhuyenMai() {
    }

    public KhuyenMai(String ma, String ten, int phanTramGiam, String ngayApDung, String ngayKetThuc, int tinhTrang) {
        this.ma = ma;
        this.ten = ten;
        this.phanTramGiam = phanTramGiam;
        this.ngayApDung = ngayApDung;
        this.ngayKetThuc = ngayKetThuc;
        this.tinhTrang = tinhTrang;
    }

    public KhuyenMai(int id, String ma, String ten, int phanTramGiam, String ngayApDung, String ngayKetThuc, int tinhTrang) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.phanTramGiam = phanTramGiam;
        this.ngayApDung = ngayApDung;
        this.ngayKetThuc = ngayKetThuc;
        this.tinhTrang = tinhTrang;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getPhanTramGiam() {
        return phanTramGiam;
    }

    public void setPhanTramGiam(int phanTramGiam) {
        this.phanTramGiam = phanTramGiam;
    }

    public String getNgayApDung() {
        return ngayApDung;
    }

    public void setNgayApDung(String ngayApDung) {
        this.ngayApDung = ngayApDung;
    }

    public String getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(String ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public int getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(int tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

   
     
}
