
package Chapter9;

public class Cylinder implements Shape3D{
    
    private final double RADIUS;
    private final double HEIGHT;
    
    public Cylinder(double radius, double height){
        RADIUS=radius;
        HEIGHT=height;
    }
    
    @Override
    public double getVolume() {
        return Math.PI*Math.pow(RADIUS, 2)*HEIGHT;
    }

    @Override
    public double getSurfaceArea() {
        return RADIUS*HEIGHT*2*Math.PI+Math.pow(RADIUS, 2)*Math.PI*2;
    }
    
    @Override
    public int getSides(){
        return 2;
    }
    
    public double getRadius(){
        return RADIUS;
    }
    
    public double getHeight(){
        return HEIGHT;
    }
}
