package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.CoSoVatChat;
import utility.DBContext;

public class CoSoVatChatRepository {

    final String insert = "INSERT INTO CoSoVatChat(MA, TEN, tinhTrang) VALUES(?,?,?)";
    final String update = "UPDATE CoSoVatChat SET  TEN = ?, tinhTrang=? WHERE MA = ?";
    final String delete = "UPDATE CoSoVatChat Set tinhTrang = ? where ma = ?";

    public List<CoSoVatChat> getAll() {
        List<CoSoVatChat> list = new ArrayList<>();
        String SELECT_COSOVATCHAT = "SELECT * FROM CoSoVatChat";
        try {
            Connection conn = DBContext.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(SELECT_COSOVATCHAT);
            while (rs.next()) {
                list.add(new CoSoVatChat(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4)));
            }
        } catch (Exception ex) {
            System.out.println("Loi tai getAll()");
        }
        return list;
    }

    public int createCoSoVatChatRepository(CoSoVatChat csvc) {
        int ketQuaTruyVan = -1;
        try ( Connection con = DBContext.getConnection();  PreparedStatement sttm = con.prepareStatement(insert)) {
            sttm.setString(1, csvc.getMa());
            sttm.setString(2, csvc.getTen());
            sttm.setInt(3, csvc.getTinhTrang());
            ketQuaTruyVan = sttm.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return ketQuaTruyVan;
    }

    public int updateCoSoVatChatRepository(CoSoVatChat csvc) {
        int ketQuaTruyVan = -1;
        try ( Connection con = DBContext.getConnection();  PreparedStatement sttm = con.prepareStatement(update)) {
            sttm.setString(1, csvc.getTen());
            sttm.setInt(2, csvc.getTinhTrang());
            sttm.setString(3, csvc.getMa());
            ketQuaTruyVan = sttm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ketQuaTruyVan;
    }

    public int deleteCoSoVatChatRepository(CoSoVatChat csvc) {
        int ketQuaTruyVan = -1;
        try ( Connection con = DBContext.getConnection();  PreparedStatement sttm = con.prepareStatement(delete)) {
            sttm.setInt(1, csvc.getTinhTrang());
            sttm.setString(2, csvc.getMa());
            ketQuaTruyVan = sttm.executeUpdate();
            ketQuaTruyVan = sttm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ketQuaTruyVan;
    }

}
