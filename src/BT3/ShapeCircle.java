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
public class ShapeCircle extends Shape{
    private static ShapeCircle instance;
    protected ShapeCircle() {
    }
    
    public static ShapeCircle createInstance(){
        if(instance == null)
            instance = new ShapeCircle();
        return instance;
    }
    
    @Override
    public String draw() {
        return "Ve hinh tron!!!";
    }
}
