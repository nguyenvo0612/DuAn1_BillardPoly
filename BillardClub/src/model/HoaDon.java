
package model;

public class HoaDon {
    private int id;
    private int idKH;
    private int idNV;
    private String ma;
    private String maNV;
    private String ngayTao;
    private String ngayThanhToan;
    private String maKM;
    private Double tienKhachDua;
    private double tongTien;
    private Double tienSauKM;
    private int idKM;
    private int tinhTrang;    

    public HoaDon(int id, String ma) {
        this.id = id;
        this.ma = ma;
    }
    
        
    public HoaDon(int id, int idKH, int idNV, String ma, String maNV, String ngayTao, String ngayThanhToan, String maKM, Double tienKhachDua, double tongTien, Double tienSauKM, int idKM, int tinhTrang) {
        this.id = id;
        this.idKH = idKH;
        this.idNV = idNV;
        this.ma = ma;
        this.maNV = maNV;
        this.ngayTao = ngayTao;
        this.ngayThanhToan = ngayThanhToan;
        this.maKM = maKM;
        this.tienKhachDua = tienKhachDua;
        this.tongTien = tongTien;
        this.tienSauKM = tienSauKM;
        this.idKM = idKM;
        this.tinhTrang = tinhTrang;
    }

    public HoaDon(int idNV, String ma, String maNV, String ngayTao, String ngayThanhToan, String maKM, Double tienKhachDua, double tongTien, Double tienSauKM, int idKM, int tinhTrang) {
        this.idNV = idNV;
        this.ma = ma;
        this.maNV = maNV;
        this.ngayTao = ngayTao;
        this.ngayThanhToan = ngayThanhToan;
        this.maKM = maKM;
        this.tienKhachDua = tienKhachDua;
        this.tongTien = tongTien;
        this.tienSauKM = tienSauKM;
        this.idKM = idKM;
        this.tinhTrang = tinhTrang;
    }

    
    public HoaDon(int id, String ma, String ngayTao, String ngayThanhToan, double tongTien) {
        this.id = id;
        this.ma = ma;
        this.ngayTao = ngayTao;
        this.ngayThanhToan = ngayThanhToan;
        this.tongTien = tongTien;
    }

    public HoaDon() {
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

    public String getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getNgayThanhToan() {
        return ngayThanhToan;
    }

    public void setNgayThanhToan(String ngayThanhToan) {
        this.ngayThanhToan = ngayThanhToan;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public int getIdKH() {
        return idKH;
    }

    public void setIdKH(int idKH) {
        this.idKH = idKH;
    }

    public int getIdNV() {
        return idNV;
    }

    public void setIdNV(int idNV) {
        this.idNV = idNV;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getMaKM() {
        return maKM;
    }

    public void setMaKM(String maKM) {
        this.maKM = maKM;
    }

    public Double getTienKhachDua() {
        return tienKhachDua;
    }

    public void setTienKhachDua(Double tienKhachDua) {
        this.tienKhachDua = tienKhachDua;
    }

    public Double getTienSauKM() {
        return tienSauKM;
    }

    public void setTienSauKM(Double tienSauKM) {
        this.tienSauKM = tienSauKM;
    }

    public int getIdKM() {
        return idKM;
    }

    public void setIdKM(int idKM) {
        this.idKM = idKM;
    }

    public int getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(int tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
    
    @Override
    public String toString() {
        return "HoaDon{" + "id=" + id + ", ma=" + ma + ", ngayTao=" + ngayTao + ", ngayThanhToan=" + ngayThanhToan + ", tongTien=" + tongTien + '}';
    }

    
    
}
