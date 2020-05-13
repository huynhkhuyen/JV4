/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Khuyen
 */
public class mainHoaDon {
    public static void main(String[] args) throws ParseException {
        HoaDonHeader hdh =  new HoaDonHeader("001", new SimpleDateFormat("dd/MM/yy").parse("13/5/2020"), "Huynh Van Khuyen");
        CTHD ct1 = new CTHD("My tom", 30, 3000, 10);
        CTHD ct2 = new CTHD("dau goi", 1, 5000, 20);
        HoaDon hd = new HoaDon.builHoaDon()
                .themHDD(hdh)
                .themCTHD(ct1)
                .themCTHD(ct2)
                .buil();
   
        System.out.println(hd.toString());   
      
                
    }
}
