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
public class RectangularPrism implements Shape3D {

    private final double WIDTH;
    private final double LENGTH;
    private final double HEIGHT;

    public RectangularPrism(int width, int length, int height) throws InvalidDimensionsException {
        if (width <= 0 || length <= 0 || height <= 0) {
            throw new InvalidDimensionsException("Dimensions not positive.");
        }

        WIDTH = width;
        LENGTH = length;
        HEIGHT = height;
    }

    @Override
    public double getVolume() {
        return WIDTH * LENGTH * HEIGHT;
    }

    @Override
    public double getSurfaceArea() {
        return (WIDTH * LENGTH * 2) + (WIDTH * HEIGHT * 2) + (LENGTH * HEIGHT * 2);
    }

    @Override
    public int getSides() {
        return 6;
    }

    public double getWidth() {
        return WIDTH;
    }

    public double getLength() {
        return LENGTH;
    }

    public double getHeight() {
        return HEIGHT;
    }

}
