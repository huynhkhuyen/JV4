/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;

import java.util.Date;

/**
 *
 * @author Khuyen
 */
public class HoaDonHeader {
    String maHoaDon;
    Date ngayBan;
    String tenKhachHang;

    public HoaDonHeader() {
    }

    public HoaDonHeader(String maHoaDon, Date ngayBan, String tenKhachHang) {
        this.maHoaDon = maHoaDon;
        this.ngayBan = ngayBan;
        this.tenKhachHang = tenKhachHang;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public Date getNgayBan() {
        return ngayBan;
    }

    public void setNgayBan(Date ngayBan) {
        this.ngayBan = ngayBan;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    @Override
    public String toString() {
        return  "maHoaDon=" + maHoaDon + ", ngayBan=" + ngayBan + ", tenKhachHang=" + tenKhachHang ;
    }
    
}
