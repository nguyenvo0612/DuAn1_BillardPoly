/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import utility.DBContext;
import model.BanChoi;

/**
 *
 * @author acer
 */
public class BanChoiRepository {
    
    final String insert = "INSERT INTO BanChoi(maBan, tenBan, gia, idCSVC, tienBan,tinhTrang, TGBD, TGKT) VALUES(?,?,?,?,?,?,?,?)";
    
    public List<BanChoi> getAll() {
        List<BanChoi> list = new ArrayList<>();
        String SELECT_DICHVU = "SELECT * FROM BanChoi";
        try {
            Connection conn = DBContext.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(SELECT_DICHVU);
            while (rs.next()) {
                list.add(new BanChoi(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getString(5), rs.getInt(6), rs.getDouble(7), rs.getString(9), rs.getString(10), rs.getInt(8)));
            }
        } catch (Exception ex) {
            System.out.println("Loi tai getAll()");
        }
        return list;
    }
    
    public int createCoSoVatChatRepository(BanChoi bc) {
        int ketQuaTruyVan = -1;
        try ( Connection con = DBContext.getConnection();  PreparedStatement sttm = con.prepareStatement(insert)) {
            sttm.setString(1, bc.getMaBan());
            sttm.setString(2, bc.getTenBan());
            sttm.setDouble(3, bc.getGia());
            sttm.setInt(4, bc.getIdCSVC());
            sttm.setDouble(5, bc.getTienBan());
            sttm.setInt(6, bc.getTinhTrang());
            sttm.setString(7, bc.getTGBD());
            sttm.setString(8, bc.getTGKT());
            ketQuaTruyVan = sttm.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return ketQuaTruyVan;
    }
}
