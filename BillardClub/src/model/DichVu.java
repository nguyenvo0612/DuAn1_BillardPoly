/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.math.BigDecimal;

/**
 *
 * @author acer
 */
public class DichVu {
    private int id;
    private String ma;
    private String ten;
    private Double gia;
    private String loaiDV;
    private int soLuong;
    private int tinhTrang;

    public DichVu() {
    }

    public DichVu(int id, String ma, String ten, Double gia, String loaiDV, int soLuong, int tinhTrang) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
        this.loaiDV = loaiDV;
        this.soLuong = soLuong;
        this.tinhTrang = tinhTrang;
    }

    public DichVu(String ma, String ten, Double gia, String loaiDV, int soLuong, int tinhTrang) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
        this.loaiDV = loaiDV;
        this.soLuong = soLuong;
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

    public Double getGia() {
        return gia;
    }

    public void setGia(Double gia) {
        this.gia = gia;
    }

    public String getLoaiDV() {
        return loaiDV;
    }

    public void setLoaiDV(String loaiDV) {
        this.loaiDV = loaiDV;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(int tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
    
}
