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
public class Sphere implements Shape3D{
    
    private final double RADIUS;

    public Sphere(double radius) {
        RADIUS=radius;
    }
    
    @Override
    public double getVolume() {
        return Math.PI * Math.pow(RADIUS, 3)*4/3;
    }

    @Override
    public double getSurfaceArea() {
        return  Math.PI * Math.pow(RADIUS, 2)*4;
    }
    
    @Override
    public int getSides(){
        return 0;
    }
    
    public double getRadius(){
        return RADIUS;
    }

}
