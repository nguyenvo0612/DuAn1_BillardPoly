/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import utility.DBContext;
import viewModel.HoaDonChiTietViewModel;
import model.HoaDon;
import viewModel.ThongKeBanChoi;
import viewModel.ThongKeViewModel;

/**
 *
 * @author Acer
 */
public class HoaDonRepository {
    
    final String insert = "INSERT INTO HoaDon(idNV ,maHD, maNV, ngayTao, ngayThanhToan, maKM, tienKhachDua, tongTien, tienSauKM, idKM, tinhTrang) VALUES(?,?,?,?,?,?,?,?,?,?,?)";

    public List<HoaDon> getAllIdMa() {
        List<HoaDon> list = new ArrayList<>();
        String SELECT_DICHVU = "SELECT id, maHD FROM HoaDon";
        try {
            Connection conn = DBContext.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(SELECT_DICHVU);
            while (rs.next()) {
                list.add(new HoaDon(rs.getInt(1), rs.getString(2)));
            }
        } catch (Exception ex) {
            System.out.println("Loi tai getAll()");
        }
        return list;
    }
    
    public int createHoaDonRepository(HoaDon hd) {
        int ketQuaTruyVan = -1;
        try ( Connection con = DBContext.getConnection();  PreparedStatement sttm = con.prepareStatement(insert)) {
            sttm.setInt(1, hd.getIdNV());
            sttm.setString(2, hd.getMa());
            sttm.setString(3, hd.getMaNV());
            sttm.setString(4, hd.getNgayTao());
            sttm.setString(5, hd.getNgayThanhToan());
            sttm.setString(6, hd.getMaKM());
            sttm.setDouble(7, hd.getTienKhachDua());
            sttm.setDouble(8, hd.getTongTien());
            sttm.setDouble(9, hd.getTienSauKM());
            sttm.setInt(10, hd.getIdKM());
            sttm.setInt(11, hd.getTinhTrang());
            ketQuaTruyVan = sttm.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return ketQuaTruyVan;
    }
    
    public List<ThongKeViewModel> thongKe() {
        List<ThongKeViewModel> list = new ArrayList<>();
        String SELECT_THONGKE = "select month(ngayThanhToan), sum(tongTien) from HoaDOn group by month(ngayThanhToan)";
        try {
            Connection conn = DBContext.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(SELECT_THONGKE);
            while (rs.next()) {
                list.add(new ThongKeViewModel(rs.getInt(1), rs.getDouble(2)));
            }
        } catch (Exception ex) {
            System.out.println("Loi tai getAll()");
        }
        return list;
    }

    public List<ThongKeBanChoi> thongKeBanChoi() {
        List<ThongKeBanChoi> list = new ArrayList<>();
        String SELECT_THONGKE = "select bc.tenBan, sum(hd.tongTien) from HoaDon hd join HoaDonChiTiet hdct on hd.id = hdct.idHD join BanChoi bc on bc.id = hdct.idBan group by bc.tenBan order by sum(hd.tongTien) desc";
        try {
            Connection conn = DBContext.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(SELECT_THONGKE);
            while (rs.next()) {
                list.add(new ThongKeBanChoi(rs.getString(1), rs.getDouble(2)));
            }
        } catch (Exception ex) {
            System.out.println("Loi tai getAll()");
        }
        return list;
    }

    public List<HoaDon> thongKeHoaDon() {
        List<HoaDon> list = new ArrayList<>();
        String SELECT_THONGKEHOADON = "select id,maHD,ngayTao,ngayThanhToan,tongTien from HoaDon";
        try {
            Connection conn = DBContext.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(SELECT_THONGKEHOADON);
            while (rs.next()) {
                list.add(new HoaDon(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDouble(5)));
            }
        } catch (Exception ex) {
            System.out.println("Loi tai get hoa don");
        }
        return list;
    }
 public List<HoaDon> layHoaDontuNgay(String dateBD, String dateKT) {
        List<HoaDon> listHD = new ArrayList<>();
        String sql = "select id,maHD,ngayTao,ngayThanhToan,tongTien from HoaDon where NGAYTAO between ? and  ? order by NGAYTAO";

        try ( Connection con = DBContext.getConnection();  PreparedStatement sttm = con.prepareStatement(sql)) {
            sttm.setString(1, dateBD);
            sttm.setString(2, dateKT);
            ResultSet rs = sttm.executeQuery();
            while (rs.next()) {
                listHD.add(new HoaDon(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDouble(5)));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return listHD;
    }
    public List<HoaDonChiTietViewModel> layHoaDonCT(String ma) {
        List<HoaDonChiTietViewModel> list = new ArrayList<>();
        String select = "select bc.tenBan, dv.ten, ctbc.soLuong, dv.gia from HoaDonChiTiet hdct join HoaDon hd on hdct.idHD = hd.id join BanChoi bc on bc.id = hdct.idBan join ChiTietBanChoi ctbc on ctbc.idBan = bc.id join DichVu dv on ctbc.idDV = dv.id where hd.maHD = ?";
        try ( Connection con = DBContext.getConnection();  PreparedStatement sttm = con.prepareStatement(select)) {
            sttm.setString(1, ma);
            ResultSet rs = sttm.executeQuery();
            while (rs.next()) {
                list.add(new HoaDonChiTietViewModel(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getDouble(4)));
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
     

   
}
