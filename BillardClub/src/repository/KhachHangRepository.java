package repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.KhachHang;
import model.NhanVien;
import utility.DBContext;

public class KhachHangRepository {

    public List<KhachHang> all() {
        List<KhachHang> list = new ArrayList<>();
        String SELECT_KhachHang = "SELECT * FROM KhachHang";
        try {
            Connection conn = DBContext.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(SELECT_KhachHang);
            while (rs.next()) {
                list.add(new KhachHang(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getInt(8),
                        rs.getString(9),
                        rs.getInt(10),
                        rs.getString(11)));
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi tại get all()");
            ex.printStackTrace();
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(NhanVienRepository.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
        return list;
    }

    public boolean insert(KhachHang obj) {
        try {
            Connection conn = DBContext.getConnection();
            String INSERT_NHANVIEN = "INSERT INTO KhachHang(ma,ten,gioiTinh,ngaySinh,diaChi,sdt,diemTichLuy,soCMT,tinhTrang, email) VALUES (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareCall(INSERT_NHANVIEN);
            ps.setString(1, obj.getMa());
            ps.setString(2, obj.getTen());
            ps.setInt(3, obj.getGioiTinh());
            ps.setDate(4, Date.valueOf(obj.getNgaySinh()));
            ps.setString(5, obj.getDiaChi());
            ps.setString(6, obj.getSdt());
            ps.setInt(7, obj.getDiemTichLuy());
            ps.setString(8, obj.getSoCMT());
            ps.setInt(9, obj.getTinhTrang());
            ps.setString(10, obj.getEmail());
            
            System.out.println(INSERT_NHANVIEN);
            ps.execute();
            ps.close();
            conn.close();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Lỗi tại insert()");
            return false;
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(NhanVienRepository.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean delete(String ma) {
        try {
            Connection conn = DBContext.getConnection();
            String UPDATE_NHANVIEN = "UPDATE KhachHang SET tinhTrang = ? WHERE ma = ?";
            PreparedStatement ps = conn.prepareCall(UPDATE_NHANVIEN);
            ps.setInt(1, 0);
            ps.setString(2, ma);
            System.out.println(UPDATE_NHANVIEN);
            ps.execute();
            ps.close();
            conn.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Lỗi tại delete()");
            return false;
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(NhanVienRepository.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean update(KhachHang obj) {
        try {
            Connection conn = DBContext.getConnection();
            String UPDATE_NHANVIEN = "UPDATE KhachHang SET ten = ?,"
                    + "gioiTinh = ?,"
                    + "ngaySinh = ?,"
                    + "diaChi = ?,"
                    + "sdt = ?,"
                    + "soCMT = ?,"
                    + "tinhTrang = ?,"
                    + "email = ? "
                    + "WHERE ma = ?";
            PreparedStatement ps = conn.prepareCall(UPDATE_NHANVIEN);
            ps.setString(1, obj.getTen());
            ps.setInt(2, obj.getGioiTinh());
            ps.setDate(3, Date.valueOf(obj.getNgaySinh()));
            ps.setString(4, obj.getDiaChi());
            ps.setString(5, obj.getSdt());
            ps.setString(6, obj.getSoCMT());
            ps.setInt(7, obj.getTinhTrang());
            ps.setString(8, obj.getEmail());
            ps.setString(9, obj.getMa());
            System.out.println(UPDATE_NHANVIEN);
            ps.execute();
            ps.close();
            conn.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Lỗi tại update()");
            return false;
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(NhanVienRepository.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return false;
    }
}
