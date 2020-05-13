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
public class ShapeTriangle extends Shape{
    
   private static ShapeTriangle instance;
    protected ShapeTriangle() {
    }
    
    public static ShapeTriangle createInstance(){
        if(instance == null)
            instance = new ShapeTriangle();
        return instance;
    }
    
    @Override
    public String draw() {
        return "Ve hinh tam giac!!!";
    }
    
}
