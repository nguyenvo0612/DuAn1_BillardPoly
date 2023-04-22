/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import model.HoaDonChiTiet;
import repository.HoaDonChiTietRepository;

/**
 *
 * @author acer
 */
public class HoaDonChiTietService {
    private HoaDonChiTietRepository repo = new HoaDonChiTietRepository();
    public int createHDCT(HoaDonChiTiet hdct) {
        return repo.createDichVuRepository(hdct);
    } 
}
