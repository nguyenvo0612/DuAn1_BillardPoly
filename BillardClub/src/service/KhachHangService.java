/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.List;
import model.KhachHang;
import repository.KhachHangRepository;

/**
 *
 * @author acer
 */
public class KhachHangService {
    private KhachHangRepository repo = new KhachHangRepository();
    public List<KhachHang> getAll() {
        return repo.all();
    }

    public boolean create(KhachHang kh) {
        return repo.insert(kh);
    }
    public boolean delete(String ma) {
        return repo.delete(ma);
    }
    public boolean update(KhachHang kh) {
        return repo.update(kh);
    }
}
