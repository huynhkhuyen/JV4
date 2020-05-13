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
public class MainFactoryMethodSingleton {
    public static void main(String[] args) {
        ShapeFactory sf = new ShapeFactory();
        
        //Ve 2 hinh tron
        Shape s1 = sf.createShape(ShapeType.circle);
       
        
        //Ve 2 hinh vuong
        Shape s2 = sf.createShape(ShapeType.rectangle);
       
        
        //Ve 2 hinh tam giac
        Shape s3 = sf.createShape(ShapeType.triangle);
       
        
        s1.setBienDem(10);
     
        
        s2.setBienDem(15);
        
        
        s3.setBienDem(35);
       
        
        System.out.println("Shape 1 co so la: "+s1.getBienDem());
       
        System.out.println("Shape 2 co so la: "+s2.getBienDem());
     
        System.out.println("Shape 3 co so la: "+s3.getBienDem());
    
    }
}
