/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewModel;

/**
 *
 * @author acer
 */
public class ThongKeViewModel {
    private int thoiGian;
    private Double doanhThu;

    public ThongKeViewModel() {
    }

    public ThongKeViewModel(int thoiGian, Double doanhThu) {
        this.thoiGian = thoiGian;
        this.doanhThu = doanhThu;
    }

    public int getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(int thoiGian) {
        this.thoiGian = thoiGian;
    }

    
    public Double getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(Double doanhThu) {
        this.doanhThu = doanhThu;
    }
    
}
