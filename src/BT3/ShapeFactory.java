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
public class ShapeFactory {
     public Shape createShape(ShapeType type){
        switch(type){
            case rectangle: return ShapeRectangle.createInstance();
            case triangle: return ShapeTriangle.createInstance();
            case circle: return ShapeCircle.createInstance();
        }
        return null;
    }
}
