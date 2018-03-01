/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Tam
 */
public class SanPham {
    private String id;
    private String tensp;
    private double gia;
    private String mota;
    private DanhMuc DanhMuc;
    private TrangThai TrangThai;

    public SanPham() {
    }

    public SanPham(String id, String tensp, double gia, String mota, DanhMuc DanhMuc, TrangThai TrangThai) {
        this.id = id;
        this.tensp = tensp;
        this.gia = gia;
        this.mota = mota;
        this.DanhMuc = DanhMuc;
        this.TrangThai = TrangThai;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public DanhMuc getDanhMuc() {
        return DanhMuc;
    }

    public void setDanhMuc(DanhMuc DanhMuc) {
        this.DanhMuc = DanhMuc;
    }

    public TrangThai getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(TrangThai TrangThai) {
        this.TrangThai = TrangThai;
    }



   
}
