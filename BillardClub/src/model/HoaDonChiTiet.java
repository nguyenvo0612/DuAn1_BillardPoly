/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author acer
 */
public class HoaDonChiTiet {
    private int id;
    private int idHD;
    private int idBan;
    private int tinhTrang;

    public HoaDonChiTiet() {
    }

    public HoaDonChiTiet(int id, int idHD, int idBan, int tinhTrang) {
        this.id = id;
        this.idHD = idHD;
        this.idBan = idBan;
        this.tinhTrang = tinhTrang;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdHD() {
        return idHD;
    }

    public void setIdHD(int idHD) {
        this.idHD = idHD;
    }

    public int getIdBan() {
        return idBan;
    }

    public void setIdBan(int idBan) {
        this.idBan = idBan;
    }

    public int getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(int tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    @Override
    public String toString() {
        return "HoaDonChiTiet{" + "id=" + id + ", idHD=" + idHD + ", idBan=" + idBan + ", tinhTrang=" + tinhTrang + '}';
    }
    
    
}
