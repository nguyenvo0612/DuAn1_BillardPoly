/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import model.DichVu;
import model.HoaDonChiTiet;
import utility.DBContext;

/**
 *
 * @author acer
 */
public class HoaDonChiTietRepository {
    final String insert = "INSERT INTO HoaDonChiTiet(idHD, idBan, tinhTrang) VALUES(?,?,?)";
    public int createDichVuRepository(HoaDonChiTiet hdct) {
        int ketQuaTruyVan = -1;
        try ( Connection con = DBContext.getConnection();  PreparedStatement sttm = con.prepareStatement(insert)) {
            sttm.setInt(1, hdct.getIdHD());
            sttm.setInt(2, hdct.getIdBan());
            sttm.setInt(3, hdct.getTinhTrang());
            ketQuaTruyVan = sttm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ketQuaTruyVan;
    }
}
