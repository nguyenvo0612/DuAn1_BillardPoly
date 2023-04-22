/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import model.ChiTietBanChoi;
import utility.DBContext;

/**
 *
 * @author acer
 */
public class ChiTietBanChoiRepository {
    final String insert = "INSERT INTO ChiTietBanChoi(idDV, idBan, tinhTrang, soLuong) VALUES(?,?,?,?)";
    public int createCoSoVatChatRepository(ChiTietBanChoi ctb) {
        int ketQuaTruyVan = -1;
        try ( Connection con = DBContext.getConnection();  PreparedStatement sttm = con.prepareStatement(insert)) {
            sttm.setInt(1, ctb.getIdDV());
            sttm.setInt(2, ctb.getIdBan());
            sttm.setInt(3, ctb.getTinhTrang());
            sttm.setInt(4, ctb.getSoLuong());
            ketQuaTruyVan = sttm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ketQuaTruyVan;
    }
}
