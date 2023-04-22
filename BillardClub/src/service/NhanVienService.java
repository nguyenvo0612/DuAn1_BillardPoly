/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import java.util.List;
import model.NhanVien;
import repository.NhanVienRepository;
import viewModel.UserLogin;

/**
 *
 * @author acer
 */
public class NhanVienService {
    private NhanVienRepository repo = new NhanVienRepository();
    public List<UserLogin> getUser() {
        return repo.getUser();
    }
    public boolean checkLogin(String maNV, String matKhau) {
        NhanVienService service = new NhanVienService();
        List<UserLogin> list = service.getUser();
        for (UserLogin us : list) {
            if(us.getMaNV().equals(maNV) && us.getMatKhau().equals(matKhau)) {
                return true;
            }
        }
        return false;
    }
}
