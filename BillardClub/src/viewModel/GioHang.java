/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewModel;

/**
 *
 * @author acer
 */
public class GioHang {
    private String dichVu;
    private Double gia;
    private int soLuong;

    public GioHang() {
    }

    public GioHang(String dichVu, Double gia, int soLuong) {
        this.dichVu = dichVu;
        this.gia = gia;
        this.soLuong = soLuong;
    }

    public String getDichVu() {
        return dichVu;
    }

    public void setDichVu(String dichVu) {
        this.dichVu = dichVu;
    }

    public Double getGia() {
        return gia;
    }

    public void setGia(Double gia) {
        this.gia = gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return "GioHang{" + "dichVu=" + dichVu + ", gia=" + gia + ", soLuong=" + soLuong + '}';
    }

    
}
