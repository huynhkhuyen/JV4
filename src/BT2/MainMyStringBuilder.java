/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT2;

/**
 *
 * @author Khuyen
 */
public class MainMyStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder.myBuil()
                .addString("Hello")
                .addFloat((float)0.58)
                .addBool(true)
                .buil();
        System.out.println(sb.toString());
    }
}
