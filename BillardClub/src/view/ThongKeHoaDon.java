/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import model.HoaDon;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import service.HoaDonService;
import utility.DBContext;
import viewModel.HoaDonChiTietViewModel;

/**
 *
 * @author ADMIN
 */
public class ThongKeHoaDon extends javax.swing.JInternalFrame {

    private HoaDonService hoaDonService;
    private DefaultTableModel model;
    private int idHD;

    public ThongKeHoaDon() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        hoaDonService = new HoaDonService();
        loadTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        tbnLamMoi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableHoaDon = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableHDCT = new javax.swing.JTable();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jdcNgayBatDau = new com.toedter.calendar.JDateChooser();
        jdcNgayKetThuc = new com.toedter.calendar.JDateChooser();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(250, 182, 124));
        setBorder(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setResizable(true);
        setFocusable(false);
        setPreferredSize(new java.awt.Dimension(1320, 810));

        jPanel2.setBackground(new java.awt.Color(250, 182, 124));

        btnThem.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        tbnLamMoi.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        tbnLamMoi.setText("Làm mới");
        tbnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnLamMoiActionPerformed(evt);
            }
        });

        tableHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ma HD", "Ngay Tao", "Ngay Thanh Toan", "Tong Tien"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableHoaDonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableHoaDon);

        tableHDCT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ten Bàn", "Tên Dịch Vụ", "Số lượng", "Tổng tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableHDCT);

        jLabel28.setText("Hóa đơn chi tiết");

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel29.setText("Thống kê hóa đơn");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_pdf.png"))); // NOI18N
        jButton1.setText("Xuat hoa don(pdf)");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel30.setText("Ngày bắt đầu:");

        jLabel31.setText("Ngày kết thúc:");

        jButton2.setText("Lọc hóa đơn");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jdcNgayBatDau.setDateFormatString("yyyy-MM-dd");

        jdcNgayKetThuc.setDateFormatString("yyyy-MM-dd");

        jButton3.setText("Tất cả hóa đơn");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)
                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jdcNgayBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(106, 106, 106)
                                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jdcNgayKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(906, 906, 906))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1914, 1914, 1914)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(81, 81, 81)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tbnLamMoi)
                            .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(476, 476, 476)
                        .addComponent(jLabel29)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(627, 627, 627)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(78, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jdcNgayBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30)
                            .addComponent(jdcNgayKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1366, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed

    }//GEN-LAST:event_btnSuaActionPerformed

    private void tbnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnLamMoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbnLamMoiActionPerformed

    private void tableHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableHoaDonMouseClicked
        loadHDCT();
    }//GEN-LAST:event_tableHoaDonMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int luaChon = tableHoaDon.getSelectedRow();
        String ma = tableHoaDon.getValueAt(luaChon, 0).toString();
        ArrayList<HoaDon> list = (ArrayList<HoaDon>) hoaDonService.thongKeHoaDon();
        for (HoaDon hd : list) {
            if (hd.getMa().equals(ma)) {
                idHD = hd.getId();
                System.out.println("Id hóa đơn: " + idHD);

            }
        }
        XuatHoaDon(idHD);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if (validateJdateTrong() == true && validateJdateNgay() == true) {

            SimpleDateFormat dinhDang = new SimpleDateFormat("yyyy-MM-dd");
            String ngaybd = dinhDang.format(jdcNgayBatDau.getDate());
            String ngaykt = dinhDang.format(jdcNgayKetThuc.getDate());
            List<HoaDon> list = hoaDonService.layHoaDontuNgay(ngaybd, ngaykt);
            JOptionPane.showMessageDialog(this, "Lọc hóa đơn từ: " + ngaybd + " đến " + ngaykt);
            model = (DefaultTableModel) tableHoaDon.getModel();
            model.setNumRows(0);
            for (HoaDon hd : list) {
                model.addRow(new Object[]{hd.getMa(), hd.getNgayTao(), hd.getNgayThanhToan(), hd.getTongTien()
                });

            }

        }
        reSetTableHDCT();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        loadTable();
        reSetTableHDCT();
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.calendar.JDateChooser jdcNgayBatDau;
    private com.toedter.calendar.JDateChooser jdcNgayKetThuc;
    private javax.swing.JTable tableHDCT;
    private javax.swing.JTable tableHoaDon;
    private javax.swing.JButton tbnLamMoi;
    // End of variables declaration//GEN-END:variables
public void loadTable() {
        model = (DefaultTableModel) tableHoaDon.getModel();
        model.setNumRows(0);
        ArrayList<HoaDon> list = (ArrayList<HoaDon>) hoaDonService.thongKeHoaDon();
        for (HoaDon hd : list) {
            model.addRow(new Object[]{
                hd.getMa(), hd.getNgayTao(), hd.getNgayThanhToan(), hd.getTongTien()
            });
        }

    }

    public void loadHDCT() {
        int luaChon = tableHoaDon.getSelectedRow();
        if (luaChon > -1) {
            String ma=tableHoaDon.getValueAt(luaChon, 0).toString();
            model = (DefaultTableModel) tableHDCT.getModel();
            model.setNumRows(0);
            ArrayList<HoaDonChiTietViewModel> list = (ArrayList<HoaDonChiTietViewModel>) hoaDonService.layHoaDonCT(ma);
            for (HoaDonChiTietViewModel hd : list) {
                model.addRow(new Object[]{
                    hd.getTenBan(), hd.getTenDV(), hd.getSoLuong(), hd.getGia()
                });
            }
        }
    }
    public void reSetTableHDCT(){
        model=(DefaultTableModel) tableHDCT.getModel();
        model.setNumRows(0);
    }
     public void XuatHoaDon(int idhd) {
        try {

            Hashtable map = new Hashtable();
            JasperReport report = JasperCompileManager.compileReport("C:\\Users\\ADMIN\\Desktop\\BillardPolyGroup1\\BillardClub\\src\\view\\rptXuatHoaDon.jrxml");

            map.put("idHD", idhd);
            JasperPrint p = JasperFillManager.fillReport(report, map, DBContext.getConnection());
            JasperViewer.viewReport(p, false);
            JasperExportManager.exportReportToPdfFile(p, "test.pdf");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public Boolean validateJdateTrong() {
        // lấy ngày được chọn
        Date selectedDateBT = jdcNgayBatDau.getDate();
        Date selectedDateKT = jdcNgayKetThuc.getDate();
        Date ngayHT = new Date();
        // kiểm tra tính hợp lệ của ngày
        if (selectedDateBT == null || selectedDateKT == null) {
            JOptionPane.showMessageDialog(this, "Kiểm tra lại ngày bắt đầu và kết thúc");
            return false;
        }

        return true;

    }

    public Boolean validateJdateNgay() {
// lấy ngày được chọn
        Date selectedDateBT = jdcNgayBatDau.getDate();
        Date selectedDateKT = jdcNgayKetThuc.getDate();
        Date ngayHT = new Date();
// kiểm tra tính hợp lệ của ngày

        if (selectedDateBT.after(ngayHT)) {
            JOptionPane.showMessageDialog(this, "Ngày bắt đầu phải trước ngày hiện tại.");
            return false;
        } else if (selectedDateBT.after(selectedDateKT)) {
            JOptionPane.showMessageDialog(this, "Ngày bắt đầu phải nhỏ hơn ngày kết thúc");
            return false;
        }

        return true;

    }
}