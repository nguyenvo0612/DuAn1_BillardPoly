package repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.KhuyenMai;
import utility.DBContext;

public class KhuyenMaiRepository {

    final String insert = "INSERT INTO KhuyenMai(MA, TEN, phanTramGiam, ngayApDung, ngayKetThuc, tinhTrang) VALUES(?,?,?,?,?,?)";
    final String update = "UPDATE KhuyenMai SET  TEN = ?, phanTramGiam=?, ngayApdung=?, ngayKetThuc=?, tinhTrang=? WHERE MA = ?";
    final String delete = "UPDATE KhuyenMai Set tinhTrang = ? where ma = ?";

    public List<KhuyenMai> getAll() {
        List<KhuyenMai> list = new ArrayList<>();
        String SELECT_KHUYENMAIHOADON = "SELECT * FROM KhuyenMai";
        try {
            Connection conn = DBContext.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(SELECT_KHUYENMAIHOADON);
            while (rs.next()) {
                list.add(new KhuyenMai(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getInt(7)));
            }
        } catch (Exception ex) {
            System.out.println("Loi tai getAll()");
        }
        return list;
    }

    public int createKhuyenMaiRepository(KhuyenMai km) {
        int ketQuaTruyVan = -1;
        try ( Connection con = DBContext.getConnection();  PreparedStatement sttm = con.prepareStatement(insert)) {
            sttm.setString(1, km.getMa());
            sttm.setString(2, km.getTen());
            sttm.setInt(3, km.getPhanTramGiam());
            sttm.setString(4, km.getNgayApDung());
            sttm.setString(5, km.getNgayKetThuc());
            sttm.setInt(6, km.getTinhTrang());
            ketQuaTruyVan = sttm.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return ketQuaTruyVan;
    }

    public int updateKhuyenMaiRepository(KhuyenMai km) {
        int ketQuaTruyVan = -1;
        try ( Connection con = DBContext.getConnection();  PreparedStatement sttm = con.prepareStatement(update)) {
            sttm.setString(1, km.getTen());
            sttm.setInt(2, km.getPhanTramGiam());
            sttm.setString(3, km.getNgayApDung());
            sttm.setString(4, km.getNgayKetThuc());
            sttm.setInt(5, km.getTinhTrang());
            sttm.setString(6, km.getMa());
            ketQuaTruyVan = sttm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ketQuaTruyVan;
    }

    public int deleteKhuyenMaiRepository(KhuyenMai km) {
        int ketQuaTruyVan = -1;
        try ( Connection con = DBContext.getConnection();  PreparedStatement sttm = con.prepareStatement(delete)) {
            sttm.setInt(1, km.getTinhTrang());
            sttm.setString(2, km.getMa());
            ketQuaTruyVan = sttm.executeUpdate();
            ketQuaTruyVan = sttm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ketQuaTruyVan;
    }

}
