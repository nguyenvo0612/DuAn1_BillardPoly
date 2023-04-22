/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import java.util.List;
import model.DichVu;
import repository.DichVuRepository;

/**
 *
 * @author acer
 */
public class DichVuService {
    private DichVuRepository repo = new DichVuRepository();
    public List<DichVu> getAll() {
        return repo.getAll();
    }
    public int create(DichVu dv) {
        return repo.createDichVuRepository(dv);
    }
    public int update(DichVu dv) {
        return repo.updateDichVuRepository(dv);
    }
    
    public int updateSl(String tenDV, int soLuong) {
        return repo.updateDichVuSLRepository(tenDV, soLuong);
    }
    
    public int updateSlTraHang(String tenDV, int soLuong) {
        return repo.updateDichVuSLTraHangRepository(tenDV, soLuong);
    }
    public int delete(String ma) {
        return repo.deleteDichVuRepository(ma);
    }
    public List<DichVu> dichVuNuoc() {
        List<DichVu> list = new ArrayList<>();
        for (DichVu dv : repo.getAll()) {
            if(dv.getLoaiDV().equalsIgnoreCase("nước")) {
                list.add(dv);
            }
        }
        return list;
    }
    
    public List<DichVu> dichGay() {
        List<DichVu> list = new ArrayList<>();
        for (DichVu dv : repo.getAll()) {
            if(dv.getLoaiDV().equalsIgnoreCase("gậy")) {
                list.add(dv);
            }
        }
        return list;
    }
    
    public List<DichVu> dichVuDoAn() {
        List<DichVu> list = new ArrayList<>();
        for (DichVu dv : repo.getAll()) {
            if(dv.getLoaiDV().equalsIgnoreCase("đồ ăn")) {
                list.add(dv);
            }
        }
        return list;
    }
    
    public DichVu getID( String ten) {
        for (DichVu dv : repo.getAll()) {
            if(dv.getTen().equalsIgnoreCase(ten)) {
                return dv;
            }
        }
        return null;
    }
}
