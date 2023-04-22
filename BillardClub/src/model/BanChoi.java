/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author acer
 */
public class BanChoi {

    private int id;
    private String maBan;
    private String tenBan;
    private Double gia;
    private String moTa;
    private int idCSVC;
    private Double tienBan;
    private String TGBD;
    private String TGKT;
    private int tinhTrang;

    public BanChoi(int id, String maBan, String tenBan, Double gia, String moTa, int idCSVC, Double tienBan, String TGBD, String TGKT, int tinhTrang) {
        this.id = id;
        this.maBan = maBan;
        this.tenBan = tenBan;
        this.gia = gia;
        this.moTa = moTa;
        this.idCSVC = idCSVC;
        this.tienBan = tienBan;
        this.TGBD = TGBD;
        this.TGKT = TGKT;
        this.tinhTrang = tinhTrang;
    }

 

    public BanChoi(String maBan, Double gia, String moTa, int idCSVC, Double tienBan, String TGBD, String TGKT, int tinhTrang) {
        this.maBan = maBan;
        this.gia = gia;
        this.moTa = moTa;
        this.idCSVC = idCSVC;
        this.tienBan = tienBan;
        this.TGBD = TGBD;
        this.TGKT = TGKT;
        this.tinhTrang = tinhTrang;
    }

    public BanChoi() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenBan() {
        return tenBan;
    }

    public void setTenBan(String tenBan) {
        this.tenBan = tenBan;
    }

    public String getMaBan() {
        return maBan;
    }

    public void setMaBan(String maBan) {
        this.maBan = maBan;
    }

    public Double getGia() {
        return gia;
    }

    public void setGia(Double gia) {
        this.gia = gia;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getIdCSVC() {
        return idCSVC;
    }

    public void setIdCSVC(int idCSVC) {
        this.idCSVC = idCSVC;
    }

    public Double getTienBan() {
        return tienBan;
    }

    public void setTienBan(Double tienBan) {
        this.tienBan = tienBan;
    }

    public String getTGBD() {
        return TGBD;
    }

    public void setTGBD(String TGBD) {
        this.TGBD = TGBD;
    }

    public String getTGKT() {
        return TGKT;
    }

    public void setTGKT(String TGKT) {
        this.TGKT = TGKT;
    }

    public int getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(int tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

}
