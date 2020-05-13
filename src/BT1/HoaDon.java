/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;

import java.util.ArrayList;

/**
 *
 * @author Khuyen
 */
public class HoaDon {
    HoaDonHeader HDH = new HoaDonHeader();
    ArrayList<CTHD> ctdh = new ArrayList<>();
    protected  HoaDon (builHoaDon b){
        this.HDH = b.HDH;
        this.ctdh = b.ctdh;
    }
    @Override
    public String toString() {
        return "HDH=" + this.HDH.toString() + ", ctdh=" + this.ctdh.toString() ;
    }
public static class builHoaDon{
    HoaDonHeader HDH = new HoaDonHeader();
    ArrayList<CTHD> ctdh = new ArrayList<>();
    public builHoaDon themHDD (HoaDonHeader hd){
        this.HDH = hd;
        return this;
    }
    public  builHoaDon themCTHD(CTHD ct){
        ctdh.add(ct);
        return this;
    }
    public HoaDon buil(){
        return new HoaDon(this);
    }

        Object themHDD(HoaDon hd) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
