/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter9;

/**
 *
 * @author miguel
 */
public class Cylinder implements Shape3D{
    
    private final double RADIUS;
    private final double HEIGHT;
    
    public Cylinder(double radius, double height){
        RADIUS=radius;
        HEIGHT=height;
    }
    
    @Override
    public double getVolume() {
        return 4 * 3 * Math.PI * Math.pow(RADIUS, 3);
    }

    @Override
    public double getSurfaceArea() {
        return 4 * Math.PI * Math.pow(RADIUS, 2);
    }
    
    @Override
    public double getSides(){
        return 2;
    }
}