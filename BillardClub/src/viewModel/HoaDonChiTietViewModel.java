
package viewModel;

public class HoaDonChiTietViewModel {
    private String tenBan;
    private String tenDV;
    private int soLuong;
    private double gia;

 

    public HoaDonChiTietViewModel(String tenBan, String tenDV, int soLuong, double gia) {
        this.tenBan = tenBan;
        this.tenDV = tenDV;
        this.soLuong = soLuong;
        this.gia = gia;
    }

    public HoaDonChiTietViewModel() {
    }

    public String getTenBan() {
        return tenBan;
    }

    public void setTenBan(String tenBan) {
        this.tenBan = tenBan;
    }

    public String getTenDV() {
        return tenDV;
    }

    public void setTenDV(String tenDV) {
        this.tenDV = tenDV;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
     
}
