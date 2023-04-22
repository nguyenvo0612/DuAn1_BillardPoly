/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewModel;

/**
 *
 * @author acer
 */
public class BanChoiViewModel {
    private String maBan;
    private String maHD;
    private String tgBD;
    private String tgKT;
    private Double tongTien;
    private String datBan;

    public BanChoiViewModel() {
    }

    public BanChoiViewModel(String maBan, String maHD, String tgBD, String tgKT, Double tongTien, String datBan) {
        this.maBan = maBan;
        this.maHD = maHD;
        this.tgBD = tgBD;
        this.tgKT = tgKT;
        this.tongTien = tongTien;
        this.datBan = datBan;
    }

    public String getDatBan() {
        return datBan;
    }

    public void setDatBan(String datBan) {
        this.datBan = datBan;
    }

    

    public String getMaBan() {
        return maBan;
    }

    public void setMaBan(String maBan) {
        this.maBan = maBan;
    }

    
    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getTgBD() {
        return tgBD;
    }

    public void setTgBD(String tgBD) {
        this.tgBD = tgBD;
    }

    public String getTgKT() {
        return tgKT;
    }

    public void setTgKT(String tgKT) {
        this.tgKT = tgKT;
    }

    public Double getTongTien() {
        return tongTien;
    }

    public void setTongTien(Double tongTien) {
        this.tongTien = tongTien;
    }

    @Override
    public String toString() {
        return "BanChoiViewModel{" + "maBan=" + maBan + ", maHD=" + maHD + ", tgBD=" + tgBD + ", tgKT=" + tgKT + ", tongTien=" + tongTien + ", datBan=" + datBan + '}';
    }

    
    
}
