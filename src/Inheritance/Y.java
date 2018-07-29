/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author ivan_grinenko
 */
public class Y extends X {
    protected int yMask = 0xff00;
    
    public Y() {
        this("yStr");
        fullMask |=yMask;
    }
    public Y(String yStr){
        fullMask |=yMask;
    }
    
}
