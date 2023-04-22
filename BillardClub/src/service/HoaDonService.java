/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.List;
import model.HoaDon;
import repository.HoaDonRepository;
import viewModel.HoaDonChiTietViewModel;
import viewModel.ThongKeBanChoi;
import viewModel.ThongKeViewModel;

/**
 *
 * @author Acer
 */
public class HoaDonService {

    private HoaDonRepository repo = new HoaDonRepository();

    public List<ThongKeViewModel> thongKe() {
        return repo.thongKe();
    }

    public List<ThongKeBanChoi> thongKeBanChoi() {
        return repo.thongKeBanChoi();
    }

    public List<HoaDon> thongKeHoaDon() {
        return repo.thongKeHoaDon();
    }

    public List<HoaDonChiTietViewModel> layHoaDonCT(String ma) {
        return repo.layHoaDonCT(ma);
    }

    public List<HoaDon> layHoaDontuNgay(String dateBD, String dateKT) {
        return repo.layHoaDontuNgay(dateBD, dateKT);
    }
    public int create(HoaDon hd) {
        return repo.createHoaDonRepository(hd);
    }
    
    public HoaDon getID(String maHD) {
        for (HoaDon hd : repo.getAllIdMa()) {
            if(hd.getMa().equalsIgnoreCase(maHD)) {
            return hd;
        }
        }
        return null;
    }
}
