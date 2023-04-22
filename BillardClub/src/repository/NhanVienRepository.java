
package repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import model.NhanVien;
import utility.DBContext;
import viewModel.UserLogin;

public class NhanVienRepository {

    public List<NhanVien> all() {
        List<NhanVien> listNhanVien = new ArrayList<>();
        String SELECT_NHANVIEN = "SELECT * FROM NHANVIEN";
        try {
            Connection conn = DBContext.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(SELECT_NHANVIEN);
            while (rs.next()) {
                listNhanVien.add(new NhanVien(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getString(5),//
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getInt(10),
                        rs.getInt(11),
                        rs.getString(12),
                        rs.getString(13)));
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi tại get all()");
            ex.printStackTrace();
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(NhanVienRepository.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            ex.printStackTrace();
            System.out.println("Lỗi");
        }
        return listNhanVien;
    }

    public boolean insert(NhanVien obj) {
        try {
            Connection conn = DBContext.getConnection();
            String INSERT_NHANVIEN = "INSERT INTO NHANVIEN(ma,ten,gioiTinh,ngaySinh,diaChi,sdt,soCMT,matKhau,vaiTro,tinhTrang,EMAIL,img) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareCall(INSERT_NHANVIEN);
            ps.setString(1, obj.getMa());
            ps.setString(2, obj.getTen());
            ps.setInt(3, obj.getGioiTinh());

            java.util.Date date = new SimpleDateFormat("yyyy-MM-dd").parse(obj.getNgaySinh());
            java.sql.Date dateSQL = new java.sql.Date(date.getTime());
            ps.setDate(4, dateSQL);
                    
            ps.setString(5, obj.getDiaChi());
            ps.setString(6, obj.getSdt());
            ps.setString(7, obj.getSoCMT());
            ps.setString(8, obj.getMatKhau());
            ps.setInt(9, obj.getVaiTro());
            ps.setInt(10, obj.getTinhTrang());
            ps.setString(11, obj.getEmail());
            ps.setString(12, obj.getImg());
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

    public boolean delete(NhanVien obj) {
        try {
            Connection conn = DBContext.getConnection();
            String UPDATE_NHANVIEN = "UPDATE NHANVIEN SET tinhTrang = ? WHERE id = ? ";
            PreparedStatement ps = conn.prepareCall(UPDATE_NHANVIEN);
            ps.setInt(1, 1);
            ps.setInt(2, obj.getId());
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

    public boolean update(NhanVien obj) {
        try {
            Connection conn = DBContext.getConnection();
            String UPDATE_NHANVIEN = "UPDATE NHANVIEN SET ten = ?,"
                    + "gioiTinh = ?,"
                    + "ngaySinh = ?,"
                    + "diaChi = ?,"
                    + "sdt = ?,"
                    + "soCMT = ?,"
                    + "matKhau = ?,"
                    + "vaiTro = ?,"
                    + "tinhTrang = ?,"
                    + "EMAIL = ?,"
                    + "img = ? "
                    + "WHERE id = ?";
            PreparedStatement ps = conn.prepareCall(UPDATE_NHANVIEN);
            ps.setString(1, obj.getTen());
            ps.setInt(2, obj.getGioiTinh());

            java.util.Date date = new SimpleDateFormat("yyyy-MM-dd").parse(obj.getNgaySinh());
            java.sql.Date dateSQL = new java.sql.Date(date.getTime());
            ps.setDate(3, dateSQL);
            
            ps.setString(4, obj.getDiaChi());
            ps.setString(5, obj.getSdt());
            ps.setString(6, obj.getSoCMT());
            ps.setString(7, obj.getMatKhau());
            ps.setInt(8, obj.getVaiTro());
            ps.setInt(9, obj.getTinhTrang());
            ps.setString(10, obj.getEmail());
            ps.setString(11, obj.getImg());
            ps.setInt(12, obj.getId());
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

    public NhanVien selectByMa(String ma) {
        NhanVien nv = new NhanVien();
        try {
            Connection conn = DBContext.getConnection();
            String SELECT_NHANVIEN = "SELECT * FROM NHANVIEN "
                    + "WHERE ma = ?";
            PreparedStatement ps = conn.prepareCall(SELECT_NHANVIEN);
            ps.setString(1, ma);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while(rs.next()){
                nv.setId(rs.getInt(1));
                nv.setMa(rs.getString(2));
                nv.setTen(rs.getString(3));
                nv.setGioiTinh(rs.getInt(4));
                nv.setNgaySinh(rs.getString(5));
                nv.setDiaChi(rs.getString(6));
                nv.setSdt(rs.getString(7));
                nv.setSoCMT(rs.getString(8));
                nv.setMatKhau(rs.getString(9));
                nv.setVaiTro(rs.getInt(10));
                nv.setTinhTrang(rs.getInt(11));
                nv.setEmail(rs.getString(12));
                nv.setImg(rs.getString(13));
            }
            ps.close();
            conn.close();
            return nv;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Lỗi tại selectbyID()");
            return null;
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(NhanVienRepository.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return null;
    }   
       public String selectByEmail(String maill) {

        try {
            String sql_email = "select Email from nhanvien where Email = '" + maill + "'";
            ResultSet rs = DBContext.query(sql_email);
            while (rs.next()) {
                return rs.getString(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public List<UserLogin> getUser() {
        List<UserLogin> listNhanVien = new ArrayList<>();
        String SELECT_NHANVIEN = "SELECT ma, matKhau FROM NHANVIEN";
        try {
            Connection conn = DBContext.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(SELECT_NHANVIEN);
            while (rs.next()) {
                listNhanVien.add(new UserLogin(
                        rs.getString(1),
                        rs.getString(2)));
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi tại get getUser()");
            ex.printStackTrace();
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(NhanVienRepository.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
        return listNhanVien;
    }


    public static void main(String[] args) {
        NhanVienRepository repo = new NhanVienRepository();
        List<NhanVien> list = repo.all();
        System.out.println(list.get(1));
    }
}
