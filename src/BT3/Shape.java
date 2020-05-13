/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT3;

/**
 *
 * @author Khuyen
 */
public abstract class Shape {
    private String brush;
    private String paper;
    private String frame;
    
    int bienDem;

    public int getBienDem() {
        return bienDem;
    }

    public void setBienDem(int bienDem) {
        this.bienDem = bienDem;
    }
    
    public abstract String draw();
}
