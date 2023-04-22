
package model;


public class CoSoVatChat {
    private int id;
    private String ma;
    private String ten;
    private int tinhTrang;

    public CoSoVatChat() {
    }

    public CoSoVatChat(String ma, String ten, int tinhTrang) {
        this.ma = ma;
        this.ten = ten;
        this.tinhTrang = tinhTrang;
    }

    public CoSoVatChat(int id, String ma, String ten, int tinhTrang) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.tinhTrang = tinhTrang;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(int tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    
    
}
