/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.List;
import model.KhuyenMai;
import repository.KhuyenMaiRepository;


public class KhuyenMaiService{
    private KhuyenMaiRepository khuyenMaiRepository =new KhuyenMaiRepository();
    public List<KhuyenMai> getAll() {
        return khuyenMaiRepository.getAll();
    }

    public int createKhuyenMaiRepository(KhuyenMai km) {
        return  khuyenMaiRepository.createKhuyenMaiRepository(km);
    }

    public int updateTacGiaRepository(KhuyenMai km) {
        return  khuyenMaiRepository.updateKhuyenMaiRepository(km);
    }
    
    public int deleteKhuyenMaiRepository(KhuyenMai km) {
        return khuyenMaiRepository.deleteKhuyenMaiRepository(km);
    }
    
    public KhuyenMai timKM(String maKM) {
        for (KhuyenMai km : khuyenMaiRepository.getAll()) {
            if(km.getMa().equalsIgnoreCase(maKM)&&km.getTinhTrang()==1) {
                return km;
            }
        }
        return null;
    }

}
