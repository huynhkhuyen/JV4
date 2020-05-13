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
public class ShapeRectangle extends Shape{
    private static ShapeRectangle instance;
    protected ShapeRectangle() {
    }
    
    public static ShapeRectangle createInstance(){
        if(instance == null)
            instance = new ShapeRectangle();
        return instance;
    }
    
    @Override
    public String draw() {
        return "Ve hinh vuong!!!";
    }
}
