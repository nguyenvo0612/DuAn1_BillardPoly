/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewModel;

/**
 *
 * @author acer
 */
public class ThongKeBanChoi {
    private String banChoi;
    private Double tongTien;

    public ThongKeBanChoi() {
    }

    public ThongKeBanChoi(String banChoi, Double tongTien) {
        this.banChoi = banChoi;
        this.tongTien = tongTien;
    }

    public String getBanChoi() {
        return banChoi;
    }

    public void setBanChoi(String banChoi) {
        this.banChoi = banChoi;
    }

    public Double getTongTien() {
        return tongTien;
    }

    public void setTongTien(Double tongTien) {
        this.tongTien = tongTien;
    }
    
}
