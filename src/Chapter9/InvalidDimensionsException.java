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
public class InvalidDimensionsException extends IllegalArgumentException {
    public InvalidDimensionsException(String message){
        super(message);
    }
}