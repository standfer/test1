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
public class X {
    protected int  xMask = 0x00ff;
    protected int fullMask;
    
    public X(){
        fullMask = xMask;
    }
    
    public int mask(int orig){
       return (orig & fullMask); 
    }
    
}
